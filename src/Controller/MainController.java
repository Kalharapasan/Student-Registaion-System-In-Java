package Controller;


import Admin.AdminRegistationPanel;
import Database.DatabaseConnection;
import Students.Students;
import Teacher.Teacher;
import java.sql.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.*;


public class MainController {
    
    public static Connection connect() {
        return DatabaseConnection.getConnection();
    }
    
    public void exit() {                                           
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);  
        }
    }
    
    public void registerUser(String userId, String password, String rePassword, String userType) {
        try {
            // Validate input fields
            if (userId.isEmpty() || password.isEmpty() || rePassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if passwords match
            if (!password.equals(rePassword)) {
                JOptionPane.showMessageDialog(null, "Passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if User ID exists in any of the tables
            if (!isUserIDValid(userId)) {
                JOptionPane.showMessageDialog(null, "User ID not found in Admin, Teacher, or Student records.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Hash the password before storing it
            String hashedPassword = hashPassword(password);

            // Insert user into the system (e.g., into a "Users" table)
            String insertQuery = "INSERT INTO LoginUser (userId, password, userType) VALUES (?, ?, ?)";
            try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(insertQuery)) {

                stmt.setString(1, userId);
                stmt.setString(2, hashedPassword);
                stmt.setString(3, userType);

                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "User registered successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Registration failed. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                 }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to check if User ID exists
    public boolean isUserIDValid(String userId) {
        String query = "SELECT admin_code FROM Admin WHERE admin_code = ? " +
                   "UNION " +
                   "SELECT teacher_code FROM Teacher WHERE teacher_code = ? " +
                   "UNION " +
                   "SELECT student_code FROM Student WHERE student_code = ?";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, userId);
            stmt.setString(2, userId);
            stmt.setString(3, userId);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next(); // If a record is found, return true
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return false; // No matching record found
    }

// Hash password using SHA-256
    public String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes());

            // Convert bytes to hex string
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
    
    
    public  void loginUser(String userId, String password, String userType) {
        String query = "SELECT password FROM LoginUser WHERE userId = ? AND userType = ?";
        
        String Id = userId;
        
        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, userId);
            stmt.setString(2, userType);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String storedPassword = rs.getString("password");

                    // Verify password
                if (hashPassword(password).equals(storedPassword)) {
                    JOptionPane.showMessageDialog(null, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);

                        // Redirect based on user type
                        switch (userType.toLowerCase()) {
                            case "admin": 
                                
                                  AdminRegistationPanel regi = new AdminRegistationPanel(Id);
                                  regi.setVisible(true);
                                
                                break;
                            case "teacher":
                                Teacher teacher =new Teacher(Id);
                                teacher.setVisible(true);
                                
                                break;
                            case "student":
                                Students studen = new Students(Id);
                                studen.setVisible(true);
                                
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Invalid user type!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect password!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "User ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
}
