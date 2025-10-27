package com.unindra.view;

import com.unindra.model.request.ClassroomRequest;
import com.unindra.model.request.DepartmentRequest;
import com.unindra.model.request.DepositRequest;
import com.unindra.model.request.PaymentCategoryRequest;
import com.unindra.model.request.PaymentDetailRequest;
import com.unindra.model.request.PaymentDetailUpdate;
import com.unindra.model.request.PaymentRequest;
import com.unindra.model.request.SectionRequest;
import com.unindra.model.request.SectionUpdateRequest;
import com.unindra.model.request.StudentRequest;
import com.unindra.model.request.StudentUpdate;
import com.unindra.model.response.ClassroomResponse;
import com.unindra.model.response.DepartmentResponse;
import com.unindra.model.response.DepositHistoryResponse;
import com.unindra.model.response.PaymentCategoryResponse;
import com.unindra.model.response.PaymentDetailBillResponse;
import com.unindra.model.response.PaymentDetailResponse;
import com.unindra.model.response.PaymentHistoryResponse;
import com.unindra.model.response.SectionResponse;
import com.unindra.model.response.StudentDepositResponse;
import com.unindra.model.response.StudentDepositsHistory;
import com.unindra.model.response.StudentResponse;
import com.unindra.model.response.StudentTable;
import com.unindra.model.response.StudentUnpaidResponse;
import com.unindra.model.response.WebResponse;
import com.unindra.model.util.Gender;
import com.unindra.service.ClassroomService;
import com.unindra.service.DepartmentService;
import com.unindra.service.DepositService;
import com.unindra.service.PaymentCategoryService;
import com.unindra.service.PaymentDetailService;
import com.unindra.service.PaymentService;
import com.unindra.service.RegionService;
import com.unindra.service.SectionService;
import com.unindra.service.StudentService;
import com.unindra.util.AppManager;
import com.unindra.util.ComboBoxUtil;
import com.unindra.util.Formatter;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
    PaymentCategoryService paymentCategoryService = new PaymentCategoryService();
    PaymentDetailService paymentDetailService = new PaymentDetailService();
    StudentService studentService = new StudentService();
    RegionService regionService = new RegionService();
    DepositService depositService = new DepositService();
    PaymentService paymentService = new PaymentService();

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
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel70 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jTextField30 = new javax.swing.JTextField();
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
        jButton26 = new javax.swing.JButton();
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
        depositPanel = new javax.swing.JInternalFrame();
        jLabel92 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jLabel93 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jComboBox39 = new javax.swing.JComboBox<>();
        jComboBox40 = new javax.swing.JComboBox<>();
        jComboBox41 = new javax.swing.JComboBox<>();
        jTextField27 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jComboBox42 = new javax.swing.JComboBox<>();
        jComboBox43 = new javax.swing.JComboBox<>();
        jComboBox44 = new javax.swing.JComboBox<>();
        jTextField29 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();

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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nomor Induk Sekolah", "Nama Siswa", "Total Tabungan"
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
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
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

        jTable6.setAutoCreateRowSorter(true);
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Kategori Pembayaran", "Banyaknya Pembayaran"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
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
        jTable6.getTableHeader().setReorderingAllowed(false);
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);
        if (jTable6.getColumnModel().getColumnCount() > 0) {
            jTable6.getColumnModel().getColumn(0).setResizable(false);
            jTable6.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTable6.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel8.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, 595, 500));

        jTable7.setAutoCreateRowSorter(true);
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
        jTable7.getTableHeader().setReorderingAllowed(false);
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable7.getColumnModel().getColumn(2).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setPreferredWidth(220);
            jTable7.getColumnModel().getColumn(3).setResizable(false);
            jTable7.getColumnModel().getColumn(3).setPreferredWidth(125);
        }

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

        jTable9.setAutoCreateRowSorter(true);
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
        addStudent.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 300, 30));

        regionComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionComboBox1ActionPerformed(evt);
            }
        });
        addStudent.getContentPane().add(regionComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, 30));
        addStudent.getContentPane().add(regionComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 140, 145, 30));

        addStudentBirthdateField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "28", "29", "30", "31" }));
        addStudent.getContentPane().add(addStudentBirthdateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 175, -1, 30));

        addStudentBirthMonthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "September", "Oktober" }));
        addStudent.getContentPane().add(addStudentBirthMonthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 175, 135, 30));

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025" }));
        addStudent.getContentPane().add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 175, 85, 30));

        regionComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionComboBox3ActionPerformed(evt);
            }
        });
        addStudent.getContentPane().add(regionComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, 30));

        regionComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionComboBox4ActionPerformed(evt);
            }
        });
        addStudent.getContentPane().add(regionComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 210, 145, 30));
        addStudent.getContentPane().add(regionComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 245, 300, 30));

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

        jButton8.setText("Tambah");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        addStudent.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 520, 120, 30));
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
        detailStudent.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 300, 30));

        regionComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionComboBox6ActionPerformed(evt);
            }
        });
        detailStudent.getContentPane().add(regionComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 150, 30));
        detailStudent.getContentPane().add(regionComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 140, 145, 30));

        detailStudentBirthDateField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "28", "29", "30", "31" }));
        detailStudent.getContentPane().add(detailStudentBirthDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 175, -1, 30));

        detailStudentbirthMonthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "September", "Oktober" }));
        detailStudent.getContentPane().add(detailStudentbirthMonthField, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 175, 135, 30));

        jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025" }));
        detailStudent.getContentPane().add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 175, 85, 30));

        regionComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionComboBox8ActionPerformed(evt);
            }
        });
        detailStudent.getContentPane().add(regionComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, 30));

        regionComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionComboBox9ActionPerformed(evt);
            }
        });
        detailStudent.getContentPane().add(regionComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 210, 145, 30));
        detailStudent.getContentPane().add(regionComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 245, 300, 30));

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

        jButton10.setText("Edit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        detailStudent.getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 535, 120, 30));

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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kategori", "Pembayaran", "Biaya"
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
        jTable11.getTableHeader().setReorderingAllowed(false);
        jTable11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable11MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTable11);

        transactionPanel.getContentPane().add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, 575, 390));

        jLabel69.setText("Nama Siswa : ");
        transactionPanel.getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jTable12.setAutoCreateRowSorter(true);
        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategori", "Pembayaran", "Biaya"
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
        jTable12.getTableHeader().setReorderingAllowed(false);
        jTable12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable12MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jTable12);
        if (jTable12.getColumnModel().getColumnCount() > 0) {
            jTable12.getColumnModel().getColumn(0).setResizable(false);
            jTable12.getColumnModel().getColumn(1).setResizable(false);
            jTable12.getColumnModel().getColumn(2).setResizable(false);
        }

        transactionPanel.getContentPane().add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 575, 390));

        jLabel70.setText("Total : Rp. ");
        transactionPanel.getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 405, 210, 30));

        jButton20.setText("Bayar");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        transactionPanel.getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 405, 150, 30));

        jTextField30.setEnabled(false);
        transactionPanel.getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 10, 180, 30));

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
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
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
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        addPaymentDetail.getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 220, 120, 30));
        addPaymentDetail.getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));
        addPaymentDetail.getContentPane().add(jComboBox34, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 250, 30));

        jLabel77.setText("Nama Pembayaran");
        addPaymentDetail.getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));
        addPaymentDetail.getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, 30));

        jLabel82.setText("Biaya");
        addPaymentDetail.getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, 30));

        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField23KeyReleased(evt);
            }
        });
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
        jLabel78.setText("Detail Kategori");
        detailCategory.getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel79.setText("Nama Kategori Pembayaran");
        detailCategory.getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 75, 200, 30));
        detailCategory.getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 75, 240, 30));

        jButton23.setText("Edit");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        detailCategory.getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 170, 120, 30));
        detailCategory.getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel81.setText("Banyak Pembayaran");
        detailCategory.getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jTextField22.setEnabled(false);
        detailCategory.getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 240, 30));

        jButton26.setText("Hapus");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        detailCategory.getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 120, 30));

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
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        detailPaymentDetail.getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 220, 120, 30));
        detailPaymentDetail.getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jComboBox36.setEnabled(false);
        detailPaymentDetail.getContentPane().add(jComboBox36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 250, 30));

        jLabel88.setText("Nama Pembayaran");
        detailPaymentDetail.getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));
        detailPaymentDetail.getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, 30));

        jLabel89.setText("Biaya");
        detailPaymentDetail.getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, 30));

        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField25KeyReleased(evt);
            }
        });
        detailPaymentDetail.getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 175, 250, 30));
        detailPaymentDetail.getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 265, -1, -1));

        jLabel91.setText("Untuk Kelas");
        detailPaymentDetail.getContentPane().add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 105, -1, 30));

        jComboBox37.setEnabled(false);
        detailPaymentDetail.getContentPane().add(jComboBox37, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 105, 250, 30));

        jButton25.setText("Hapus");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        detailPaymentDetail.getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 120, 30));

        jDesktopPane1.add(detailPaymentDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        depositPanel.setClosable(true);
        depositPanel.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        depositPanel.setVisible(false);
        depositPanel.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setText("Nama Siswa : ");
        depositPanel.getContentPane().add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jTable14.setAutoCreateRowSorter(true);
        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No. Transaksi", "Tanggal", "Masuk", "Keluar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane16.setViewportView(jTable14);
        if (jTable14.getColumnModel().getColumnCount() > 0) {
            jTable14.getColumnModel().getColumn(0).setResizable(false);
            jTable14.getColumnModel().getColumn(1).setResizable(false);
            jTable14.getColumnModel().getColumn(2).setResizable(false);
            jTable14.getColumnModel().getColumn(3).setResizable(false);
        }

        depositPanel.getContentPane().add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 10, 620, 390));

        jLabel93.setText("Total : Rp. ");
        depositPanel.getContentPane().add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 405, 250, 30));

        jLabel94.setText("Tanggal");

        jLabel95.setText("No. Transaksi");

        jLabel96.setText("Jumlah");

        jTextField26.setEnabled(false);

        jComboBox39.setEnabled(false);

        jComboBox40.setEnabled(false);
        jComboBox40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox40ActionPerformed(evt);
            }
        });

        jComboBox41.setEnabled(false);
        jComboBox41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox41ActionPerformed(evt);
            }
        });

        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField27KeyReleased(evt);
            }
        });

        jButton27.setText("Tambah");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addComponent(jLabel94)
                            .addComponent(jLabel96))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField26)
                            .addComponent(jTextField27))))
                .addGap(14, 14, 14))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton27)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Deposit", jPanel9);

        jLabel97.setText("Tanggal");

        jLabel98.setText("No. Transaksi");

        jLabel99.setText("Jumlah");

        jTextField28.setEnabled(false);

        jComboBox42.setEnabled(false);

        jComboBox43.setEnabled(false);
        jComboBox43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox43ActionPerformed(evt);
            }
        });

        jComboBox44.setEnabled(false);
        jComboBox44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox44ActionPerformed(evt);
            }
        });

        jTextField29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField29KeyReleased(evt);
            }
        });

        jButton28.setText("Tarik");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98)
                            .addComponent(jLabel97)
                            .addComponent(jLabel99))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField28)
                            .addComponent(jTextField29))))
                .addGap(14, 14, 14))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton28)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Penarikan", jPanel11);

        depositPanel.getContentPane().add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 520, 380));

        jDesktopPane1.add(depositPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 1200, 500));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setupComboBoxUtil(){
        
        jComboBox13.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getDateList()));
        jComboBox14.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getMonthList()));
        jComboBox15.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getYearListStudent()));
        
        jComboBox17.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getDateList()));
        jComboBox18.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getMonthList()));
        jComboBox19.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getYearListStudent()));
        
        LocalDate localDate = LocalDate.now();
        
        jComboBox39.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getDateList()));
        jComboBox40.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getMonthList()));
        jComboBox41.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getYearOfTwoSemester()));
        jComboBox39.setSelectedIndex(localDate.getDayOfMonth() - 1);
        jComboBox40.setSelectedIndex(localDate.getMonthValue() - 1);
        
        jComboBox42.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getDateList()));
        jComboBox43.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getMonthList()));
        jComboBox44.setModel(new DefaultComboBoxModel<>(ComboBoxUtil.getYearOfTwoSemester()));
        jComboBox42.setSelectedIndex(localDate.getDayOfMonth() - 1);
        jComboBox43.setSelectedIndex(localDate.getMonthValue() - 1);
    }
    
    private void setUpRegionComboBox() throws IOException {
        List<RegionResponse> provinces = regionService.getProvinces();
        
        regionComboBox1.setItems(provinces);
        regionComboBox3.setItems(provinces);
        regionComboBox6.setItems(provinces);
        regionComboBox8.setItems(provinces);
        
        List<RegionResponse> regencies = regionService.getRegencies(regionComboBox1.getSelectedRegion().getId());
        
        regionComboBox2.setItems(regencies);
        regionComboBox4.setItems(regencies);
        regionComboBox7.setItems(regencies);
        
        List<RegionResponse> districts = regionService.getDistricts(regionComboBox4.getSelectedRegion().getId());
        
        regionComboBox5.setItems(districts);
        
    }
    
    private void loadStudents() throws IOException {
        List<StudentTable> datas = studentService.get();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for(StudentTable data : datas){
            model.addRow(new String[]{
                data.getStudentId(),
                data.getName(),
                data.getGender(),
                data.getRegencyName(),
                data.getBirthDate(),
                data.getDepartment(),
                data.getClassroom(),
                data.getSection()
            });
        }
        
    }
    
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
        
        jComboBox35.removeAllItems();
        jComboBox37.removeAllItems();
        jComboBox35.addItem("Regular");
        jComboBox37.addItem("Regular");
        
        for(ClassroomResponse data : datas){
            jComboBox35.addItem(data.getCode());
            jComboBox37.addItem(data.getCode());
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
        
        String[] sections = datas.stream()
                                    .map(s -> String.valueOf(s.getName()))
                                    .distinct()
                                    .sorted()
                                    .toArray(String[]::new);

        jComboBox31.setModel(new DefaultComboBoxModel<>(sections));
    }
    
    private void loadPaymentCategories() throws IOException{
        List<PaymentCategoryResponse> datas = paymentCategoryService.get();
        
        DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
        model.setRowCount(0);
        
        for(PaymentCategoryResponse data : datas){
            model.addRow(new Object[]{
                data.getName(),
                data.getTotalPayment()
            });
        }
        
        String[] paymentCategories = datas.stream().map(category -> category.getName()).toArray(String[]::new);
        
        jComboBox34.setModel(new DefaultComboBoxModel<>(paymentCategories));
        jComboBox36.setModel(new DefaultComboBoxModel<>(paymentCategories));
    }
    
    private void loadPaymentDetails() throws IOException {
        List<PaymentDetailResponse> datas = paymentDetailService.get();
        
        DefaultTableModel model = (DefaultTableModel) jTable7.getModel();
        model.setRowCount(0);
        
        for(PaymentDetailResponse data : datas){
            model.addRow(new Object[]{
                data.getCategoryName(),
                data.getClassroomCode(),
                data.getPaymentName(),
                Formatter.formatToIndonesian(data.getUnitPrice())
            });
        }

    }
    
    private void loadStudentsDeposit() throws IOException {
     
        List<StudentDepositResponse> datas = depositService.getAllStudentDeposit();
        
        DefaultTableModel model = (DefaultTableModel) jTable10.getModel();
        model.setRowCount(0);
        
        for(StudentDepositResponse data : datas){
            model.addRow(new String[]{
                data.getStudentId(),
                data.getStudentName(),
                Formatter.formatToIndonesian(data.getTotalDeposit().stripTrailingZeros().toPlainString())
            });
        }
        
    }
    
    private void loadDepositsHistory() throws IOException {
     
        List<DepositHistoryResponse> datas = depositService.getDepositsHistory();
        
        DefaultTableModel model = (DefaultTableModel) jTable9.getModel();
        model.setRowCount(0);
        
        for(DepositHistoryResponse data : datas){
            model.addRow(new String[]{
                data.getReferenceNumber(),
                data.getStudentName(),
                data.getDate(),
                Formatter.formatToRupiah(data.getDepositAmount()),
                Formatter.formatToRupiah(data.getWithdrawalAmount()),
            });
        }
        
    }
    
    private void loadStudentsTotalBill() throws IOException {
        
        List<StudentUnpaidResponse> datas = paymentDetailService.getUnpaidBill();
        
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        model.setRowCount(0);
        
        for(StudentUnpaidResponse data : datas){
            model.addRow(new String[]{
                data.getStudentId(),
                data.getStudentName(),
                Formatter.formatToRupiah(data.getTotalUnpaid().toPlainString())
            });
        }
        
    }
    
    private void loadStudentsBill() throws IOException {
        
        List<StudentUnpaidResponse> datas = paymentDetailService.getUnpaidBill();
        
        DefaultTableModel model = (DefaultTableModel) jTable5.getModel();
        model.setRowCount(0);
        
        for(StudentUnpaidResponse data : datas){
            model.addRow(new String[]{
                data.getStudentId(),
                data.getStudentName(),
                Formatter.formatToRupiah(data.getTotalUnpaid().toPlainString())
            });
        }
        
    }
    
    private void loadPaymentHistory() throws IOException {
        List<PaymentHistoryResponse> history = paymentService.getHistory();
        
        DefaultTableModel model = (DefaultTableModel) jTable8.getModel();
        model.setRowCount(0);
        
        for(PaymentHistoryResponse data : history){
            model.addRow(new String[]{
                data.getReferenceNumber(),
                data.getStudentName(),
                data.getDate(),
                Formatter.formatToRupiah(data.getTotalAmount().toPlainString())
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
            detailPaymentDetail,
            depositPanel
        };
    }
    
    private void studentPanelAddStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentPanelAddStudentButtonActionPerformed
        
        detailStudent.setVisible(false);
        addStudent.setVisible(true);
        
    }//GEN-LAST:event_studentPanelAddStudentButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        String id = jTable1.getValueAt(selectedRow, 0).toString();
        
        try {
            String message = studentService.delete(id);
            
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.ERROR_MESSAGE);
            loadStudents();
            detailStudent.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        selectedRow = jTable1.getSelectedRow();
        
        String id = jTable1.getValueAt(selectedRow, 0).toString();
        
        try {
            StudentResponse studentDetail = studentService.getStudentDetail(id);
            
            jTextField6.setText(studentDetail.getName());
            jComboBox20.setSelectedIndex((studentDetail.getGender() == Gender.MALE) ? 0 : 1);
            jTextArea2.setText(studentDetail.getAddress());
            jTextField7.setText(studentDetail.getUsername());
            jTextField8.setText(studentDetail.getEmail());
            jTextField9.setText(studentDetail.getPhoneNumber());
            
            jComboBox17.setSelectedItem(studentDetail.getBirthDate());
            jComboBox18.setSelectedIndex(studentDetail.getBirthMonth() - 1);
            jComboBox19.setSelectedItem(studentDetail.getBirthYear());
                    
            String provinceId = studentDetail.getRegencyId().substring(0, 2);
            regionComboBox6.setSelectedById(provinceId);
            regionComboBox7.setItems(regionService.getRegencies(provinceId));
            regionComboBox7.setSelectedById(studentDetail.getRegencyId());
            
            String districtId = studentDetail.getDistrictId();
            regionComboBox8.setSelectedById(districtId.substring(0,2));
            regionComboBox9.setItems(regionService.getRegencies(regionComboBox8.getSelectedRegion().getId()));
            
            String regencyId = districtId.substring(0, 4);
            regionComboBox9.setSelectedById(regencyId);
            regionComboBox10.setItems(regionService.getDistricts(regencyId));
            regionComboBox10.setSelectedById(districtId);
            
            jComboBox32.setSelectedItem(studentDetail.getDepartment());
            jComboBox30.setSelectedItem(studentDetail.getClassroom());
            jComboBox31.setSelectedItem(studentDetail.getSection());
            
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
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
            loadPaymentDetails();
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
            loadStudents();
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

        selectedRow = jTable5.getSelectedRow();
        String studentId = jTable5.getValueAt(selectedRow, 0).toString();
        String name = jTable5.getValueAt(selectedRow, 1).toString();
        
        jLabel69.setText(String.format("%s | %s" ,studentId, name));
        
        String referenceNumber = null;
        try {
            unpaidPayment = paymentDetailService.getUnpaidPayment(studentId);
            referenceNumber = paymentService.getReferenceNumber();
            
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        jTextField30.setText(referenceNumber);
        
        loadBill();
        
        DefaultTableModel model = (DefaultTableModel) jTable12.getModel();
        model.setRowCount(0);
        jLabel70.setText("Total : Rp. ");
        totalPayment = 0;
        transactionPanel.setVisible(true);
        
    }//GEN-LAST:event_jTable5MouseClicked

    private void loadBill() {
        
        DefaultTableModel model = (DefaultTableModel) jTable11.getModel();
        model.setRowCount(0);
        
        for(PaymentDetailBillResponse data : unpaidPayment){
            model.addRow(new String[]{
                data.getPaymentCategory(),
                data.getName(),
                Formatter.formatToRupiah(data.getUnitPrice().toPlainString())
            });
        }
    }
    
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
        
        selectedRow = jTable6.getSelectedRow();
        
        jTextField21.setText(jTable6.getValueAt(selectedRow, 0).toString());
        jTextField22.setText(jTable6.getValueAt(selectedRow, 1).toString());
        
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        
        addPaymentDetail.setVisible(false);
        addCategory.setVisible(false);
        
        detailCategory.setVisible(false);
        detailPaymentDetail.setVisible(true);
        
        selectedRow = jTable7.getSelectedRow();
        
        jComboBox36.setSelectedItem(jTable7.getValueAt(selectedRow, 0).toString());
        jComboBox37.setSelectedItem(jTable7.getValueAt(selectedRow, 1).toString());
        jTextField24.setText(jTable7.getValueAt(selectedRow, 2).toString());
        jTextField25.setText(jTable7.getValueAt(selectedRow, 3).toString());
        
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

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        
        PaymentCategoryRequest request = new PaymentCategoryRequest();
        
        request.setName(jTextField19.getText());
        
        try {
            String message = paymentCategoryService.add(request);
        
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadPaymentCategories();
            addCategory.setVisible(false);
            jTextField19.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        
        String code = jTable6.getValueAt(selectedRow, 0).toString();
        
        PaymentCategoryRequest request = new PaymentCategoryRequest();
        request.setName(jTextField21.getText());
        
        try {
            String message = paymentCategoryService.update(code, request);
        
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadPaymentCategories();
            detailCategory.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        
        String code = jTable6.getValueAt(selectedRow, 0).toString();
        
        try {
            String message = paymentCategoryService.delete(code);
        
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadPaymentCategories();
            detailCategory.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        
        PaymentDetailRequest request = new PaymentDetailRequest();
        
        request.setCategoryName(jComboBox34.getSelectedItem().toString());
        request.setClassroomCode(jComboBox35.getSelectedItem().toString());
        request.setName(jTextField20.getText());
        request.setUnitPrice(Formatter.formatToRegularString(jTextField23.getText()));
        
        try {
            String message = paymentDetailService.add(request);
            
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadPaymentCategories();
            loadPaymentDetails();
            loadStudentsTotalBill();
            addPaymentDetail.setVisible(false);
            
            jTextField20.setText("");
            jTextField23.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed

        String keyword = jTable7.getValueAt(selectedRow, 0) + "-" + jTable7.getValueAt(selectedRow, 1) + "-" + jTable7.getValueAt(selectedRow, 2);
        
        PaymentDetailUpdate request = new PaymentDetailUpdate();
        
        request.setName(jTextField24.getText());
        request.setUnitPrice(Formatter.formatToRegularString(jTextField25.getText()));
        
        try {
            String message = paymentDetailService.update(keyword, request);
            
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadPaymentDetails();
            loadStudentsTotalBill();
            detailPaymentDetail.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        
        String keyword = jTable7.getValueAt(selectedRow, 0) + "-" + jTable7.getValueAt(selectedRow, 1) + "-" + jTable7.getValueAt(selectedRow, 2);
        
        try {
            String message = paymentDetailService.delete(keyword);
            
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadPaymentCategories();
            loadPaymentDetails();
            loadStudentsTotalBill();
            detailPaymentDetail.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        StudentRequest request = new StudentRequest();
        
        request.setName(jTextField2.getText());
        Gender gender = (jComboBox16.getSelectedIndex() == 0) ? Gender.MALE : Gender.FEMALE;
        request.setGender(gender);
        request.setBirthPlaceRegency(regionComboBox2.getSelectedRegion().getId());
        request.setBirthDate(jComboBox13.getSelectedItem().toString());
        request.setBirthMonth(jComboBox14.getSelectedIndex() + 1);
        request.setBirthYear(jComboBox15.getSelectedItem().toString());
        request.setDistrictAddress(regionComboBox5.getSelectedRegion().getId());
        request.setAddress(jTextArea1.getText());
        request.setUsername(jTextField3.getText());
        request.setEmail(jTextField4.getText());
        request.setPhoneNumber(jTextField5.getText());
        request.setDepartmentName(jComboBox29.getSelectedItem().toString());
        
        try {
            String message = studentService.add(request);

            
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadStudents();
            loadSections();
            loadStudentsDeposit();
            addStudent.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void regionComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionComboBox3ActionPerformed
        
        String id = regionComboBox3.getSelectedRegion().getId();
        try {
            regionComboBox4.setItems(regionService.getRegencies(id));
            regionComboBox5.setItems(regionService.getDistricts(regionComboBox4.getSelectedRegion().getId()));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_regionComboBox3ActionPerformed

    private void regionComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionComboBox1ActionPerformed
        
        String id = regionComboBox1.getSelectedRegion().getId();
        try {
            regionComboBox2.setItems(regionService.getRegencies(id));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_regionComboBox1ActionPerformed

    private void regionComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionComboBox4ActionPerformed
    
        var selectedRegion = regionComboBox4.getSelectedRegion();
    
        if (selectedRegion == null) {
            return;
        }
        
        String id = regionComboBox4.getSelectedRegion().getId();
        try {
            regionComboBox5.setItems(regionService.getDistricts(id));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_regionComboBox4ActionPerformed

    private void regionComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionComboBox8ActionPerformed
        
        String id = regionComboBox8.getSelectedRegion().getId();
        try {
            regionComboBox9.setItems(regionService.getRegencies(id));
            regionComboBox10.setItems(regionService.getDistricts(regionComboBox9.getSelectedRegion().getId()));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_regionComboBox8ActionPerformed

    private void regionComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionComboBox6ActionPerformed
        
        String id = regionComboBox6.getSelectedRegion().getId();
        try {
            regionComboBox7.setItems(regionService.getRegencies(id));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_regionComboBox6ActionPerformed

    private void regionComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionComboBox9ActionPerformed
        
        var selectedRegion = regionComboBox9.getSelectedRegion();
    
        if (selectedRegion == null) {
            return;
        }
        
        String id = regionComboBox9.getSelectedRegion().getId();
        try {
            regionComboBox10.setItems(regionService.getDistricts(id));
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_regionComboBox9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        String id = jTable1.getValueAt(selectedRow, 0).toString();
        StudentUpdate update = new StudentUpdate();
        
        update.setName(jTextField6.getText());
        Gender gender = (jComboBox20.getSelectedIndex() == 0) ? Gender.MALE : Gender.FEMALE;
        update.setGender(gender);
        update.setBirthPlaceRegency(regionComboBox7.getSelectedRegion().getId());
        update.setBirthDate(jComboBox17.getSelectedItem().toString());
        update.setBirthMonth(jComboBox18.getSelectedIndex() + 1);
        update.setBirthYear(jComboBox19.getSelectedItem().toString());
        update.setDistrictAddress(regionComboBox10.getSelectedRegion().getId());
        update.setAddress(jTextArea2.getText());
        update.setUsername(jTextField7.getText());
        update.setEmail(jTextField8.getText());
        update.setPhoneNumber(jTextField9.getText());
        update.setDepartmentName(jComboBox32.getSelectedItem().toString());
        update.setGradeLevel(jComboBox30.getSelectedItem().toString());
        update.setSection(jComboBox31.getSelectedItem().toString());
        
        try {
            String message = studentService.update(id, update);
            loadStudents();
            
            JOptionPane.showMessageDialog(this, message, "Sukses", JOptionPane.INFORMATION_MESSAGE);
            detailStudent.setVisible(false);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jComboBox41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox41ActionPerformed

    private void jComboBox40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox40ActionPerformed

    private void jComboBox43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox43ActionPerformed

    private void jComboBox44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox44ActionPerformed

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        
        selectedRow = jTable10.getSelectedRow();
        String id = jTable10.getValueAt(selectedRow, 0).toString();
        String name = jTable10.getValueAt(selectedRow, 1).toString();
        
        jLabel92.setText(String.format("%s | %s", id, name));
        
        List<StudentDepositsHistory> allStudentDepositsHistory = null;
        String depositRefenceNumber = null;
        String withdrawRefenceNumber = null;
        try {
            allStudentDepositsHistory = depositService.getAllStudentDepositsHistory(id);
            depositRefenceNumber = depositService.getReferenceNumber("deposit");
            withdrawRefenceNumber = depositService.getReferenceNumber("withdraw");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable14.getModel();
        model.setRowCount(0);
        
        for(StudentDepositsHistory data : allStudentDepositsHistory){
            model.addRow(new Object[]{
                data.getReferenceNo(),
                data.getDate(),
                Formatter.formatToIndonesian(data.getDepositAmount().toPlainString()),
                Formatter.formatToIndonesian(data.getWithdrawAmount().toPlainString())
            });
        }
        jTextField26.setText(depositRefenceNumber);
        jTextField28.setText(withdrawRefenceNumber);
        
        jLabel93.setText(String.format("Total : Rp. %s", jTable10.getValueAt(selectedRow, 2).toString()));
        
        depositPanel.setVisible(true);
    }//GEN-LAST:event_jTable10MouseClicked

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        
        String studentId = jTable10.getValueAt(selectedRow, 0).toString();
        
        LocalDateTime now = LocalDateTime.now();
        DepositRequest request = new DepositRequest();
        
        request.setDate(jComboBox39.getSelectedItem().toString());
        request.setMonth(jComboBox40.getSelectedIndex() + 1);
        request.setYear(jComboBox41.getSelectedItem().toString());
        request.setClock(String.valueOf(now.getHour()));
        request.setMinute(String.valueOf(now.getMinute()));
        request.setReferenceNo(jTextField26.getText());
        request.setAmount(Formatter.formatToRegularString(jTextField27.getText()));
        
        try {
            WebResponse<StudentDepositResponse> response = depositService.deposit(studentId, request);
            
            
            JOptionPane.showMessageDialog(this, response.getMessage(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
            depositPanel.setVisible(false);
            loadStudentsDeposit();
            loadDepositsHistory();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        
        String studentId = jTable10.getValueAt(selectedRow, 0).toString();
        
        LocalDateTime now = LocalDateTime.now();
        DepositRequest request = new DepositRequest();
        
        request.setDate(jComboBox42.getSelectedItem().toString());
        request.setMonth(jComboBox43.getSelectedIndex() + 1);
        request.setYear(jComboBox44.getSelectedItem().toString());
        request.setClock(String.valueOf(now.getHour()));
        request.setMinute(String.valueOf(now.getMinute()));
        request.setReferenceNo(jTextField28.getText());
        request.setAmount(Formatter.formatToRegularString(jTextField29.getText()));
        
        try {
            WebResponse<StudentDepositResponse> response = depositService.withdraw(studentId, request);
            
            
            JOptionPane.showMessageDialog(this, response.getMessage(), "Sukses", JOptionPane.INFORMATION_MESSAGE);
            depositPanel.setVisible(false);
            loadStudentsDeposit();
            loadDepositsHistory();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTextField29KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField29KeyReleased
        
        jTextField29.setText(Formatter.formatToRupiah(jTextField29.getText()));
        
    }//GEN-LAST:event_jTextField29KeyReleased

    private void jTextField27KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyReleased
        
        jTextField27.setText(Formatter.formatToRupiah(jTextField27.getText()));
        
    }//GEN-LAST:event_jTextField27KeyReleased

    private void jTextField25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField25KeyReleased
        
        jTextField25.setText(Formatter.formatToRupiah(jTextField25.getText()));
        
    }//GEN-LAST:event_jTextField25KeyReleased

    private void jTextField23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyReleased
        
        jTextField23.setText(Formatter.formatToRupiah(jTextField23.getText()));
        
    }//GEN-LAST:event_jTextField23KeyReleased

    private void jTable11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable11MouseClicked
        
        selectedRow = jTable11.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable11.getModel();
        
        DefaultTableModel model2 = (DefaultTableModel) jTable12.getModel();
        model2.addRow(new Object[]{
            model.getValueAt(selectedRow, 0),
            model.getValueAt(selectedRow, 1),
            model.getValueAt(selectedRow, 2)
        });
        
        totalPayment += Integer.parseInt(model.getValueAt(selectedRow, 2).toString().replace(".", ""));
        String value = Formatter.formatToRupiah(String.valueOf(totalPayment));
        jLabel70.setText(String.format("Total : Rp. %s", value));
        
        model.removeRow(selectedRow);
    }//GEN-LAST:event_jTable11MouseClicked

    private void jTable12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable12MouseClicked
        
        selectedRow = jTable12.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable12.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTable11.getModel();
        
            
        model2.addRow(new Object[]{
            model.getValueAt(selectedRow, 0),
            model.getValueAt(selectedRow, 1),
            model.getValueAt(selectedRow, 2)
        });
            
            
        totalPayment -= Integer.parseInt(model.getValueAt(selectedRow, 2).toString().replace(".", ""));
        String value = Formatter.formatToRupiah(String.valueOf(totalPayment));
        jLabel70.setText(String.format("Total : Rp. %s", value));

        
        model.removeRow(selectedRow);
        
    }//GEN-LAST:event_jTable12MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        
        String studentId = jLabel69.getText().substring(0, 9);
        PaymentRequest request = new PaymentRequest();
        
        request.setReferenceNumber(jTextField30.getText());
        request.setAmount(BigDecimal.valueOf(totalPayment));        
        
        List<PaymentDetailBillResponse> paymentRequest = new ArrayList<>();
        int j = jTable12.getRowCount();
        for (int i = 0; i < j; i++){
            PaymentDetailBillResponse response = new PaymentDetailBillResponse();
            
            response.setPaymentCategory(jTable12.getValueAt(i, 0).toString());
            response.setName(jTable12.getValueAt(i, 1).toString());
            response.setUnitPrice(BigDecimal.valueOf(Double.parseDouble(Formatter.formatToRegularString(jTable12.getValueAt(i, 2).toString()))));
            
            paymentRequest.add(response);
        }
                
        request.setPayments(paymentRequest);
        
        PaymentHistoryResponse response = null;
        try {
            response = paymentService.add(studentId, request);
            
            DefaultTableModel model = (DefaultTableModel) jTable8.getModel();
            model.addRow(new Object[]{
                response.getReferenceNumber(),
                response.getStudentName(),
                response.getDate(),
                Formatter.formatToRupiah(response.getTotalAmount().toPlainString())
            });
            
            JOptionPane.showMessageDialog(this, "Pembayaran Sukses", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            loadStudentsBill();
            transactionPanel.setVisible(false);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Gagal", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton20ActionPerformed

    
    private void generateComponents() throws IOException{
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(AppManager.getImageIcon().getImage());
        
        jTabbedPane1.putClientProperty("JTabbedPane.tabHeight", 40);
        jTabbedPane2.putClientProperty("JTabbedPane.tabHeight", 40);
        jTabbedPane2.putClientProperty("JTabbedPane.tabAreaAlignment", "fill");
        jDesktopPane1.setBackground(jTabbedPane1.getBackground());
        
        setupComboBoxUtil();
        setUpRegionComboBox();
        loadDepartments();
        loadClassrooms();
        loadSections();
        loadPaymentCategories();
        loadPaymentDetails();
        loadStudents();
        loadStudentsTotalBill();
        loadStudentsBill();
        loadPaymentHistory();
        loadStudentsDeposit();
        loadDepositsHistory();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame addCategory;
    private javax.swing.JInternalFrame addClassroom;
    private javax.swing.JInternalFrame addDepartment;
    private javax.swing.JInternalFrame addPaymentDetail;
    private javax.swing.JInternalFrame addSection;
    private javax.swing.JInternalFrame addStudent;
    private javax.swing.JInternalFrame depositPanel;
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
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
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
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox30;
    private javax.swing.JComboBox<String> jComboBox31;
    private javax.swing.JComboBox<String> jComboBox32;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JComboBox<String> jComboBox37;
    private javax.swing.JComboBox<String> jComboBox39;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox40;
    private javax.swing.JComboBox<String> jComboBox41;
    private javax.swing.JComboBox<String> jComboBox42;
    private javax.swing.JComboBox<String> jComboBox43;
    private javax.swing.JComboBox<String> jComboBox44;
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
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane16;
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
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable14;
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
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
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
    
    List<PaymentDetailBillResponse> unpaidPayment = null;

    private Integer totalPayment = 0;
}
