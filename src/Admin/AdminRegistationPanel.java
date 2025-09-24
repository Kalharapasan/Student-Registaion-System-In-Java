package Admin;

import Controller.AdminController;
import Database.*;
import java.sql.*;
import Controller.AdminController.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;


public class AdminRegistationPanel extends javax.swing.JFrame {
    
    private  String admin_id;
    
    private String studentsQueryTableLoad = "SELECT * FROM Student";
    private String teacherQueryTableLoad = "SELECT * FROM Teacher";
    private String courseQueryTableLoad = "SELECT * FROM Course";
    private String subjectQueryTableLoad = "SELECT * FROM Subject";
    private String timeTableQueryTableLoad = "SELECT * FROM TimeTable";
    private String adminQueryTableLoad = "SELECT * FROM Admin";
    
    
    
    private String teacherQueryGetID ="SELECT teacher_code FROM Teacher";
    private String studentsQueryGetID ="SELECT student_code FROM Student";
    private String subjectQueryGetCoseID ="SELECT course_id FROM Course";
    private String timeTableQueryGetSubjectID ="SELECT subject_id FROM Subject";
    
    public AdminRegistationPanel(String admin_id) {
        initComponents();
        adminstudentDataTable.setModel(adminController.getTableModel(studentsQueryTableLoad));
        adminTeacherDataTable.setModel(adminController.getTableModel(teacherQueryTableLoad));
        adminCoseDataTable.setModel(adminController.getTableModel(courseQueryTableLoad));
        adminSubjectDataTable.setModel(adminController.getTableModel(subjectQueryTableLoad));
        adminTimeTableDataTable.setModel(adminController.getTableModel(timeTableQueryTableLoad));
        adminDataTable.setModel(adminController.getTableModel(adminQueryTableLoad));
        
        
        
        adminController.populateComboBoxWithQuery(adminCoseTeacherIdcombo,teacherQueryGetID ,"teacher_code");
        adminController.populateComboBoxWithQuery(adminSubjectTeacherIdcombo,teacherQueryGetID ,"teacher_code");
        adminController.populateComboBoxWithQuery(adminTimeTableTeacherIdcombo,teacherQueryGetID ,"teacher_code");
        
        adminController.populateComboBoxWithQuery(adminSubjectCoseCombo,subjectQueryGetCoseID,"course_id");
        adminController.populateComboBoxWithQuery(adminTimeTableCoseIDcombo,subjectQueryGetCoseID,"course_id");
        adminController.populateComboBoxWithQuery(adminTimeTableSearchcombo,subjectQueryGetCoseID,"course_id");
        
        
        adminController.populateComboBoxWithQuery(adminTimeTableSubjectIdcombo,timeTableQueryGetSubjectID,"subject_id");
        
        this.admin_id =admin_id;
       
        
    }
    private Connection connect() {
        return DatabaseConnection.getConnection();
    }
    AdminController adminController = new AdminController();
    
   private void courseFromClear(){
       adminCoseIDtext.setText("");
       adminCoseNametext.setText("");
       adminCosePaymenttext.setText("");
       adminCoseTeacherIdcombo.setSelectedIndex(0);

   }
   private void subjectFromClear(){
       adminSubjectIdtext.setText("");
       adminSubjectNametext.setText("");
       adminSubjectCreditcombo.setSelectedIndex(0);
       adminSubjectCoseCombo.setSelectedIndex(0);
       adminSubjectTeacherIdcombo.setSelectedIndex(0);
   }
   
    private void adminFromClear() {
        admintext.setText("");
        adminFnametext.setText("");
        adminLnametex.setText("");
        adminAgetext.setText("");
        adminBirthdaytext.setText("");
        adminAddresstext.setText("");
        adminEmailtext.setText("");
        adminNictext.setText("");
        adminSalarytext.setText("");
    }

    private void techerFromClear() {
        adminteacherIdtext.setText("");
        adminteacherFnametext.setText("");
        adminteacherLnametext.setText("");
        adminteacherAgetext.setText("");
        adminteacherBirthdaytext.setText("");
        adminteacherAddresstext.setText("");
        adminteacherEmailtext.setText("");
        adminteacherNictext.setText("");
        adminteacherSalarytext.setText("");
    }

    private void studentFromClear() {
        adminstudentIdtext.setText("");
        adminstudentFnametext.setText("");
        adminstudentLnametext.setText("");
        adminstudentAgetext.setText("");
        adminstudentBirthdaytext.setText("");
        adminstudentAddresstext.setText("");
        adminstudentEmailtext.setText("");
        adminstudentNictext.setText("");
    }
    
    private void timeTableFromClear(){
        adminTimeTableCoseIDcombo.setSelectedIndex(0);
        adminTimeTableSubjectIdcombo.setSelectedIndex(0);
        adminTimeTableTeacherIdcombo.setSelectedIndex(0);
        adminTimeTableMoncombo.setSelectedIndex(0);
        adminTimeTableTuecombo.setSelectedIndex(0);
        adminTimeTableWenscombo.setSelectedIndex(0);
        adminTimeTableThercombo.setSelectedIndex(0);
        adminTimeTableFricombo.setSelectedIndex(0);

    }
    
    
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminTabbedPane = new javax.swing.JTabbedPane();
        adminStudentFormPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        adminstudentFnametext = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        adminstudentLnametext = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        adminstudentAgetext = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        adminstudentBirthdaytext = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        adminstudentAddresstext = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        adminstudentEmailtext = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        adminstudentNictext = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        adminstudentIdtext = new javax.swing.JTextField();
        adminstudentsearchtext = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminstudentDataTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        adminstudentsearchBtn = new javax.swing.JButton();
        adminstudentDeleteBtn = new javax.swing.JButton();
        adminstudentSaveBtn = new javax.swing.JButton();
        adminstudentUpdateBtn = new javax.swing.JButton();
        adminstudentExitBtn = new javax.swing.JButton();
        adminstudentClearBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        adminTeacherFormPanel = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        adminteacherFnametext = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        adminteacherLnametext = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        adminteacherAgetext = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        adminteacherBirthdaytext = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        adminteacherAddresstext = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        adminteacherEmailtext = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        adminteacherNictext = new javax.swing.JTextField();
        adminteacherSalarytext = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        adminteacherIdtext = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        adminTeacherDataTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        adminTeacherSearchtext = new javax.swing.JTextField();
        adminteacherSearchBtn = new javax.swing.JButton();
        adminteacherSaveBtn = new javax.swing.JButton();
        adminteacherDeleteBtn = new javax.swing.JButton();
        adminteacherUpdateBtn = new javax.swing.JButton();
        adminteacherClearBtn = new javax.swing.JButton();
        adminteacherExitBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        adminCoseFormPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        adminCoseNametext = new javax.swing.JTextField();
        adminCoseSaveBtn = new javax.swing.JButton();
        adminCoseDeleteBtn = new javax.swing.JButton();
        adminCoseUpdateBtn = new javax.swing.JButton();
        adminCoseLoadBtn = new javax.swing.JButton();
        adminCoseClearBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        adminCosePaymenttext = new javax.swing.JTextField();
        adminCoseTeacherIdcombo = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        adminCoseIDtext = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adminCoseDataTable = new javax.swing.JTable();
        adminCoseSearchLable = new javax.swing.JLabel();
        adminCoseSearchtext = new javax.swing.JTextField();
        adminCoseSearchBtn = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        adminSubjectFormPanel = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        adminSubjectNametext = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        adminSubjectSaveBtn = new javax.swing.JButton();
        adminSubjectDeleteBtn = new javax.swing.JButton();
        adminSubjectUpdateBtn = new javax.swing.JButton();
        adminSubjectExitBtn = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        adminSubjectCoseCombo = new javax.swing.JComboBox<>();
        adminSubjectTeacherIdcombo = new javax.swing.JComboBox<>();
        adminSubjectCreditcombo = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        adminSubjectIdtext = new javax.swing.JTextField();
        adminSubjectClearBtn = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        adminSubjectDataTable = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        adminSubjectSearchtext = new javax.swing.JTextField();
        adminSubjectSearchBtn = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        adminTimeTableFormPanel = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        adminTimeTableSearchcombo = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        adminTimeTableDataTable = new javax.swing.JTable();
        adminTimeTableSearchBtn = new javax.swing.JButton();
        adminteacherRefreshBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        adminTimeTableSubjectIdcombo = new javax.swing.JComboBox<>();
        adminTimeTableSaveBtn = new javax.swing.JButton();
        adminTimeTableDeleteBtn = new javax.swing.JButton();
        adminTimeTableExitBtn = new javax.swing.JButton();
        adminTimeTableUpdateBtn = new javax.swing.JButton();
        adminTimeTableCoseIDcombo = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        adminTimeTableTeacherIdcombo = new javax.swing.JComboBox<>();
        adminTimeTableClearBtn = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        adminTimeTableWenscombo = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        adminTimeTableThercombo = new javax.swing.JComboBox<>();
        adminTimeTableFricombo = new javax.swing.JComboBox<>();
        adminTimeTableMoncombo = new javax.swing.JComboBox<>();
        adminTimeTableTuecombo = new javax.swing.JComboBox<>();
        adminAdminFormPanel = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        adminFnametext = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        adminLnametex = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        adminAgetext = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        adminBirthdaytext = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        adminAddresstext = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        adminEmailtext = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        adminNictext = new javax.swing.JTextField();
        adminSalarytext = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        admintext = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        adminSearchtext = new javax.swing.JTextField();
        adminteacherSearchBtn1 = new javax.swing.JButton();
        adminSaveBtn = new javax.swing.JButton();
        adminDeleteBtn = new javax.swing.JButton();
        adminUpdateBtn = new javax.swing.JButton();
        adminClearBtn = new javax.swing.JButton();
        adminExitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        adminDataTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setResizable(false);

