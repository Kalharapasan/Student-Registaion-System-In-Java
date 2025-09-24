package Controller;

import static Controller.StudentController.connect;
import Database.*;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TeacherController {
    
     public static Connection connect() {
        return DatabaseConnection.getConnection();
    }
     
    public String getComboBoxValue(JComboBox<String> comboBox) {
        Object selectedItem = comboBox.getSelectedItem();
        return (selectedItem != null) ? selectedItem.toString() : null;
    }
     
    public void exit() {                                           
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);  
        }
    }

    public String getValue(JTable table, int row, int col) {
        Object value = table.getValueAt(row, col);
        return (value != null) ? value.toString() : ""; // Prevents NullPointerException
    }
    
    public boolean insertData(String tableName, String[] columns, Object[] values) {
        if (columns.length != values.length) {
            throw new IllegalArgumentException("Columns and values count must match.");
        }

        String columnNames = String.join(", ", columns);
        String placeholders = String.join(", ", java.util.Collections.nCopies(values.length, "?"));
        String query = "INSERT INTO " + tableName + " (" + columnNames + ") VALUES (" + placeholders + ")";

        try (Connection conn = DatabaseConnection.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            for (int i = 0; i < values.length; i++) {
                stmt.setObject(i + 1, values[i]); // Set values dynamically
            }

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0; // Return true if insert is successful

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
   
    
    public void deleteData(String query,String id) {
        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, id);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Data deleted successfully!");
            } else {
                System.out.println("No Data found with ID: " + id);
            }
        } catch (SQLException e) {
            System.err.println("Error deleting data: " + e.getMessage());
        }
    }
    
    
    
    public static int updateData(String query, Object... params) {
        int affectedRows = 0;
        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            // Set parameters dynamically
            for (int i = 0; i < params.length; i++) {
                stmt.setObject(i + 1, params[i]);
            }

            // Execute UPDATE operation
            affectedRows = stmt.executeUpdate();
            System.out.println("Update successful, rows affected: " + affectedRows);

        } catch (SQLException ex) {
            System.err.println("Database error: " + ex.getMessage());
            ex.printStackTrace();
        }
        return affectedRows;
    }
    
    
    public static DefaultTableModel getTableModel(String query, String Id) {
        DefaultTableModel model = new DefaultTableModel(); 

        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, Id);  // Set parameter value

            try (ResultSet rs = stmt.executeQuery()) {
                // Get Column Names
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                String[] columnNames = new String[columnCount];

                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = metaData.getColumnName(i);
                }

                // Set column names in model
                model.setColumnIdentifiers(columnNames);

                // Get Data Rows
                while (rs.next()) {
                    String[] rowData = new String[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        rowData[i - 1] = rs.getString(i);
                    }
                    model.addRow(rowData);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return model;
    }
    
    public void populateComboBoxWithQuery(JComboBox<String> comboBox, String query, String columnName) {
        List<String> values = new ArrayList<>();

        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                values.add(rs.getString(columnName)); // Add each value to the list
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        comboBox.removeAllItems(); // Clear previous items
        for (String value : values) {
            comboBox.addItem(value); // Add each value to the JComboBox
        }
    }
    
    
    public void populateComboBoxWithQuery(JComboBox<String> comboBox, String query, String columnName, String Id) {
        List<String> values = new ArrayList<>();

        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(query)) {
        
            stmt.setString(1, Id); // Set the student_code parameter
        
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    values.add(rs.getString(columnName)); // Add each value to the list
                }
            }
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        comboBox.removeAllItems(); // Clear previous items
        for (String value : values) {
            comboBox.addItem(value); // Add each value to the JComboBox
        }
    }
    
    public DefaultTableModel searchData(String id, String value, String query) {  
        DefaultTableModel model = new DefaultTableModel();

        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, id); // Set student_code
            stmt.setString(2, value);   // Set course_id

            try (ResultSet rs = stmt.executeQuery()) {
            // Get Column Names
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                String[] columnNames = new String[columnCount];

                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = metaData.getColumnName(i);
                }
                model.setColumnIdentifiers(columnNames);

                // Get Data Rows
                while (rs.next()) {
                    String[] rowData = new String[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        rowData[i - 1] = rs.getString(i);
                    }
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
       return model;
    }
    
    // Method to convert marks to GPA points
    public  double getGPA(double marks) {
        if (marks >= 90) return 4.0;
        else if (marks >= 80) return 3.7;
        else if (marks >= 75) return 3.3;
        else if (marks >= 70) return 3.0;
        else if (marks >= 65) return 2.7;
        else if (marks >= 60) return 2.3;
        else if (marks >= 55) return 2.0;
        else if (marks >= 50) return 1.7;
        else return 0.0; // Fail
    }

    // Method to calculate GPA for one subject
    public  double calculateGPA(double marks, double credits) {
        double gpaPoints = getGPA(marks);
        return (credits > 0) ? gpaPoints * credits / credits : 0.0;
    }
    
    public double getCredit(String query, String subjectId) {
        double subjectCredit = -1;  // Default value if not found
        
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, subjectId);  // Set subject_id in query
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                subjectCredit = rs.getDouble("subject_credit");  // Get subject_credit from result
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return subjectCredit;  // Return correct subject credit
    }
    
   
    
    
    
}
