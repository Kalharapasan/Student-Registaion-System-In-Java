package Teacher;

import Controller.TeacherController;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Teacher extends javax.swing.JFrame {

    private String teacher_id;
    
    private String queryGetSubjectId ="SELECT subject_id FROM Subject WHERE teacher_code LIKE ? ";
    private String queryGetStudentId ="SELECT DISTINCT E.student_code FROM Enrolle E JOIN Subject S ON E.course_id = S.course_id WHERE S.teacher_code = ?; ";
    private String queryGetCouseId ="SELECT DISTINCT S.course_id FROM Subject S WHERE S.teacher_code = ?";
    
    private String queryGetStudentMark ="SELECT student_code,course_id,subject_id,subject_mark,subject_gpa FROM SubjectMark WHERE teacher_code LIKE ?";
    
    private String queryGetTimeTable ="SELECT course_id,subject_id,time_mon,time_tue,time_wed,time_thu,time_fri FROM TimeTable WHERE teacher_code LIKE ?";
    
    
    TeacherController controller = new TeacherController();
    
    public Teacher(String teacher_id) {
        initComponents();
        this.teacher_id=teacher_id;   
        
        controller.populateComboBoxWithQuery(teacherMarkSubjectIdcombo, queryGetSubjectId, "subject_id",teacher_id);
        controller.populateComboBoxWithQuery(teacherSubjectSubjectIdcombo, queryGetSubjectId, "subject_id",teacher_id);
        controller.populateComboBoxWithQuery(teacherStudentIdcombo, queryGetStudentId, "student_code",teacher_id);
        controller.populateComboBoxWithQuery(teacherSubjectCoseIdcombo, queryGetCouseId, "course_id",teacher_id);
        
        teacherMarkDataTable.setModel(controller.getTableModel(queryGetStudentMark, teacher_id));
        
        teacherTitmeTableDataTable.setModel(controller.getTableModel(queryGetTimeTable, teacher_id));

        
    }
    
    private void markFormClear (){
        teacherStudentIdcombo.setSelectedIndex(0);
        teacherSubjectCoseIdcombo.setSelectedIndex(0);
        teacherSubjectSubjectIdcombo.setSelectedIndex(0);
        teacherSubjectMarktext.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        teacherMarkPanel = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        teacherSubjectSaveBtn = new javax.swing.JButton();
        teacherSubjectDeleteBtn = new javax.swing.JButton();
        teacherSubjectUpdateBtn = new javax.swing.JButton();
        teacherSubjectLoadBtn = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        teacherSubjectMarktext = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        teacherSubjectSubjectIdcombo = new javax.swing.JComboBox<>();
        teacherSubjectCoseIdcombo = new javax.swing.JComboBox<>();
        teacherStudentIdcombo = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        teacherSubjectDataTable = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        teacherSubjectSearchtext = new javax.swing.JTextField();
        teacherSubjectSearchBtn = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        teacherMarkDataTable = new javax.swing.JTable();
        teacherSubjectRefreshBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        teacherTitmeTablePanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        teacherTitmeTableDataTable = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        teacherMarkSearchBtn = new javax.swing.JButton();
        teacherMarkSubjectIdcombo = new javax.swing.JComboBox<>();
        teacherMarkRefreshBtn = new javax.swing.JButton();
        teacherTimeTableSearchBtn = new javax.swing.JButton();
        teacherTimeTableRefreshBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTabbedPane1.setRequestFocusEnabled(false);

        teacherMarkPanel.setBackground(new java.awt.Color(204, 204, 255));

        jPanel13.setBackground(new java.awt.Color(153, 255, 204));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel26.setText("Student ID");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Subject ID");

        teacherSubjectSaveBtn.setBackground(new java.awt.Color(255, 102, 102));
        teacherSubjectSaveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectSaveBtn.setText("Save");
        teacherSubjectSaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectSaveBtnActionPerformed(evt);
            }
        });

        teacherSubjectDeleteBtn.setBackground(new java.awt.Color(255, 255, 153));
        teacherSubjectDeleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectDeleteBtn.setText("Delete");
        teacherSubjectDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectDeleteBtnActionPerformed(evt);
            }
        });

        teacherSubjectUpdateBtn.setBackground(new java.awt.Color(102, 255, 204));
        teacherSubjectUpdateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectUpdateBtn.setText("Update");
        teacherSubjectUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectUpdateBtnActionPerformed(evt);
            }
        });

        teacherSubjectLoadBtn.setBackground(new java.awt.Color(102, 255, 102));
        teacherSubjectLoadBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectLoadBtn.setText("Clear");
        teacherSubjectLoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectLoadBtnActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel43.setText("Mark");

        teacherSubjectMarktext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectMarktext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectMarktextActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel28.setText("Cose ID");

        teacherSubjectSubjectIdcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectSubjectIdcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectSubjectIdcomboActionPerformed(evt);
            }
        });

        teacherSubjectCoseIdcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectCoseIdcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectCoseIdcomboActionPerformed(evt);
            }
        });

        teacherStudentIdcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherStudentIdcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherStudentIdcomboActionPerformed(evt);
            }
        });

        teacherSubjectDataTable.setBackground(new java.awt.Color(204, 204, 255));
        teacherSubjectDataTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(teacherSubjectDataTable);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teacherSubjectUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherSubjectLoadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherSubjectDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherSubjectSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(225, 225, 225))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(teacherSubjectCoseIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacherSubjectSubjectIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacherSubjectMarktext, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacherStudentIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)))))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(teacherStudentIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherSubjectCoseIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherSubjectSubjectIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(teacherSubjectMarktext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(teacherSubjectSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherSubjectDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherSubjectUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherSubjectLoadBtn))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Student ID ");

        teacherSubjectSearchtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectSearchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                teacherSubjectSearchtextKeyPressed(evt);
            }
        });

        teacherSubjectSearchBtn.setBackground(new java.awt.Color(204, 255, 204));
        teacherSubjectSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectSearchBtn.setText("Searsh");
        teacherSubjectSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectSearchBtnActionPerformed(evt);
            }
        });

        teacherMarkDataTable.setBackground(new java.awt.Color(255, 153, 255));
        teacherMarkDataTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        teacherMarkDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherMarkDataTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(teacherMarkDataTable);

        teacherSubjectRefreshBtn.setBackground(new java.awt.Color(204, 255, 204));
        teacherSubjectRefreshBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherSubjectRefreshBtn.setText("Refresh");
        teacherSubjectRefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherSubjectRefreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teacherSubjectSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teacherSubjectSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherSubjectRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherSubjectSearchtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherSubjectSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherSubjectRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Subject Mark");

        javax.swing.GroupLayout teacherMarkPanelLayout = new javax.swing.GroupLayout(teacherMarkPanel);
        teacherMarkPanel.setLayout(teacherMarkPanelLayout);
        teacherMarkPanelLayout.setHorizontalGroup(
            teacherMarkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherMarkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 906, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(teacherMarkPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 84, Short.MAX_VALUE))
        );
        teacherMarkPanelLayout.setVerticalGroup(
            teacherMarkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherMarkPanelLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(teacherMarkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Subject Mark", teacherMarkPanel);

        teacherTitmeTablePanel.setBackground(new java.awt.Color(204, 255, 204));

        jPanel8.setBackground(new java.awt.Color(255, 255, 204));

        teacherTitmeTableDataTable.setBackground(new java.awt.Color(255, 153, 255));
        teacherTitmeTableDataTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane4.setViewportView(teacherTitmeTableDataTable);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel30.setText("Subject ID ");

        teacherMarkSearchBtn.setBackground(new java.awt.Color(153, 153, 255));
        teacherMarkSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherMarkSearchBtn.setText("Searsh");

        teacherMarkSubjectIdcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherMarkSubjectIdcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherMarkSubjectIdcomboMouseClicked(evt);
            }
        });
        teacherMarkSubjectIdcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherMarkSubjectIdcomboActionPerformed(evt);
            }
        });

        teacherMarkRefreshBtn.setBackground(new java.awt.Color(153, 153, 255));
        teacherMarkRefreshBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherMarkRefreshBtn.setText("Searsh");

        teacherTimeTableSearchBtn.setBackground(new java.awt.Color(204, 255, 204));
        teacherTimeTableSearchBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherTimeTableSearchBtn.setText("Searsh");
        teacherTimeTableSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherTimeTableSearchBtnActionPerformed(evt);
            }
        });

        teacherTimeTableRefreshBtn.setBackground(new java.awt.Color(204, 255, 204));
        teacherTimeTableRefreshBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        teacherTimeTableRefreshBtn.setText("Refresh");
        teacherTimeTableRefreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherTimeTableRefreshBtnActionPerformed(evt);
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
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teacherMarkSubjectIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(teacherTimeTableSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherTimeTableRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(831, 831, 831)
                        .addComponent(teacherMarkSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teacherMarkRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherMarkSubjectIdcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacherMarkSearchBtn)
                    .addComponent(teacherMarkRefreshBtn)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teacherTimeTableSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(teacherTimeTableRefreshBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Time Table");

        javax.swing.GroupLayout teacherTitmeTablePanelLayout = new javax.swing.GroupLayout(teacherTitmeTablePanel);
        teacherTitmeTablePanel.setLayout(teacherTitmeTablePanelLayout);
        teacherTitmeTablePanelLayout.setHorizontalGroup(
            teacherTitmeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherTitmeTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teacherTitmeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherTitmeTablePanelLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1242, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        teacherTitmeTablePanelLayout.setVerticalGroup(
            teacherTitmeTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherTitmeTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Time Table", teacherTitmeTablePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teacherSubjectUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectUpdateBtnActionPerformed
        // TODO add your handling code here:
        try {
            // Query to get subject credit
            String queryGetSubjectCredit = "SELECT subject_credit FROM Subject WHERE subject_id=?";

            // Retrieving values from UI components
            String studentId = controller.getComboBoxValue(teacherStudentIdcombo);
            String courseId = controller.getComboBoxValue(teacherSubjectCoseIdcombo);
            String subjectId = controller.getComboBoxValue(teacherSubjectSubjectIdcombo);
            
            
            // Convert mark to double
            double mark = Double.parseDouble(teacherSubjectMarktext.getText());
            int insertMark = (int) mark; // Convert to integer
            
            // Get subject credit from the database
            double credit = controller.getCredit(queryGetSubjectCredit, subjectId);
            
            // Calculate GPA based on marks and credit
            double gpa = controller.calculateGPA(mark, credit);

            // SQL query to update the subject mark and GPA in the database
            String updateQuery = "UPDATE SubjectMark SET subject_mark = ?, subject_gpa = ? " +
                                 "WHERE student_code = ? AND course_id = ? AND subject_id = ? AND teacher_code = ?";

            // Call updateData method
            int rowsUpdated = controller.updateData(updateQuery, insertMark, gpa, studentId, courseId, subjectId, teacher_id);

            if (rowsUpdated > 0) {
                
                System.out.println("Update successful! " + rowsUpdated + " row(s) affected.");
            } else {
                System.out.println("No matching record found to update.");
            }
            teacherMarkDataTable.setModel(controller.getTableModel(queryGetStudentMark, teacher_id));
            markFormClear ();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_teacherSubjectUpdateBtnActionPerformed

    private void teacherSubjectMarktextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectMarktextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherSubjectMarktextActionPerformed

    private void teacherMarkSubjectIdcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherMarkSubjectIdcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherMarkSubjectIdcomboActionPerformed

    private void teacherSubjectSubjectIdcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectSubjectIdcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherSubjectSubjectIdcomboActionPerformed

    private void teacherSubjectCoseIdcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectCoseIdcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherSubjectCoseIdcomboActionPerformed

    private void teacherStudentIdcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherStudentIdcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherStudentIdcomboActionPerformed

    private void teacherSubjectSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectSaveBtnActionPerformed
        // TODO add your handling code here:
        try {
            // Query to get subject credit
            String queryGetSubjectCredit = "SELECT subject_credit FROM Subject WHERE subject_id=?";

            // Retrieving values from UI components
            String studentId = controller.getComboBoxValue(teacherStudentIdcombo);
            String courseId = controller.getComboBoxValue(teacherSubjectCoseIdcombo);
            String subjectId = controller.getComboBoxValue(teacherSubjectSubjectIdcombo);
           
            double mark = Double.parseDouble(teacherSubjectMarktext.getText());
            int insertMark = (int) mark;  // Convert to integer
            double credit = controller.getCredit(queryGetSubjectCredit, subjectId); // Get subject credit
            double gpa = controller.calculateGPA(mark, credit); // Calculate GPA

            // Column names matching the SubjectMark table
            String[] columns = {"student_code", "course_id", "subject_id", "teacher_code", "subject_mark", "subject_gpa"};
            Object[] values = {studentId, courseId, subjectId, teacher_id, insertMark, gpa};

            // Insert data into the SubjectMark table
            boolean success = controller.insertData("SubjectMark", columns, values);

            if (success) {
               
                System.out.println("Data inserted successfully!");
            } else {
                System.out.println("Failed to insert data.");
            }
            
             teacherMarkDataTable.setModel(controller.getTableModel(queryGetStudentMark, teacher_id));
             markFormClear ();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_teacherSubjectSaveBtnActionPerformed

    private void teacherSubjectDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectDeleteBtnActionPerformed
         try {
        // Get selected student ID from combo box
        String studentId = controller.getComboBoxValue(teacherStudentIdcombo);
        
        // Ensure studentId is not empty or null
        if (studentId == null || studentId.trim().isEmpty()) {
            System.out.println("Please select a student.");
            return;
        }

        // Confirmation dialog before deletion
        int confirm = JOptionPane.showConfirmDialog(null, 
                    "Are you sure you want to delete subject marks for Student ID: " + studentId + "?", 
                    "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            // Query to delete subject marks for the given student
            String deleteQuery = "DELETE FROM SubjectMark WHERE student_code = ?";  
            // Call deleteData method
            controller.deleteData(deleteQuery, studentId);
            JOptionPane.showMessageDialog(null, "Subject marks deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);  
            
        }
        teacherMarkDataTable.setModel(controller.getTableModel(queryGetStudentMark, teacher_id));
        markFormClear ();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            
        }
    }//GEN-LAST:event_teacherSubjectDeleteBtnActionPerformed

    private void teacherMarkDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherMarkDataTableMouseClicked
        // TODO add your handling code here:
        
         SwingUtilities.invokeLater(() -> {
            int selectedRow = teacherMarkDataTable.getSelectedRow();
            System.out.println("Selected Row: " + selectedRow); // Debugging

            if (selectedRow != -1) {
                teacherStudentIdcombo.setSelectedItem(controller.getValue(teacherMarkDataTable, selectedRow, 0));
                teacherSubjectCoseIdcombo.setSelectedItem(controller.getValue(teacherMarkDataTable, selectedRow, 1));
                teacherSubjectSubjectIdcombo.setSelectedItem(controller.getValue(teacherMarkDataTable, selectedRow, 2));
                teacherSubjectMarktext.setText(controller.getValue(teacherMarkDataTable, selectedRow, 3));
                
            }
        });
        
    }//GEN-LAST:event_teacherMarkDataTableMouseClicked

    private void teacherSubjectLoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectLoadBtnActionPerformed
        // TODO add your handling code here:
        markFormClear ();
    }//GEN-LAST:event_teacherSubjectLoadBtnActionPerformed

    private void teacherSubjectSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectSearchBtnActionPerformed
        // TODO add your handling code here:
        try {
            String studentId = teacherSubjectSearchtext.getText(); // Get student code from UI

            String query = "SELECT sm.student_code, sm.course_id, sm.subject_id, sm.teacher_code, sm.subject_mark, sm.subject_gpa " +
                   "FROM SubjectMark sm " +
                   "JOIN Teacher t ON sm.teacher_code = t.teacher_code " +
                   "WHERE sm.teacher_code = ? AND sm.student_code = ?";

            
             teacherMarkDataTable.setModel(controller.searchData(teacher_id, studentId, query));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_teacherSubjectSearchBtnActionPerformed

    private void teacherSubjectSearchtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teacherSubjectSearchtextKeyPressed
        // TODO add your handling code here:
        try {
            String studentId = teacherSubjectSearchtext.getText(); // Get student code from UI

            String query = "SELECT sm.student_code, sm.course_id, sm.subject_id, sm.teacher_code, sm.subject_mark, sm.subject_gpa " +
                   "FROM SubjectMark sm " +
                   "JOIN Teacher t ON sm.teacher_code = t.teacher_code " +
                   "WHERE sm.teacher_code = ? AND sm.student_code = ?";

            
             teacherMarkDataTable.setModel(controller.searchData(teacher_id, studentId, query));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_teacherSubjectSearchtextKeyPressed

    private void teacherSubjectRefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherSubjectRefreshBtnActionPerformed
        // TODO add your handling code here:
        teacherMarkDataTable.setModel(controller.getTableModel(queryGetStudentMark, teacher_id));
        teacherSubjectSearchtext.setText("");
        
    }//GEN-LAST:event_teacherSubjectRefreshBtnActionPerformed

    private void teacherTimeTableSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherTimeTableSearchBtnActionPerformed
        // TODO add your handling code here:
        
        try {
            String value =controller.getComboBoxValue(teacherMarkSubjectIdcombo);
             String query = "SELECT  course_id, subject_id, " +
                   "time_mon, time_tue, time_wed, time_thu, time_fri " +
                   "FROM TimeTable " +
                   "WHERE subject_id = ? AND teacher_code = ?";
            teacherTitmeTableDataTable.setModel(controller.searchData(teacher_id, value, query));
            
             
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_teacherTimeTableSearchBtnActionPerformed

    private void teacherTimeTableRefreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherTimeTableRefreshBtnActionPerformed
        // TODO add your handling code here:
        teacherTitmeTableDataTable.setModel(controller.getTableModel(queryGetTimeTable, teacher_id));
        teacherMarkSubjectIdcombo.setSelectedIndex(0);
    }//GEN-LAST:event_teacherTimeTableRefreshBtnActionPerformed

    private void teacherMarkSubjectIdcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherMarkSubjectIdcomboMouseClicked
        // TODO add your handling code here:
        try {
            String value =controller.getComboBoxValue(teacherMarkSubjectIdcombo);
             String query = "SELECT timetable_id, course_id, subject_id, teacher_code, " +
                   "time_mon, time_tue, time_wed, time_thu, time_fri " +
                   "FROM TimeTable " +
                   "WHERE teacher_code = ? AND subject_id = ?  ";
            teacherTitmeTableDataTable.setModel(controller.searchData(teacher_id, value, query));
            
             
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_teacherMarkSubjectIdcomboMouseClicked

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher(null).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable teacherMarkDataTable;
    private javax.swing.JPanel teacherMarkPanel;
    private javax.swing.JButton teacherMarkRefreshBtn;
    private javax.swing.JButton teacherMarkSearchBtn;
    private javax.swing.JComboBox<String> teacherMarkSubjectIdcombo;
    private javax.swing.JComboBox<String> teacherStudentIdcombo;
    private javax.swing.JComboBox<String> teacherSubjectCoseIdcombo;
    private javax.swing.JTable teacherSubjectDataTable;
    private javax.swing.JButton teacherSubjectDeleteBtn;
    private javax.swing.JButton teacherSubjectLoadBtn;
    private javax.swing.JTextField teacherSubjectMarktext;
    private javax.swing.JButton teacherSubjectRefreshBtn;
    private javax.swing.JButton teacherSubjectSaveBtn;
    private javax.swing.JButton teacherSubjectSearchBtn;
    private javax.swing.JTextField teacherSubjectSearchtext;
    private javax.swing.JComboBox<String> teacherSubjectSubjectIdcombo;
    private javax.swing.JButton teacherSubjectUpdateBtn;
    private javax.swing.JButton teacherTimeTableRefreshBtn;
    private javax.swing.JButton teacherTimeTableSearchBtn;
    private javax.swing.JTable teacherTitmeTableDataTable;
    private javax.swing.JPanel teacherTitmeTablePanel;
    // End of variables declaration//GEN-END:variables
}
