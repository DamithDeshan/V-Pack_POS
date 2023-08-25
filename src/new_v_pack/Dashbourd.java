/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package new_v_pack;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.lang.invoke.MethodHandles;

import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Timer;

/**
 *
 * @author Rajapaksha
 */
public class Dashbourd extends javax.swing.JFrame {

    public Dashbourd() {
        initComponents();
        ShowDate();
        ShowTime();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        TopicPanel = new javax.swing.JTabbedPane();
        Home = new javax.swing.JPanel();
        btn_Home_Title = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnHomePOS = new javax.swing.JButton();
        btnHomeProduct = new javax.swing.JButton();
        btnHomeInvoice = new javax.swing.JButton();
        btnHomeWarranty = new javax.swing.JButton();
        btnHomeUser = new javax.swing.JButton();
        Product = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtQuntity = new javax.swing.JTextField();
        txtPurchasePrice = new javax.swing.JTextField();
        txtSellingPrice = new javax.swing.JTextField();
        cmbWarrentyPeriod = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cmbCondition = new javax.swing.JComboBox<>();
        btnProductAll = new javax.swing.JButton();
        btnProductUpdate = new javax.swing.JButton();
        btnProductClear = new javax.swing.JButton();
        txtProductSearch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        FilterCondition = new javax.swing.JComboBox<>();
        btnAllProduct = new javax.swing.JButton();
        btnProductOutofStock = new javax.swing.JButton();
        btnProductNearOutofStock = new javax.swing.JButton();
        Invoice = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        InvoiceTable = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        txtfindInvoice = new javax.swing.JTextField();
        btnInvoiceAll = new javax.swing.JButton();
        btnInvoiceToday = new javax.swing.JButton();
        btnInvoiceLastWeek = new javax.swing.JButton();
        btnInvoiceLastMonth = new javax.swing.JButton();
        btnInvoiceLast3Months = new javax.swing.JButton();
        btnInvoiceLastYear = new javax.swing.JButton();
        btnInvoiceLast5Year = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        lblCountQuntity = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        lblCountSubTotal = new javax.swing.JLabel();
        Warranty = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WarrantyTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtFindItemCode = new javax.swing.JTextField();
        btnWarrantyAll = new javax.swing.JButton();
        btnWarrantyExpiredItem = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnWarrantyItemCodeUpdate = new javax.swing.JButton();
        btnWarrantyRemoveItem = new javax.swing.JButton();
        btnWarrantyDataClear = new javax.swing.JButton();
        txtWarrantyInvoiceID = new javax.swing.JTextField();
        txtWarrantyProcuctID = new javax.swing.JTextField();
        txtWarrantyCustomerNIC = new javax.swing.JTextField();
        txtWarrantyCustomerName = new javax.swing.JTextField();
        txtWarrantyItemCode = new javax.swing.JTextField();
        txtWarreantyPeriod = new javax.swing.JTextField();
        txtWarrantyExpriationDate = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtWarrantyNewItemCode = new javax.swing.JTextField();
        User = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtTown = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtHouseNO = new javax.swing.JTextField();
        rabMale = new javax.swing.JRadioButton();
        rabFemale = new javax.swing.JRadioButton();
        txtUNIC = new javax.swing.JTextField();
        txtLaName = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        chbUserShowPassword = new javax.swing.JCheckBox();
        psfRePassword = new javax.swing.JPasswordField();
        psfPassword = new javax.swing.JPasswordField();
        txtUserName = new javax.swing.JTextField();
        cmbUserRole = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnUserAdd = new javax.swing.JButton();
        btnUserUpdate = new javax.swing.JButton();
        btnUserDelete = new javax.swing.JButton();
        btnUserClear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Report = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnReportPrint = new javax.swing.JButton();
        cmbReportYearList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbReportMonths = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnPanel = new javax.swing.JPanel();
        btnLogOUT = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnPOS = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnIncoice = new javax.swing.JButton();
        btnWarranty = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1350, 802));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setBackground(new java.awt.Color(153, 153, 153));

        btn_Home_Title.setFont(new java.awt.Font("Palace Script MT", 3, 90)); // NOI18N
        btn_Home_Title.setForeground(new java.awt.Color(102, 255, 255));
        btn_Home_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_Home_Title.setText("V Pack Computer Solutions");

        lblUser.setFont(new java.awt.Font("Microsoft PhagsPa", 3, 26)); // NOI18N
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_1.png"))); // NOI18N
        lblUser.setText("User");

        lblTime.setFont(new java.awt.Font("Microsoft PhagsPa", 3, 26)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Time.png"))); // NOI18N
        lblTime.setText("Time");

        lblDate.setFont(new java.awt.Font("Microsoft PhagsPa", 3, 26)); // NOI18N
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Date.png"))); // NOI18N
        lblDate.setText("Date");

        btnHomePOS.setBackground(new java.awt.Color(153, 153, 153));
        btnHomePOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home_POS.png"))); // NOI18N
        btnHomePOS.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnHomePOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomePOSMouseClicked(evt);
            }
        });

        btnHomeProduct.setBackground(new java.awt.Color(153, 153, 153));
        btnHomeProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home_Product.png"))); // NOI18N
        btnHomeProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnHomeProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeProductMouseClicked(evt);
            }
        });

        btnHomeInvoice.setBackground(new java.awt.Color(153, 153, 153));
        btnHomeInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home_Invoice.png"))); // NOI18N
        btnHomeInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnHomeInvoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeInvoiceMouseClicked(evt);
            }
        });

        btnHomeWarranty.setBackground(new java.awt.Color(153, 153, 153));
        btnHomeWarranty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home_Warrenty.png"))); // NOI18N
        btnHomeWarranty.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnHomeWarranty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeWarrantyMouseClicked(evt);
            }
        });

        btnHomeUser.setBackground(new java.awt.Color(153, 153, 153));
        btnHomeUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home_User.png"))); // NOI18N
        btnHomeUser.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        btnHomeUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHomeWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(btnHomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(btn_Home_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnHomePOS, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHomeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(btnHomeInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btn_Home_Title)
                .addGap(77, 77, 77)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnHomeInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHomePOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHomeProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHomeWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTime)
                    .addComponent(lblDate))
                .addGap(41, 41, 41))
        );

        TopicPanel.addTab("Home", Home);

        Product.setBackground(new java.awt.Color(153, 153, 153));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel9.setText("Stock Management");

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Quntity", "Purchase Price", "Selling Price", "Warranty", "Condition"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(stockTable);
        if (stockTable.getColumnModel().getColumnCount() > 0) {
            stockTable.getColumnModel().getColumn(0).setResizable(false);
            stockTable.getColumnModel().getColumn(1).setResizable(false);
            stockTable.getColumnModel().getColumn(2).setResizable(false);
            stockTable.getColumnModel().getColumn(3).setResizable(false);
            stockTable.getColumnModel().getColumn(4).setResizable(false);
            stockTable.getColumnModel().getColumn(5).setResizable(false);
            stockTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel10.setText("Product Name");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel11.setText("Quantity");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel12.setText("Purchase Price");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel13.setText("Selling Price");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel14.setText("Warranty (Months)");

        txtProductName.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });

        txtQuntity.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtQuntity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuntityKeyReleased(evt);
            }
        });

        txtPurchasePrice.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtPurchasePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPurchasePriceKeyReleased(evt);
            }
        });

        txtSellingPrice.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtSellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSellingPriceKeyReleased(evt);
            }
        });

        cmbWarrentyPeriod.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbWarrentyPeriod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel58.setText("Product ID");

        txtProductID.setEditable(false);
        txtProductID.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel21.setText("Conditon ");

        cmbCondition.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Condition.....", "Brand New", "Second Hand" }));
        cmbCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConditionActionPerformed(evt);
            }
        });

        btnProductAll.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnProductAll.setText("Add Product");
        btnProductAll.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnProductAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductAllMouseClicked(evt);
            }
        });

        btnProductUpdate.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnProductUpdate.setText("Update Product");
        btnProductUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnProductUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductUpdateMouseClicked(evt);
            }
        });

        btnProductClear.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnProductClear.setText("Clear Product");
        btnProductClear.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnProductClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnProductUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(39, 39, 39)
                            .addComponent(txtQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102)
                            .addComponent(jLabel21)
                            .addGap(18, 18, 18)
                            .addComponent(cmbCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSellingPrice)
                            .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbWarrentyPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnProductAll, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProductClear, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel58)
                        .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbWarrentyPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductAll, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductClear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        txtProductSearch.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtProductSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProductSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProductSearchKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel7.setText("Search Product");

        FilterCondition.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FilterCondition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Brand New", "Second Hand" }));
        FilterCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterConditionActionPerformed(evt);
            }
        });

        btnAllProduct.setBackground(new java.awt.Color(153, 153, 153));
        btnAllProduct.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        btnAllProduct.setText("All Product");
        btnAllProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnAllProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAllProductMouseClicked(evt);
            }
        });

        btnProductOutofStock.setBackground(new java.awt.Color(153, 153, 153));
        btnProductOutofStock.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        btnProductOutofStock.setText("Out of Stock");
        btnProductOutofStock.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnProductOutofStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductOutofStockMouseClicked(evt);
            }
        });

        btnProductNearOutofStock.setBackground(new java.awt.Color(153, 153, 153));
        btnProductNearOutofStock.setFont(new java.awt.Font("Segoe UI", 2, 20)); // NOI18N
        btnProductNearOutofStock.setText("Near out of Stock");
        btnProductNearOutofStock.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnProductNearOutofStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductNearOutofStockMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ProductLayout = new javax.swing.GroupLayout(Product);
        Product.setLayout(ProductLayout);
        ProductLayout.setHorizontalGroup(
            ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FilterCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(ProductLayout.createSequentialGroup()
                .addGroup(ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductLayout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel9))
                    .addGroup(ProductLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1021, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ProductLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnAllProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)
                                .addComponent(btnProductOutofStock, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProductNearOutofStock, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        ProductLayout.setVerticalGroup(
            ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGroup(ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProductLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProductLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(FilterCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(ProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAllProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductOutofStock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductNearOutofStock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        TopicPanel.addTab("Product", Product);

        Invoice.setBackground(new java.awt.Color(153, 153, 153));

        InvoiceTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        InvoiceTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Invoice Id", "User NIC", "Paid Amount", "Balance", "Sub Total", "Quantity", "Selling Date", "Selling Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(InvoiceTable);
        if (InvoiceTable.getColumnModel().getColumnCount() > 0) {
            InvoiceTable.getColumnModel().getColumn(0).setMinWidth(20);
        }

        jLabel22.setFont(new java.awt.Font("Ebrima", 3, 60)); // NOI18N
        jLabel22.setText(" Invoice");

        jLabel71.setFont(new java.awt.Font("Dubai Medium", 3, 24)); // NOI18N
        jLabel71.setText("Find Invoice ");

        txtfindInvoice.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtfindInvoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtfindInvoiceKeyReleased(evt);
            }
        });

        btnInvoiceAll.setBackground(new java.awt.Color(204, 204, 204));
        btnInvoiceAll.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnInvoiceAll.setText("All");
        btnInvoiceAll.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnInvoiceAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvoiceAllMouseClicked(evt);
            }
        });

        btnInvoiceToday.setBackground(new java.awt.Color(204, 204, 204));
        btnInvoiceToday.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnInvoiceToday.setText("Today");
        btnInvoiceToday.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnInvoiceToday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvoiceTodayMouseClicked(evt);
            }
        });

        btnInvoiceLastWeek.setBackground(new java.awt.Color(204, 204, 204));
        btnInvoiceLastWeek.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnInvoiceLastWeek.setText("Last Week");
        btnInvoiceLastWeek.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnInvoiceLastWeek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvoiceLastWeekMouseClicked(evt);
            }
        });

        btnInvoiceLastMonth.setBackground(new java.awt.Color(204, 204, 204));
        btnInvoiceLastMonth.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnInvoiceLastMonth.setText("Last Month");
        btnInvoiceLastMonth.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnInvoiceLastMonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvoiceLastMonthMouseClicked(evt);
            }
        });

        btnInvoiceLast3Months.setBackground(new java.awt.Color(204, 204, 204));
        btnInvoiceLast3Months.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnInvoiceLast3Months.setText("Last 3 Months");
        btnInvoiceLast3Months.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnInvoiceLast3Months.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvoiceLast3MonthsMouseClicked(evt);
            }
        });

        btnInvoiceLastYear.setBackground(new java.awt.Color(204, 204, 204));
        btnInvoiceLastYear.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnInvoiceLastYear.setText("Last Year");
        btnInvoiceLastYear.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnInvoiceLastYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvoiceLastYearMouseClicked(evt);
            }
        });

        btnInvoiceLast5Year.setBackground(new java.awt.Color(204, 204, 204));
        btnInvoiceLast5Year.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnInvoiceLast5Year.setText("Last 5 Years");
        btnInvoiceLast5Year.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnInvoiceLast5Year.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInvoiceLast5YearMouseClicked(evt);
            }
        });

        jPanel33.setBackground(new java.awt.Color(153, 153, 153));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel76.setText("Number of items sold");

        lblCountQuntity.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        lblCountQuntity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountQuntity.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCountQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCountQuntity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel76)
                .addGap(17, 17, 17))
        );

        jPanel34.setBackground(new java.awt.Color(153, 153, 153));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 3, 22)); // NOI18N
        jLabel79.setText("Amount of items sold");

        lblCountSubTotal.setFont(new java.awt.Font("Segoe UI Black", 3, 20)); // NOI18N
        lblCountSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountSubTotal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCountSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCountSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout InvoiceLayout = new javax.swing.GroupLayout(Invoice);
        Invoice.setLayout(InvoiceLayout);
        InvoiceLayout.setHorizontalGroup(
            InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvoiceLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(InvoiceLayout.createSequentialGroup()
                .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InvoiceLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(InvoiceLayout.createSequentialGroup()
                                    .addComponent(jLabel71)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtfindInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(InvoiceLayout.createSequentialGroup()
                                    .addComponent(btnInvoiceAll, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInvoiceToday, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInvoiceLastWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInvoiceLastMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInvoiceLast3Months, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInvoiceLastYear, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnInvoiceLast5Year, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(InvoiceLayout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        InvoiceLayout.setVerticalGroup(
            InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvoiceLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfindInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInvoiceAll, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvoiceToday, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvoiceLastWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvoiceLastMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvoiceLast3Months, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvoiceLastYear, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvoiceLast5Year, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(InvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        TopicPanel.addTab("Invoice", Invoice);

        Warranty.setBackground(new java.awt.Color(153, 153, 153));

        WarrantyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No", "Product ID", "Item Code", "Customer NIC ", "Customer Name ", "Warranty Period ", "Expiration Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        WarrantyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WarrantyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(WarrantyTable);
        if (WarrantyTable.getColumnModel().getColumnCount() > 0) {
            WarrantyTable.getColumnModel().getColumn(0).setResizable(false);
            WarrantyTable.getColumnModel().getColumn(1).setResizable(false);
            WarrantyTable.getColumnModel().getColumn(2).setResizable(false);
            WarrantyTable.getColumnModel().getColumn(3).setResizable(false);
            WarrantyTable.getColumnModel().getColumn(4).setResizable(false);
            WarrantyTable.getColumnModel().getColumn(5).setResizable(false);
            WarrantyTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel23.setText("Warranty Management");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 3, 26)); // NOI18N
        jLabel39.setText("Find Item Code");

        txtFindItemCode.setFont(new java.awt.Font("Segoe UI Black", 3, 20)); // NOI18N
        txtFindItemCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFindItemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindItemCodeKeyReleased(evt);
            }
        });

        btnWarrantyAll.setBackground(new java.awt.Color(153, 153, 153));
        btnWarrantyAll.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnWarrantyAll.setText("All Warranty Item");
        btnWarrantyAll.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnWarrantyAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWarrantyAllMouseClicked(evt);
            }
        });

        btnWarrantyExpiredItem.setBackground(new java.awt.Color(153, 153, 153));
        btnWarrantyExpiredItem.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnWarrantyExpiredItem.setText("Warranty Expired Item");
        btnWarrantyExpiredItem.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnWarrantyExpiredItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWarrantyExpiredItemMouseClicked(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Invoice No");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Product ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Customer NIC");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText("Customer Name");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setText("Item Code");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setText("Warranty Period");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setText("Expiration Date");

        btnWarrantyItemCodeUpdate.setBackground(new java.awt.Color(153, 153, 153));
        btnWarrantyItemCodeUpdate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnWarrantyItemCodeUpdate.setText("Update Code");
        btnWarrantyItemCodeUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnWarrantyItemCodeUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWarrantyItemCodeUpdateMouseClicked(evt);
            }
        });

        btnWarrantyRemoveItem.setBackground(new java.awt.Color(153, 153, 153));
        btnWarrantyRemoveItem.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnWarrantyRemoveItem.setText("Remove Item");
        btnWarrantyRemoveItem.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnWarrantyRemoveItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWarrantyRemoveItemMouseClicked(evt);
            }
        });

        btnWarrantyDataClear.setBackground(new java.awt.Color(153, 153, 153));
        btnWarrantyDataClear.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnWarrantyDataClear.setText("Clear Data");
        btnWarrantyDataClear.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnWarrantyDataClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWarrantyDataClearMouseClicked(evt);
            }
        });

        txtWarrantyInvoiceID.setEditable(false);
        txtWarrantyInvoiceID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        txtWarrantyProcuctID.setEditable(false);
        txtWarrantyProcuctID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        txtWarrantyCustomerNIC.setEditable(false);
        txtWarrantyCustomerNIC.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtWarrantyCustomerNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarrantyCustomerNICActionPerformed(evt);
            }
        });

        txtWarrantyCustomerName.setEditable(false);
        txtWarrantyCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        txtWarrantyItemCode.setEditable(false);
        txtWarrantyItemCode.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtWarrantyItemCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWarrantyItemCodeKeyReleased(evt);
            }
        });

        txtWarreantyPeriod.setEditable(false);
        txtWarreantyPeriod.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtWarreantyPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarreantyPeriodActionPerformed(evt);
            }
        });

        txtWarrantyExpriationDate.setEditable(false);
        txtWarrantyExpriationDate.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setText("New Item Code");

        txtWarrantyNewItemCode.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
       

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWarrantyCustomerName)
                    .addComponent(txtWarrantyProcuctID)
                    .addComponent(txtWarrantyInvoiceID, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(txtWarrantyCustomerNIC))
                .addGap(57, 57, 57)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(41, 41, 41))
                        .addComponent(jLabel19))
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addGap(50, 50, 50)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWarrantyItemCode)
                    .addComponent(txtWarreantyPeriod)
                    .addComponent(txtWarrantyExpriationDate, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(txtWarrantyNewItemCode))
                .addGap(101, 101, 101))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnWarrantyItemCodeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnWarrantyRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnWarrantyDataClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWarrantyInvoiceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtWarrantyItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWarrantyProcuctID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel4)
                    .addComponent(txtWarrantyNewItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWarrantyCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel18)
                    .addComponent(txtWarreantyPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWarrantyCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19)
                    .addComponent(txtWarrantyExpriationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWarrantyItemCodeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWarrantyRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWarrantyDataClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout WarrantyLayout = new javax.swing.GroupLayout(Warranty);
        Warranty.setLayout(WarrantyLayout);
        WarrantyLayout.setHorizontalGroup(
            WarrantyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WarrantyLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(39, 39, 39)
                .addComponent(txtFindItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(WarrantyLayout.createSequentialGroup()
                .addGroup(WarrantyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WarrantyLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel23))
                    .addGroup(WarrantyLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(btnWarrantyAll, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnWarrantyExpiredItem, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WarrantyLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WarrantyLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        WarrantyLayout.setVerticalGroup(
            WarrantyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WarrantyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(WarrantyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFindItemCode)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(WarrantyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWarrantyAll, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWarrantyExpiredItem, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        TopicPanel.addTab("Warrenty", Warranty);

        User.setBackground(new java.awt.Color(153, 153, 153));

        UserTable.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIC", "First Name", "Last Name", "Gender", "House No", "Street", "Town", "User Role", "User Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(UserTable);
        if (UserTable.getColumnModel().getColumnCount() > 0) {
            UserTable.getColumnModel().getColumn(0).setResizable(false);
            UserTable.getColumnModel().getColumn(1).setResizable(false);
            UserTable.getColumnModel().getColumn(2).setResizable(false);
            UserTable.getColumnModel().getColumn(3).setResizable(false);
            UserTable.getColumnModel().getColumn(4).setResizable(false);
            UserTable.getColumnModel().getColumn(5).setResizable(false);
            UserTable.getColumnModel().getColumn(6).setResizable(false);
            UserTable.getColumnModel().getColumn(7).setResizable(false);
            UserTable.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("NIC");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel43.setText("First Name");

        txtFName.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel44.setText("Last Name");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel45.setText("Gender");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel46.setText("Address");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel47.setText("House No");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel48.setText("Street");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel49.setText("Town");

        txtTown.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N

        txtStreet.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N

        txtHouseNO.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N

        rabMale.setBackground(new java.awt.Color(153, 153, 153));
        rabMale.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        rabMale.setText("Male");
        rabMale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rabMaleMouseClicked(evt);
            }
        });

        rabFemale.setBackground(new java.awt.Color(153, 153, 153));
        rabFemale.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        rabFemale.setText("Female");
        rabFemale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rabFemaleMouseClicked(evt);
            }
        });
        rabFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabFemaleActionPerformed(evt);
            }
        });

        txtUNIC.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        txtUNIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUNICActionPerformed(evt);
            }
        });
        txtUNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUNICKeyReleased(evt);
            }
        });

        txtLaName.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel47))
                            .addComponent(jLabel49))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHouseNO)
                            .addComponent(txtStreet)
                            .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(rabMale)
                                .addGap(60, 60, 60)
                                .addComponent(rabFemale))
                            .addComponent(txtFName, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(txtLaName)
                            .addComponent(txtUNIC))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtUNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtLaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rabMale)
                            .addComponent(rabFemale)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtHouseNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtTown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel53.setText("Re Enter Password");

        chbUserShowPassword.setBackground(new java.awt.Color(153, 153, 153));
        chbUserShowPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chbUserShowPassword.setText("Show Password");
        chbUserShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbUserShowPasswordMouseClicked(evt);
            }
        });

        psfRePassword.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N

        psfPassword.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        psfPassword.setToolTipText("");
        psfPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtUserName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        cmbUserRole.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        cmbUserRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Role", "Chasier", "Owner", "Admin" }));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel57.setText("User Name");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel50.setText("User Role");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel51.setText("Password");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(cmbUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel51))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel53)
                                .addGap(38, 38, 38)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(psfPassword)
                            .addComponent(txtUserName)
                            .addComponent(psfRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(chbUserShowPassword)
                        .addGap(118, 118, 118)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(cmbUserRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(psfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psfRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addComponent(chbUserShowPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnUserAdd.setBackground(new java.awt.Color(153, 153, 153));
        btnUserAdd.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        btnUserAdd.setText("Add");
        btnUserAdd.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnUserAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserAddMouseClicked(evt);
            }
        });

        btnUserUpdate.setBackground(new java.awt.Color(153, 153, 153));
        btnUserUpdate.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        btnUserUpdate.setText("Update");
        btnUserUpdate.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnUserUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserUpdateMouseClicked(evt);
            }
        });

        btnUserDelete.setBackground(new java.awt.Color(153, 153, 153));
        btnUserDelete.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        btnUserDelete.setText("Delete");
        btnUserDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnUserDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserDeleteMouseClicked(evt);
            }
        });

        btnUserClear.setBackground(new java.awt.Color(153, 153, 153));
        btnUserClear.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        btnUserClear.setText("Clear");
        btnUserClear.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnUserClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUserAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnUserUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(btnUserDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnUserClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserAdd)
                    .addComponent(btnUserUpdate)
                    .addComponent(btnUserDelete)
                    .addComponent(btnUserClear))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel6.setText("User Management");

        javax.swing.GroupLayout UserLayout = new javax.swing.GroupLayout(User);
        User.setLayout(UserLayout);
        UserLayout.setHorizontalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UserLayout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel6))
                    .addGroup(UserLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1036, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        UserLayout.setVerticalGroup(
            UserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UserLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        TopicPanel.addTab("User", User);

        Report.setBackground(new java.awt.Color(153, 153, 153));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Reports");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Monthly Income Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        btnReportPrint.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnReportPrint.setText("Print Document");

        cmbReportYearList.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbReportYearList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Year");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("Month");

        cmbReportMonths.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbReportMonths.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmbReportYearList, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cmbReportMonths, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReportPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReportPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbReportYearList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cmbReportMonths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ReportLayout = new javax.swing.GroupLayout(Report);
        Report.setLayout(ReportLayout);
        ReportLayout.setHorizontalGroup(
            ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportLayout.createSequentialGroup()
                .addGroup(ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReportLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ReportLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        ReportLayout.setVerticalGroup(
            ReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel16)
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        TopicPanel.addTab("User", Report);

        getContentPane().add(TopicPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, -30, 1090, 860));

        btnPanel.setBackground(new java.awt.Color(102, 102, 102));

        btnLogOUT.setBackground(new java.awt.Color(204, 204, 204));
        btnLogOUT.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        btnLogOUT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLogOUT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/SignOut.png"))); // NOI18N
        btnLogOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogOUTMouseClicked(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(204, 204, 204));
        btnHome.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home.png"))); // NOI18N
        btnHome.setText("     Home  ");
        btnHome.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        

        btnPOS.setBackground(new java.awt.Color(204, 204, 204));
        btnPOS.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        btnPOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/POS.png"))); // NOI18N
        btnPOS.setText("      POS   ");
        btnPOS.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnPOS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPOSMouseClicked(evt);
            }
        });

        btnProduct.setBackground(new java.awt.Color(204, 204, 204));
        btnProduct.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        btnProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Product.png"))); // NOI18N
        btnProduct.setText("   Product  ");
        btnProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductMouseClicked(evt);
            }
        });

        btnIncoice.setBackground(new java.awt.Color(204, 204, 204));
        btnIncoice.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        btnIncoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Invoice.png"))); // NOI18N
        btnIncoice.setText("    Invoice  ");
        btnIncoice.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnIncoice.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnIncoice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncoiceMouseClicked(evt);
            }
        });

        btnWarranty.setBackground(new java.awt.Color(204, 204, 204));
        btnWarranty.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        btnWarranty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Warrenty.png"))); // NOI18N
        btnWarranty.setText("  Warranty  ");
        btnWarranty.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnWarranty.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnWarranty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWarrantyMouseClicked(evt);
            }
        });

        btnUser.setBackground(new java.awt.Color(204, 204, 204));
        btnUser.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User.png"))); // NOI18N
        btnUser.setText("     User  ");
        btnUser.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        btnUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, btnPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnLogOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, btnPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnWarranty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIncoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnHome)
                .addGap(39, 39, 39)
                .addComponent(btnPOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnProduct)
                .addGap(33, 33, 33)
                .addComponent(btnIncoice)
                .addGap(39, 39, 39)
                .addComponent(btnWarranty)
                .addGap(36, 36, 36)
                .addComponent(btnUser)
                .addGap(49, 49, 49)
                .addComponent(btnLogOUT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        getContentPane().add(btnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 830));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LoadProductTable(String key ){
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("Select product_id, product_name, quantity, Purchase_price, Selling_price, warranty, product_condition from product " + key + " order by product_id asc");

            DefaultTableModel tm = (DefaultTableModel)stockTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[]= {rs.getInt("product_id"),rs.getString("product_name"),rs.getInt("quantity"),rs.getString("Purchase_price"),rs.getString("Selling_price"),rs.getInt("warranty"),rs.getString("product_condition")};
                tm.addRow(o);
            }

        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
        }
    }
    
    private void LoadUserTable(){
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("Select NIC, Fname, Lname, Gender, HouseNo, Street, Town, UserRole, UserName from systemlogin");

            DefaultTableModel tm = (DefaultTableModel)UserTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[] = {rs.getString("NIC"),rs.getString("Fname"),rs.getString("Lname"),rs.getString("Gender"),rs.getString("HouseNo"),rs.getString("Street"),rs.getString("Town"),rs.getString("UserRole"),rs.getString("UserName")};
                tm.addRow(o);
            }

        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
        }
    }
    
    public void ProductClear(){
        txtProductID.setText("");
        txtProductName.setText("");
        txtQuntity.setText("");
        txtSellingPrice.setText("");
        txtPurchasePrice.setText("");
        cmbWarrentyPeriod.setSelectedIndex(0);
        cmbCondition.setSelectedIndex(0);
        txtProductSearch.setText("");
        FilterCondition.setSelectedIndex(0);
        
    }
    
    private void stockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)stockTable.getModel();
        int selectedRowIndex = stockTable.getSelectedRow();
        
        txtProductID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtProductName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtQuntity.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtPurchasePrice.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtSellingPrice.setText(model.getValueAt(selectedRowIndex, 4).toString());
        cmbCondition.setSelectedItem(model.getValueAt(selectedRowIndex, 6).toString());
        
        String[] bnw = {"0","1","2","3","6","12","24","36","48","60"};
        String[] shw = {"0","1","2","3","6","12"};
        
        cmbWarrentyPeriod.removeAllItems();
        if(cmbCondition.getSelectedItem().toString().equalsIgnoreCase("Brand New")){
            for(int i=0;i<10;i++){
                cmbWarrentyPeriod.addItem(bnw[i]);
            }
        }else if(cmbCondition.getSelectedItem().toString().equalsIgnoreCase("Second Hand")){
            for(int i=0;i<6;i++){
                cmbWarrentyPeriod.addItem(shw[i]);
            }
        }
        cmbWarrentyPeriod.setSelectedItem(model.getValueAt(selectedRowIndex, 5).toString());
        
    }//GEN-LAST:event_stockTableMouseClicked

    private void UserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)UserTable.getModel();
        int selectedRowIndex = UserTable.getSelectedRow();

        txtUNIC.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtFName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtLaName.setText(model.getValueAt(selectedRowIndex, 2).toString());
        if ((model.getValueAt(selectedRowIndex, 3).toString()).equalsIgnoreCase("Male")){
            rabMale.setSelected(true);
            rabFemale.setSelected(false);
        }else if((model.getValueAt(selectedRowIndex, 3).toString()).equalsIgnoreCase("Female")){
            rabFemale.setSelected(true);
            rabMale.setSelected(false);
        }
        txtHouseNO.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txtStreet.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtTown.setText(model.getValueAt(selectedRowIndex, 6).toString());
        cmbUserRole.setSelectedItem(model.getValueAt(selectedRowIndex, 7).toString());
        txtUserName.setText(model.getValueAt(selectedRowIndex, 8).toString());
    }//GEN-LAST:event_UserTableMouseClicked

    
    private void rabMaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rabMaleMouseClicked
        rabFemale.setSelected(false);
    }//GEN-LAST:event_rabMaleMouseClicked

    private void rabFemaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rabFemaleMouseClicked
        rabMale.setSelected(false);
    }//GEN-LAST:event_rabFemaleMouseClicked

    public void UserClear(){
        txtUNIC.setText("");
        txtFName.setText("");
        txtLaName.setText("");
        rabMale.setSelected(false);
        rabFemale.setSelected(false);
        txtHouseNO.setText("");
        txtStreet.setText("");
        txtTown.setText("");
        cmbUserRole.setSelectedItem("");
        txtUserName.setText("");
        psfPassword.setText("");
        psfRePassword.setText("");
    }
    
    private void chbUserShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbUserShowPasswordMouseClicked
        if(chbUserShowPassword.isSelected()){
            psfPassword.setEchoChar((char)0);
            psfRePassword.setEchoChar((char)0);
          }else{
            psfPassword.setEchoChar('*');
            psfRePassword.setEchoChar('*');
        }
    }//GEN-LAST:event_chbUserShowPasswordMouseClicked

    private void txtProductSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductSearchKeyReleased
        String filter = FilterCondition.getSelectedItem().toString();
        String kee = "";
        
        if (filter.equalsIgnoreCase("Brand New")){
            kee = " product_condition = \"Brand New\"";
        }else if (filter.equalsIgnoreCase("Second Hand")){
            kee = " product_condition = \"Second Hand\" ";
        }
        
        if(txtProductSearch.getText().isEmpty()){
            if(filter.equalsIgnoreCase("All")){
                LoadProductTable("");
            }else{
                LoadProductTable(" where " + kee + " ");
            } 
        }else{
            if(filter.equalsIgnoreCase("All")){
                LoadProductTable(" where product_name like \"%" + txtProductSearch.getText() + "%\" or product_id like \"%" + txtProductSearch.getText() + "%\" " );
            }else{
                LoadProductTable(" where (product_name like \"%" + txtProductSearch.getText() + "%\" or product_id like \"%" + txtProductSearch.getText() + "%\") and " + kee + " " );
            }
        } 
    }//GEN-LAST:event_txtProductSearchKeyReleased

    
    
    public static String getWarrantyExpireDate(int n){
        
        DateFormat dateformat = new SimpleDateFormat("YYYY-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, n);
        String Date = dateformat.format(cal.getTime());
        return Date;
    }
    
        
    private void LoadInvoiceTable(String key){
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("Select * from invoice" + key);

            DefaultTableModel tm = (DefaultTableModel)InvoiceTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[]= {rs.getString("invoice_id"),rs.getString("user_nic"),rs.getString("paid_amount"),rs.getString("balance"),rs.getString("sub_total"),rs.getString("quantity"),rs.getString("Adding_date"),rs.getString("Adding_time")};
                tm.addRow(o);
            }

        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
        }
    }
    
    private void txtfindInvoiceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfindInvoiceKeyReleased
        LoadInvoiceTable(" where invoice_id like \"%" + txtfindInvoice.getText() + "%\"");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_txtfindInvoiceKeyReleased

    private void txtFindItemCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindItemCodeKeyReleased
        LoadWarrantyTable(" where item_code like \"%" + txtFindItemCode.getText() + "%\"" );
    }//GEN-LAST:event_txtFindItemCodeKeyReleased

    private void btnLogOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOUTMouseClicked
        this.hide();
        JOptionPane.showMessageDialog(this, "Successfully logged out.....!");
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogOUTMouseClicked

    private void cmbConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConditionActionPerformed
        String[] bnw = {"0","1","2","3","6","12","24","36","48","60"};
        String[] shw = {"0","1","2","3","6","12"};
        cmbWarrentyPeriod.removeAllItems();
        if(cmbCondition.getSelectedItem().toString().equalsIgnoreCase("Brand New")){
            for(int i=0;i<10;i++){
                cmbWarrentyPeriod.addItem(bnw[i]);
            }
        }else if(cmbCondition.getSelectedItem().toString().equalsIgnoreCase("Second Hand")){
            for(int i=0;i<6;i++){
                cmbWarrentyPeriod.addItem(shw[i]);
            }
        }else{
            cmbWarrentyPeriod.setSelectedItem("0");
        }
    }//GEN-LAST:event_cmbConditionActionPerformed

    private void FilterConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterConditionActionPerformed
        if(FilterCondition.getSelectedItem().toString().equalsIgnoreCase("All")){
            LoadProductTable(" where product_name like \"%" + txtProductSearch.getText() + "%\" or product_id like \"%" + txtProductSearch.getText() + "%\"");
        }else if(FilterCondition.getSelectedItem().toString().equalsIgnoreCase("Brand New")){
            LoadProductTable(" where product_condition = \"Brand New\" and ( product_name like \"%" + txtProductSearch.getText() + "%\" or product_id like \"%" + txtProductSearch.getText() + "%\")");
        }else if(FilterCondition.getSelectedItem().toString().equalsIgnoreCase("Second Hand")){
            LoadProductTable(" where product_condition = \"Second Hand\" and ( product_name like \"%" + txtProductSearch.getText() + "%\" or product_id like \"%" + txtProductSearch.getText() + "%\")");
        }
    }//GEN-LAST:event_FilterConditionActionPerformed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        TopicPanel.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnPOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPOSMouseClicked
        this.hide();
        new POS().setVisible(true);
        POS.lblUsername.setText(lblUser.getText());
        
    }//GEN-LAST:event_btnPOSMouseClicked

    private void btnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserMouseClicked
        TopicPanel.setSelectedIndex(4);
        LoadUserTable();
    }//GEN-LAST:event_btnUserMouseClicked

    private void btnWarrantyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarrantyMouseClicked
        TopicPanel.setSelectedIndex(3);
        LoadWarrantyTable("");
    }//GEN-LAST:event_btnWarrantyMouseClicked

    private void btnIncoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncoiceMouseClicked
        TopicPanel.setSelectedIndex(2);
        LoadInvoiceTable("");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_btnIncoiceMouseClicked

    private void btnProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductMouseClicked
        TopicPanel.setSelectedIndex(1);
        LoadProductTable("");
    }//GEN-LAST:event_btnProductMouseClicked

    private void btnHomePOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomePOSMouseClicked
        this.hide();
        new POS().setVisible(true);
        POS.lblUsername.setText(lblUser.getText());
    }//GEN-LAST:event_btnHomePOSMouseClicked

    private void btnHomeProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeProductMouseClicked
        TopicPanel.setSelectedIndex(1);
        LoadProductTable("");
    }//GEN-LAST:event_btnHomeProductMouseClicked

    private void btnHomeInvoiceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeInvoiceMouseClicked
        TopicPanel.setSelectedIndex(2);
        LoadInvoiceTable("");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_btnHomeInvoiceMouseClicked

    private void btnHomeWarrantyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeWarrantyMouseClicked
        TopicPanel.setSelectedIndex(3);
        LoadWarrantyTable("");
    }//GEN-LAST:event_btnHomeWarrantyMouseClicked

    private void btnHomeUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeUserMouseClicked
        TopicPanel.setSelectedIndex(4);
        LoadUserTable();
    }//GEN-LAST:event_btnHomeUserMouseClicked

    private void btnUserAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserAddMouseClicked
        if(txtUNIC.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the User NIC .....!");
        }else if(txtFName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the User First Name .....!");
        }else if(txtLaName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Last Name .....!");
        }else if((rabMale.isSelected() == false) && (rabFemale.isSelected() == false)){
            JOptionPane.showMessageDialog(this, "Please Select the Gender .....!");
        }else if(txtHouseNO.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the House Number .....!");
        }else if(txtStreet.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Street .....!");
        }else if(txtTown.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Town .....!");
        }else if(cmbUserRole.getSelectedItem().toString().contentEquals("Role")){
            JOptionPane.showMessageDialog(this, "Please Select the User Role .....!");
        }else if(txtUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the User Name .....!");
        }else if(psfPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Password .....!");
        }else if(psfRePassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Re Enter Password .....!");
        }else{
            if(cheackNIC(txtUNIC.getText()).equalsIgnoreCase("Yes")){
                if(psfPassword.getText().equalsIgnoreCase(psfRePassword.getText())){
                    String Gender;
        
                    if (rabMale.isSelected() == true){
                        Gender = "Male";
                    }else{
                        Gender = "Female";
                    }
                    try{
                        Statement state = data.dbConnection().createStatement();
                        String add_sql = "INSERT INTO systemlogin(NIC, Fname, Lname, Gender, HouseNo, Street, Town, UserRole, UserName, UserPassword)Values " + 
                                "(\"" + txtUNIC.getText() + "\",\"" + txtFName.getText() + "\",\"" + txtLaName.getText() + "\",\"" + Gender + 
                                "\",\"" + txtHouseNO.getText()+ "\",\"" + txtStreet.getText()+ "\",\"" + txtTown.getText()+ "\",\"" + cmbUserRole.getSelectedItem()+ 
                                "\",\"" + txtUserName.getText()+ "\",\"" + psfPassword.getText()+ "\")";
                        state.execute(add_sql);
                        JOptionPane.showMessageDialog(this, "Successfuly Add...");
                    
                        UserClear();
                        LoadUserTable();

                    }catch (HeadlessException | SQLException e){
                        JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
                    }
                }else{
                    psfPassword.setText("");
                    psfRePassword.setText("");
                    JOptionPane.showMessageDialog(this, "Passwords does not match.....!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "The NIC Number Entered is Previously registered .....!");
            }
        }
    }//GEN-LAST:event_btnUserAddMouseClicked

    private void btnUserUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserUpdateMouseClicked
        if(txtUNIC.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the User NIC .....!");
        }else if(txtFName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the User First Name .....!");
        }else if(txtLaName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Last Name .....!");
        }else if((rabMale.isSelected() == false) && (rabFemale.isSelected() == false)){
            JOptionPane.showMessageDialog(this, "Please Select the Gender .....!");
        }else if(txtHouseNO.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the House Number .....!");
        }else if(txtStreet.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Street .....!");
        }else if(txtTown.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Town .....!");
        }else if(cmbUserRole.getSelectedItem().toString().contentEquals("Role")){
            JOptionPane.showMessageDialog(this, "Please Select the User Role .....!");
        }else if(txtUserName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the User Name .....!");
        }else if(psfPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Password .....!");
        }else if(psfRePassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Re Enter Password .....!");
        }else{
            if(cheackNIC(txtUNIC.getText()).equalsIgnoreCase("No")){
                if(psfPassword.getText().equalsIgnoreCase(psfRePassword.getText())){
                    String Gender;
                    if (rabMale.isSelected() == true){
                        Gender = "Male";
                    }else{
                        Gender = "Female";
                    }
                    try{
                        Statement state = data.dbConnection().createStatement();
                        String add_sql = "UPDATE systemlogin SET Fname = \"" + txtFName.getText() + "\", Lname =\"" + txtLaName.getText() + "\", Gender =\"" + Gender + "\", HouseNo =\"" + txtHouseNO.getText()+ "\", Street =\"" + txtStreet.getText()+ "\", Town =\"" + txtTown.getText()+ "\", UserRole =\"" + cmbUserRole.getSelectedItem()+ "\", UserName =\"" + txtUserName.getText()+ "\", UserPassword =\"" + psfPassword.getText()+ "\" WHERE NIC = \"" + txtUNIC.getText() + "\" ";
                        state.execute(add_sql);
                        JOptionPane.showMessageDialog(this, "Successfuly Update...");

                        UserClear();
                        LoadUserTable();

                    }catch (HeadlessException | SQLException e){
                        JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
                    }
                }else{
                    psfPassword.setText("");
                    psfRePassword.setText("");
                    JOptionPane.showMessageDialog(this, "Passwords does not match.....!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Must have registered before .....!");
            }
        }   
    }//GEN-LAST:event_btnUserUpdateMouseClicked

    private void btnUserDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserDeleteMouseClicked
        if(cheackNIC(txtUNIC.getText()).equalsIgnoreCase("No")){
            try{
                Statement state = data.dbConnection().createStatement();
                String add_sql = "DELETE FROM systemlogin WHERE NIC = \"" + txtUNIC.getText() + "\"";
                state.execute(add_sql);
                JOptionPane.showMessageDialog(this, "Successfuly Deleted...");
            
                UserClear();
                LoadUserTable();

            }catch (HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Must have registered before .....!");
            UserClear();
        }
    }//GEN-LAST:event_btnUserDeleteMouseClicked

    private void btnUserClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUserClearMouseClicked
        UserClear();
    }//GEN-LAST:event_btnUserClearMouseClicked

    private void btnWarrantyAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarrantyAllMouseClicked
        LoadWarrantyTable("");
    }//GEN-LAST:event_btnWarrantyAllMouseClicked

    private void btnWarrantyExpiredItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarrantyExpiredItemMouseClicked
        LoadWarrantyTable(" where Expiration_date < \"" + getDate() + "\"" );
    }//GEN-LAST:event_btnWarrantyExpiredItemMouseClicked

    private void btnWarrantyRemoveItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarrantyRemoveItemMouseClicked
        DefaultTableModel model = (DefaultTableModel)WarrantyTable.getModel();
        int SelectedRowIndex = WarrantyTable.getSelectedRow();

        try{
            Statement state = data.dbConnection().createStatement();
            String add_sql = "DELETE FROM warranty WHERE item_code = \"" +model.getValueAt(SelectedRowIndex, 2).toString() + "\"";
            state.execute(add_sql);
            JOptionPane.showMessageDialog(this, "Successfuly Deleted...");
            WarrantyDataClear();
            LoadWarrantyTable("");

        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
        }
    }//GEN-LAST:event_btnWarrantyRemoveItemMouseClicked

    private void btnInvoiceAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceAllMouseClicked
        LoadInvoiceTable("");
        txtfindInvoice.setText("");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_btnInvoiceAllMouseClicked

    private void btnInvoiceTodayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceTodayMouseClicked
        LoadInvoiceTable(" where Adding_date = \"" + getDate() + "\"");
        txtfindInvoice.setText("");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_btnInvoiceTodayMouseClicked

    private void btnInvoiceLastWeekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceLastWeekMouseClicked
        LoadInvoiceTable(" where Adding_date Between \"" + getLastWeekDate()  + "\" AND \"" + getDate() + "\"");
        txtfindInvoice.setText("");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_btnInvoiceLastWeekMouseClicked

    private void btnInvoiceLastMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceLastMonthMouseClicked
        LoadInvoiceTable(" where Adding_date Between \"" + getLastMonthDate(1)  + "\" AND \"" + getDate() + "\"");
        txtfindInvoice.setText("");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_btnInvoiceLastMonthMouseClicked

    private void btnInvoiceLast3MonthsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceLast3MonthsMouseClicked
        LoadInvoiceTable(" where Adding_date Between \"" + getLastMonthDate(3)  + "\" AND \"" + getDate() + "\"");
        txtfindInvoice.setText("");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_btnInvoiceLast3MonthsMouseClicked

    private void btnInvoiceLastYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceLastYearMouseClicked
        LoadInvoiceTable(" where Adding_date Between \"" + getLastYearDate(1)  + "\" AND \"" + getDate() + "\"");
        txtfindInvoice.setText("");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_btnInvoiceLastYearMouseClicked

    private void btnInvoiceLast5YearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInvoiceLast5YearMouseClicked
        LoadInvoiceTable(" where Adding_date Between \"" + getLastYearDate(5)  + "\" AND \"" + getDate() + "\"");
        txtfindInvoice.setText("");
        countquntity();
        countInvoicePrice();
    }//GEN-LAST:event_btnInvoiceLast5YearMouseClicked

    private void btnAllProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllProductMouseClicked
        FilterCondition.setSelectedIndex(0);
        txtProductSearch.setText("");
        LoadProductTable("");
    }//GEN-LAST:event_btnAllProductMouseClicked

    private void btnProductOutofStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductOutofStockMouseClicked
        FilterCondition.setSelectedIndex(0);
        txtProductSearch.setText("");
        LoadProductTable(" where quantity = 0 ");
    }//GEN-LAST:event_btnProductOutofStockMouseClicked

    private void btnProductNearOutofStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductNearOutofStockMouseClicked
        FilterCondition.setSelectedIndex(0);
        txtProductSearch.setText("");
        LoadProductTable(" where quantity <= 5 AND quantity <> 0 ");
    }//GEN-LAST:event_btnProductNearOutofStockMouseClicked

    private void btnProductAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductAllMouseClicked
        if(!(txtProductID.getText().isEmpty())){
            JOptionPane.showMessageDialog(this, "Please Clear the Product ID .....!");
        }else if(txtProductName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Product Name .....!");
        }else if(txtPurchasePrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Purchase Price .....!");
        }else if(txtSellingPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Selling Price .....!");
        }else if(txtQuntity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Product Quntity .....!");
        }else if(cmbCondition.getSelectedItem().toString().equalsIgnoreCase("Condition.....") ){
            JOptionPane.showMessageDialog(this, "Please Insert the Product Condition .....!");
        }else{
            try{
                Statement state = data.dbConnection().createStatement();
                String add_sql = "INSERT INTO product (product_name, quantity, Purchase_price, Selling_price, warranty, product_condition, Adding_date, Adding_time)"+
                        " values(\""+txtProductName.getText()+ "\","+Integer.valueOf(txtQuntity.getText())+","+Double. valueOf(txtPurchasePrice.getText()) +","+Double. valueOf(txtSellingPrice.getText()) +","+Integer.valueOf(cmbWarrentyPeriod.getSelectedItem().toString())+ ",\"" + cmbCondition.getSelectedItem().toString() + "\",\""+getDate()+"\",\""+getTime()+"\")";
                state.execute(add_sql);
                JOptionPane.showMessageDialog(this, "Successfuly Insert...");
                ProductClear();
                LoadProductTable("");

            }catch (HeadlessException | NumberFormatException | SQLException e){
                JOptionPane.showMessageDialog(this,e);
            }
        } 
    }//GEN-LAST:event_btnProductAllMouseClicked

    private void btnProductUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductUpdateMouseClicked
        if(txtProductID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Product ID .....!");
        }else if(txtProductName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Product Name .....!");
        }else if(txtPurchasePrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Purchase Price .....!");
        }else if(txtSellingPrice.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Selling Price .....!");
        }else if(txtQuntity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Insert the Product Quntity .....!");
        }else if(cmbCondition.getSelectedItem().toString().equalsIgnoreCase("Condition.....") ){
            JOptionPane.showMessageDialog(this, "Please Insert the Product Condition .....!");
        }else{
            try{
                Statement state = data.dbConnection().createStatement();
                String add_sql = "UPDATE product SET product_name = \"" +txtProductName.getText() + "\", quantity = \"" + Integer.valueOf(txtQuntity.getText()) + "\", Purchase_price = \"" +Double. valueOf(txtPurchasePrice.getText()) + "\", Selling_price = \"" +Double. valueOf(txtSellingPrice.getText()) + "\", warranty = \"" +Integer.valueOf(cmbWarrentyPeriod.getSelectedItem().toString()) + "\", product_condition = \"" + cmbCondition.getSelectedItem().toString() + "\" WHERE product_id = \"" +Integer.valueOf(txtProductID.getText()) + "\"";
                state.execute(add_sql);
                JOptionPane.showMessageDialog(this, "Successfuly Update...");
                ProductClear();
                LoadProductTable("");

            }catch (HeadlessException | NumberFormatException | SQLException e){
                JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
            }
        } 
    }//GEN-LAST:event_btnProductUpdateMouseClicked

    private void btnProductClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductClearMouseClicked
        ProductClear();
    }//GEN-LAST:event_btnProductClearMouseClicked

    private void rabFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rabFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rabFemaleActionPerformed

    private void txtUNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUNICActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void txtWarreantyPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarreantyPeriodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarreantyPeriodActionPerformed

    private void WarrantyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WarrantyTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)WarrantyTable.getModel();
        int selectedRowIndex = WarrantyTable.getSelectedRow();
        
        txtWarrantyInvoiceID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        txtWarrantyProcuctID.setText(model.getValueAt(selectedRowIndex, 1).toString());
        txtWarrantyItemCode.setText(model.getValueAt(selectedRowIndex, 2).toString());
        txtWarrantyCustomerNIC.setText(model.getValueAt(selectedRowIndex, 3).toString());
        txtWarrantyCustomerName.setText(model.getValueAt(selectedRowIndex, 4).toString());
        txtWarreantyPeriod.setText(model.getValueAt(selectedRowIndex, 5).toString());
        txtWarrantyExpriationDate.setText(model.getValueAt(selectedRowIndex, 6).toString());

    }//GEN-LAST:event_WarrantyTableMouseClicked

    private void txtWarrantyCustomerNICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarrantyCustomerNICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarrantyCustomerNICActionPerformed

    private void btnWarrantyDataClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarrantyDataClearMouseClicked
        WarrantyDataClear();
    }//GEN-LAST:event_btnWarrantyDataClearMouseClicked

    private void WarrantyDataClear(){
        txtWarrantyInvoiceID.setText("");
        txtWarrantyProcuctID.setText("");
        txtWarrantyItemCode.setText("");
        txtWarrantyCustomerNIC.setText("");
        txtWarrantyCustomerName.setText("");
        txtWarreantyPeriod.setText("");
        txtWarrantyExpriationDate.setText("");
        txtWarrantyNewItemCode.setText("");
    }
    
    private void btnWarrantyItemCodeUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarrantyItemCodeUpdateMouseClicked
        if(cheackItemcode(txtWarrantyNewItemCode.getText()).equalsIgnoreCase("Yes")){
            try{
                Statement state = data.dbConnection().createStatement();
                ResultSet rs = state.executeQuery("Select item_code from warranty where item_code = \"" + txtWarrantyItemCode.getText().toString() + "\"");
                String add_sql = "UPDATE warranty SET item_code = \"" +txtWarrantyNewItemCode.getText() + "\" WHERE item_code = \"" + txtWarrantyItemCode.getText() + "\"";
                state.execute(add_sql);
                JOptionPane.showMessageDialog(this, "Successfuly Update...");
                WarrantyDataClear();
                LoadWarrantyTable("");
            }catch (SQLException e){
                JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
            }
        }else{
            txtWarrantyNewItemCode.setText("");
            JOptionPane.showMessageDialog(this, "This code has already been used");   
        }    
    }//GEN-LAST:event_btnWarrantyItemCodeUpdateMouseClicked

    public static String cheackItemcode(String code){
        String validCode = "";
        
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT item_code FROM warranty WHERE item_code = \""+ code + "\"");

            if (rs.next()){
                if(rs.getString("item_code").equalsIgnoreCase(code)){
                    validCode = "No";
                }
            }else{
                validCode = "Yes";
            }
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(rootPane, "Database not Connected.....! ");
        }
        return validCode; 
    }
    
    private void txtWarrantyItemCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWarrantyItemCodeKeyReleased
 
    }//GEN-LAST:event_txtWarrantyItemCodeKeyReleased

    private void txtUNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUNICKeyReleased
        if(txtUNIC.getText().length()==0){
            txtUNIC.setText("");
        }else{
            try{
                //try old NIC number
                if((Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("1 ")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("2"))){
                    System.out.println("New "+txtUNIC.getText().length());
                    if(txtUNIC.getText().length()<=12){
                        int nic = Integer.parseInt(txtUNIC.getText().toString());
                        System.out.println("Under 12");
                    }else if(txtUNIC.getText().length()>12){
                        txtUNIC.setText(txtUNIC.getText().substring(0, 12)); 
                        System.out.println("Upper 12");
                        int nic = Integer.parseInt(txtUNIC.getText().toString().substring(0, 12));
                    }
                }
                
                if((Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("9")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("8")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("7")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("6")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("5"))){
                    System.out.println("OLD "+txtUNIC.getText().length());
                    if(txtUNIC.getText().length()== 9){
                        txtUNIC.setText(txtUNIC.getText().toString() + "V");
                    }else if(txtUNIC.getText().length()>=10){
                        txtUNIC.setText(txtUNIC.getText().substring(0, 10));
                    }
                    
                    if(txtUNIC.getText().length()<9){
                        int nic = Integer.parseInt(txtUNIC.getText().toString());
                    }else if(txtUNIC.getText().length()>=9){
                        int nic = Integer.parseInt(txtUNIC.getText().toString().substring(0, 8));
                    }
                }
                
                //try new NIC number

            }catch(NumberFormatException e){
                int length = txtUNIC.getText().length()-1;
                
                if((Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("9")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("8")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("7")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("6")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("5"))){
                    if(txtUNIC.getText().length()==1){
                        txtUNIC.setText("");
                    }else if(txtUNIC.getText().length()>=8){
                        if(!(txtUNIC.getText().charAt(9)=='V')){
                            txtUNIC.setText(txtUNIC.getText().toString().substring(0, 8) + "V");
                        }
                    }else{
                        txtUNIC.setText(txtUNIC.getText().substring(0, length));
                    }
                }
                
                if((Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("1")) || (Character.toString(txtUNIC.getText().charAt(0)).equalsIgnoreCase("2"))){
                    if(txtUNIC.getText().length()==1){
                        txtUNIC.setText("");
                    }else{
                        txtUNIC.setText(txtUNIC.getText().substring(0, length));
                    }  
                }
                
                JOptionPane.showMessageDialog(this, "NIC Number is Invalid....!");
            }
        }
   
    }//GEN-LAST:event_txtUNICKeyReleased

    private void txtQuntityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuntityKeyReleased
        try{
            if(txtQuntity.getText().length()==0){
                txtQuntity.setText("");
            }else {
                int quntity = Integer.parseInt(txtQuntity.getText());
            }
        }catch(Exception e ){
            txtQuntity.setText(txtQuntity.getText().substring(0, txtQuntity.getText().length()-1));
            JOptionPane.showMessageDialog(this, "Value is Invalid....!");
        }  
    }//GEN-LAST:event_txtQuntityKeyReleased

    private void txtPurchasePriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPurchasePriceKeyReleased
        try{
            if(txtPurchasePrice.getText().length()==0){
                txtPurchasePrice.setText("");
            }else {
                float PurchasePrice = Float.parseFloat(txtPurchasePrice.getText());
            }
        }catch(Exception e ){
            txtPurchasePrice.setText(txtPurchasePrice.getText().substring(0, txtPurchasePrice.getText().length()-1));
            JOptionPane.showMessageDialog(this, "Value is Invalid....!");
        }
    }//GEN-LAST:event_txtPurchasePriceKeyReleased

    private void txtSellingPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSellingPriceKeyReleased
        try{
            if(txtSellingPrice.getText().length()==0){
                txtSellingPrice.setText("");
            }else {
                float SellingPrice = Float.parseFloat(txtSellingPrice.getText());
            }
        }catch(Exception e ){
            txtSellingPrice.setText(txtSellingPrice.getText().substring(0, txtSellingPrice.getText().length()-1));
            JOptionPane.showMessageDialog(this, "Value is Invalid....!");
        }
    }//GEN-LAST:event_txtSellingPriceKeyReleased

    public static String cheackNIC(String id){
        String validateNIC = "";
        
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT NIC FROM systemlogin WHERE NIC= \""+id + "\"");

            if (rs.next()){
                if(rs.getString("NIC").equalsIgnoreCase(id)){
                    validateNIC = "No";
                }
            }else{
                validateNIC = "Yes";
            }
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(rootPane, "Database not Connected.....! ");
        }
        return validateNIC; 
    }
    
    private void LoadWarrantyTable(String key){
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("Select * from warranty " + key + " ORDER BY invo_id ASC");

            DefaultTableModel tm = (DefaultTableModel)WarrantyTable.getModel();
            tm.setRowCount(0);

            while (rs.next()){
                Object o[]= {rs.getString("invo_id"),rs.getString("prod_id"),rs.getString("item_code"),rs.getString("coustomer_NIC"),rs.getString("coustomer_name"),rs.getString("Warranty_period"),rs.getString("Expiration_date")};
                tm.addRow(o);
            }

        }catch (SQLException e){
            JOptionPane.showMessageDialog(this, "DataBase is not Connected....!");
        }
    }
    
    public static String getLastWeekDate(){
        DateFormat dateformat = new SimpleDateFormat("YYYY-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        String Date = dateformat.format(cal.getTime());
        return Date;
    } 
    
    public static String getLastMonthDate(int n){
        DateFormat dateformat = new SimpleDateFormat("YYYY-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -n);
        String Date = dateformat.format(cal.getTime());
        return Date;
    } 
    
    public void countquntity(){
        int sum = 0;
        for(int i = 0;i<InvoiceTable.getRowCount();i++){
            sum = sum + Integer.parseInt(InvoiceTable.getValueAt(i, 5).toString());
        }
        lblCountQuntity.setText(Integer.toString(sum));
    }
    
    public void countInvoicePrice(){
        float sum = 0.0f;
        for(int i = 0;i<InvoiceTable.getRowCount();i++){
            sum = sum + Float.parseFloat(InvoiceTable.getValueAt(i, 4).toString());
        }
        lblCountSubTotal.setText(String.format("%.2f",sum));
    }
    
    public static String getLastYearDate(int n){
        DateFormat dateformat = new SimpleDateFormat("YYYY-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -n);
        String Date = dateformat.format(cal.getTime());
        return Date;
    } 

    public static String getDate(){
        java.util.Date date = new java.util.Date();
        SimpleDateFormat thisday = new SimpleDateFormat("YYYY-MM-dd");
        return thisday.format(date);
    }
    
    public static String getTime(){
        java.util.Date date = new java.util.Date();
        SimpleDateFormat thistime = new SimpleDateFormat(" hh:mm:ss a");
        return thistime.format(date);
    }
    
    public static void ShowDate(){
        java.util.Date d = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd");
        String dd = sdf.format(d);
        lblDate.setText(dd);
    }
    
    public static void ShowTime(){
        new Timer(0, (ActionEvent e) -> {
            java.util.Date t = new java.util.Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH : mm : ss");
            String tt = sdf.format(t);
            lblTime.setText(tt);
        }).start(); 
    }

    public static void main(String args[])  throws InterruptedException{
        java.awt.EventQueue.invokeLater(() -> {
            new Dashbourd().setVisible(true);
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> FilterCondition;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Invoice;
    private javax.swing.JTable InvoiceTable;
    private javax.swing.JPanel Product;
    private javax.swing.JPanel Report;
    private javax.swing.JTabbedPane TopicPanel;
    private javax.swing.JPanel User;
    private javax.swing.JTable UserTable;
    private javax.swing.JPanel Warranty;
    private javax.swing.JTable WarrantyTable;
    private javax.swing.JButton btnAllProduct;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHomeInvoice;
    private javax.swing.JButton btnHomePOS;
    private javax.swing.JButton btnHomeProduct;
    private javax.swing.JButton btnHomeUser;
    private javax.swing.JButton btnHomeWarranty;
    private javax.swing.JButton btnIncoice;
    private javax.swing.JButton btnInvoiceAll;
    private javax.swing.JButton btnInvoiceLast3Months;
    private javax.swing.JButton btnInvoiceLast5Year;
    private javax.swing.JButton btnInvoiceLastMonth;
    private javax.swing.JButton btnInvoiceLastWeek;
    private javax.swing.JButton btnInvoiceLastYear;
    private javax.swing.JButton btnInvoiceToday;
    private javax.swing.JLabel btnLogOUT;
    private javax.swing.JButton btnPOS;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnProductAll;
    private javax.swing.JButton btnProductClear;
    private javax.swing.JButton btnProductNearOutofStock;
    private javax.swing.JButton btnProductOutofStock;
    private javax.swing.JButton btnProductUpdate;
    private javax.swing.JButton btnReportPrint;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnUserAdd;
    private javax.swing.JButton btnUserClear;
    private javax.swing.JButton btnUserDelete;
    private javax.swing.JButton btnUserUpdate;
    private javax.swing.JButton btnWarranty;
    private javax.swing.JButton btnWarrantyAll;
    private javax.swing.JButton btnWarrantyDataClear;
    private javax.swing.JButton btnWarrantyExpiredItem;
    private javax.swing.JButton btnWarrantyItemCodeUpdate;
    private javax.swing.JButton btnWarrantyRemoveItem;
    private javax.swing.JLabel btn_Home_Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chbUserShowPassword;
    private javax.swing.JComboBox<String> cmbCondition;
    private javax.swing.JComboBox<String> cmbReportMonths;
    private javax.swing.JComboBox<String> cmbReportYearList;
    private javax.swing.JComboBox<String> cmbUserRole;
    private javax.swing.JComboBox<String> cmbWarrentyPeriod;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCountQuntity;
    private javax.swing.JLabel lblCountSubTotal;
    private static javax.swing.JLabel lblDate;
    private static javax.swing.JLabel lblTime;
    public static javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField psfPassword;
    private javax.swing.JPasswordField psfRePassword;
    private javax.swing.JRadioButton rabFemale;
    private javax.swing.JRadioButton rabMale;
    private javax.swing.JTable stockTable;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFindItemCode;
    private javax.swing.JTextField txtHouseNO;
    private javax.swing.JTextField txtLaName;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductSearch;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtQuntity;
    private javax.swing.JTextField txtSellingPrice;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtTown;
    private javax.swing.JTextField txtUNIC;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtWarrantyCustomerNIC;
    private javax.swing.JTextField txtWarrantyCustomerName;
    private javax.swing.JTextField txtWarrantyExpriationDate;
    private javax.swing.JTextField txtWarrantyInvoiceID;
    private javax.swing.JTextField txtWarrantyItemCode;
    private javax.swing.JTextField txtWarrantyNewItemCode;
    private javax.swing.JTextField txtWarrantyProcuctID;
    private javax.swing.JTextField txtWarreantyPeriod;
    private javax.swing.JTextField txtfindInvoice;
    // End of variables declaration//GEN-END:variables

}
