package com.unindra.view;

import com.unindra.model.request.ClassroomRequest;
import com.unindra.model.request.DepartmentRequest;
import com.unindra.model.request.SectionRequest;
import com.unindra.model.request.SectionUpdateRequest;
import com.unindra.model.response.ClassroomResponse;
import com.unindra.model.response.DepartmentResponse;
import com.unindra.model.response.SectionResponse;
import com.unindra.model.response.WebResponse;
import com.unindra.service.ClassroomService;
import com.unindra.service.DepartmentService;
import com.unindra.service.SectionService;
import com.unindra.util.AppManager;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rizmakiana
 */
public class Dashboard extends javax.swing.JFrame {
    
    DepartmentService departmentService = new DepartmentService();
    ClassroomService classroomService = new ClassroomService();
    SectionService sectionService = new SectionService();

    public Dashboard() throws IOException {
        generateComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        studentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        studentPanelSearchField = new javax.swing.JTextField();
        studentPanelSectionList = new javax.swing.JComboBox<>();
        studentPanelClassroomList = new javax.swing.JComboBox<>();
        studentPanelDepartmentList = new javax.swing.JComboBox<>();
        studentPanelAddStudentButton = new javax.swing.JButton();
        studentPanelPrintButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        addStudent = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        addStudentNameField = new javax.swing.JTextField();
        addStudentProvinceBirthplaceField = new com.unindra.component.RegionComboBox();
        addStudentRegencyBirthplaceField = new com.unindra.component.RegionComboBox();
        addStudentBirthdateField = new javax.swing.JComboBox<>();
        addStudentBirthMonthField = new javax.swing.JComboBox<>();
        addStudentBirthYearField = new javax.swing.JComboBox<>();
        addStudentProvinceAddressField = new com.unindra.component.RegionComboBox();
        addStudentRegencyAddressField = new com.unindra.component.RegionComboBox();
        addStudentDistrictAddressField = new com.unindra.component.RegionComboBox();
        jScrollPane11 = new javax.swing.JScrollPane();
        addStudentDetailAddressField = new javax.swing.JTextArea();
        addStudentGenderField = new javax.swing.JComboBox<>();
        addStudentUsernameField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        addStudentEmailField = new javax.swing.JTextField();
        addStudentPhoneNumberField = new javax.swing.JTextField();
        addStudentAddButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        addStudentDepartmentField = new javax.swing.JComboBox<>();
        detailStudent = new javax.swing.JInternalFrame();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        detailStudentNameField = new javax.swing.JTextField();
        detailStudentProvinceField = new com.unindra.component.RegionComboBox();
        detailStudentRegencyField = new com.unindra.component.RegionComboBox();
        detailStudentBirthDateField = new javax.swing.JComboBox<>();
        detailStudentbirthMonthField = new javax.swing.JComboBox<>();
        detailStudentBirthYearField = new javax.swing.JComboBox<>();
        detailStudentProvinceAddressField = new com.unindra.component.RegionComboBox();
        detailStudentRegencyAddressField = new com.unindra.component.RegionComboBox();
        detailStudentDistrictAddressField = new com.unindra.component.RegionComboBox();
        jScrollPane12 = new javax.swing.JScrollPane();
        detailStudentDetailAddressField = new javax.swing.JTextArea();
        detailStudentGenderField = new javax.swing.JComboBox<>();
        detailStudentUsernameField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        detailStudentEmailField = new javax.swing.JTextField();
        detailStudentPhoneNumberField = new javax.swing.JTextField();
        detailStudentDeleteButton = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        detailStudentEditButton = new javax.swing.JButton();
        detailStudentClassroomField = new javax.swing.JComboBox<>();
        detailStudentSectionField = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        detailStudentDepartmentField = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        addDepartment = new javax.swing.JInternalFrame();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        detailDepartment = new javax.swing.JInternalFrame();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        addClassroom = new javax.swing.JInternalFrame();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jComboBox21 = new javax.swing.JComboBox<>();
        jComboBox22 = new javax.swing.JComboBox<>();
        detailClassroom = new javax.swing.JInternalFrame();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jComboBox23 = new javax.swing.JComboBox<>();
        jComboBox24 = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        addSection = new javax.swing.JInternalFrame();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jComboBox25 = new javax.swing.JComboBox<>();
        jComboBox26 = new javax.swing.JComboBox<>();
        detailSection = new javax.swing.JInternalFrame();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jComboBox27 = new javax.swing.JComboBox<>();
        jComboBox28 = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        transactionPanel = new javax.swing.JInternalFrame();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel69 = new javax.swing.JLabel();
        jComboBox33 = new javax.swing.JComboBox<>();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        addCategory = new javax.swing.JInternalFrame();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        addPaymentDetail = new javax.swing.JInternalFrame();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jComboBox34 = new javax.swing.JComboBox<>();
        jLabel77 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jComboBox35 = new javax.swing.JComboBox<>();
        detailCategory = new javax.swing.JInternalFrame();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        detailPaymentDetail = new javax.swing.JInternalFrame();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        jComboBox36 = new javax.swing.JComboBox<>();
        jLabel88 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jComboBox37 = new javax.swing.JComboBox<>();
        jButton25 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management School App");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        studentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Adwaita Sans", 0, 32)); // NOI18N
        jLabel2.setText("Data Siswa");
        studentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 40));

        jLabel3.setText("Data Seluruh Siswa Sekolah");
        studentPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 25));

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama Siswa", "Jenis Kelamin", "Tempat Lahir", "Tanggal Lahir", "Jurusan", "Kelas", "SubKelas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentTable);

        studentPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 1200, 545));
        studentPanel.add(studentPanelSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, 260, 30));

        studentPanelSectionList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Subkelas", "A", "B", "C" }));
        studentPanel.add(studentPanelSectionList, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 50, 160, 30));

        studentPanelClassroomList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Kelas", "10", "11", "12" }));
        studentPanel.add(studentPanelClassroomList, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 130, 30));

        studentPanelDepartmentList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Jurusan" }));
        studentPanel.add(studentPanelDepartmentList, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 50, 150, 30));

        studentPanelAddStudentButton.setText("Tambah Siswa");
        studentPanelAddStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentPanelAddStudentButtonActionPerformed(evt);
            }
        });
        studentPanel.add(studentPanelAddStudentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 15, 155, 30));

        studentPanelPrintButton.setText("Cetak");
        studentPanel.add(studentPanelPrintButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 15, 100, 30));

        jTabbedPane1.addTab("Data Siswa", studentPanel);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Adwaita Sans", 0, 32)); // NOI18N
        jLabel4.setText("Data Kelas");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 40));

        jLabel5.setText("Data Seluruh Kelas di Sekolah");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 25));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode Jurusan", "Nama Jurusan", "Total Tingkat Kelas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(55);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(50);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 595, 255));

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Tingkat Kelas", "Jurusan", "Tingkat Kelas", "Total Kelas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setResizable(false);
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(55);
            jTable3.getColumnModel().getColumn(1).setResizable(false);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable3.getColumnModel().getColumn(2).setResizable(false);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable3.getColumnModel().getColumn(3).setResizable(false);
            jTable3.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 85, 595, 255));

        jTable4.setAutoCreateRowSorter(true);
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Kelas", "Jurusan", "Tingkat Kelas", "Nama Kelas", "Jumlah Murid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.getTableHeader().setReorderingAllowed(false);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setResizable(false);
            jTable4.getColumnModel().getColumn(1).setResizable(false);
            jTable4.getColumnModel().getColumn(2).setResizable(false);
            jTable4.getColumnModel().getColumn(3).setResizable(false);
            jTable4.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 1200, 280));

        jButton3.setText("Tambah Jurusan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 150, 30));

        jButton4.setText("Tambah Tingkat Kelas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 50, 200, 30));

        jButton5.setText("Tambah Kelas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 50, 150, 30));

        jTabbedPane1.addTab("Data Kelas", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Adwaita Sans", 0, 32)); // NOI18N
        jLabel14.setText("Data Tabungan");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 40));

        jLabel15.setText("Data Tabungan Seluruh Siswa Sekolah");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 25));

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No Transaksi", "Nama Siswa", "Tanggal", "Total Tabungan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane10.setViewportView(jTable10);

        jPanel3.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 1200, 550));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Jurusan" }));
        jPanel3.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 150, 30));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Kelas", "10", "11", "12" }));
        jPanel3.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(925, 50, 130, 30));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Subkelas", "A", "B", "C" }));
        jPanel3.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 50, 160, 30));

        jTabbedPane1.addTab("Tabungan", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Adwaita Sans", 0, 32)); // NOI18N
        jLabel6.setText("Data Pembayaran Siswa");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 40));

        jLabel7.setText("Data Pembayaran Seluruh Siswa Sekolah");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 25));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "NIS", "Nama Siswa", "Total Tunggakan"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 1200, 500));

        jTabbedPane2.addTab("Pembayaran Siswa", jPanel7);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Adwaita Sans", 0, 32)); // NOI18N
        jLabel8.setText("Data Pembayaran");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 40));

        jLabel9.setText("Data Pembayaran Sekolah");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 25));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nama Kategori Pembayaran"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(550);
        }

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 595, 500));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kategori", "Untuk Kelas", "Nama Pembayaran", "Biaya"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);

        jPanel8.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 85, 595, 500));

        jButton6.setText("Tambah Kategori");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 50, -1, 30));

        jButton7.setText("Tambah Pembayaran");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, -1, 30));

        jTabbedPane2.addTab("Manajemen Pembayaran", jPanel8);

        jPanel4.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 640));

        jTabbedPane1.addTab("Dasbor Pembayaran", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Adwaita Sans", 0, 32)); // NOI18N
        jLabel12.setText("Riwayat Tabungan");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 40));

        jLabel13.setText("Data Riwayat Tabungan Harian Siswa Sekolah");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 330, 25));

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No Transaksi", "Nama Siswa", "Tanggal", "Biaya Masuk", "Biaya Keluar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable9);

        jPanel5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1200, 540));

        jPanel5.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 55, 60, 30));

        jPanel5.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 55, 125, 30));

        jPanel5.add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 55, 80, 30));

        jTabbedPane1.addTab("Riwayat Tabungan", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Adwaita Sans", 0, 32)); // NOI18N
        jLabel10.setText("Riwayat Transaksi");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 300, 40));

        jLabel11.setText("Data Transaksi Seluruh Siswa Sekolah");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 300, 25));

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No Transaksi", "Nama Siswa", "Tanggal", "Total Transaksi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable8);

        jPanel6.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1200, 540));

        jPanel6.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 55, 80, 30));

        jPanel6.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 55, 125, 30));

        jPanel6.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 55, 60, 30));

        jTabbedPane1.addTab("Riwayat Transaksi", jPanel6);

        jDesktopPane1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1240, 680));

        addStudent.setClosable(true);
        addStudent.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addStudent.setVisible(false);
        addStudent.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel1.setText("Tambah Siswa");
        addStudent.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel16.setText("Nama Lengkap");
        addStudent.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 30));

        jLabel17.setText("Jenis Kelamin");
        addStudent.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, 150, 30));

        jLabel18.setText("Tempat Lahir");
        addStudent.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jLabel19.setText("Tanggal Lahir");
        addStudent.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, 30));

        jLabel20.setText("Alamat");
        addStudent.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));
        addStudent.getContentPane().add(addStudentNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 300, 30));
        addStudent.getContentPane().add(addStudentProvinceBirthplaceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, 30));
        addStudent.getContentPane().add(addStudentRegencyBirthplaceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 140, 145, 30));

        addStudentBirthdateField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "28", "29", "30", "31" }));
        addStudent.getContentPane().add(addStudentBirthdateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 175, -1, 30));

        addStudentBirthMonthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "September", "Oktober" }));
        addStudent.getContentPane().add(addStudentBirthMonthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 175, 135, 30));

        addStudentBirthYearField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025" }));
        addStudent.getContentPane().add(addStudentBirthYearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 175, 85, 30));
        addStudent.getContentPane().add(addStudentProvinceAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, 30));
        addStudent.getContentPane().add(addStudentRegencyAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 210, 145, 30));
        addStudent.getContentPane().add(addStudentDistrictAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 245, 300, 30));

        addStudentDetailAddressField.setColumns(20);
        addStudentDetailAddressField.setLineWrap(true);
        addStudentDetailAddressField.setRows(5);
        addStudentDetailAddressField.setWrapStyleWord(true);
        jScrollPane11.setViewportView(addStudentDetailAddressField);

        addStudent.getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 300, 60));

        addStudentGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        addStudent.getContentPane().add(addStudentGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 105, 300, 30));
        addStudent.getContentPane().add(addStudentUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 345, 300, 30));

        jLabel21.setText("Nama Pengguna");
        addStudent.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 345, -1, 30));

        jLabel22.setText("Surel");
        addStudent.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        jLabel23.setText("No Telepon");
        addStudent.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 415, -1, 30));
        addStudent.getContentPane().add(addStudentEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 300, 30));
        addStudent.getContentPane().add(addStudentPhoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 415, 300, 30));

        addStudentAddButton.setText("Tambah");
        addStudent.getContentPane().add(addStudentAddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 520, 120, 30));
        addStudent.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 565, -1, -1));

        jLabel66.setText("Jurusan");
        addStudent.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 30));

        addStudent.getContentPane().add(addStudentDepartmentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 300, 30));

        jDesktopPane1.add(addStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 100, -1, -1));

        detailStudent.setClosable(true);
        detailStudent.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        detailStudent.setVisible(false);
        detailStudent.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel25.setText("Detail Siswa");
        detailStudent.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel26.setText("Nama Lengkap");
        detailStudent.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 30));

        jLabel27.setText("Jenis Kelamin");
        detailStudent.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, 150, 30));

        jLabel28.setText("Tempat Lahir");
        detailStudent.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jLabel29.setText("Tanggal Lahir");
        detailStudent.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, 30));

        jLabel30.setText("Alamat");
        detailStudent.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));
        detailStudent.getContentPane().add(detailStudentNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 300, 30));
        detailStudent.getContentPane().add(detailStudentProvinceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, 30));
        detailStudent.getContentPane().add(detailStudentRegencyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 140, 145, 30));

        detailStudentBirthDateField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "28", "29", "30", "31" }));
        detailStudent.getContentPane().add(detailStudentBirthDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 175, -1, 30));

        detailStudentbirthMonthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "September", "Oktober" }));
        detailStudent.getContentPane().add(detailStudentbirthMonthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 175, 135, 30));

        detailStudentBirthYearField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025" }));
        detailStudent.getContentPane().add(detailStudentBirthYearField, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 175, 85, 30));
        detailStudent.getContentPane().add(detailStudentProvinceAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, 30));
        detailStudent.getContentPane().add(detailStudentRegencyAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 210, 145, 30));
        detailStudent.getContentPane().add(detailStudentDistrictAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 245, 300, 30));

        detailStudentDetailAddressField.setColumns(20);
        detailStudentDetailAddressField.setLineWrap(true);
        detailStudentDetailAddressField.setRows(5);
        detailStudentDetailAddressField.setWrapStyleWord(true);
        jScrollPane12.setViewportView(detailStudentDetailAddressField);

        detailStudent.getContentPane().add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 300, 60));

        detailStudentGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        detailStudent.getContentPane().add(detailStudentGenderField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 105, 300, 30));
        detailStudent.getContentPane().add(detailStudentUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 345, 300, 30));

        jLabel31.setText("Nama Pengguna");
        detailStudent.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 345, -1, 30));

        jLabel32.setText("Surel");
        detailStudent.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));

        jLabel33.setText("No Telepon");
        detailStudent.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 415, -1, 30));
        detailStudent.getContentPane().add(detailStudentEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 300, 30));
        detailStudent.getContentPane().add(detailStudentPhoneNumberField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 415, 300, 30));

        detailStudentDeleteButton.setText("Hapus");
        detailStudentDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailStudentDeleteButtonActionPerformed(evt);
            }
        });
        detailStudent.getContentPane().add(detailStudentDeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 535, 120, 30));
        detailStudent.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 565, -1, -1));

        detailStudentEditButton.setText("Edit");
        detailStudent.getContentPane().add(detailStudentEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 535, 120, 30));

        detailStudentClassroomField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));
        detailStudent.getContentPane().add(detailStudentClassroomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 485, 150, 30));

        detailStudent.getContentPane().add(detailStudentSectionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 485, 145, 30));

        jLabel67.setText("Jurusan");
        detailStudent.getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 30));

        detailStudent.getContentPane().add(detailStudentDepartmentField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 300, 30));

        jLabel68.setText("\n");
        detailStudent.getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, -1, -1));

        jDesktopPane1.add(detailStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 100, -1, -1));

        addDepartment.setClosable(true);
        addDepartment.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addDepartment.setVisible(false);
        addDepartment.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel35.setText("Tambah Jurusan");
        addDepartment.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel36.setText("Nama Jurusan");
        addDepartment.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel37.setText("Kode Jurusan");
        addDepartment.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, 30));
        addDepartment.getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 300, 30));
        addDepartment.getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 105, 300, 30));

        jButton11.setText("Tambah");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        addDepartment.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 160, 120, 30));
        addDepartment.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        jDesktopPane1.add(addDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        detailDepartment.setClosable(true);
        detailDepartment.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        detailDepartment.setVisible(false);
        detailDepartment.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel39.setText("Detail Jurusan");
        detailDepartment.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel40.setText("Nama Jurusan");
        detailDepartment.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel41.setText("Kode Jurusan");
        detailDepartment.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, 30));
        detailDepartment.getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 300, 30));
        detailDepartment.getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 105, 300, 30));

        jButton12.setText("Hapus");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        detailDepartment.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 120, 30));
        detailDepartment.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        jButton13.setText("Edit");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        detailDepartment.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 160, 120, 30));

        jDesktopPane1.add(detailDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        addClassroom.setClosable(true);
        addClassroom.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addClassroom.setVisible(false);
        addClassroom.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel43.setText("Tambah Tingkat Kelas");
        addClassroom.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel44.setText("Jurusan");
        addClassroom.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel45.setText("Tingkat Kelas");
        addClassroom.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, 30));

        jButton14.setText("Tambah");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        addClassroom.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 160, 120, 30));
        addClassroom.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        addClassroom.getContentPane().add(jComboBox21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 300, 30));

        jComboBox22.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));
        addClassroom.getContentPane().add(jComboBox22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 105, 300, 30));

        jDesktopPane1.add(addClassroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        detailClassroom.setClosable(true);
        detailClassroom.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        detailClassroom.setVisible(false);
        detailClassroom.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel47.setText("Detail Tingkat Kelas");
        detailClassroom.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel48.setText("Jurusan");
        detailClassroom.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, 30));

        jLabel49.setText("Tingkat Kelas");
        detailClassroom.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jButton15.setText("Hapus");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        detailClassroom.getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 120, 30));
        detailClassroom.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        jButton16.setText("Edit");
        jButton16.setEnabled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        detailClassroom.getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 120, 30));

        jComboBox23.setEnabled(false);
        detailClassroom.getContentPane().add(jComboBox23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 105, 300, 30));

        jComboBox24.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));
        jComboBox24.setEnabled(false);
        detailClassroom.getContentPane().add(jComboBox24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 300, 30));

        jLabel51.setText("Kode Tingkat Kelas");
        detailClassroom.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jTextField14.setEnabled(false);
        detailClassroom.getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 300, 30));

        jLabel52.setText("Total Kelas");
        detailClassroom.getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, 30));

        jTextField15.setEnabled(false);
        detailClassroom.getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 175, 300, 30));
        detailClassroom.getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jDesktopPane1.add(detailClassroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        addSection.setClosable(true);
        addSection.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addSection.setVisible(true);
        addSection.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel54.setText("Tambah Kelas");
        addSection.getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel55.setText("Jurusan");
        addSection.getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jLabel56.setText("Tingkat Kelas");
        addSection.getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, 30));

        jButton17.setText("Tambah");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        addSection.getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 160, 120, 30));
        addSection.getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        addSection.getContentPane().add(jComboBox25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 300, 30));

        jComboBox26.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));
        addSection.getContentPane().add(jComboBox26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 105, 300, 30));

        jDesktopPane1.add(addSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, -1));

        detailSection.setClosable(true);
        detailSection.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        detailSection.setVisible(true);
        detailSection.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel58.setText("Detail Kelas");
        detailSection.getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel59.setText("Jurusan");
        detailSection.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, 30));

        jLabel60.setText("Tingkat Kelas");
        detailSection.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jButton18.setText("Hapus");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        detailSection.getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 120, 30));
        detailSection.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));

        jButton19.setText("Edit");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        detailSection.getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 120, 30));

        jComboBox27.setEnabled(false);
        detailSection.getContentPane().add(jComboBox27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 105, 300, 30));

        jComboBox28.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));
        jComboBox28.setEnabled(false);
        detailSection.getContentPane().add(jComboBox28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 300, 30));

        jLabel62.setText("Kode Kelas");
        detailSection.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jTextField16.setEnabled(false);
        detailSection.getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 300, 30));

        jLabel63.setText("Nama Kelas");
        detailSection.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, 30));
        detailSection.getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 175, 300, 30));
        detailSection.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, -1, -1));

        jLabel65.setText("Total Murid");
        detailSection.getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        jTextField18.setEnabled(false);
        detailSection.getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 300, 30));

        jDesktopPane1.add(detailSection, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, -1, -1));

        transactionPanel.setClosable(true);
        transactionPanel.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        transactionPanel.setVisible(false);
        transactionPanel.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Pembayaran", "Biaya"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(jTable11);

        transactionPanel.getContentPane().add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, 575, 390));

        jLabel69.setText("Nama Siswa : ");
        transactionPanel.getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));
        transactionPanel.getContentPane().add(jComboBox33, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 10, 150, 30));

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Pembayaran", "Biaya"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane14.setViewportView(jTable12);

        transactionPanel.getContentPane().add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 575, 390));

        jLabel70.setText("Total : Rp. ");
        transactionPanel.getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 405, 210, 30));

        jButton20.setText("Bayar");
        transactionPanel.getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 405, 150, 30));

        jDesktopPane1.add(transactionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1200, 500));

        addCategory.setClosable(true);
        addCategory.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addCategory.setVisible(false);
        addCategory.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel71.setText("Tambah Kategori");
        addCategory.getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel72.setText("Nama Kategori Pembayaran");
        addCategory.getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 30));
        addCategory.getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 240, 30));

        jButton21.setText("Tambah");
        addCategory.getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 170, 120, 30));
        addCategory.getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jDesktopPane1.add(addCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, -1, -1));

        addPaymentDetail.setClosable(true);
        addPaymentDetail.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        addPaymentDetail.setVisible(false);
        addPaymentDetail.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel74.setText("Tambah Pembayaran");
        addPaymentDetail.getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel75.setText("Kategori");
        addPaymentDetail.getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 30));

        jButton22.setText("Tambah");
        addPaymentDetail.getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 220, 120, 30));
        addPaymentDetail.getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));
        addPaymentDetail.getContentPane().add(jComboBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 250, 30));

        jLabel77.setText("Nama Pembayaran");
        addPaymentDetail.getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));
        addPaymentDetail.getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, 30));

        jLabel82.setText("Biaya");
        addPaymentDetail.getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, 30));
        addPaymentDetail.getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, 250, 30));
        addPaymentDetail.getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 265, -1, -1));

        jLabel84.setText("Untuk Kelas");
        addPaymentDetail.getContentPane().add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, 30));
        addPaymentDetail.getContentPane().add(jComboBox35, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105, 250, 30));

        jDesktopPane1.add(addPaymentDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, -1, -1));

        detailCategory.setClosable(true);
        detailCategory.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        detailCategory.setVisible(false);
        detailCategory.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel78.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel78.setText("Tambah Kategori");
        detailCategory.getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel79.setText("Nama Kategori Pembayaran");
        detailCategory.getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 200, 30));
        detailCategory.getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 75, 240, 30));

        jButton23.setText("Tambah");
        detailCategory.getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 170, 120, 30));
        detailCategory.getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel81.setText("Total Pembayaran");
        detailCategory.getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jTextField22.setEnabled(false);
        detailCategory.getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 240, 30));

        jDesktopPane1.add(detailCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        detailPaymentDetail.setClosable(true);
        detailPaymentDetail.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        detailPaymentDetail.setVisible(true);
        detailPaymentDetail.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Adwaita Sans", 1, 15)); // NOI18N
        jLabel85.setText("Detail Pembayaran");
        detailPaymentDetail.getContentPane().add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel86.setText("Kategori");
        detailPaymentDetail.getContentPane().add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 30));

        jButton24.setText("Edit");
        detailPaymentDetail.getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 220, 120, 30));
        detailPaymentDetail.getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jComboBox36.setEnabled(false);
        detailPaymentDetail.getContentPane().add(jComboBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 250, 30));

        jLabel88.setText("Nama Pembayaran");
        detailPaymentDetail.getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));
        detailPaymentDetail.getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, 30));

        jLabel89.setText("Biaya");
        detailPaymentDetail.getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, 30));
        detailPaymentDetail.getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, 250, 30));
        detailPaymentDetail.getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 265, -1, -1));

        jLabel91.setText("Untuk Kelas");
        detailPaymentDetail.getContentPane().add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, 30));

        jComboBox37.setEnabled(false);
        detailPaymentDetail.getContentPane().add(jComboBox37, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105, 250, 30));

        jButton25.setText("Hapus");
        detailPaymentDetail.getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 120, 30));

        jDesktopPane1.add(detailPaymentDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadDepartments() throws IOException{
        
        List<DepartmentResponse> datas = departmentService.getAll();
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        
        for(DepartmentResponse data : datas){
            model.addRow(new String[]{
                data.getCode(),
                data.getDepartmentName(),
                String.valueOf(data.getTotalClassroom())
            });
        }
        
        String[] departments = datas.stream().map(data -> data.getDepartmentName()).toArray(String[]::new);
        
        jComboBox21.setModel(new DefaultComboBoxModel<>(departments));
        jComboBox23.setModel(new DefaultComboBoxModel<>(departments));
        jComboBox25.setModel(new DefaultComboBoxModel<>(departments));
        jComboBox27.setModel(new DefaultComboBoxModel<>(departments));
        jComboBox29.setModel(new DefaultComboBoxModel<>(departments));
        jComboBox32.setModel(new DefaultComboBoxModel<>(departments));
    }
    
    private void loadClassrooms() throws IOException {
        List<ClassroomResponse> datas = classroomService.getAll();
        
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        
        for(ClassroomResponse data : datas){
            model.addRow(new String[]{
                data.getCode(),
                data.getDepartmentName(),
                data.getGradeLevel(),
                String.valueOf(data.getTotalSection())
            });
        }
    
    }
    
    private void loadSections() throws IOException{
        List<SectionResponse> datas = sectionService.getAll();
        
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0);
        
        for(SectionResponse data : datas){
            model.addRow(new String[]{
                data.getCode(),
                data.getDepartmentName(),
                data.getGradeLevel(),
                String.valueOf(data.getName()),
                String.valueOf(data.getTotalStudents())
            });
        }
    }
    
    private JInternalFrame[] getAllInternalFrames(){
        return  new JInternalFrame[]{
            addStudent,
            detailStudent, 
            addDepartment,
            detailDepartment,
            addClassroom,
            detailClassroom,
            addSection,
            detailSection,
            transactionPanel,
            addCategory,
            addPaymentDetail,
            detailCategory,
            detailPaymentDetail
        };
    }
    
    private void studentPanelAddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentPanelAddStudentButtonActionPerformed
        
        detailStudent.setVisible(false);
        addStudent.setVisible(true);
        
    }//GEN-LAST:event_studentPanelAddStudentButtonActionPerformed

    private void detailStudentDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailStudentDeleteButtonActionPerformed
        
    }//GEN-LAST:event_detailStudentDeleteButtonActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        
        addStudent.setVisible(false);
        detailStudent.setVisible(true);
        
    }//GEN-LAST:event_studentTableMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        
        for(JInternalFrame frame : getAllInternalFrames()){
            frame.setVisible(false);
        }
        
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        addDepartment.setVisible(true);
        addClassroom.setVisible(false);
        addSection.setVisible(false);
        
        detailDepartment.setVisible(false);
        detailClassroom.setVisible(false);
        detailSection.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        String code = jTable2.getValueAt(selectedRow, 0).toString();
        
        try {
            String message = departmentService.delete(code);
            
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadDepartments();
            detailDepartment.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        DepartmentRequest request = new DepartmentRequest();
        
        request.setDepartmentName(jTextField12.getText());
        request.setCode(jTextField13.getText());
        String code = jTable2.getValueAt(selectedRow, 0).toString();
        
        try {
            WebResponse<DepartmentResponse> response = departmentService.update(code, request);
            
            JOptionPane.showMessageDialog(this, response.getMessage(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadDepartments();
            loadClassrooms();
            loadSections();
            detailDepartment.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        addDepartment.setVisible(false);
        addClassroom.setVisible(false);
        addSection.setVisible(false);
        
        detailDepartment.setVisible(true);
        detailClassroom.setVisible(false);
        detailSection.setVisible(false);
        
        selectedRow = jTable2.getSelectedRow();
        jTextField13.setText(jTable2.getValueAt(selectedRow, 0).toString());
        jTextField12.setText(jTable2.getValueAt(selectedRow, 1).toString());
        
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        String code = jTable3.getValueAt(selectedRow, 0).toString();
        
        try {
            String message = classroomService.delete(code);
        
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadDepartments();
            loadClassrooms();
            detailClassroom.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        addDepartment.setVisible(false);
        addClassroom.setVisible(true);
        addSection.setVisible(false);
        
        detailDepartment.setVisible(false);
        detailClassroom.setVisible(false);
        detailSection.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked

        selectedRow = jTable3.getSelectedRow();
        
        addDepartment.setVisible(false);
        addClassroom.setVisible(false);
        addSection.setVisible(false);
        
        detailDepartment.setVisible(false);
        detailClassroom.setVisible(true);
        detailSection.setVisible(false);
        
        jTextField14.setText(jTable3.getValueAt(selectedRow, 0).toString());
        jComboBox23.setSelectedItem(jTable3.getValueAt(selectedRow, 1).toString());
        jComboBox24.setSelectedItem(jTable3.getValueAt(selectedRow, 2).toString());
        jTextField15.setText(jTable3.getValueAt(selectedRow, 3).toString());
       
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        String code = jTable4.getValueAt(selectedRow, 0).toString();
        
        try {
            String message = sectionService.delete(code);
        
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadClassrooms();
            loadSections();
            detailSection.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
        String code = jTable4.getValueAt(selectedRow, 0).toString();
        
        SectionUpdateRequest request = new SectionUpdateRequest();
        request.setName(jTextField17.getText());
        
        try {
            String message = sectionService.update(code, request);
        
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadClassrooms();
            loadSections();
            detailSection.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        addDepartment.setVisible(false);
        addClassroom.setVisible(false);
        addSection.setVisible(true);
        
        detailDepartment.setVisible(false);
        detailClassroom.setVisible(false);
        detailSection.setVisible(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked

        selectedRow = jTable4.getSelectedRow();
        
        addDepartment.setVisible(false);
        addClassroom.setVisible(false);
        addSection.setVisible(false);
        
        detailDepartment.setVisible(false);
        detailClassroom.setVisible(false);
        detailSection.setVisible(true);
        
        jTextField16.setText(jTable4.getValueAt(selectedRow, 0).toString());
        jComboBox27.setSelectedItem(jTable4.getValueAt(selectedRow, 1).toString());
        jComboBox28.setSelectedItem(jTable4.getValueAt(selectedRow, 2).toString());
        jTextField17.setText(jTable4.getValueAt(selectedRow, 3).toString());
        jTextField18.setText(jTable4.getValueAt(selectedRow, 4).toString());
        
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        
        transactionPanel.setVisible(true);
        
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        addPaymentDetail.setVisible(false);
        addCategory.setVisible(true);
        
        detailCategory.setVisible(false);
        detailPaymentDetail.setVisible(false);
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        addCategory.setVisible(false);
        addPaymentDetail.setVisible(true);
        
        detailCategory.setVisible(false);
        detailPaymentDetail.setVisible(false);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        
        addPaymentDetail.setVisible(false);
        addCategory.setVisible(false);
        
        detailCategory.setVisible(true);
        detailPaymentDetail.setVisible(false);
        
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        
        addPaymentDetail.setVisible(false);
        addCategory.setVisible(false);
        
        detailCategory.setVisible(false);
        detailPaymentDetail.setVisible(true);
        
    }//GEN-LAST:event_jTable7MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        DepartmentRequest request = new DepartmentRequest();
        
        request.setDepartmentName(jTextField10.getText());
        request.setCode(jTextField11.getText());
        
        try {
            WebResponse<DepartmentResponse> response = departmentService.add(request);
            
            JOptionPane.showMessageDialog(this, response.getMessage(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadDepartments();
            addDepartment.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        
        ClassroomRequest request = new ClassroomRequest();
        
        request.setDepartmentName(jComboBox21.getSelectedItem().toString());
        request.setGradeLevel(jComboBox22.getSelectedItem().toString());
        
        try {
            String message = classroomService.add(request);
        
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadDepartments();
            loadClassrooms();
            addClassroom.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        SectionRequest request = new SectionRequest();
        
        request.setDepartmentName(jComboBox25.getSelectedItem().toString());
        request.setGradeLevel(jComboBox26.getSelectedItem().toString());
        
        try {
            String message = sectionService.add(request);
        
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadClassrooms();
            loadSections();
            addSection.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void generateComponents() throws IOException{
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(AppManager.getImageIcon().getImage());
        
        jTabbedPane1.putClientProperty("JTabbedPane.tabHeight", 40);
        jTabbedPane2.putClientProperty("JTabbedPane.tabHeight", 40);
        jTabbedPane2.putClientProperty("JTabbedPane.tabAreaAlignment", "fill");
        jDesktopPane1.setBackground(jTabbedPane1.getBackground());
        
        loadDepartments();
        loadClassrooms();
        loadSections();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame addCategory;
    private javax.swing.JInternalFrame addClassroom;
    private javax.swing.JInternalFrame addDepartment;
    private javax.swing.JInternalFrame addPaymentDetail;
    private javax.swing.JInternalFrame addSection;
    private javax.swing.JInternalFrame addStudent;
    private javax.swing.JInternalFrame detailCategory;
    private javax.swing.JInternalFrame detailClassroom;
    private javax.swing.JInternalFrame detailDepartment;
    private javax.swing.JInternalFrame detailPaymentDetail;
    private javax.swing.JInternalFrame detailSection;
    private javax.swing.JInternalFrame detailStudent;
    private javax.swing.JComboBox<String> detailStudentBirthDateField;
    private javax.swing.JComboBox<String> detailStudentBirthYearField;
    private javax.swing.JComboBox<String> detailStudentClassroomField;
    private javax.swing.JButton detailStudentDeleteButton;
    private javax.swing.JComboBox<String> detailStudentDepartmentField;
    private javax.swing.JTextArea detailStudentDetailAddressField;
    private com.unindra.component.RegionComboBox detailStudentDistrictAddressField;
    private javax.swing.JButton detailStudentEditButton;
    private javax.swing.JTextField detailStudentEmailField;
    private javax.swing.JComboBox<String> detailStudentGenderField;
    private javax.swing.JTextField detailStudentNameField;
    private javax.swing.JTextField detailStudentPhoneNumberField;
    private com.unindra.component.RegionComboBox detailStudentProvinceAddressField;
    private com.unindra.component.RegionComboBox detailStudentProvinceField;
    private com.unindra.component.RegionComboBox detailStudentRegencyAddressField;
    private com.unindra.component.RegionComboBox detailStudentRegencyField;
    private javax.swing.JComboBox<String> detailStudentSectionField;
    private javax.swing.JTextField detailStudentUsernameField;
    private javax.swing.JComboBox<String> detailStudentbirthMonthField;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JComboBox<String> jComboBox37;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private com.unindra.component.RegionComboBox regionComboBox1;
    private com.unindra.component.RegionComboBox regionComboBox10;
    private com.unindra.component.RegionComboBox regionComboBox2;
    private com.unindra.component.RegionComboBox regionComboBox3;
    private com.unindra.component.RegionComboBox regionComboBox4;
    private com.unindra.component.RegionComboBox regionComboBox5;
    private com.unindra.component.RegionComboBox regionComboBox6;
    private com.unindra.component.RegionComboBox regionComboBox7;
    private com.unindra.component.RegionComboBox regionComboBox8;
    private com.unindra.component.RegionComboBox regionComboBox9;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JButton studentPanelAddStudentButton;
    private javax.swing.JComboBox<String> studentPanelClassroomList;
    private javax.swing.JComboBox<String> studentPanelDepartmentList;
    private javax.swing.JButton studentPanelPrintButton;
    private javax.swing.JTextField studentPanelSearchField;
    private javax.swing.JComboBox<String> studentPanelSectionList;
    private javax.swing.JTable studentTable;
    private javax.swing.JInternalFrame transactionPanel;
    // End of variables declaration//GEN-END:variables

    private Integer selectedRow = 0;
}
