import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class StudentInfoSystemUI extends javax.swing.JFrame {

    public StudentInfoSystemUI() {
        initComponents();

        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        frontPanel = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        staffPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        searchBTN = new javax.swing.JButton();
        editBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        addStudentBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        studentPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        displayStudentBTN = new javax.swing.JButton();
        loginStaff = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        loginStaffBTN = new javax.swing.JButton();
        userStaffTF = new javax.swing.JTextField();
        passStaffPF = new javax.swing.JPasswordField();
        loginStudent = new javax.swing.JPanel();
        passStaffPF1 = new javax.swing.JPasswordField();
        userStaffTF1 = new javax.swing.JTextField();
        loginStaffBTN1 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        subPanel = new javax.swing.JPanel();
        frontPanelSub = new javax.swing.JPanel();
        addPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        coursetf = new javax.swing.JTextField();
        gendertf = new javax.swing.JTextField();
        addresstf = new javax.swing.JTextField();
        matrictf = new javax.swing.JTextField();
        contacttf = new javax.swing.JTextField();
        birthdaytf = new javax.swing.JTextField();
        semestertf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        editPanel = new javax.swing.JPanel();
        updatebtn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        semestertf1 = new javax.swing.JTextField();
        coursetf1 = new javax.swing.JTextField();
        gendertf1 = new javax.swing.JTextField();
        addresstf1 = new javax.swing.JTextField();
        matrictf1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        contacttf1 = new javax.swing.JTextField();
        birthdaytf1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        nametf1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        searchtf2 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        searchPanel = new javax.swing.JPanel();
        searchtf = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        deletePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        deletebtn = new javax.swing.JButton();
        searchtf1 = new javax.swing.JTextField();
        displayAllPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        displayProfilePanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        searchTF3 = new javax.swing.JTextField();
        searchProfileBTN = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Information System");

        bodyPanel.setBackground(new java.awt.Color(255, 255, 0));

        menuPanel.setBackground(new java.awt.Color(0, 51, 255));
        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        btnHome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnHome.setText("HOME");
        btnHome.setIconTextGap(10);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnStaff.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnStaff.setText("STAFF");
        btnStaff.setIconTextGap(10);
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });

        btnStudent.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnStudent.setText("STUDENT");
        btnStudent.setIconTextGap(10);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.setIconTextGap(10);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STUDENT");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("  INFORMATION");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SYSTEM");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\muham\\OneDrive\\Documents\\NetBeansProjects\\StudentInformationSystems\\src\\StudentLogo.png")); // NOI18N

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(26, 188, 156));
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        mainPanel.setLayout(new java.awt.CardLayout());

        frontPanel.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout frontPanelLayout = new javax.swing.GroupLayout(frontPanel);
        frontPanel.setLayout(frontPanelLayout);
        frontPanelLayout.setHorizontalGroup(
            frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        frontPanelLayout.setVerticalGroup(
            frontPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        mainPanel.add(frontPanel, "card6");

        homePanel.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
            homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        mainPanel.add(homePanel, "card2");

        staffPanel.setBackground(new java.awt.Color(0, 51, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STAFF");

        searchBTN.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        searchBTN.setText("Search Student");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        editBTN.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        editBTN.setText("Edit Student");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });

        displayBTN.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        displayBTN.setText("Display ALL Student");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        addStudentBTN.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        addStudentBTN.setText("Add New Student");
        addStudentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentBTNActionPerformed(evt);
            }
        });

        deleteBTN.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        deleteBTN.setText("Delete Student");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout staffPanelLayout = new javax.swing.GroupLayout(staffPanel);
        staffPanel.setLayout(staffPanelLayout);
        staffPanelLayout.setHorizontalGroup(
            staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(deleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addStudentBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        staffPanelLayout.setVerticalGroup(
            staffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staffPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(49, 49, 49)
                .addComponent(addStudentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );

        mainPanel.add(staffPanel, "card3");

        studentPanel.setBackground(new java.awt.Color(0, 51, 255));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STUDENT");

        displayStudentBTN.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        displayStudentBTN.setText("Display Profile");
        displayStudentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayStudentBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentPanelLayout = new javax.swing.GroupLayout(studentPanel);
        studentPanel.setLayout(studentPanelLayout);
        studentPanelLayout.setHorizontalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(studentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(58, 58, 58))
                    .addComponent(displayStudentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        studentPanelLayout.setVerticalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addComponent(displayStudentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );

        mainPanel.add(studentPanel, "card4");

        loginStaff.setBackground(new java.awt.Color(0, 51, 255));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("STAFF");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Username:");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Password:");

        loginStaffBTN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginStaffBTN.setText("LOGIN");
        loginStaffBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginStaffBTNActionPerformed(evt);
            }
        });

        userStaffTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userStaffTFActionPerformed(evt);
            }
        });

        passStaffPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passStaffPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginStaffLayout = new javax.swing.GroupLayout(loginStaff);
        loginStaff.setLayout(loginStaffLayout);
        loginStaffLayout.setHorizontalGroup(
            loginStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginStaffLayout.createSequentialGroup()
                        .addGroup(loginStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34))
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addComponent(userStaffTF)
                    .addComponent(passStaffPF))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginStaffLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginStaffBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        loginStaffLayout.setVerticalGroup(
            loginStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addGap(31, 31, 31)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userStaffTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passStaffPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loginStaffBTN)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        mainPanel.add(loginStaff, "card6");

        loginStudent.setBackground(new java.awt.Color(0, 51, 255));

        passStaffPF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passStaffPF1ActionPerformed(evt);
            }
        });

        userStaffTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userStaffTF1ActionPerformed(evt);
            }
        });

        loginStaffBTN1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loginStaffBTN1.setText("LOGIN");
        loginStaffBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginStaffBTN1ActionPerformed(evt);
            }
        });

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Password:");

        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Username:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("STUDENT");

        javax.swing.GroupLayout loginStudentLayout = new javax.swing.GroupLayout(loginStudent);
        loginStudent.setLayout(loginStudentLayout);
        loginStudentLayout.setHorizontalGroup(
            loginStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginStudentLayout.createSequentialGroup()
                        .addGroup(loginStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addComponent(userStaffTF1)
                    .addComponent(passStaffPF1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginStudentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginStaffBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        loginStudentLayout.setVerticalGroup(
            loginStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addGap(31, 31, 31)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userStaffTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passStaffPF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(loginStaffBTN1)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        mainPanel.add(loginStudent, "card7");

        subPanel.setBackground(new java.awt.Color(0, 51, 255));
        subPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        subPanel.setLayout(new java.awt.CardLayout());

        frontPanelSub.setBackground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout frontPanelSubLayout = new javax.swing.GroupLayout(frontPanelSub);
        frontPanelSub.setLayout(frontPanelSubLayout);
        frontPanelSubLayout.setHorizontalGroup(
            frontPanelSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        frontPanelSubLayout.setVerticalGroup(
            frontPanelSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );

        subPanel.add(frontPanelSub, "card7");

        addPanel.setBackground(new java.awt.Color(0, 51, 255));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Program:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Matric no:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of birth:");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Semester:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact Number:");

        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });

        coursetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursetfActionPerformed(evt);
            }
        });

        gendertf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendertfActionPerformed(evt);
            }
        });

        addresstf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstfActionPerformed(evt);
            }
        });

        matrictf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrictfActionPerformed(evt);
            }
        });

        contacttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttfActionPerformed(evt);
            }
        });

        birthdaytf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdaytfActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contacttf, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gendertf, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursetf, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matrictf, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthdaytf, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semestertf, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(29, 29, 29)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gendertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coursetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(29, 29, 29)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(29, 29, 29)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matrictf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdaytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(29, 29, 29)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semestertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contacttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        subPanel.add(addPanel, "card2");

        editPanel.setBackground(new java.awt.Color(0, 51, 255));

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Program:");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Address:");

        coursetf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursetf1ActionPerformed(evt);
            }
        });

        gendertf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gendertf1ActionPerformed(evt);
            }
        });

        addresstf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstf1ActionPerformed(evt);
            }
        });

        matrictf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrictf1ActionPerformed(evt);
            }
        });

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Matric no:");

        contacttf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttf1ActionPerformed(evt);
            }
        });

        birthdaytf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdaytf1ActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Date of birth:");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Semester:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Contact Number:");

        nametf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametf1ActionPerformed(evt);
            }
        });

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Name:");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Gender:");

        searchtf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtf2ActionPerformed(evt);
            }
        });
        searchtf2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtf2KeyReleased(evt);
            }
        });

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "COURSE", "ADDRESS", "MATRIC NO", "BIRTH DATE", "SEMESTER", "CONTACT NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table3);

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel24))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contacttf1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nametf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gendertf1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(coursetf1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addresstf1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(matrictf1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(birthdaytf1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(semestertf1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchtf2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editPanelLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(editPanelLayout.createSequentialGroup()
                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(editPanelLayout.createSequentialGroup()
                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(editPanelLayout.createSequentialGroup()
                                        .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(editPanelLayout.createSequentialGroup()
                                                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel23)
                                                    .addComponent(nametf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel24))
                                            .addComponent(gendertf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17))
                                    .addComponent(coursetf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18))
                            .addComponent(addresstf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19))
                    .addComponent(matrictf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdaytf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semestertf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contacttf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addComponent(updatebtn)
                .addGap(18, 18, 18)
                .addComponent(searchtf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        subPanel.add(editPanel, "card3");

        searchPanel.setBackground(new java.awt.Color(0, 51, 255));

        searchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtfActionPerformed(evt);
            }
        });
        searchtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtfKeyReleased(evt);
            }
        });

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "COURSE", "ADDRESS", "MATRIC NO", "BIRTH DATE", "SEMESTER", "CONTACT NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table2);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search:");

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 313, Short.MAX_VALUE)))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        subPanel.add(searchPanel, "card5");

        deletePanel.setBackground(new java.awt.Color(0, 51, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "COURSE", "ADDRESS", "MATRIC NO", "BIRTH DATE", "SEMESTER", "CONTACT NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        searchtf1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchtf1MouseClicked(evt);
            }
        });
        searchtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtf1ActionPerformed(evt);
            }
        });
        searchtf1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtf1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(deletebtn)
                .addGap(35, 35, 35)
                .addComponent(searchtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtn)
                    .addComponent(searchtf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        subPanel.add(deletePanel, "card5");

        displayAllPanel.setBackground(new java.awt.Color(0, 51, 255));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "COURSE", "ADDRESS", "MATRIC NO", "BIRTH DATE", "SEMESTER", "CONTACT NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table1);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Display All");

        javax.swing.GroupLayout displayAllPanelLayout = new javax.swing.GroupLayout(displayAllPanel);
        displayAllPanel.setLayout(displayAllPanelLayout);
        displayAllPanelLayout.setHorizontalGroup(
            displayAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayAllPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(displayAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                    .addGroup(displayAllPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(displayAllPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        displayAllPanelLayout.setVerticalGroup(
            displayAllPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayAllPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        subPanel.add(displayAllPanel, "card6");

        displayProfilePanel.setBackground(new java.awt.Color(0, 51, 255));

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Matric No:");

        searchProfileBTN.setText("Search");
        searchProfileBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProfileBTNActionPerformed(evt);
            }
        });

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "GENDER", "COURSE", "ADDRESS", "MATRIC NO", "BIRTH DATE", "SEMESTER", "CONTACT NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(table4);

        javax.swing.GroupLayout displayProfilePanelLayout = new javax.swing.GroupLayout(displayProfilePanel);
        displayProfilePanel.setLayout(displayProfilePanelLayout);
        displayProfilePanelLayout.setHorizontalGroup(
            displayProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayProfilePanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(displayProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayProfilePanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(searchProfileBTN))
                    .addGroup(displayProfilePanelLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(51, 51, 51)
                        .addComponent(searchTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayProfilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                .addContainerGap())
        );
        displayProfilePanelLayout.setVerticalGroup(
            displayProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayProfilePanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(displayProfilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(searchTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchProfileBTN)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        subPanel.add(displayProfilePanel, "card8");

        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:

        // remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();

        // add panel
        mainPanel.add(homePanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(loginStaff);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        // TODO add your handling code here:
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        mainPanel.add(loginStudent);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int dialogBtn = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Anda yakin akan keluar?", "PERINGATAN", dialogBtn);
        if (dialogResult == 0) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
        subPanel.removeAll();
        subPanel.repaint();
        subPanel.revalidate();
        subPanel.add(displayAllPanel);
        subPanel.repaint();
        subPanel.revalidate();
    }//GEN-LAST:event_displayBTNActionPerformed

    private void addStudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentBTNActionPerformed
        // TODO add your handling code here:
        subPanel.removeAll();
        subPanel.repaint();
        subPanel.revalidate();
        subPanel.add(addPanel);
        subPanel.repaint();
        subPanel.revalidate();
    }//GEN-LAST:event_addStudentBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        subPanel.removeAll();
        subPanel.repaint();
        subPanel.revalidate();
        subPanel.add(searchPanel);
        subPanel.repaint();
        subPanel.revalidate();
    }//GEN-LAST:event_searchBTNActionPerformed

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
        // TODO add your handling code here:
        subPanel.removeAll();
        subPanel.repaint();
        subPanel.revalidate();
        subPanel.add(editPanel);
        subPanel.repaint();
        subPanel.revalidate();
    }//GEN-LAST:event_editBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        subPanel.removeAll();
        subPanel.repaint();
        subPanel.revalidate();
        subPanel.add(deletePanel);
        subPanel.repaint();
        subPanel.revalidate();
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametfActionPerformed

    private void coursetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursetfActionPerformed

    private void gendertfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendertfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendertfActionPerformed

    private void addresstfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstfActionPerformed

    private void matrictfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrictfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matrictfActionPerformed

    private void contacttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttfActionPerformed

    private void birthdaytfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdaytfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdaytfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(nametf.getText().equals("")||(gendertf.getText().equals(""))||(coursetf.getText().equals(""))||(addresstf.getText().equals(""))||(matrictf.getText().equals(""))||(birthdaytf.getText().equals(""))||(semestertf.getText().equals(""))||(contacttf.getText().equals(""))){
            JOptionPane.showMessageDialog(this, "You need to fill up all the data");
        }else{
            String data[] = {nametf.getText(),gendertf.getText(),coursetf.getText(),addresstf.getText(), matrictf.getText(), birthdaytf.getText(), semestertf.getText(), contacttf.getText()};
            
            DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
            DefaultTableModel tablemode2 = (DefaultTableModel)table1.getModel();
            DefaultTableModel tablemode3 = (DefaultTableModel)table2.getModel();
            DefaultTableModel tablemode4 = (DefaultTableModel)table3.getModel();
            DefaultTableModel tablemode5 = (DefaultTableModel)table4.getModel();
            tablemodel.addRow (data);
            tablemode2.addRow (data);
            tablemode3.addRow (data);
            tablemode4.addRow (data);
            tablemode5.addRow (data);
            JOptionPane.showMessageDialog(this, "The data has been added");
            
            nametf.setText("");
            gendertf.setText("");
            coursetf.setText("");
            addresstf.setText("");
            matrictf.setText("");
            birthdaytf.setText("");
            semestertf.setText("");
            contacttf.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();

        String tablename = tablemodel.getValueAt(table.getSelectedRow(), 0).toString();
        String tablegender = tablemodel.getValueAt(table.getSelectedRow(), 1).toString();
        String tablecourse = tablemodel.getValueAt(table.getSelectedRow(), 2).toString();
        String tableaddress = tablemodel.getValueAt(table.getSelectedRow(), 3).toString();
        String tablematric = tablemodel.getValueAt(table.getSelectedRow(), 4).toString();
        String tablebirthday = tablemodel.getValueAt(table.getSelectedRow(), 5).toString();
        String tablesemester = tablemodel.getValueAt(table.getSelectedRow(), 6).toString();
        String tablecontact = tablemodel.getValueAt(table.getSelectedRow(), 7).toString();

        nametf.setText(tablename);
        gendertf.setText(tablegender);
        coursetf.setText(tablecourse);
        addresstf.setText(tableaddress);
        matrictf.setText(tablematric);
        birthdaytf.setText(tablebirthday);
        semestertf.setText(tablesemester);
        contacttf.setText(tablecontact);
    }//GEN-LAST:event_tableMouseClicked

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtfActionPerformed

    private void searchtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyReleased
        DefaultTableModel tablemode3 = (DefaultTableModel)table2.getModel();
        String search = searchtf.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter <DefaultTableModel> (tablemode3);
        table2.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchtfKeyReleased

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tablemode3 = (DefaultTableModel)table2.getModel();

        String tablename = tablemode3.getValueAt(table2.getSelectedRow(), 0).toString();
        String tablegender = tablemode3.getValueAt(table2.getSelectedRow(), 1).toString();
        String tablecourse = tablemode3.getValueAt(table2.getSelectedRow(), 2).toString();
        String tableaddress = tablemode3.getValueAt(table2.getSelectedRow(), 3).toString();
        String tablematric = tablemode3.getValueAt(table2.getSelectedRow(), 4).toString();
        String tablebirthday = tablemode3.getValueAt(table2.getSelectedRow(), 5).toString();
        String tablesemester = tablemode3.getValueAt(table2.getSelectedRow(), 6).toString();
        String tablecontact = tablemode3.getValueAt(table2.getSelectedRow(), 7).toString();

        nametf.setText(tablename);
        gendertf.setText(tablegender);
        coursetf.setText(tablecourse);
        addresstf.setText(tableaddress);
        matrictf.setText(tablematric);
        birthdaytf.setText(tablebirthday);
        semestertf.setText(tablesemester);
        contacttf.setText(tablecontact);
    }//GEN-LAST:event_table2MouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
        DefaultTableModel tablemode2 = (DefaultTableModel)table1.getModel();
        DefaultTableModel tablemode3 = (DefaultTableModel)table2.getModel();
        DefaultTableModel tablemode4 = (DefaultTableModel)table3.getModel();
        DefaultTableModel tablemode5 = (DefaultTableModel)table4.getModel();
        if(table.getSelectedRowCount()== 1){
            tablemodel.removeRow(table.getSelectedRow());
            int index = table.getSelectedRow();
            tablemode2.removeRow(index+1);
            tablemode3.removeRow(index+1);
            tablemode4.removeRow(index+1);
            tablemode5.removeRow(index+1);
        }
        else 
        {
            if (table.getRowCount()== 0)
            {
                JOptionPane.showMessageDialog(this, "No data");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Please select only single row at one time");
            }
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void searchtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtf1ActionPerformed

    private void searchtf1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtf1KeyReleased
        // TODO add your handling code here:
        DefaultTableModel tablemode1 = (DefaultTableModel)table.getModel();
        String search = searchtf1.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter <DefaultTableModel> (tablemode1);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchtf1KeyReleased

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        DefaultTableModel tablemodel = (DefaultTableModel)table.getModel();
        DefaultTableModel tablemode2 = (DefaultTableModel)table1.getModel();
        DefaultTableModel tablemode3 = (DefaultTableModel)table2.getModel();
        DefaultTableModel tablemode4 = (DefaultTableModel)table3.getModel();
        DefaultTableModel tablemode5 = (DefaultTableModel)table4.getModel();
        if(table3.getSelectedRowCount()== 1){

            String name = nametf1.getText();
            String gender = gendertf1.getText();
            String course = coursetf1.getText();
            String address = addresstf1.getText();
            String matric = matrictf1.getText();
            String birthday = birthdaytf1.getText();
            String semester = semestertf1.getText();
            String contact = contacttf1.getText();

            tablemode4.setValueAt(name, table3.getSelectedRow(), 0);
            tablemode4.setValueAt(gender, table3.getSelectedRow(), 1);
            tablemode4.setValueAt(course, table3.getSelectedRow(), 2);
            tablemode4.setValueAt(address, table3.getSelectedRow(), 3);
            tablemode4.setValueAt(matric, table3.getSelectedRow(), 4);
            tablemode4.setValueAt(birthday, table3.getSelectedRow(), 5);
            tablemode4.setValueAt(semester, table3.getSelectedRow(), 6);
            tablemode4.setValueAt(contact, table3.getSelectedRow(), 7);
            int index = table.getSelectedRow();
            
            tablemode2.setValueAt(name, index+1, 0);
            tablemode2.setValueAt(gender, index+1, 1);
            tablemode2.setValueAt(course, index+1, 2);
            tablemode2.setValueAt(address, index+1, 3);
            tablemode2.setValueAt(matric, index+1, 4);
            tablemode2.setValueAt(birthday, index+1, 5);
            tablemode2.setValueAt(semester, index+1, 6);
            tablemode2.setValueAt(contact, index+1, 7);
            
            tablemodel.setValueAt(name, index+1, 0);
            tablemodel.setValueAt(gender, index+1, 1);
            tablemodel.setValueAt(course, index+1, 2);
            tablemodel.setValueAt(address, index+1, 3);
            tablemodel.setValueAt(matric, index+1, 4);
            tablemodel.setValueAt(birthday, index+1, 5);
            tablemodel.setValueAt(semester, index+1, 6);
            tablemodel.setValueAt(contact, index+1, 7);
            
            tablemode3.setValueAt(name, index+1, 0);
            tablemode3.setValueAt(gender, index+1, 1);
            tablemode3.setValueAt(course, index+1, 2);
            tablemode3.setValueAt(address, index+1, 3);
            tablemode3.setValueAt(matric, index+1, 4);
            tablemode3.setValueAt(birthday, index+1, 5);
            tablemode3.setValueAt(semester, index+1, 6);
            tablemode3.setValueAt(contact, index+1, 7);
            
            tablemode5.setValueAt(name, index+1, 0);
            tablemode5.setValueAt(gender, index+1, 1);
            tablemode5.setValueAt(course, index+1, 2);
            tablemode5.setValueAt(address, index+1, 3);
            tablemode5.setValueAt(matric, index+1, 4);
            tablemode5.setValueAt(birthday, index+1, 5);
            tablemode5.setValueAt(semester, index+1, 6);
            tablemode5.setValueAt(contact, index+1, 7);
            JOptionPane.showMessageDialog(this, "Update successful!");
        }else{
            if(table3.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "No data");
            }else{
                JOptionPane.showMessageDialog(this, "Please select only one row in one time!");
            }
        }

    }//GEN-LAST:event_updatebtnActionPerformed

    private void coursetf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursetf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coursetf1ActionPerformed

    private void gendertf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gendertf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gendertf1ActionPerformed

    private void addresstf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstf1ActionPerformed

    private void matrictf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrictf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matrictf1ActionPerformed

    private void contacttf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttf1ActionPerformed

    private void birthdaytf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdaytf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdaytf1ActionPerformed

    private void nametf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametf1ActionPerformed

    private void searchtf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtf2ActionPerformed

    private void searchtf2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtf2KeyReleased
        // TODO add your handling code here:
        DefaultTableModel tablemode4 = (DefaultTableModel)table3.getModel();
        String search = searchtf2.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter <DefaultTableModel> (tablemode4);
        table3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchtf2KeyReleased

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tablemode4 = (DefaultTableModel)table3.getModel();
        String tablename = tablemode4.getValueAt(table3.getSelectedRow(), 0).toString();
        String tablegender = tablemode4.getValueAt(table3.getSelectedRow(), 1).toString();
        String tablecourse = tablemode4.getValueAt(table3.getSelectedRow(), 2).toString();
        String tableaddress = tablemode4.getValueAt(table3.getSelectedRow(), 3).toString();
        String tablematric = tablemode4.getValueAt(table3.getSelectedRow(), 4).toString();
        String tablebirthday = tablemode4.getValueAt(table3.getSelectedRow(), 5).toString();
        String tablesemester = tablemode4.getValueAt(table3.getSelectedRow(), 6).toString();
        String tablecontact = tablemode4.getValueAt(table3.getSelectedRow(), 7).toString();

        nametf1.setText(tablename);
        gendertf1.setText(tablegender);
        coursetf1.setText(tablecourse);
        addresstf1.setText(tableaddress);
        matrictf1.setText(tablematric);
        birthdaytf1.setText(tablebirthday);
        semestertf1.setText(tablesemester);
        contacttf1.setText(tablecontact);
    }//GEN-LAST:event_table3MouseClicked

    private void searchtf1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtf1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtf1MouseClicked

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tablemode2 = (DefaultTableModel)table1.getModel();

        String tablename = tablemode2.getValueAt(table.getSelectedRow(), 0).toString();
        String tablegender = tablemode2.getValueAt(table.getSelectedRow(), 1).toString();
        String tablecourse = tablemode2.getValueAt(table.getSelectedRow(), 2).toString();
        String tableaddress = tablemode2.getValueAt(table.getSelectedRow(), 3).toString();
        String tablematric = tablemode2.getValueAt(table.getSelectedRow(), 4).toString();
        String tablebirthday = tablemode2.getValueAt(table.getSelectedRow(), 5).toString();
        String tablesemester = tablemode2.getValueAt(table.getSelectedRow(), 6).toString();
        String tablecontact = tablemode2.getValueAt(table.getSelectedRow(), 7).toString();
        
        nametf.setText(tablename);
        gendertf.setText(tablegender);
        coursetf.setText(tablecourse);
        addresstf.setText(tableaddress);
        matrictf.setText(tablematric);
        birthdaytf.setText(tablebirthday);
        semestertf.setText(tablesemester);
        contacttf.setText(tablecontact);
    }//GEN-LAST:event_table1MouseClicked

    private void displayStudentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayStudentBTNActionPerformed
        // TODO add your handling code here:
        subPanel.removeAll();
        subPanel.repaint();
        subPanel.revalidate();
        subPanel.add(displayProfilePanel);
        subPanel.repaint();
        subPanel.revalidate();
    }//GEN-LAST:event_displayStudentBTNActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tablemode5 = (DefaultTableModel)table4.getModel();

        String tablename = tablemode5.getValueAt(table4.getSelectedRow(), 0).toString();
        String tablegender = tablemode5.getValueAt(table4.getSelectedRow(), 1).toString();
        String tablecourse = tablemode5.getValueAt(table4.getSelectedRow(), 2).toString();
        String tableaddress = tablemode5.getValueAt(table4.getSelectedRow(), 3).toString();
        String tablematric = tablemode5.getValueAt(table4.getSelectedRow(), 4).toString();
        String tablebirthday = tablemode5.getValueAt(table4.getSelectedRow(), 5).toString();
        String tablesemester = tablemode5.getValueAt(table4.getSelectedRow(), 6).toString();
        String tablecontact = tablemode5.getValueAt(table4.getSelectedRow(), 7).toString();
        
        nametf.setText(tablename);
        gendertf.setText(tablegender);
        coursetf.setText(tablecourse);
        addresstf.setText(tableaddress);
        matrictf.setText(tablematric);
        birthdaytf.setText(tablebirthday);
        semestertf.setText(tablesemester);
        contacttf.setText(tablecontact);
    }//GEN-LAST:event_table4MouseClicked

    private void searchProfileBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProfileBTNActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tablemode5 = (DefaultTableModel)table4.getModel();
        String search = searchTF3.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter <DefaultTableModel> (tablemode5);
        table3.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchProfileBTNActionPerformed

    private void loginStaffBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginStaffBTNActionPerformed
        // TODO add your handling code here:
        String username = "admin";
        String password = "1234";
        if(username == ("admin") && password == ("1234"))
        {
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();
            mainPanel.add(staffPanel);
            mainPanel.repaint();
            mainPanel.revalidate();
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Password / "+ "Username");
            userStaffTF.setText("");
            passStaffPF.setText("");
            userStaffTF.requestFocus();
        }
    }//GEN-LAST:event_loginStaffBTNActionPerformed

    private void userStaffTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userStaffTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userStaffTFActionPerformed

    private void passStaffPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passStaffPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passStaffPFActionPerformed

    private void passStaffPF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passStaffPF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passStaffPF1ActionPerformed

    private void userStaffTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userStaffTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userStaffTF1ActionPerformed

    private void loginStaffBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginStaffBTN1ActionPerformed
        // TODO add your handling code here:
        String username = "student";
        String password = "1234";
        if(username == ("student") && password == ("1234"))
        {
            mainPanel.removeAll();
            mainPanel.repaint();
            mainPanel.revalidate();
            mainPanel.add(studentPanel);
            mainPanel.repaint();
            mainPanel.revalidate();
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Password / "+ "Username");
            userStaffTF.setText("");
            passStaffPF.setText("");
            userStaffTF.requestFocus();
        }
    }//GEN-LAST:event_loginStaffBTN1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentInfoSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInfoSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInfoSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInfoSystemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentInfoSystemUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton addStudentBTN;
    private javax.swing.JTextField addresstf;
    private javax.swing.JTextField addresstf1;
    private javax.swing.JTextField birthdaytf;
    private javax.swing.JTextField birthdaytf1;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnStaff;
    private javax.swing.JButton btnStudent;
    private javax.swing.JTextField contacttf;
    private javax.swing.JTextField contacttf1;
    private javax.swing.JTextField coursetf;
    private javax.swing.JTextField coursetf1;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JButton deletebtn;
    private javax.swing.JPanel displayAllPanel;
    private javax.swing.JButton displayBTN;
    private javax.swing.JPanel displayProfilePanel;
    private javax.swing.JButton displayStudentBTN;
    private javax.swing.JButton editBTN;
    private javax.swing.JPanel editPanel;
    private javax.swing.JPanel frontPanel;
    private javax.swing.JPanel frontPanelSub;
    private javax.swing.JTextField gendertf;
    private javax.swing.JTextField gendertf1;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel loginStaff;
    private javax.swing.JButton loginStaffBTN;
    private javax.swing.JButton loginStaffBTN1;
    private javax.swing.JPanel loginStudent;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField matrictf;
    private javax.swing.JTextField matrictf1;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField nametf1;
    private javax.swing.JPasswordField passStaffPF;
    private javax.swing.JPasswordField passStaffPF1;
    private javax.swing.JButton searchBTN;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JButton searchProfileBTN;
    private javax.swing.JTextField searchTF3;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTextField searchtf1;
    private javax.swing.JTextField searchtf2;
    private javax.swing.JTextField semestertf;
    private javax.swing.JTextField semestertf1;
    private javax.swing.JPanel staffPanel;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JPanel subPanel;
    private javax.swing.JTable table;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextField userStaffTF;
    private javax.swing.JTextField userStaffTF1;
    // End of variables declaration//GEN-END:variables
}