        AdminTabbedPane.setBackground(java.awt.SystemColor.textHighlight);
        AdminTabbedPane.setToolTipText("");
        AdminTabbedPane.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        AdminTabbedPane.setMinimumSize(new java.awt.Dimension(32767, 32767));
        AdminTabbedPane.setPreferredSize(new java.awt.Dimension(32767, 32767));
        AdminTabbedPane.setRequestFocusEnabled(false);

        adminStudentFormPanel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel7.setBackground(new java.awt.Color(51, 51, 255));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Frist Name");

        adminstudentFnametext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Last Name");

        adminstudentLnametext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Age");

        adminstudentAgetext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Birthday");

        adminstudentBirthdaytext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Address");

        adminstudentAddresstext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Email");

        adminstudentEmailtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel17.setText("NIC");

        adminstudentNictext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("ID");

        adminstudentIdtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminstudentNictext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentEmailtext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentAddresstext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentBirthdaytext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentAgetext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentLnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentFnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminstudentIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminstudentFnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(adminstudentLnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminstudentAgetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminstudentBirthdaytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminstudentAddresstext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminstudentEmailtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminstudentNictext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        adminstudentsearchtext.setBackground(new java.awt.Color(51, 51, 255));

        adminstudentDataTable.setBackground(new java.awt.Color(255, 255, 153));
        adminstudentDataTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminstudentDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        adminstudentDataTable.setToolTipText("");
        adminstudentDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminstudentDataTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminstudentDataTableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(adminstudentDataTable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Student ID");

        searchTextField.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
        });

        adminstudentsearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminstudentsearchBtn.setText("Searsh");
        adminstudentsearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminstudentsearchBtnActionPerformed(evt);
            }
        });

        adminstudentDeleteBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        adminstudentDeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminstudentDeleteBtn.setText("Delete");
        adminstudentDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminstudentDeleteBtnActionPerformed(evt);
            }
        });

        adminstudentSaveBtn.setBackground(java.awt.Color.red);
        adminstudentSaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminstudentSaveBtn.setText("Save");
        adminstudentSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminstudentSaveBtnActionPerformed(evt);
            }
        });

        adminstudentUpdateBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow"));
        adminstudentUpdateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminstudentUpdateBtn.setText("Update");
        adminstudentUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminstudentUpdateBtnActionPerformed(evt);
            }
        });

        adminstudentExitBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("nb.explorer.noFocusSelectionBackground"));
        adminstudentExitBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminstudentExitBtn.setText("Exit");
        adminstudentExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminstudentExitBtnActionPerformed(evt);
            }
        });

        adminstudentClearBtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Component.error.focusedBorderColor"));
        adminstudentClearBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminstudentClearBtn.setText("Clear");
        adminstudentClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminstudentClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminstudentsearchtextLayout = new javax.swing.GroupLayout(adminstudentsearchtext);
        adminstudentsearchtext.setLayout(adminstudentsearchtextLayout);
        adminstudentsearchtextLayout.setHorizontalGroup(
            adminstudentsearchtextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminstudentsearchtextLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminstudentsearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(adminstudentsearchtextLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(adminstudentsearchtextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminstudentsearchtextLayout.createSequentialGroup()
                        .addComponent(adminstudentSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(adminstudentDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(adminstudentUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(adminstudentClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminstudentExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        adminstudentsearchtextLayout.setVerticalGroup(
            adminstudentsearchtextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminstudentsearchtextLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(adminstudentsearchtextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentsearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminstudentsearchtextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminstudentSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminstudentExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Students Registion From");

        javax.swing.GroupLayout adminStudentFormPanelLayout = new javax.swing.GroupLayout(adminStudentFormPanel);
        adminStudentFormPanel.setLayout(adminStudentFormPanelLayout);
        adminStudentFormPanelLayout.setHorizontalGroup(
            adminStudentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminStudentFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminStudentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(adminStudentFormPanelLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminstudentsearchtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        adminStudentFormPanelLayout.setVerticalGroup(
            adminStudentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminStudentFormPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminStudentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminstudentsearchtext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );

        AdminTabbedPane.addTab("Students Registation", adminStudentFormPanel);

        adminTeacherFormPanel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel18.setBackground(new java.awt.Color(51, 51, 255));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel38.setText("Teacher ID");

        adminteacherFnametext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel39.setText("Last Name");

        adminteacherLnametext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel40.setText("Age");

        adminteacherAgetext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel41.setText("Birthday");

        adminteacherBirthdaytext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel42.setText("Address");

        adminteacherAddresstext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel43.setText("Email");

        adminteacherEmailtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel44.setText("NIC");

        adminteacherNictext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        adminteacherSalarytext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel45.setText("Salary");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel46.setText("Frist Name");

        adminteacherIdtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(221, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminteacherIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminteacherFnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherSalarytext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherLnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherAgetext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherBirthdaytext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherAddresstext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherEmailtext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherNictext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminteacherFnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminteacherLnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminteacherAgetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminteacherBirthdaytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminteacherAddresstext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminteacherEmailtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminteacherNictext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminteacherSalarytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel19.setBackground(new java.awt.Color(51, 51, 255));

        adminTeacherDataTable.setBackground(new java.awt.Color(255, 255, 153));
        adminTeacherDataTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTeacherDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        adminTeacherDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTeacherDataTableMouseClicked(evt);
            }
        });
        adminTeacherDataTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminTeacherDataTableKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(adminTeacherDataTable);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Teacher ID ");

        adminTeacherSearchtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTeacherSearchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminTeacherSearchtextKeyPressed(evt);
            }
        });

        adminteacherSearchBtn.setBackground(new java.awt.Color(255, 0, 0));
        adminteacherSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminteacherSearchBtn.setText("Searsh");
        adminteacherSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminteacherSearchBtnActionPerformed(evt);
            }
        });

        adminteacherSaveBtn.setBackground(new java.awt.Color(255, 51, 204));
        adminteacherSaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminteacherSaveBtn.setText("Save");
        adminteacherSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminteacherSaveBtnActionPerformed(evt);
            }
        });

        adminteacherDeleteBtn.setBackground(new java.awt.Color(102, 255, 204));
        adminteacherDeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminteacherDeleteBtn.setText("Delete");
        adminteacherDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminteacherDeleteBtnActionPerformed(evt);
            }
        });

        adminteacherUpdateBtn.setBackground(new java.awt.Color(51, 255, 51));
        adminteacherUpdateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminteacherUpdateBtn.setText("Update");
        adminteacherUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminteacherUpdateBtnActionPerformed(evt);
            }
        });

        adminteacherClearBtn.setBackground(new java.awt.Color(0, 51, 204));
        adminteacherClearBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminteacherClearBtn.setText("Clear");
        adminteacherClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminteacherClearBtnActionPerformed(evt);
            }
        });

        adminteacherExitBtn.setBackground(new java.awt.Color(0, 204, 204));
        adminteacherExitBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminteacherExitBtn.setText("Exit");
        adminteacherExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminteacherExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(adminteacherSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminteacherDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(adminteacherUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(adminteacherClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(adminteacherExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(adminTeacherSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminteacherSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminTeacherSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminteacherSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Teacher Registation From");

        javax.swing.GroupLayout adminTeacherFormPanelLayout = new javax.swing.GroupLayout(adminTeacherFormPanel);
        adminTeacherFormPanel.setLayout(adminTeacherFormPanelLayout);
        adminTeacherFormPanelLayout.setHorizontalGroup(
            adminTeacherFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminTeacherFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminTeacherFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminTeacherFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(adminTeacherFormPanelLayout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        adminTeacherFormPanelLayout.setVerticalGroup(
            adminTeacherFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminTeacherFormPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminTeacherFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminTabbedPane.addTab("Teacher Registation", adminTeacherFormPanel);

        adminCoseFormPanel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel10.setBackground(new java.awt.Color(51, 51, 255));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel18.setText("Cose Name");

        adminCoseNametext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        adminCoseSaveBtn.setBackground(new java.awt.Color(255, 102, 102));
        adminCoseSaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseSaveBtn.setText("Save");
        adminCoseSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCoseSaveBtnActionPerformed(evt);
            }
        });

        adminCoseDeleteBtn.setBackground(new java.awt.Color(153, 0, 153));
        adminCoseDeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseDeleteBtn.setText("Delete");
        adminCoseDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCoseDeleteBtnActionPerformed(evt);
            }
        });

        adminCoseUpdateBtn.setBackground(new java.awt.Color(255, 255, 153));
        adminCoseUpdateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseUpdateBtn.setText("Update");
        adminCoseUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCoseUpdateBtnActionPerformed(evt);
            }
        });

        adminCoseLoadBtn.setBackground(new java.awt.Color(51, 51, 255));
        adminCoseLoadBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseLoadBtn.setText("Exit");
        adminCoseLoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCoseLoadBtnActionPerformed(evt);
            }
        });

        adminCoseClearBtn.setBackground(new java.awt.Color(102, 255, 204));
        adminCoseClearBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseClearBtn.setText("Clear");
        adminCoseClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCoseClearBtnActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel19.setText("Teacher ID");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel20.setText("Payment");

        adminCosePaymenttext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        adminCoseTeacherIdcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseTeacherIdcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminCoseTeacherIdcomboMouseClicked(evt);
            }
        });
        adminCoseTeacherIdcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCoseTeacherIdcomboActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Cose ID");

        adminCoseIDtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(adminCoseNametext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminCoseDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminCoseSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminCoseLoadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminCoseUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminCoseClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(adminCoseTeacherIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(227, 227, 227))
                            .addComponent(adminCosePaymenttext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(adminCoseIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminCoseIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminCoseNametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminCoseTeacherIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(adminCosePaymenttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminCoseSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminCoseUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminCoseDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminCoseClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminCoseLoadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(51, 51, 255));

        adminCoseDataTable.setBackground(new java.awt.Color(204, 255, 204));
        adminCoseDataTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        adminCoseDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminCoseDataTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(adminCoseDataTable);

        adminCoseSearchLable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseSearchLable.setText("Cose ID ");

        adminCoseSearchtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseSearchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminCoseSearchtextKeyPressed(evt);
            }
        });

        adminCoseSearchBtn.setBackground(new java.awt.Color(204, 255, 204));
        adminCoseSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminCoseSearchBtn.setText("Searsh");
        adminCoseSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminCoseSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(adminCoseSearchLable, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminCoseSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminCoseSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminCoseSearchLable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminCoseSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminCoseSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Cose Registion From");

        javax.swing.GroupLayout adminCoseFormPanelLayout = new javax.swing.GroupLayout(adminCoseFormPanel);
        adminCoseFormPanel.setLayout(adminCoseFormPanelLayout);
        adminCoseFormPanelLayout.setHorizontalGroup(
            adminCoseFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminCoseFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminCoseFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(adminCoseFormPanelLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap())
        );
        adminCoseFormPanelLayout.setVerticalGroup(
            adminCoseFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminCoseFormPanelLayout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminCoseFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminCoseFormPanelLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        AdminTabbedPane.addTab("Cose Registation", adminCoseFormPanel);

        adminSubjectFormPanel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel14.setBackground(new java.awt.Color(0, 51, 255));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Subject Name");

        adminSubjectNametext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel29.setText("Credit");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Cose ID");

        adminSubjectSaveBtn.setBackground(new java.awt.Color(255, 153, 153));
        adminSubjectSaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectSaveBtn.setText("Save");
        adminSubjectSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectSaveBtnActionPerformed(evt);
            }
        });

        adminSubjectDeleteBtn.setBackground(new java.awt.Color(102, 102, 255));
        adminSubjectDeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectDeleteBtn.setText("Delete");
        adminSubjectDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectDeleteBtnActionPerformed(evt);
            }
        });

        adminSubjectUpdateBtn.setBackground(new java.awt.Color(255, 255, 153));
        adminSubjectUpdateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectUpdateBtn.setText("Update");
        adminSubjectUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectUpdateBtnActionPerformed(evt);
            }
        });

        adminSubjectExitBtn.setBackground(new java.awt.Color(204, 0, 204));
        adminSubjectExitBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectExitBtn.setText("Exit");
        adminSubjectExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectExitBtnActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel31.setText("Teacher ID");

        adminSubjectCoseCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectCoseCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSubjectCoseComboMouseClicked(evt);
            }
        });

        adminSubjectTeacherIdcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectTeacherIdcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSubjectTeacherIdcomboMouseClicked(evt);
            }
        });

        adminSubjectCreditcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectCreditcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", " " }));
        adminSubjectCreditcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectCreditcomboActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel32.setText("Subject ID");

        adminSubjectIdtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        adminSubjectClearBtn.setBackground(new java.awt.Color(0, 255, 204));
        adminSubjectClearBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectClearBtn.setText("Clear");
        adminSubjectClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(adminSubjectSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(adminSubjectNametext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminSubjectCreditcombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminSubjectCoseCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminSubjectTeacherIdcombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(adminSubjectIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(adminSubjectExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminSubjectClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(adminSubjectUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(adminSubjectDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminSubjectIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminSubjectNametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminSubjectCreditcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminSubjectCoseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminSubjectTeacherIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminSubjectSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminSubjectUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminSubjectDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminSubjectExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminSubjectClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(51, 51, 255));

        adminSubjectDataTable.setBackground(new java.awt.Color(204, 255, 204));
        adminSubjectDataTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        adminSubjectDataTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        adminSubjectDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSubjectDataTableMouseClicked(evt);
            }
        });
        adminSubjectDataTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminSubjectDataTableKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(adminSubjectDataTable);

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel35.setText("Subject ID ");

        adminSubjectSearchtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectSearchtext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSubjectSearchtextMouseClicked(evt);
            }
        });
        adminSubjectSearchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminSubjectSearchtextKeyPressed(evt);
            }
        });

        adminSubjectSearchBtn.setBackground(new java.awt.Color(204, 255, 204));
        adminSubjectSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSubjectSearchBtn.setText("Searsh");
        adminSubjectSearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminSubjectSearchBtnMouseClicked(evt);
            }
        });
        adminSubjectSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubjectSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminSubjectSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminSubjectSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminSubjectSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminSubjectSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Subject Registion From");

        javax.swing.GroupLayout adminSubjectFormPanelLayout = new javax.swing.GroupLayout(adminSubjectFormPanel);
        adminSubjectFormPanel.setLayout(adminSubjectFormPanelLayout);
        adminSubjectFormPanelLayout.setHorizontalGroup(
            adminSubjectFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminSubjectFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminSubjectFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(adminSubjectFormPanelLayout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        adminSubjectFormPanelLayout.setVerticalGroup(
            adminSubjectFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminSubjectFormPanelLayout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminSubjectFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59))
        );

        AdminTabbedPane.addTab("Subject Registion", adminSubjectFormPanel);

        adminTimeTableFormPanel.setBackground(new java.awt.Color(204, 255, 204));

        jPanel12.setBackground(new java.awt.Color(51, 51, 255));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel33.setText("Cose ID ");

        adminTimeTableSearchcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableSearchcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTimeTableSearchcomboMouseClicked(evt);
            }
        });
        adminTimeTableSearchcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTimeTableSearchcomboActionPerformed(evt);
            }
        });

        adminTimeTableDataTable.setBackground(new java.awt.Color(153, 255, 153));
        adminTimeTableDataTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        adminTimeTableDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        adminTimeTableDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTimeTableDataTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(adminTimeTableDataTable);

        adminTimeTableSearchBtn.setBackground(new java.awt.Color(153, 153, 255));
        adminTimeTableSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableSearchBtn.setText("Searsh");
        adminTimeTableSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTimeTableSearchBtnActionPerformed(evt);
            }
        });

        adminteacherRefreshBtn.setBackground(new java.awt.Color(204, 255, 204));
        adminteacherRefreshBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminteacherRefreshBtn.setText("Refrsh");
        adminteacherRefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminteacherRefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTimeTableSearchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminTimeTableSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminteacherRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminTimeTableSearchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminTimeTableSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Time Table");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel34.setText("Subject ID");

        adminTimeTableSubjectIdcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        adminTimeTableSaveBtn.setBackground(new java.awt.Color(255, 153, 153));
        adminTimeTableSaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableSaveBtn.setText("Save");
        adminTimeTableSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTimeTableSaveBtnActionPerformed(evt);
            }
        });

        adminTimeTableDeleteBtn.setBackground(new java.awt.Color(153, 255, 153));
        adminTimeTableDeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableDeleteBtn.setText("Delete");
        adminTimeTableDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTimeTableDeleteBtnActionPerformed(evt);
            }
        });

        adminTimeTableExitBtn.setBackground(new java.awt.Color(102, 102, 255));
        adminTimeTableExitBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableExitBtn.setText("Exit");
        adminTimeTableExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTimeTableExitBtnActionPerformed(evt);
            }
        });

        adminTimeTableUpdateBtn.setBackground(new java.awt.Color(204, 255, 204));
        adminTimeTableUpdateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableUpdateBtn.setText("Update");
        adminTimeTableUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTimeTableUpdateBtnActionPerformed(evt);
            }
        });

        adminTimeTableCoseIDcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel47.setText("Cose ID");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel48.setText("TuesDay");

        adminTimeTableTeacherIdcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        adminTimeTableClearBtn.setBackground(new java.awt.Color(102, 255, 255));
        adminTimeTableClearBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableClearBtn.setText("Clear");
        adminTimeTableClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTimeTableClearBtnActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel49.setText("Teacher ID");

        adminTimeTableWenscombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableWenscombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00AM -9.00AM", "8.00AM -10.00AM", "8.00AM -11.00AM", "8.00AM -12.00PM", "9.00AM-10.00AM", "9.00AM-11.00AM", "9.00AM-12.00PM", "10.00AM-11.00AM", "10.00AM-12.00PM", "11.00-AM-12.00PM", "1.00PM-2.00PM", "1.00PM-3.00PM", "1.00PM-4.00PM", "1.00PM-5.00PM", "1.00PM-6.00PM", "2.00PM-3.00PM", "2.00PM-4.00PM", "2.00PM-5.00PM", "2.00PM-6.00PM", "3.00PM-4.00PM", "3.00PM-5.00PM", "3.00PM-6.00PM", "4.00PM-5.00PM", "4.00PM-6.00PM", "5.00PM-6.00PM" }));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel50.setText("MonDay");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel51.setText("WensDay");

        jLabel52.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel52.setText("ThesDay");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel53.setText("FriDay");

        adminTimeTableThercombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableThercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00AM -9.00AM", "8.00AM -10.00AM", "8.00AM -11.00AM", "8.00AM -12.00PM", "9.00AM-10.00AM", "9.00AM-11.00AM", "9.00AM-12.00PM", "10.00AM-11.00AM", "10.00AM-12.00PM", "11.00-AM-12.00PM", "1.00PM-2.00PM", "1.00PM-3.00PM", "1.00PM-4.00PM", "1.00PM-5.00PM", "1.00PM-6.00PM", "2.00PM-3.00PM", "2.00PM-4.00PM", "2.00PM-5.00PM", "2.00PM-6.00PM", "3.00PM-4.00PM", "3.00PM-5.00PM", "3.00PM-6.00PM", "4.00PM-5.00PM", "4.00PM-6.00PM", "5.00PM-6.00PM" }));

        adminTimeTableFricombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableFricombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00AM -9.00AM", "8.00AM -10.00AM", "8.00AM -11.00AM", "8.00AM -12.00PM", "9.00AM-10.00AM", "9.00AM-11.00AM", "9.00AM-12.00PM", "10.00AM-11.00AM", "10.00AM-12.00PM", "11.00-AM-12.00PM", "1.00PM-2.00PM", "1.00PM-3.00PM", "1.00PM-4.00PM", "1.00PM-5.00PM", "1.00PM-6.00PM", "2.00PM-3.00PM", "2.00PM-4.00PM", "2.00PM-5.00PM", "2.00PM-6.00PM", "3.00PM-4.00PM", "3.00PM-5.00PM", "3.00PM-6.00PM", "4.00PM-5.00PM", "4.00PM-6.00PM", "5.00PM-6.00PM" }));
        adminTimeTableFricombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTimeTableFricomboActionPerformed(evt);
            }
        });

        adminTimeTableMoncombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableMoncombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00AM -9.00AM", "8.00AM -10.00AM", "8.00AM -11.00AM", "8.00AM -12.00PM", "9.00AM-10.00AM", "9.00AM-11.00AM", "9.00AM-12.00PM", "10.00AM-11.00AM", "10.00AM-12.00PM", "11.00-AM-12.00PM", "1.00PM-2.00PM", "1.00PM-3.00PM", "1.00PM-4.00PM", "1.00PM-5.00PM", "1.00PM-6.00PM", "2.00PM-3.00PM", "2.00PM-4.00PM", "2.00PM-5.00PM", "2.00PM-6.00PM", "3.00PM-4.00PM", "3.00PM-5.00PM", "3.00PM-6.00PM", "4.00PM-5.00PM", "4.00PM-6.00PM", "5.00PM-6.00PM" }));

        adminTimeTableTuecombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableTuecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00AM -9.00AM", "8.00AM -10.00AM", "8.00AM -11.00AM", "8.00AM -12.00PM", "9.00AM-10.00AM", "9.00AM-11.00AM", "9.00AM-12.00PM", "10.00AM-11.00AM", "10.00AM-12.00PM", "11.00-AM-12.00PM", "1.00PM-2.00PM", "1.00PM-3.00PM", "1.00PM-4.00PM", "1.00PM-5.00PM", "1.00PM-6.00PM", "2.00PM-3.00PM", "2.00PM-4.00PM", "2.00PM-5.00PM", "2.00PM-6.00PM", "3.00PM-4.00PM", "3.00PM-5.00PM", "3.00PM-6.00PM", "4.00PM-5.00PM", "4.00PM-6.00PM", "5.00PM-6.00PM" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminTimeTableThercombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminTimeTableFricombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminTimeTableWenscombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminTimeTableMoncombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminTimeTableTuecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(adminTimeTableCoseIDcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminTimeTableSubjectIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminTimeTableTeacherIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adminTimeTableClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adminTimeTableUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adminTimeTableSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminTimeTableDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(adminTimeTableExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTimeTableCoseIDcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTimeTableSubjectIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminTimeTableTeacherIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminTimeTableMoncombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adminTimeTableTuecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminTimeTableWenscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminTimeTableThercombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminTimeTableFricombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminTimeTableSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminTimeTableDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminTimeTableClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminTimeTableUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminTimeTableExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout adminTimeTableFormPanelLayout = new javax.swing.GroupLayout(adminTimeTableFormPanel);
        adminTimeTableFormPanel.setLayout(adminTimeTableFormPanelLayout);
        adminTimeTableFormPanelLayout.setHorizontalGroup(
            adminTimeTableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminTimeTableFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminTimeTableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminTimeTableFormPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        adminTimeTableFormPanelLayout.setVerticalGroup(
            adminTimeTableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminTimeTableFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminTimeTableFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminTimeTableFormPanelLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        AdminTabbedPane.addTab("Time Table", adminTimeTableFormPanel);

        adminAdminFormPanel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel20.setBackground(new java.awt.Color(51, 51, 255));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel54.setText("Admin ID");

        adminFnametext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel55.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel55.setText("Last Name");

        adminLnametex.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel56.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel56.setText("Age");

        adminAgetext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel57.setText("Birthday");

        adminBirthdaytext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel58.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel58.setText("Address");

        adminAddresstext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel59.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel59.setText("Email");

        adminEmailtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel60.setText("NIC");

        adminNictext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        adminSalarytext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel61.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel61.setText("Salary");

        jLabel62.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel62.setText("Frist Name");

        admintext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(221, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(admintext, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminFnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminSalarytext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminLnametex, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminAgetext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminBirthdaytext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminAddresstext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminEmailtext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminNictext, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admintext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adminFnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminLnametex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminAgetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminBirthdaytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminAddresstext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminEmailtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminNictext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminSalarytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel21.setBackground(new java.awt.Color(51, 51, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Admin ID ");

        adminSearchtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSearchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminSearchtextKeyPressed(evt);
            }
        });

        adminteacherSearchBtn1.setBackground(new java.awt.Color(255, 0, 0));
        adminteacherSearchBtn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminteacherSearchBtn1.setText("Searsh");
        adminteacherSearchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminteacherSearchBtn1ActionPerformed(evt);
            }
        });

        adminSaveBtn.setBackground(new java.awt.Color(255, 51, 204));
        adminSaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminSaveBtn.setText("Save");
        adminSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSaveBtnActionPerformed(evt);
            }
        });

        adminDeleteBtn.setBackground(new java.awt.Color(102, 255, 204));
        adminDeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminDeleteBtn.setText("Delete");
        adminDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDeleteBtnActionPerformed(evt);
            }
        });

        adminUpdateBtn.setBackground(new java.awt.Color(51, 255, 51));
        adminUpdateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminUpdateBtn.setText("Update");
        adminUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUpdateBtnActionPerformed(evt);
            }
        });

        adminClearBtn.setBackground(new java.awt.Color(0, 51, 204));
        adminClearBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminClearBtn.setText("Clear");
        adminClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminClearBtnActionPerformed(evt);
            }
        });

        adminExitBtn.setBackground(new java.awt.Color(0, 204, 204));
        adminExitBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminExitBtn.setText("Exit");
        adminExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminExitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(adminSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(adminDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(adminUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(adminClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(adminExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(adminSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminteacherSearchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminteacherSearchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(476, 476, 476)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminExitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Teacher Registation From");

        adminDataTable.setBackground(new java.awt.Color(255, 255, 153));
        adminDataTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        adminDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDataTableMouseClicked(evt);
            }
        });
        adminDataTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminDataTableKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(adminDataTable);

        javax.swing.GroupLayout adminAdminFormPanelLayout = new javax.swing.GroupLayout(adminAdminFormPanel);
        adminAdminFormPanel.setLayout(adminAdminFormPanelLayout);
        adminAdminFormPanelLayout.setHorizontalGroup(
            adminAdminFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAdminFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(adminAdminFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminAdminFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(adminAdminFormPanelLayout.createSequentialGroup()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        adminAdminFormPanelLayout.setVerticalGroup(
            adminAdminFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminAdminFormPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(adminAdminFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminAdminFormPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminTabbedPane.addTab("Admin Registation", adminAdminFormPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(AdminTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AdminTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminstudentClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminstudentClearBtnActionPerformed
        studentFromClear();
    }//GEN-LAST:event_adminstudentClearBtnActionPerformed

    private void adminstudentUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminstudentUpdateBtnActionPerformed
            try {
                String id = adminstudentIdtext.getText();
                String studentFname = adminstudentFnametext.getText();
                String studentLname = adminstudentLnametext.getText();
                int studentAge = Integer.parseInt(adminstudentAgetext.getText());

                // Convert birthday to SQL Date
                String studentBirthdayStr = adminstudentBirthdaytext.getText();
                java.sql.Date studentBirthday = java.sql.Date.valueOf(studentBirthdayStr); // Ensure format is YYYY-MM-DD

                String studentAddress = adminstudentAddresstext.getText();
                String studentEmail = adminstudentEmailtext.getText();

                // Fix NIC: Change from int to String if the database column is VARCHAR
                String studentNic = adminstudentNictext.getText();

                // Construct the UPDATE SQL query
                String query = "UPDATE Student SET student_first_name = ?, student_last_name = ?, student_age = ?, " +
                       "student_birthday = ?, student_address = ?, student_email = ?, student_nic = ? WHERE student_code = ?";

                // Call the update method
                int rowsUpdated = adminController.updateData(query, studentFname, studentLname, studentAge, studentBirthday, studentAddress, studentEmail, studentNic, id);
                
                if (rowsUpdated > 0) {
                    
                    JOptionPane.showMessageDialog(null, "Student details updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No record found to update!", "Update Failed", JOptionPane.WARNING_MESSAGE);
                }

                // Refresh table data
                adminstudentDataTable.setModel(adminController.getTableModel(studentsQueryTableLoad));
                studentFromClear();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid number format: " + e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Invalid date format. Use YYYY-MM-DD.", "Date Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminstudentUpdateBtnActionPerformed

    private void adminteacherUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherUpdateBtnActionPerformed
        // UI Code for Capturing Input and Calling the Update Method
        try {
            // Trim input fields to remove leading/trailing spaces
            String id = adminteacherIdtext.getText().trim();
            String adminteacherFname = adminteacherFnametext.getText().trim();
            String adminteacherLname = adminteacherLnametext.getText().trim();
            String adminteacherAddress = adminteacherAddresstext.getText().trim();
            String adminteacherEmail = adminteacherEmailtext.getText().trim();

            // Convert age, NIC, and salary to numeric values
            int adminteacherAge = Integer.parseInt(adminteacherAgetext.getText().trim());
            String adminteacherNic = adminteacherNictext.getText().trim(); // Change to String if NIC is alphanumeric
            double adminteacherSalary = Double.parseDouble(adminteacherSalarytext.getText().trim());

            // Convert birthday to SQL Date format
            String adminteacherBirthdayStr = adminteacherBirthdaytext.getText().trim();
            java.sql.Date adminteacherBirthday = java.sql.Date.valueOf(adminteacherBirthdayStr); // Ensure format is YYYY-MM-DD

            // Corrected SQL Query
            String query = "UPDATE Teacher SET teacher_first_name=?, teacher_last_name=?, teacher_age=?, teacher_birthday=?, teacher_address=?, teacher_email=?, teacher_nic=?, teacher_salary=? WHERE teacher_code=?";
 
            // Call the update function with correct parameter order
            int rowsAffected = adminController.updateData(query, adminteacherFname, adminteacherLname, adminteacherAge, adminteacherBirthday, adminteacherAddress, adminteacherEmail, adminteacherNic, adminteacherSalary, id);

            if (rowsAffected > 0) {
                // Refresh table after update
                adminTeacherDataTable.setModel(adminController.getTableModel(teacherQueryTableLoad));
                techerFromClear();

                // Show success message
                JOptionPane.showMessageDialog(null, "Teacher information updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No records updated. Please check if the teacher exists.", "Update Failed", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numeric values for Age, NIC, and Salary.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Invalid date format. Use YYYY-MM-DD.", "Date Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_adminteacherUpdateBtnActionPerformed

    private void adminCoseUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCoseUpdateBtnActionPerformed
        // Calling the update method
        try {
            String courseId = adminCoseIDtext.getText().trim();
            String courseName = adminCoseNametext.getText().trim();
    
            // Validate Payment Input
            String paymentText = adminCosePaymenttext.getText().trim();
            double payment;
            try {
                payment = Double.parseDouble(paymentText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid payment value!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            String teacherId = adminController.getComboBoxValue(adminCoseTeacherIdcombo);
    
            // Validate that teacherId is not null or empty
            if (teacherId == null || teacherId.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select a valid teacher ID!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Define SQL Update Query
            String query = "UPDATE Course SET course_name=?, teacher_code=?, course_payment=? WHERE course_id=?";
    
            // Call the update method
            int rowsUpdated = adminController.updateData(query, courseName, teacherId, payment, courseId);

            // Show success message if update was successful
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                adminCoseDataTable.setModel(adminController.getTableModel(courseQueryTableLoad));
                courseFromClear(); // Clear the form after update
            } else {
                JOptionPane.showMessageDialog(null, "No records updated. Check Course ID.", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
       
    }//GEN-LAST:event_adminCoseUpdateBtnActionPerformed

    private void adminCoseTeacherIdcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCoseTeacherIdcomboActionPerformed
       
    }//GEN-LAST:event_adminCoseTeacherIdcomboActionPerformed

    private void adminSubjectUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectUpdateBtnActionPerformed
            try {
                String subjectId = adminSubjectIdtext.getText();
                String subjectName = adminSubjectNametext.getText();
                int credit =  Integer.parseInt(adminController.getComboBoxValue(adminSubjectCreditcombo));
                String coursId =adminController.getComboBoxValue(adminSubjectCoseCombo);
                String teacherId = adminController.getComboBoxValue(adminSubjectTeacherIdcombo);
                
                String query = "UPDATE Subject SET subject_name=?, subject_credit=?, course_id=?,teacher_code=? WHERE subject_id=?";
                adminController.updateData(query, subjectName,credit,coursId,teacherId,subjectId);
                 
                adminSubjectDataTable.setModel(adminController.getTableModel(subjectQueryTableLoad));
                subjectFromClear();
                JOptionPane.showMessageDialog(null, "Data updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception ex) {
                System.err.println("Unexpected error: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
    }//GEN-LAST:event_adminSubjectUpdateBtnActionPerformed

    private void adminSubjectCreditcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectCreditcomboActionPerformed
        
    }//GEN-LAST:event_adminSubjectCreditcomboActionPerformed

    private void adminTimeTableSearchcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableSearchcomboActionPerformed
        
    }//GEN-LAST:event_adminTimeTableSearchcomboActionPerformed

    private void adminTimeTableUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableUpdateBtnActionPerformed
        try {
            String coseId =adminController.getComboBoxValue(adminTimeTableCoseIDcombo);
            String subjectId =adminController.getComboBoxValue(adminTimeTableSubjectIdcombo);
            String teacherId =adminController.getComboBoxValue(adminTimeTableTeacherIdcombo);
            String mon =adminController.getComboBoxValue(adminTimeTableMoncombo);
            String tuse =adminController.getComboBoxValue(adminTimeTableTuecombo);
            String wens =adminController.getComboBoxValue(adminTimeTableWenscombo);
            String ther =adminController.getComboBoxValue(adminTimeTableThercombo);
            String fri =adminController.getComboBoxValue(adminTimeTableFricombo);
            int id =0;
            try {
                int selectedRow = adminTimeTableDataTable.getSelectedRow();
                System.out.println("Selected Row: " + selectedRow);
                if (selectedRow != -1) { 
                     id =Integer.parseInt(adminController.getValue(adminTimeTableDataTable, selectedRow, 0)); 
                }
            } catch (Exception ex) {
                System.err.println("Unexpected error: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            String query = "UPDATE TimeTable SET course_id=?, subject_id=?, teacher_code=?,time_mon=?, time_tue=?, time_wed=?, time_thu=?, time_fri=? WHERE timetable_id=?";
            adminController.updateData(query, coseId,subjectId,teacherId,mon,tuse,wens,ther,fri,id);
            timeTableFromClear();
            adminTimeTableDataTable.setModel(adminController.getTableModel(timeTableQueryTableLoad));
            JOptionPane.showMessageDialog(null, "Data updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminTimeTableUpdateBtnActionPerformed

    private void adminTimeTableFricomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableFricomboActionPerformed
        
    }//GEN-LAST:event_adminTimeTableFricomboActionPerformed

    private void adminstudentsearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminstudentsearchBtnActionPerformed
       String searchValue = searchTextField.getText();
       String query = "SELECT * FROM Student WHERE student_code LIKE ?";
       adminstudentDataTable.setModel(adminController.searchData(searchValue,query));
       searchTextField.setText("");
    }//GEN-LAST:event_adminstudentsearchBtnActionPerformed

    private void adminteacherClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherClearBtnActionPerformed
        techerFromClear();
    }//GEN-LAST:event_adminteacherClearBtnActionPerformed

    private void adminstudentExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminstudentExitBtnActionPerformed
       adminController.exit();
    }//GEN-LAST:event_adminstudentExitBtnActionPerformed

    private void adminstudentDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminstudentDeleteBtnActionPerformed
        String id =adminstudentIdtext.getText();  // Assuming NIC holds the student ID
        String query = "DELETE FROM Student WHERE  student_code=?";
        adminController.deleteData(query, id);
        studentFromClear();
        adminstudentDataTable.setModel(adminController.getTableModel(studentsQueryTableLoad));
    }//GEN-LAST:event_adminstudentDeleteBtnActionPerformed

    private void adminteacherSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherSaveBtnActionPerformed
        // Capture input from UI elements and call the method
        try {
            String id = adminteacherIdtext.getText();
            String adminteacherFname = adminteacherFnametext.getText();
            String adminteacherLname = adminteacherLnametext.getText();
            int adminteacherAge = Integer.parseInt(adminteacherAgetext.getText());
            String adminteacherBirthday = adminteacherBirthdaytext.getText();
            String adminteacherAddress = adminteacherAddresstext.getText();
            String adminteacherEmail = adminteacherEmailtext.getText();
            int adminteacherNic = Integer.parseInt(adminteacherNictext.getText());
            double adminteacherSalary = Double.parseDouble(adminteacherSalarytext.getText());

            
            String table = "Teacher";
            String[] columns = {"teacher_code", "teacher_first_name", "teacher_last_name", "teacher_age", "teacher_birthday", "teacher_address", "teacher_email", "teacher_nic", "teacher_salary"};
            Object[] values = {id, adminteacherFname, adminteacherLname, adminteacherAge,adminteacherBirthday,adminteacherAddress,adminteacherEmail,adminteacherNic,adminteacherSalary};
           
            
            adminController.insertData(table, columns, values);
            // Refresh the data table
            
            boolean isInserted = adminController.insertData(table, columns, values);

            if (isInserted) {
                JOptionPane.showMessageDialog(null, "Teacher added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                adminTeacherDataTable.setModel(adminController.getTableModel(teacherQueryTableLoad));
                techerFromClear(); // Clear form only if insert was successful
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add teacher!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numeric values for Age, NIC, and Salary.", "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Invalid date format. Use YYYY-MM-DD.", "Date Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }   

    }//GEN-LAST:event_adminteacherSaveBtnActionPerformed

    private void adminstudentSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminstudentSaveBtnActionPerformed
        try {
            String id = adminstudentIdtext.getText();
            String studentFname = adminstudentFnametext.getText();
            String studentLname = adminstudentLnametext.getText();
            int studentAge = Integer.parseInt(adminstudentAgetext.getText());
        
            // Convert birthday to SQL Date format
            String studentBirthdayStr = adminstudentBirthdaytext.getText();
            java.sql.Date studentBirthday = java.sql.Date.valueOf(studentBirthdayStr); // Ensure input is YYYY-MM-DD

            String studentAddress = adminstudentAddresstext.getText();
            String studentEmail = adminstudentEmailtext.getText();
        
            // Fix NIC: Change from int to String if database column is VARCHAR
            String studentNic = adminstudentNictext.getText();

            String table = "Student";
            String[] columns = {"student_code", "student_first_name", "student_last_name", "student_age", "student_birthday", "student_address", "student_email", "student_nic"};
            Object[] values = {id, studentFname, studentLname, studentAge, studentBirthday, studentAddress, studentEmail, studentNic};

            // Check if insertion is successful
            boolean isInserted = adminController.insertData(table, columns, values);

            if (isInserted) {
                studentFromClear();
                adminstudentDataTable.setModel(adminController.getTableModel(studentsQueryTableLoad));
                JOptionPane.showMessageDialog(null, "Student saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to save student!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid number format: " + e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Invalid date format. Use YYYY-MM-DD.", "Date Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_adminstudentSaveBtnActionPerformed

    private void adminteacherExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherExitBtnActionPerformed
        adminController.exit();
    }//GEN-LAST:event_adminteacherExitBtnActionPerformed
   
    private void adminstudentDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminstudentDataTableMouseClicked
        SwingUtilities.invokeLater(() -> {
            int selectedRow = adminstudentDataTable.getSelectedRow();
            System.out.println("Selected Row: " + selectedRow); // Debugging

            if (selectedRow != -1) {
                adminstudentIdtext.setText(adminController.getValue(adminstudentDataTable, selectedRow, 0));
                adminstudentFnametext.setText(adminController.getValue(adminstudentDataTable, selectedRow, 1));
                adminstudentLnametext.setText(adminController.getValue(adminstudentDataTable, selectedRow, 2));
                adminstudentAgetext.setText(adminController.getValue(adminstudentDataTable, selectedRow, 3));
                adminstudentBirthdaytext.setText(adminController.getValue(adminstudentDataTable, selectedRow, 4));
                adminstudentAddresstext.setText(adminController.getValue(adminstudentDataTable, selectedRow, 5));
                adminstudentEmailtext.setText(adminController.getValue(adminstudentDataTable, selectedRow, 6));
                adminstudentNictext.setText(adminController.getValue(adminstudentDataTable, selectedRow, 7));
            }
        });

    }//GEN-LAST:event_adminstudentDataTableMouseClicked

    private void adminCoseLoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCoseLoadBtnActionPerformed
       adminController.exit();
    }//GEN-LAST:event_adminCoseLoadBtnActionPerformed

    private void adminSubjectExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectExitBtnActionPerformed
        adminController.exit();
    }//GEN-LAST:event_adminSubjectExitBtnActionPerformed

    private void adminTimeTableExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableExitBtnActionPerformed
        adminController.exit();
    }//GEN-LAST:event_adminTimeTableExitBtnActionPerformed

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
       String searchValue = searchTextField.getText();
       String query = "SELECT * FROM Student WHERE student_code LIKE ? ";
       adminstudentDataTable.setModel(adminController.searchData(searchValue,query));
       
    }//GEN-LAST:event_searchTextFieldKeyPressed

    private void adminstudentDataTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminstudentDataTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_adminstudentDataTableMouseEntered

    private void adminTeacherDataTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminTeacherDataTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminTeacherDataTableKeyPressed

    private void adminTeacherDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTeacherDataTableMouseClicked
        
        SwingUtilities.invokeLater(() -> {
            int selectedRow = adminTeacherDataTable.getSelectedRow();
            System.out.println("Selected Row: " + selectedRow); // Debugging

            if (selectedRow != -1) {
                adminteacherIdtext.setText(adminController.getValue(adminTeacherDataTable, selectedRow, 0));
                adminteacherFnametext.setText(adminController.getValue(adminTeacherDataTable, selectedRow, 1));
                adminteacherLnametext.setText(adminController.getValue(adminTeacherDataTable, selectedRow, 2));
                adminteacherAgetext.setText(adminController.getValue(adminTeacherDataTable, selectedRow, 3));
                adminteacherBirthdaytext.setText(adminController.getValue(adminTeacherDataTable, selectedRow, 4));
                adminteacherAddresstext.setText(adminController.getValue(adminTeacherDataTable, selectedRow, 5));
                adminteacherEmailtext.setText(adminController.getValue(adminTeacherDataTable, selectedRow, 6));
                adminteacherNictext.setText(adminController.getValue(adminTeacherDataTable, selectedRow, 7));
                adminteacherSalarytext.setText(adminController.getValue(adminTeacherDataTable, selectedRow, 8));
            }
        });
       
    }//GEN-LAST:event_adminTeacherDataTableMouseClicked

    private void adminteacherDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherDeleteBtnActionPerformed
         try {
        // Ensure the ID is valid
        String id = adminteacherIdtext.getText().trim();
        String query = "DELETE FROM Teacher WHERE  teacher_code=?";

        // Confirmation Dialog before Deletion
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this teacher?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            adminController.deleteData(query,id);

            // Refresh Table After Deletion
            adminTeacherDataTable.setModel(adminController.getTableModel(teacherQueryTableLoad));
            techerFromClear();
            // Show Success Message
            JOptionPane.showMessageDialog(null, "Teacher deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(null, "Invalid Teacher ID. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "An unexpected error occurred while deleting the teacher.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_adminteacherDeleteBtnActionPerformed

    private void adminteacherSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherSearchBtnActionPerformed
        // TODO add your handling code here:
       String searchValue=adminTeacherSearchtext.getText();
       String query = "SELECT * FROM Teacher WHERE teacher_code LIKE ? ";
       adminTeacherDataTable.setModel(adminController.searchData(searchValue,query));
       adminTeacherSearchtext.setText("");
        
    }//GEN-LAST:event_adminteacherSearchBtnActionPerformed

    private void adminTeacherSearchtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminTeacherSearchtextKeyPressed
        // TODO add your handling code here:
        String searchValue=adminTeacherSearchtext.getText();
        String query = "SELECT * FROM Teacher WHERE teacher_code LIKE ? ";
       adminTeacherDataTable.setModel(adminController.searchData(searchValue,query));
       
    }//GEN-LAST:event_adminTeacherSearchtextKeyPressed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void adminCoseTeacherIdcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminCoseTeacherIdcomboMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_adminCoseTeacherIdcomboMouseClicked

    private void adminCoseSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCoseSaveBtnActionPerformed
        // TODO add your handling code here:
        
        try {
            String courseId = adminCoseIDtext.getText().trim();
            String courseName = adminCoseNametext.getText().trim();
            Double payment = Double.parseDouble(adminCosePaymenttext.getText().trim());           
            String teacherId = adminController.getComboBoxValue(adminCoseTeacherIdcombo).trim();

            String table = "Course";
            String[] columns = {"course_id", "course_name", "teacher_code", "course_payment"};
            Object[] values = {courseId, courseName, teacherId, payment};

            boolean isInserted = adminController.insertData(table, columns, values);
    
            if (isInserted) {
                adminCoseDataTable.setModel(adminController.getTableModel(courseQueryTableLoad));
                courseFromClear();
                JOptionPane.showMessageDialog(null, "Course added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add course.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        
    }//GEN-LAST:event_adminCoseSaveBtnActionPerformed

    private void adminCoseDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCoseDeleteBtnActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = adminCoseDataTable.getSelectedRow();
            System.out.println("Selected Row: " + selectedRow);
            String id = null;
            String query = "DELETE FROM Course WHERE  course_id=?";
            if (selectedRow != -1) {
                id =adminController.getValue(adminCoseDataTable, selectedRow, 0);
            }
            adminController.deleteData(query, id);
            adminCoseDataTable.setModel(adminController.getTableModel(courseQueryTableLoad));
            JOptionPane.showMessageDialog(null, "Data delete successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            courseFromClear();
            
        } catch (Exception e) {
            System.err.println("Error"+e);
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while deleting the teacher.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_adminCoseDeleteBtnActionPerformed

    private void adminCoseClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCoseClearBtnActionPerformed
        // TODO add your handling code here:
        courseFromClear();
    }//GEN-LAST:event_adminCoseClearBtnActionPerformed

    private void adminCoseSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminCoseSearchBtnActionPerformed
        // TODO add your handling code here:
        try {
            String value =adminCoseSearchtext.getText();
            String query = "SELECT * FROM Course WHERE course_id LIKE ? ";
            adminController.searchData(value, query);
            adminCoseDataTable.setModel(adminController.searchData(value, query));    
            adminCoseSearchtext.setText("");
        } catch (Exception e) {
            System.err.println("Error"+e);
            adminCoseSearchtext.setText("");
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while deleting the teacher.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_adminCoseSearchBtnActionPerformed

    private void adminCoseSearchtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminCoseSearchtextKeyPressed
        // TODO add your handling code here:
        try {
            String value =adminCoseSearchtext.getText();
            String query = "SELECT * FROM Course WHERE course_id LIKE ? ";
            adminController.searchData(value, query);
            adminCoseDataTable.setModel(adminController.searchData(value, query));    
            
        } catch (Exception e) {
            System.err.println("Error"+e);
            adminCoseSearchtext.setText("");
            JOptionPane.showMessageDialog(null, "An unexpected error occurred while deleting the teacher.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminCoseSearchtextKeyPressed

    private void adminCoseDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminCoseDataTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = adminCoseDataTable.getSelectedRow();
            System.out.println("Selected Row: " + selectedRow);
            if (selectedRow != -1) {
                  
                adminCoseIDtext.setText(adminController.getValue(adminCoseDataTable, selectedRow, 0));
                adminCoseNametext.setText(adminController.getValue(adminCoseDataTable, selectedRow, 1));
               adminCoseTeacherIdcombo.setSelectedItem(adminController.getValue(adminCoseDataTable, selectedRow, 2)); 
                adminCosePaymenttext.setText(adminController.getValue(adminCoseDataTable, selectedRow, 3));
                  
            }
    }//GEN-LAST:event_adminCoseDataTableMouseClicked

    private void adminSubjectSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectSaveBtnActionPerformed
        // TODO add your handling code here:
        try {
            String subjectId = adminSubjectIdtext.getText();
            String subjectName = adminSubjectNametext.getText();
            int credit =  Integer.parseInt(adminController.getComboBoxValue(adminSubjectCreditcombo));
            String coursId =adminController.getComboBoxValue(adminSubjectCoseCombo);
            String teacherId = adminController.getComboBoxValue(adminSubjectTeacherIdcombo);

            String table = "Subject";
            String[] columns = {"subject_id", "subject_name", "subject_credit", "course_id","teacher_code"};
            Object[] values = {subjectId, subjectName, credit, coursId,teacherId};

            adminController.insertData(table, columns, values);
            adminSubjectDataTable.setModel(adminController.getTableModel(subjectQueryTableLoad));
            subjectFromClear();
            JOptionPane.showMessageDialog(null, "Course added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_adminSubjectSaveBtnActionPerformed

    private void adminSubjectCoseComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSubjectCoseComboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminSubjectCoseComboMouseClicked

    private void adminSubjectTeacherIdcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSubjectTeacherIdcomboMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminSubjectTeacherIdcomboMouseClicked

    private void adminSubjectDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectDeleteBtnActionPerformed
        // TODO add your handling code here:
        try {
            String subjectId = adminSubjectIdtext.getText();
            String query = "DELETE FROM Subject WHERE  subject_id=?";
            adminController.deleteData(query, subjectId);
            
            adminSubjectDataTable.setModel(adminController.getTableModel(subjectQueryTableLoad));
            subjectFromClear();
            JOptionPane.showMessageDialog(null, "Data delete successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminSubjectDeleteBtnActionPerformed

    private void adminSubjectDataTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminSubjectDataTableKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_adminSubjectDataTableKeyPressed

    private void adminSubjectDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSubjectDataTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = adminSubjectDataTable.getSelectedRow();
            System.out.println("Selected Row: " + selectedRow);
            if (selectedRow != -1) { 
               adminSubjectIdtext.setText(adminController.getValue(adminSubjectDataTable, selectedRow, 0));
               adminSubjectNametext.setText(adminController.getValue(adminSubjectDataTable, selectedRow, 1));
               adminSubjectCreditcombo.setSelectedItem(adminController.getValue(adminSubjectDataTable, selectedRow, 2)); 
               adminSubjectCoseCombo.setSelectedItem(adminController.getValue(adminSubjectDataTable, selectedRow, 3)); 
               adminSubjectTeacherIdcombo.setSelectedItem(adminController.getValue(adminSubjectDataTable, selectedRow, 4)); 
            }
    }//GEN-LAST:event_adminSubjectDataTableMouseClicked

    private void adminSubjectClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminSubjectClearBtnActionPerformed

    private void adminSubjectSearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSubjectSearchBtnMouseClicked
        // TODO add your handling code here:
        try {
            String searchValue =adminSubjectSearchtext.getText();
            String query = "SELECT * FROM Subject WHERE subject_id LIKE ? ";
            adminSubjectDataTable.setModel(adminController.searchData(searchValue, query));
            adminSubjectSearchtext.setText("");
            
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            adminSubjectSearchtext.setText("");
        }
        
    }//GEN-LAST:event_adminSubjectSearchBtnMouseClicked

    private void adminSubjectSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubjectSearchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminSubjectSearchBtnActionPerformed

    private void adminSubjectSearchtextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminSubjectSearchtextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminSubjectSearchtextMouseClicked

    private void adminSubjectSearchtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminSubjectSearchtextKeyPressed
        // TODO add your handling code here:
         try {
            String searchValue =adminSubjectSearchtext.getText();
            String query = "SELECT * FROM Subject WHERE subject_id LIKE ? ";
            adminSubjectDataTable.setModel(adminController.searchData(searchValue, query));
            
            
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            adminSubjectSearchtext.setText("");
        }
    }//GEN-LAST:event_adminSubjectSearchtextKeyPressed

    private void adminTimeTableSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableSaveBtnActionPerformed
        
        try {
            String coseId =adminController.getComboBoxValue(adminTimeTableCoseIDcombo);
            String subjectId =adminController.getComboBoxValue(adminTimeTableSubjectIdcombo);
            String teacherId =adminController.getComboBoxValue(adminTimeTableTeacherIdcombo);
            String mon =adminController.getComboBoxValue(adminTimeTableMoncombo);
            String tuse =adminController.getComboBoxValue(adminTimeTableTuecombo);
            String wens =adminController.getComboBoxValue(adminTimeTableWenscombo);
            String ther =adminController.getComboBoxValue(adminTimeTableThercombo);
            String fri =adminController.getComboBoxValue(adminTimeTableFricombo);
            
            String table = "TimeTable";
            String[] columns = {"course_id", "subject_id", "teacher_code", "time_mon","time_tue","time_wed","time_thu","time_fri"};
            Object[] values = {coseId, subjectId, teacherId, mon,tuse,wens,ther,fri};

            boolean isInserted = adminController.insertData(table, columns, values);
            adminTimeTableDataTable.setModel(adminController.getTableModel(timeTableQueryTableLoad));
            timeTableFromClear();
            JOptionPane.showMessageDialog(null, "Data delete successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminTimeTableSaveBtnActionPerformed

    private void adminTimeTableSearchcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTimeTableSearchcomboMouseClicked
        // TODO add your handling code here:
        try {
            String searchValue =adminController.getComboBoxValue(adminTimeTableSearchcombo);
            String query = "SELECT * FROM TimeTable WHERE course_id LIKE ? ";
            adminTimeTableDataTable.setModel(adminController.searchData(searchValue, query));
            
            
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_adminTimeTableSearchcomboMouseClicked

    private void adminTimeTableDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableDeleteBtnActionPerformed
        // TODO add your handling code here:
        try {
            
            String id = null ;
            String query = "DELETE FROM TimeTable WHERE  timetable_id=?";
            try {
                int selectedRow = adminTimeTableDataTable.getSelectedRow();
                System.out.println("Selected Row: " + selectedRow);
                if (selectedRow != -1) { 
                     id =adminController.getValue(adminTimeTableDataTable, selectedRow, 0); 
                }
                adminController.deleteData(query, id);
                JOptionPane.showMessageDialog(null, "Data delete successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                timeTableFromClear();
                adminTimeTableDataTable.setModel(adminController.getTableModel(timeTableQueryTableLoad));
                
            } catch (Exception ex) {
                System.err.println("Unexpected error: " + ex.getMessage());
                JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
            
            
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminTimeTableDeleteBtnActionPerformed

    private void adminTimeTableDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTimeTableDataTableMouseClicked
        // TODO add your handling code here:
        try {
            int selectedRow = adminTimeTableDataTable.getSelectedRow();
            System.out.println("Selected Row: " + selectedRow);
            if (selectedRow != -1) { 
               adminTimeTableCoseIDcombo.setSelectedItem(adminController.getValue(adminTimeTableDataTable, selectedRow, 1)); 
               adminTimeTableSubjectIdcombo.setSelectedItem(adminController.getValue(adminTimeTableDataTable, selectedRow, 2));
               adminTimeTableTeacherIdcombo.setSelectedItem(adminController.getValue(adminTimeTableDataTable, selectedRow, 3));
               adminTimeTableMoncombo.setSelectedItem(adminController.getValue(adminTimeTableDataTable, selectedRow, 4));
               adminTimeTableTuecombo.setSelectedItem(adminController.getValue(adminTimeTableDataTable, selectedRow, 5));
               adminTimeTableWenscombo.setSelectedItem(adminController.getValue(adminTimeTableDataTable, selectedRow, 6));
               adminTimeTableThercombo.setSelectedItem(adminController.getValue(adminTimeTableDataTable, selectedRow, 7));
               adminTimeTableFricombo.setSelectedItem(adminController.getValue(adminTimeTableDataTable, selectedRow, 8));
               
               
            }
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_adminTimeTableDataTableMouseClicked

    private void adminTimeTableClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableClearBtnActionPerformed
        // TODO add your handling code here:
        timeTableFromClear();
    }//GEN-LAST:event_adminTimeTableClearBtnActionPerformed

    private void adminDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDataTableMouseClicked
        // TODO add your handling code here:
        SwingUtilities.invokeLater(() -> {
            int selectedRow = adminDataTable.getSelectedRow();
            System.out.println("Selected Row: " + selectedRow); // Debugging

            if (selectedRow != -1) {
                admintext.setText(adminController.getValue(adminDataTable, selectedRow, 0));
                adminFnametext.setText(adminController.getValue(adminDataTable, selectedRow, 1));
                adminLnametex.setText(adminController.getValue(adminDataTable, selectedRow, 2));
                adminAgetext.setText(adminController.getValue(adminDataTable, selectedRow, 3));
                adminBirthdaytext.setText(adminController.getValue(adminDataTable, selectedRow, 4));
                adminAddresstext.setText(adminController.getValue(adminDataTable, selectedRow, 5));
                adminEmailtext.setText(adminController.getValue(adminDataTable, selectedRow, 6));
                adminNictext.setText(adminController.getValue(adminDataTable, selectedRow, 7));
                adminSalarytext.setText(adminController.getValue(adminDataTable, selectedRow, 8));
            }
        });
    }//GEN-LAST:event_adminDataTableMouseClicked

    private void adminDataTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminDataTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminDataTableKeyPressed

    private void adminSearchtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminSearchtextKeyPressed
        // TODO add your handling code here:
        try {
            String searchValue =adminSearchtext.getText();
            String query = "SELECT * FROM Admin WHERE admin_code LIKE ?";
            adminDataTable.setModel(adminController.searchData(searchValue,query));
            
            
        } catch (Exception e) {
            adminSearchtext.setText("");
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminSearchtextKeyPressed

    private void adminteacherSearchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherSearchBtn1ActionPerformed
        // TODO add your handling code here:
        try {
            String searchValue =adminSearchtext.getText();
            String query = "SELECT * FROM Admin WHERE admin_code LIKE ?";
            adminDataTable.setModel(adminController.searchData(searchValue,query));
            adminSearchtext.setText("");
            
        } catch (Exception e) {
            adminSearchtext.setText("");
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_adminteacherSearchBtn1ActionPerformed

    private void adminSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSaveBtnActionPerformed
        // TODO add your handling code here:
        try {
            // Retrieve input values
            String id = admintext.getText();
            String fname = adminFnametext.getText();
            String lname = adminLnametex.getText();
            int age = Integer.parseInt(adminAgetext.getText());
            String birthday = adminBirthdaytext.getText();
            String address = adminAddresstext.getText();
            String email = adminEmailtext.getText();
            int nic = Integer.parseInt(adminNictext.getText());
            double salary = Double.parseDouble(adminSalarytext.getText());

            // Columns and values for insertion
            String tableName = "Admin";
            String[] columns = { "admin_code", "admin_first_name", "admin_last_name", "admin_age", "admin_birthday",
                            "admin_address", "admin_email", "admin_nic", "admin_salary" };

            Object[] values = { id, fname, lname, age, java.sql.Date.valueOf(birthday), address, email, nic, salary };

            // Insert data into database
            boolean isInserted = adminController.insertData(tableName, columns, values);

            if (isInserted) {
                JOptionPane.showMessageDialog(null, "Data saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to save data.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Refresh table and clear form
            adminDataTable.setModel(adminController.getTableModel(adminQueryTableLoad));
            adminFromClear();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid number format. Please check your input.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Invalid data: " + ex.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_adminSaveBtnActionPerformed

    private void adminDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDeleteBtnActionPerformed
        // TODO add your handling code here:
        try {
            String id = admintext.getText();

            // Confirm deletion
            int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", 
                                                          "Confirm Deletion", JOptionPane.YES_NO_OPTION);
            if (confirmation == JOptionPane.YES_OPTION) {
            // SQL delete query
            String query = "DELETE FROM Admin WHERE admin_code = ?";

            // Execute the delete operation
             adminController.deleteData(query, id);
            JOptionPane.showMessageDialog(null, "Data deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            adminDataTable.setModel(adminController.getTableModel(adminQueryTableLoad));
            adminFromClear();
        }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_adminDeleteBtnActionPerformed

    private void adminUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUpdateBtnActionPerformed
        // TODO add your handling code here:
        try {
            String id = admintext.getText();
            String fname = adminFnametext.getText();
            String lname = adminLnametex.getText();
            int age = Integer.parseInt(adminAgetext.getText());
            String birthday = adminBirthdaytext.getText();
            String address = adminAddresstext.getText();
            String email = adminEmailtext.getText();
            int nic = Integer.parseInt(adminNictext.getText());
            double salary = Double.parseDouble(adminSalarytext.getText());

            // SQL update query
            String query = "UPDATE Admin SET admin_first_name = ?, admin_last_name = ?, admin_age = ?, admin_birthday = ?, "
                     + "admin_address = ?, admin_email = ?, admin_nic = ?, admin_salary = ? WHERE admin_code = ?";

            // Execute the update
            int rowsUpdated =adminController.updateData(query, fname, lname, age, java.sql.Date.valueOf(birthday), address, email, nic, salary, id);

            if (rowsUpdated > 0) {
                adminDataTable.setModel(adminController.getTableModel(adminQueryTableLoad));
                adminFromClear();
                JOptionPane.showMessageDialog(null, "Data updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No matching record found to update!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid number format. Please check age, NIC, and salary fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Invalid date format. Use YYYY-MM-DD.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_adminUpdateBtnActionPerformed

    private void adminClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminClearBtnActionPerformed
        // TODO add your handling code here:
        adminFromClear();
    }//GEN-LAST:event_adminClearBtnActionPerformed

    private void adminExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminExitBtnActionPerformed
        // TODO add your handling code here:
        adminController.exit();
    }//GEN-LAST:event_adminExitBtnActionPerformed

    private void adminTimeTableSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableSearchBtnActionPerformed
        // TODO add your handling code here:
         try {
            String searchValue =adminController.getComboBoxValue(adminTimeTableSearchcombo);
            String query = "SELECT * FROM TimeTable WHERE course_id LIKE ? ";
            adminTimeTableDataTable.setModel(adminController.searchData(searchValue, query));
            adminTimeTableSearchcombo.setSelectedIndex(0);
            
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminTimeTableSearchBtnActionPerformed

    private void adminteacherRefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherRefreshBtnActionPerformed
        // TODO add your handling code here:
        adminTimeTableDataTable.setModel(adminController.getTableModel(timeTableQueryTableLoad));
    }//GEN-LAST:event_adminteacherRefreshBtnActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegistationPanel(null).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AdminTabbedPane;
    private javax.swing.JTextField adminAddresstext;
    private javax.swing.JPanel adminAdminFormPanel;
    private javax.swing.JTextField adminAgetext;
    private javax.swing.JTextField adminBirthdaytext;
    private javax.swing.JButton adminClearBtn;
    private javax.swing.JButton adminCoseClearBtn;
    private javax.swing.JTable adminCoseDataTable;
    private javax.swing.JButton adminCoseDeleteBtn;
    private javax.swing.JPanel adminCoseFormPanel;
    private javax.swing.JTextField adminCoseIDtext;
    private javax.swing.JButton adminCoseLoadBtn;
    private javax.swing.JTextField adminCoseNametext;
    private javax.swing.JTextField adminCosePaymenttext;
    private javax.swing.JButton adminCoseSaveBtn;
    private javax.swing.JButton adminCoseSearchBtn;
    private javax.swing.JLabel adminCoseSearchLable;
    private javax.swing.JTextField adminCoseSearchtext;
    private javax.swing.JComboBox<String> adminCoseTeacherIdcombo;
    private javax.swing.JButton adminCoseUpdateBtn;
    private javax.swing.JTable adminDataTable;
    private javax.swing.JButton adminDeleteBtn;
    private javax.swing.JTextField adminEmailtext;
    private javax.swing.JButton adminExitBtn;
    private javax.swing.JTextField adminFnametext;
    private javax.swing.JTextField adminLnametex;
    private javax.swing.JTextField adminNictext;
    private javax.swing.JTextField adminSalarytext;
    private javax.swing.JButton adminSaveBtn;
    private javax.swing.JTextField adminSearchtext;
    private javax.swing.JPanel adminStudentFormPanel;
    private javax.swing.JButton adminSubjectClearBtn;
    private javax.swing.JComboBox<String> adminSubjectCoseCombo;
    private javax.swing.JComboBox<String> adminSubjectCreditcombo;
    private javax.swing.JTable adminSubjectDataTable;
    private javax.swing.JButton adminSubjectDeleteBtn;
    private javax.swing.JButton adminSubjectExitBtn;
    private javax.swing.JPanel adminSubjectFormPanel;
    private javax.swing.JTextField adminSubjectIdtext;
    private javax.swing.JTextField adminSubjectNametext;
    private javax.swing.JButton adminSubjectSaveBtn;
    private javax.swing.JButton adminSubjectSearchBtn;
    private javax.swing.JTextField adminSubjectSearchtext;
    private javax.swing.JComboBox<String> adminSubjectTeacherIdcombo;
    private javax.swing.JButton adminSubjectUpdateBtn;
    private javax.swing.JTable adminTeacherDataTable;
    private javax.swing.JPanel adminTeacherFormPanel;
    private javax.swing.JTextField adminTeacherSearchtext;
    private javax.swing.JButton adminTimeTableClearBtn;
    private javax.swing.JComboBox<String> adminTimeTableCoseIDcombo;
    private javax.swing.JTable adminTimeTableDataTable;
    private javax.swing.JButton adminTimeTableDeleteBtn;
    private javax.swing.JButton adminTimeTableExitBtn;
    private javax.swing.JPanel adminTimeTableFormPanel;
    private javax.swing.JComboBox<String> adminTimeTableFricombo;
    private javax.swing.JComboBox<String> adminTimeTableMoncombo;
    private javax.swing.JButton adminTimeTableSaveBtn;
    private javax.swing.JButton adminTimeTableSearchBtn;
    private javax.swing.JComboBox<String> adminTimeTableSearchcombo;
    private javax.swing.JComboBox<String> adminTimeTableSubjectIdcombo;
    private javax.swing.JComboBox<String> adminTimeTableTeacherIdcombo;
    private javax.swing.JComboBox<String> adminTimeTableThercombo;
    private javax.swing.JComboBox<String> adminTimeTableTuecombo;
    private javax.swing.JButton adminTimeTableUpdateBtn;
    private javax.swing.JComboBox<String> adminTimeTableWenscombo;
    private javax.swing.JButton adminUpdateBtn;
    private javax.swing.JTextField adminstudentAddresstext;
    private javax.swing.JTextField adminstudentAgetext;
    private javax.swing.JTextField adminstudentBirthdaytext;
    private javax.swing.JButton adminstudentClearBtn;
    private javax.swing.JTable adminstudentDataTable;
    private javax.swing.JButton adminstudentDeleteBtn;
    private javax.swing.JTextField adminstudentEmailtext;
    private javax.swing.JButton adminstudentExitBtn;
    private javax.swing.JTextField adminstudentFnametext;
    private javax.swing.JTextField adminstudentIdtext;
    private javax.swing.JTextField adminstudentLnametext;
    private javax.swing.JTextField adminstudentNictext;
    private javax.swing.JButton adminstudentSaveBtn;
    private javax.swing.JButton adminstudentUpdateBtn;
    private javax.swing.JButton adminstudentsearchBtn;
    private javax.swing.JPanel adminstudentsearchtext;
    private javax.swing.JTextField adminteacherAddresstext;
    private javax.swing.JTextField adminteacherAgetext;
    private javax.swing.JTextField adminteacherBirthdaytext;
    private javax.swing.JButton adminteacherClearBtn;
    private javax.swing.JButton adminteacherDeleteBtn;
    private javax.swing.JTextField adminteacherEmailtext;
    private javax.swing.JButton adminteacherExitBtn;
    private javax.swing.JTextField adminteacherFnametext;
    private javax.swing.JTextField adminteacherIdtext;
    private javax.swing.JTextField adminteacherLnametext;
    private javax.swing.JTextField adminteacherNictext;
    private javax.swing.JButton adminteacherRefreshBtn;
    private javax.swing.JTextField adminteacherSalarytext;
    private javax.swing.JButton adminteacherSaveBtn;
    private javax.swing.JButton adminteacherSearchBtn;
    private javax.swing.JButton adminteacherSearchBtn1;
    private javax.swing.JButton adminteacherUpdateBtn;
    private javax.swing.JTextField admintext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
