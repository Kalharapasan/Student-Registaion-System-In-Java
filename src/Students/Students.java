package Students;

import Controller.StudentController;
import javax.swing.JOptionPane;

public class Students extends javax.swing.JFrame {
    
    private  String student_id;
    private String queryGetCoseID ="SELECT course_id FROM Course";
    
    private String queryGetSubjectIDForStudent = "SELECT t.timetable_id, t.course_id, s.subject_id, s.subject_name, s.subject_credit, " +
                   "t.teacher_code, t.time_mon, t.time_tue, t.time_wed, t.time_thu, t.time_fri " +
                   "FROM Enrolle e " +
                   "JOIN TimeTable t ON e.course_id = t.course_id " +
                   "JOIN Subject s ON t.subject_id = s.subject_id " +
                   "WHERE e.student_code = ?";
    
    private String queryGetTitmeTableSubjectID ="SELECT DISTINCT s.subject_id, s.subject_name, s.subject_credit, t.course_id, t.teacher_code FROM Enrolle e JOIN TimeTable t ON e.course_id = t.course_id "
            + "JOIN Subject s ON t.subject_id = s.subject_id WHERE e.student_code = ?";
    
    private String enrolleQuery = "SELECT * FROM Enrolle WHERE student_code = ?";
    
    private String queryGetCoseIDForStudent = "SELECT course_id FROM Enrolle WHERE student_code = ?";
    
    private String queryGetMarkForStudent ="SELECT * FROM SubjectMark WHERE student_code = ?" ;
    
    private String queryGetSubjectidForStudent = 
    "SELECT S.subject_id FROM Enrolle E " +
    "JOIN Course C ON E.course_id = C.course_id " +
    "JOIN Subject S ON C.course_id = S.course_id " +
    "WHERE E.student_code = ?";
    
    private String queryGetTecherForStudent="SELECT s.subject_id, s.subject_name, s.subject_credit, " +
                   "t.teacher_first_name, t.teacher_last_name, s.course_id " +
                   "FROM Subject s " +
                   "JOIN Teacher t ON s.teacher_code = t.teacher_code " +
                   "JOIN Enrolle e ON s.course_id = e.course_id " +
                   "WHERE e.student_code = ?";
    
