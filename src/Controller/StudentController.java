package Controller;

import static Controller.AdminController.connect;
import Database.*;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentController {
    
    
    
     public static Connection connect() {
        return DatabaseConnection.getConnection();
    }
     
     //Load Table data
    public static DefaultTableModel getTableModel(String query) {
       
        DefaultTableModel model = new DefaultTableModel(); // Create default model

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

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

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return model; // Always return a model
    }
     
    public static DefaultTableModel getTableModel(String query, String studentId) {
        DefaultTableModel model = new DefaultTableModel(); 

        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, studentId);  // Set parameter value

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
        
    public DefaultTableModel searchData(String searchValue,String query) {  
        DefaultTableModel model = new DefaultTableModel();

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, "%" + searchValue + "%");
            try (ResultSet rs = stmt.executeQuery()) {  // Fix: Use try-with-resources for ResultSet
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
        return model; // Always return a model
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
    
    
    public void deleteData(String query,int id) {
        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, id);
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
    
     public String getComboBoxValue(JComboBox<String> comboBox) {
        Object selectedItem = comboBox.getSelectedItem();
        return (selectedItem != null) ? selectedItem.toString() : null;
    }
     
     
    public double calculateFinalGPA(String studentCode, String courseId) {
        double totalWeightedGPA = 0.0;
        int totalCredits = 0;

        String query = "SELECT sm.subject_gpa, s.subject_credit " +
                   "FROM SubjectMark sm " +
                   "JOIN Subject s ON sm.subject_id = s.subject_id " +
                   "WHERE sm.student_code = ? AND sm.course_id = ?";

        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, studentCode);
            stmt.setString(2, courseId);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    double subjectGPA = rs.getDouble("subject_gpa");
                    int subjectCredit = rs.getInt("subject_credit");

                    totalWeightedGPA += subjectGPA * subjectCredit;
                    totalCredits += subjectCredit;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return 0.0; // Return 0 if there's an error
        }

        return (totalCredits > 0) ? totalWeightedGPA / totalCredits : 0.0;
    } 
}