    StudentController controller = new StudentController();
    

    
    public Students(String student_id) {
        initComponents();
        
       
        controller.populateComboBoxWithQuery(studentCoseIDcombo, queryGetCoseID,"course_id" );
        
        controller.populateComboBoxWithQuery(studentCoseSearchcombo, queryGetCoseIDForStudent,"course_id",student_id );
        
        
        controller.populateComboBoxWithQuery(studentMarkSearchcombo, queryGetCoseID,"course_id" );

        controller.populateComboBoxWithQuery(studentTimeTableSubjectIDcombo, queryGetTitmeTableSubjectID, "subject_id", student_id);
        
        controller.populateComboBoxWithQuery(studentTeacherSubjectIdCombo, queryGetSubjectidForStudent, "subject_id", student_id);

        studentTimeTableDataTable.setModel(controller.getTableModel(queryGetSubjectIDForStudent,student_id));
        
        studentCoseDataTable.setModel(controller.getTableModel(enrolleQuery, student_id));
        
        studentMarkDataTable.setModel(controller.getTableModel(queryGetMarkForStudent,student_id));
        
        studentTeacherDataTable.setModel(controller.getTableModel(queryGetTecherForStudent,student_id));
        
        this.student_id = student_id;
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        studentTimeTablePanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        studentTimeTableDataTable = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        studentTimeTableSubjectIDcombo = new javax.swing.JComboBox<>();
        adminTimeTableSearchBtn = new javax.swing.JButton();
        adminteacherRefreshBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        studentCosePanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        studentCoseIDcombo = new javax.swing.JComboBox<>();
        studentCoseEnroleBtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentCoseDataTable = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        studentCoseSearchcombo = new javax.swing.JComboBox<>();
        adminTimeTableSearchBtn1 = new javax.swing.JButton();
        adminteacherRefreshBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        studentMarkPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentMarkDataTable = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        studentMarkGpaLable = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        studentMarkSearchcombo = new javax.swing.JComboBox<>();
        adminMarkSearchBtn = new javax.swing.JButton();
        adminMarkRefreshBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        studentTeacherPanel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentTeacherDataTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        studentTeacherSubjectIdCombo = new javax.swing.JComboBox<>();
        adminTeacherSearchBtn = new javax.swing.JButton();
        studentTeacherRefreshBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        studentTimeTablePanel.setBackground(new java.awt.Color(204, 255, 204));

        studentTimeTableDataTable.setBackground(java.awt.Color.lightGray);
        studentTimeTableDataTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentTimeTableDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(studentTimeTableDataTable);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Subject ID ");

        studentTimeTableSubjectIDcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        studentTimeTableSubjectIDcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTimeTableSubjectIDcomboMouseClicked(evt);
            }
        });
        studentTimeTableSubjectIDcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentTimeTableSubjectIDcomboActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentTimeTableSubjectIDcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(adminTimeTableSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminteacherRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentTimeTableSubjectIDcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminTimeTableSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminteacherRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Time Table");

        javax.swing.GroupLayout studentTimeTablePanelLayout = new javax.swing.GroupLayout(studentTimeTablePanel);
        studentTimeTablePanel.setLayout(studentTimeTablePanelLayout);
        studentTimeTablePanelLayout.setHorizontalGroup(
            studentTimeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentTimeTablePanelLayout.createSequentialGroup()
                .addGroup(studentTimeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentTimeTablePanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        studentTimeTablePanelLayout.setVerticalGroup(
            studentTimeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentTimeTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Time Table", studentTimeTablePanel);

        studentCosePanel.setBackground(new java.awt.Color(204, 255, 204));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel21.setText("Cose ID");

        studentCoseIDcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        studentCoseIDcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCoseIDcomboActionPerformed(evt);
            }
        });

        studentCoseEnroleBtn.setBackground(new java.awt.Color(255, 51, 0));
        studentCoseEnroleBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        studentCoseEnroleBtn.setText("Enrolle");
        studentCoseEnroleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCoseEnroleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studentCoseIDcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(studentCoseEnroleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentCoseIDcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(studentCoseEnroleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 153, 204));

        studentCoseDataTable.setBackground(new java.awt.Color(204, 204, 204));
        studentCoseDataTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        studentCoseDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(studentCoseDataTable);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel22.setText("Cose ID");

        studentCoseSearchcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        studentCoseSearchcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentCoseSearchcomboMouseClicked(evt);
            }
        });
        studentCoseSearchcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentCoseSearchcomboActionPerformed(evt);
            }
        });

        adminTimeTableSearchBtn1.setBackground(new java.awt.Color(153, 153, 255));
        adminTimeTableSearchBtn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTimeTableSearchBtn1.setText("Searsh");
        adminTimeTableSearchBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTimeTableSearchBtn1ActionPerformed(evt);
            }
        });

        adminteacherRefreshBtn1.setBackground(new java.awt.Color(204, 255, 204));
        adminteacherRefreshBtn1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminteacherRefreshBtn1.setText("Refrsh");
        adminteacherRefreshBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminteacherRefreshBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studentCoseSearchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminTimeTableSearchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminteacherRefreshBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adminTimeTableSearchBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adminteacherRefreshBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentCoseSearchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cose Enrolle");

        javax.swing.GroupLayout studentCosePanelLayout = new javax.swing.GroupLayout(studentCosePanel);
        studentCosePanel.setLayout(studentCosePanelLayout);
        studentCosePanelLayout.setHorizontalGroup(
            studentCosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentCosePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentCosePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        studentCosePanelLayout.setVerticalGroup(
            studentCosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentCosePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(studentCosePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cose Enrolle", studentCosePanel);

        studentMarkPanel.setBackground(new java.awt.Color(204, 255, 204));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        studentMarkDataTable.setBackground(java.awt.Color.lightGray);
        studentMarkDataTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(studentMarkDataTable);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("GPA");

        studentMarkGpaLable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        studentMarkGpaLable.setText("0.00");

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel25.setText("Cose ID ");

        studentMarkSearchcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        studentMarkSearchcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMarkSearchcomboMouseClicked(evt);
            }
        });
        studentMarkSearchcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentMarkSearchcomboActionPerformed(evt);
            }
        });

        adminMarkSearchBtn.setBackground(new java.awt.Color(153, 153, 255));
        adminMarkSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminMarkSearchBtn.setText("Searsh");
        adminMarkSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMarkSearchBtnActionPerformed(evt);
            }
        });

        adminMarkRefreshBtn.setBackground(new java.awt.Color(204, 255, 204));
        adminMarkRefreshBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminMarkRefreshBtn.setText("Refrsh");
        adminMarkRefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMarkRefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentMarkSearchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(adminMarkSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminMarkRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentMarkGpaLable, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adminMarkSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(adminMarkRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentMarkGpaLable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentMarkSearchcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Marks");

        javax.swing.GroupLayout studentMarkPanelLayout = new javax.swing.GroupLayout(studentMarkPanel);
        studentMarkPanel.setLayout(studentMarkPanelLayout);
        studentMarkPanelLayout.setHorizontalGroup(
            studentMarkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentMarkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentMarkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        studentMarkPanelLayout.setVerticalGroup(
            studentMarkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentMarkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Marke", studentMarkPanel);

        studentTeacherPanel.setBackground(new java.awt.Color(204, 255, 204));

        jPanel9.setBackground(new java.awt.Color(255, 153, 255));

        studentTeacherDataTable.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane3.setViewportView(studentTeacherDataTable);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Subject Id");

        studentTeacherSubjectIdCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        studentTeacherSubjectIdCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTeacherSubjectIdComboMouseClicked(evt);
            }
        });
        studentTeacherSubjectIdCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentTeacherSubjectIdComboActionPerformed(evt);
            }
        });

        adminTeacherSearchBtn.setBackground(new java.awt.Color(153, 153, 255));
        adminTeacherSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminTeacherSearchBtn.setText("Searsh");
        adminTeacherSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminTeacherSearchBtnActionPerformed(evt);
            }
        });

        studentTeacherRefreshBtn.setBackground(new java.awt.Color(204, 255, 204));
        studentTeacherRefreshBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        studentTeacherRefreshBtn.setText("Refrsh");
        studentTeacherRefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentTeacherRefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentTeacherSubjectIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(adminTeacherSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(studentTeacherRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adminTeacherSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentTeacherRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(studentTeacherSubjectIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.borderColor"));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Teacher");

        javax.swing.GroupLayout studentTeacherPanelLayout = new javax.swing.GroupLayout(studentTeacherPanel);
        studentTeacherPanel.setLayout(studentTeacherPanelLayout);
        studentTeacherPanelLayout.setHorizontalGroup(
            studentTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentTeacherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        studentTeacherPanelLayout.setVerticalGroup(
            studentTeacherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentTeacherPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Teacher", studentTeacherPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentMarkSearchcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentMarkSearchcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentMarkSearchcomboActionPerformed

    private void studentTimeTableSubjectIDcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentTimeTableSubjectIDcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentTimeTableSubjectIDcomboActionPerformed

    private void studentCoseIDcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCoseIDcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentCoseIDcomboActionPerformed

    private void studentCoseSearchcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCoseSearchcomboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_studentCoseSearchcomboActionPerformed

    private void studentTeacherSubjectIdComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentTeacherSubjectIdComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentTeacherSubjectIdComboActionPerformed

    private void studentTimeTableSubjectIDcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTimeTableSubjectIDcomboMouseClicked
        // TODO add your handling code here:
        try {
            String searchValue = controller.getComboBoxValue(studentTimeTableSubjectIDcombo);
            String query ="Select  time_mon, time_tue, time_wed, time_thu, time_fri FROM TimeTable WHERE subject_id LIKE ?";
            studentTimeTableDataTable.setModel(controller.searchData(searchValue,query));
            
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
        }
        
                
    }//GEN-LAST:event_studentTimeTableSubjectIDcomboMouseClicked

    private void studentCoseEnroleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCoseEnroleBtnActionPerformed
        // TODO add your handling code here:
        try {
            String query = "INSERT INTO Enrolle (student_code, course_id) VALUES (?,?)";
            String course_id = controller.getComboBoxValue(studentCoseIDcombo);
            
            String table = "Enrolle";
            String[] columns = {"student_code", "course_id"};
            Object[] values = {student_id, course_id};
           
            controller.insertData(table,columns,values);
            studentCoseIDcombo.setSelectedIndex(0);
            studentCoseDataTable.setModel(controller.getTableModel(enrolleQuery, student_id));
            JOptionPane.showMessageDialog(null, "Enrole Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_studentCoseEnroleBtnActionPerformed

    private void adminTimeTableSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableSearchBtnActionPerformed
        // TODO add your handling code here:
        try {
            String searchValue = controller.getComboBoxValue(studentTimeTableSubjectIDcombo);
            String query ="Select  time_mon, time_tue, time_wed, time_thu, time_fri FROM TimeTable WHERE subject_id LIKE ?";
            studentTimeTableDataTable.setModel(controller.searchData(searchValue,query));
            
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
        }
    }//GEN-LAST:event_adminTimeTableSearchBtnActionPerformed

    private void adminteacherRefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherRefreshBtnActionPerformed
        // TODO add your handling code here:
        studentTimeTableSubjectIDcombo.setSelectedIndex(0);
        studentTimeTableDataTable.setModel(controller.getTableModel(queryGetSubjectIDForStudent,student_id));
    }//GEN-LAST:event_adminteacherRefreshBtnActionPerformed

    private void adminTimeTableSearchBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTimeTableSearchBtn1ActionPerformed
        // TODO add your handling code here:
       try {
            String searchValue = (String) studentCoseSearchcombo.getSelectedItem(); // Get selected student_code
            if (searchValue != null && !searchValue.trim().isEmpty()) {
                String query = "SELECT s.subject_id, s.subject_name, s.subject_credit, s.course_id, s.teacher_code " +
                        "FROM Subject s " +
                        "JOIN Course c ON s.course_id = c.course_id " +
                        "JOIN Enrolle e ON c.course_id = e.course_id " +
                        "WHERE e.student_code = ? AND c.course_id = ?";


                studentCoseDataTable.setModel(controller.searchData(student_id,searchValue, query)); // Set table model
            } else {
                JOptionPane.showMessageDialog(null, "Please select a student!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminTimeTableSearchBtn1ActionPerformed

    private void adminteacherRefreshBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminteacherRefreshBtn1ActionPerformed
        // TODO add your handling code here:
        studentCoseSearchcombo.setSelectedIndex(0);
        studentCoseDataTable.setModel(controller.getTableModel(enrolleQuery, student_id));
    }//GEN-LAST:event_adminteacherRefreshBtn1ActionPerformed

    private void studentCoseSearchcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentCoseSearchcomboMouseClicked
        // TODO add your handling code here:
        try {
            String searchValue = (String) studentCoseSearchcombo.getSelectedItem(); // Get selected student_code
            if (searchValue != null && !searchValue.trim().isEmpty()) {
                String query = "SELECT s.subject_id, s.subject_name, s.subject_credit, s.course_id, s.teacher_code " +
                        "FROM Subject s " +
                        "JOIN Course c ON s.course_id = c.course_id " +
                        "JOIN Enrolle e ON c.course_id = e.course_id " +
                        "WHERE e.student_code = ? AND c.course_id = ?";


                studentCoseDataTable.setModel(controller.searchData(student_id,searchValue, query)); // Set table model
            } else {
                JOptionPane.showMessageDialog(null, "Please select a student!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_studentCoseSearchcomboMouseClicked

    private void adminMarkSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMarkSearchBtnActionPerformed
        // TODO add your handling code here:
        try {
            String value = controller.getComboBoxValue(studentMarkSearchcombo);
            String query = "SELECT sm.subject_id, s.subject_name, sm.subject_mark, sm.subject_gpa, sm.teacher_code " +
                       "FROM SubjectMark sm " +
                       "JOIN Subject s ON sm.subject_id = s.subject_id " +
                       "WHERE sm.student_code = ? AND sm.course_id = ?";

            studentMarkDataTable.setModel(controller.searchData(student_id,value, query));
            studentMarkSearchcombo.setSelectedIndex(0);
            double finalGPA = controller.calculateFinalGPA(student_id, value);
            studentMarkGpaLable.setText(String.format("%.2f", finalGPA));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_adminMarkSearchBtnActionPerformed

    private void adminMarkRefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMarkRefreshBtnActionPerformed
        // TODO add your handling code here:
        studentMarkSearchcombo.setSelectedIndex(0);
        studentMarkDataTable.setModel(controller.getTableModel(queryGetMarkForStudent,student_id));
    }//GEN-LAST:event_adminMarkRefreshBtnActionPerformed

    private void studentMarkSearchcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMarkSearchcomboMouseClicked
        // TODO add your handling code here:
        try {
            String value = controller.getComboBoxValue(studentMarkSearchcombo);
            String query = "SELECT sm.subject_id, s.subject_name, sm.subject_mark, sm.subject_gpa, sm.teacher_code " +
                       "FROM SubjectMark sm " +
                       "JOIN Subject s ON sm.subject_id = s.subject_id " +
                       "WHERE sm.student_code = ? AND sm.course_id = ?";

            studentMarkDataTable.setModel(controller.searchData(student_id,value, query));
            studentMarkSearchcombo.setSelectedIndex(0);
            double finalGPA = controller.calculateFinalGPA(student_id, value);
            studentMarkGpaLable.setText(String.format("%.2f", finalGPA));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_studentMarkSearchcomboMouseClicked

    private void adminTeacherSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminTeacherSearchBtnActionPerformed
        // TODO add your handling code here:
       
        try {
             String value = controller.getComboBoxValue(studentTeacherSubjectIdCombo);
             String query = 
                        "SELECT S.subject_id, S.subject_name, S.subject_credit, \n" +
                        "T.teacher_code, T.teacher_first_name, T.teacher_last_name, T.teacher_email \n" +
                        "FROM Enrolle E \n" +
                        "JOIN Course C ON E.course_id = C.course_id \n" +
                        "JOIN Subject S ON C.course_id = S.course_id \n" +
                        "LEFT JOIN Teacher T ON S.teacher_code = T.teacher_code \n" +
                        "WHERE E.student_code = ? AND S.subject_id = ?;";
             
            studentTeacherDataTable.setModel(controller.searchData(student_id, value, query));
            studentTeacherSubjectIdCombo.setSelectedIndex(0);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_adminTeacherSearchBtnActionPerformed

    private void studentTeacherRefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentTeacherRefreshBtnActionPerformed
        // TODO add your handling code here:
        studentTeacherSubjectIdCombo.setSelectedIndex(0);
        studentTeacherDataTable.setModel(controller.getTableModel(queryGetTecherForStudent,student_id));
    }//GEN-LAST:event_studentTeacherRefreshBtnActionPerformed

    private void studentTeacherSubjectIdComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTeacherSubjectIdComboMouseClicked
        // TODO add your handling code here:
        try {
             String value = controller.getComboBoxValue(studentTeacherSubjectIdCombo);
             String query = 
                        "SELECT S.subject_id, S.subject_name, S.subject_credit, \n" +
                        "T.teacher_code, T.teacher_first_name, T.teacher_last_name, T.teacher_email \n" +
                        "FROM Enrolle E \n" +
                        "JOIN Course C ON E.course_id = C.course_id \n" +
                        "JOIN Subject S ON C.course_id = S.course_id \n" +
                        "LEFT JOIN Teacher T ON S.teacher_code = T.teacher_code \n" +
                        "WHERE E.student_code = ? AND S.subject_id = ?;";
             
            studentTeacherDataTable.setModel(controller.searchData(student_id, value, query));
           
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_studentTeacherSubjectIdComboMouseClicked

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminMarkRefreshBtn;
    private javax.swing.JButton adminMarkSearchBtn;
    private javax.swing.JButton adminTeacherSearchBtn;
    private javax.swing.JButton adminTimeTableSearchBtn;
    private javax.swing.JButton adminTimeTableSearchBtn1;
    private javax.swing.JButton adminteacherRefreshBtn;
    private javax.swing.JButton adminteacherRefreshBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable studentCoseDataTable;
    private javax.swing.JButton studentCoseEnroleBtn;
    private javax.swing.JComboBox<String> studentCoseIDcombo;
    private javax.swing.JPanel studentCosePanel;
    private javax.swing.JComboBox<String> studentCoseSearchcombo;
    private javax.swing.JTable studentMarkDataTable;
    private javax.swing.JLabel studentMarkGpaLable;
    private javax.swing.JPanel studentMarkPanel;
    private javax.swing.JComboBox<String> studentMarkSearchcombo;
    private javax.swing.JTable studentTeacherDataTable;
    private javax.swing.JPanel studentTeacherPanel;
    private javax.swing.JButton studentTeacherRefreshBtn;
    private javax.swing.JComboBox<String> studentTeacherSubjectIdCombo;
    private javax.swing.JTable studentTimeTableDataTable;
    private javax.swing.JPanel studentTimeTablePanel;
    private javax.swing.JComboBox<String> studentTimeTableSubjectIDcombo;
    // End of variables declaration//GEN-END:variables
}
