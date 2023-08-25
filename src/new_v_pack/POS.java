/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package new_v_pack;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rajapaksha
 */


public final class POS extends javax.swing.JFrame {

    public POS() {
        initComponents();
        loadProaduct("");
        ShowDate();
        ShowTime();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Frame = new javax.swing.JPanel();
        Main_Item_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbPOSProduct = new javax.swing.JComboBox<>();
        spnPOSQuntity = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblQuntity = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCondition = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblWarrenty = new javax.swing.JLabel();
        btnAddtoCart = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtFindItem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabPOSItemTable = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtPOSCustomerNIC = new javax.swing.JTextField();
        txtPOSCustomerName = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtPOSPayAmount = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        lblPOSChange = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lblPOSTotalPrice = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmbDiscount = new javax.swing.JComboBox<>();
        lbldiscount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblPOSSubTotalPrice = new javax.swing.JLabel();
        btnCartUpdate = new javax.swing.JButton();
        btnCartRemove = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        btngoHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setName("POSFrame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Frame.setBackground(new java.awt.Color(153, 153, 153));
        Frame.setEnabled(false);

        Main_Item_panel.setBackground(new java.awt.Color(153, 153, 153));
        Main_Item_panel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Main_Item_panel.setDoubleBuffered(false);
        Main_Item_panel.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("product");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Quntity");

        cmbPOSProduct.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        cmbPOSProduct.setMaximumRowCount(20);
        cmbPOSProduct.setToolTipText("");
        cmbPOSProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPOSProductActionPerformed(evt);
            }
        });

        spnPOSQuntity.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        spnPOSQuntity.setFocusable(false);
        spnPOSQuntity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPOSQuntityStateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 3, 20)); // NOI18N
        jLabel10.setText("Details");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("ID          :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Quntity          :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Price          :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Warranty          :");

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        lblQuntity.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Condition          :");

        lblCondition.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Months");

        lblWarrenty.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(166, 166, 166))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCondition)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(lblQuntity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(lblWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(14, 14, 14))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addComponent(lblWarrenty, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCondition))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnAddtoCart.setBackground(new java.awt.Color(153, 153, 153));
        btnAddtoCart.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        btnAddtoCart.setText("Add to Cart");
        btnAddtoCart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddtoCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddtoCartMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Find Product");

        txtFindItem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtFindItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFindItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFindItemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout Main_Item_panelLayout = new javax.swing.GroupLayout(Main_Item_panel);
        Main_Item_panel.setLayout(Main_Item_panelLayout);
        Main_Item_panelLayout.setHorizontalGroup(
            Main_Item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_Item_panelLayout.createSequentialGroup()
                .addGroup(Main_Item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Main_Item_panelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(Main_Item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Main_Item_panelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(289, 289, 289))
                            .addComponent(cmbPOSProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Main_Item_panelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel7)
                        .addGap(81, 81, 81)
                        .addComponent(spnPOSQuntity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_Item_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Main_Item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_Item_panelLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_Item_panelLayout.createSequentialGroup()
                        .addComponent(btnAddtoCart, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_Item_panelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtFindItem, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        Main_Item_panelLayout.setVerticalGroup(
            Main_Item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_Item_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Main_Item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFindItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(28, 28, 28)
                .addGroup(Main_Item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPOSProduct)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Main_Item_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spnPOSQuntity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddtoCart)
                .addGap(19, 19, 19))
        );

        tabPOSItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Warranty (Month)", "quntity", "Unit Price", "Total Price", "Condition"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabPOSItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPOSItemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabPOSItemTable);
        if (tabPOSItemTable.getColumnModel().getColumnCount() > 0) {
            tabPOSItemTable.getColumnModel().getColumn(0).setResizable(false);
            tabPOSItemTable.getColumnModel().getColumn(1).setResizable(false);
            tabPOSItemTable.getColumnModel().getColumn(2).setResizable(false);
            tabPOSItemTable.getColumnModel().getColumn(3).setResizable(false);
            tabPOSItemTable.getColumnModel().getColumn(4).setResizable(false);
            tabPOSItemTable.getColumnModel().getColumn(5).setResizable(false);
            tabPOSItemTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User_1.png"))); // NOI18N
        jLabel19.setText(" ");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("User");

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel6.setDoubleBuffered(false);
        jPanel6.setEnabled(false);
        jPanel6.setFocusable(false);

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        jLabel21.setText("Customer Details");

        jLabel22.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel22.setText("Customer NIC");

        jLabel23.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel23.setText("Customer Name");

        txtPOSCustomerNIC.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txtPOSCustomerNIC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPOSCustomerName.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txtPOSCustomerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPOSCustomerNIC, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(txtPOSCustomerName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel21)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtPOSCustomerNIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtPOSCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel28.setText("Pay Amount");

        txtPOSPayAmount.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        txtPOSPayAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPOSPayAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPOSPayAmountKeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel29.setText("Change");

        lblPOSChange.setFont(new java.awt.Font("Segoe UI Black", 3, 22)); // NOI18N
        lblPOSChange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPOSChange.setText("0.00");
        lblPOSChange.setInheritsPopupMenu(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtPOSPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(lblPOSChange, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPOSPayAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPOSChange, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nupe - Matara");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VPack Computer Solutions ");

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date");
        lblDate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("Time");
        lblTime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Time.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Date.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 3, 26)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText(" Total");

        jPanel14.setBackground(new java.awt.Color(204, 255, 204));

        lblPOSTotalPrice.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        lblPOSTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPOSTotalPrice.setText("0.00");
        lblPOSTotalPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblPOSTotalPriceKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPOSTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPOSTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel17.setText("Discount");

        cmbDiscount.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%" }));
        cmbDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDiscountActionPerformed(evt);
            }
        });

        lbldiscount.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lbldiscount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldiscount.setText("0.00");
        lbldiscount.setFocusable(false);
        lbldiscount.setInheritsPopupMenu(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 26)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sub Total ");

        jPanel15.setBackground(new java.awt.Color(204, 255, 204));

        lblPOSSubTotalPrice.setFont(new java.awt.Font("Sitka Heading", 3, 24)); // NOI18N
        lblPOSSubTotalPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPOSSubTotalPrice.setText("0.00");
        lblPOSSubTotalPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblPOSSubTotalPriceKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPOSSubTotalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPOSSubTotalPrice)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldiscount)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        btnCartUpdate.setBackground(new java.awt.Color(153, 153, 153));
        btnCartUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/update.png"))); // NOI18N
        btnCartUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCartUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCartUpdateMouseClicked(evt);
            }
        });

        btnCartRemove.setBackground(new java.awt.Color(153, 153, 153));
        btnCartRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/refresh.png"))); // NOI18N
        btnCartRemove.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCartRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCartRemoveMouseClicked(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(153, 153, 153));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/remove.png"))); // NOI18N
        btnClear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        btnDone.setBackground(new java.awt.Color(153, 153, 153));
        btnDone.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        btnDone.setText("Done");
        btnDone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoneMouseClicked(evt);
            }
        });

        btngoHome.setBackground(new java.awt.Color(153, 153, 153));
        btngoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Home.png"))); // NOI18N
        btngoHome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btngoHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngoHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout FrameLayout = new javax.swing.GroupLayout(Frame);
        Frame.setLayout(FrameLayout);
        FrameLayout.setHorizontalGroup(
            FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameLayout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblTime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(FrameLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))
                    .addGroup(FrameLayout.createSequentialGroup()
                        .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(FrameLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnCartUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnCartRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FrameLayout.createSequentialGroup()
                                .addComponent(btngoHome)
                                .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FrameLayout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(FrameLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(138, 138, 138)))))
                        .addGap(18, 18, 18)
                        .addComponent(Main_Item_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        FrameLayout.setVerticalGroup(
            FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrameLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameLayout.createSequentialGroup()
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(lblUsername)))
                        .addGroup(FrameLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblDate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btngoHome))
                .addGap(41, 41, 41)
                .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FrameLayout.createSequentialGroup()
                        .addComponent(Main_Item_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(FrameLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FrameLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCartRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCartUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FrameLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FrameLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Frame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFindItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFindItemKeyReleased
        loadProaduct(txtFindItem.getText());
    }//GEN-LAST:event_txtFindItemKeyReleased

    private void cmbPOSProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPOSProductActionPerformed
        try {
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("Select product_id, quantity, Selling_price, warranty,product_condition from product where  product_name = \""+ cmbPOSProduct.getSelectedItem() +"\"");
            
            if (rs.next()) {
                lblID.setText(rs.getString("product_id"));
                lblQuntity.setText(rs.getString("quantity"));
                lblPrice.setText(rs.getString("Selling_price"));
                lblWarrenty.setText(rs.getString("warranty"));
                lblCondition.setText(rs.getString("product_condition"));
            }
            spnPOSQuntity.setEnabled(true);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_cmbPOSProductActionPerformed
    
    private void ClearPOS(){
        ClearPOSItemData();
        lblPOSSubTotalPrice.setText("0.00");
        ((DefaultTableModel)tabPOSItemTable.getModel()).setNumRows(0);
        txtPOSPayAmount.setText("");
        lblPOSChange.setText("0.00");
        txtPOSCustomerNIC.setText("");
        txtPOSCustomerName.setText("");
        cmbDiscount.removeAllItems();
        cmbDiscount.addItem("0%");
        lbldiscount.setText("0.00");
        lblPOSTotalPrice.setText("0.00");
        lblPOSSubTotalPrice.setText("0.00");
        lblPOSChange.setText("0.00");
        
    }
    
    private void spnPOSQuntityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPOSQuntityStateChanged
        if (Integer.parseInt(spnPOSQuntity.getValue().toString())<0){
            spnPOSQuntity.setValue(0);
        }else if (Integer.parseInt(lblQuntity.getText()) < Integer.parseInt(spnPOSQuntity.getValue().toString())){
            spnPOSQuntity.setValue(lblQuntity.getText());
        }
    }//GEN-LAST:event_spnPOSQuntityStateChanged

    private void txtPOSPayAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPOSPayAmountKeyReleased
        try{
            if (txtPOSPayAmount.getText().length()==0){
                lblPOSChange.setText("-"+lblPOSSubTotalPrice.getText());
            }else{
                calChange();
            }    
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, " Invalid Currency Value......! ");
            lblPOSChange.setText("0.00");
            txtPOSPayAmount.setText("");
        } 
    }//GEN-LAST:event_txtPOSPayAmountKeyReleased

    private void tabPOSItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPOSItemTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)tabPOSItemTable.getModel();
        int selectedRowIndex = tabPOSItemTable.getSelectedRow();
        
        lblID.setText(model.getValueAt(selectedRowIndex, 0).toString());
        cmbPOSProduct.setSelectedItem(model.getValueAt(selectedRowIndex, 1).toString());
        
        try {
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("select quantity, Selling_price, warranty  from product where product_name =  '" + cmbPOSProduct.getSelectedItem() + "'");

            if (rs.next()) {
                lblQuntity.setText(rs.getString("quantity"));
                lblPrice.setText(rs.getString("Selling_price"));
                lblWarrenty.setText(rs.getString("warranty"));
            }

        } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
        }
        spnPOSQuntity.setValue(Integer.parseInt(model.getValueAt(selectedRowIndex, 3).toString()));  
    }//GEN-LAST:event_tabPOSItemTableMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //setDate();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void lblPOSSubTotalPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPOSSubTotalPriceKeyReleased
        
    }//GEN-LAST:event_lblPOSSubTotalPriceKeyReleased

    private void lblPOSTotalPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPOSTotalPriceKeyReleased
        
    }//GEN-LAST:event_lblPOSTotalPriceKeyReleased

    private void cmbDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDiscountActionPerformed
        calsubTotal();
    }//GEN-LAST:event_cmbDiscountActionPerformed

    private void btnCartUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartUpdateMouseClicked
        DefaultTableModel model = (DefaultTableModel)tabPOSItemTable.getModel();

        if (Integer.parseInt(spnPOSQuntity.getValue().toString())<0){
            spnPOSQuntity.setValue(0);
        }else if (Integer.parseInt(lblQuntity.getText()) < Integer.parseInt(spnPOSQuntity.getValue().toString())){
            spnPOSQuntity.setValue(Integer.parseInt(lblQuntity.getText()));
        }
        
        float price = Float.parseFloat(lblPrice.getText()) * Integer.parseInt(spnPOSQuntity.getValue().toString());
        float totalprice = price ;
        
        model.setValueAt(spnPOSQuntity.getValue(), tabPOSItemTable.getSelectedRow(), 3);
        model.setValueAt(totalprice, tabPOSItemTable.getSelectedRow(), 5);
        getTotalItemPrice();
        ClearPOSItemData();
        calChange();
    }//GEN-LAST:event_btnCartUpdateMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        ClearPOS();
    }//GEN-LAST:event_btnClearMouseClicked

    private void btnCartRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartRemoveMouseClicked
        DefaultTableModel model = (DefaultTableModel)tabPOSItemTable.getModel();
        int SelectedRowIndex = tabPOSItemTable.getSelectedRow();
        model.removeRow(SelectedRowIndex);
        JOptionPane.showMessageDialog(this, "Successfuly Removed....!");
        ClearPOSItemData();
        getTotalItemPrice();
        calChange();
    }//GEN-LAST:event_btnCartRemoveMouseClicked

    private void btnDoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoneMouseClicked
        DefaultTableModel model = (DefaultTableModel)tabPOSItemTable.getModel();
        String invoiceNO = null;
        int itemrowcount;
        if(Float.parseFloat(lblPOSSubTotalPrice.getText())<= Float.parseFloat(txtPOSPayAmount.getText())){
//----------------------------------------------- Update Invoice Table -------------------------------------------------------------
            try{
                Statement state = data.dbConnection().createStatement();
                String add_sql = "INSERT INTO invoice( user_nic, paid_amount, total, discount, sub_total, balance, quantity, Adding_date, Adding_time) "+
                    "VALUES (\""+getUserNIC()+ "\",\""+txtPOSPayAmount.getText()+"\",\""+lblPOSTotalPrice.getText() +"\",\""+lbldiscount.getText() +"\",\""+lblPOSSubTotalPrice.getText() + "\",\""+lblPOSChange.getText() +"\",\""+countQuntity()+"\",\""+getDate()+"\",\""+getTime()+"\")";
                state.execute(add_sql);
            
                JOptionPane.showMessageDialog(this, "Successfuly Update Invoice Table...");

            }catch (HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(this, "Database not Connected......! ");
            }
//----------------------------------------------- Find Last Invoice Number -------------------------------------------------------------
        
            invoiceNO = getLastInvoiceNo();
     
//----------------------------------------------- Update Warranty Table -------------------------------------------------------------
            itemrowcount = tabPOSItemTable.getRowCount();
        
            for (int i=0;i<itemrowcount;i++){
                int itemquntity = Integer. parseInt(model.getValueAt(i, 3).toString());
                int warrantymonth = Integer. parseInt(model.getValueAt(i, 2).toString());
                String product_code;
                if((itemquntity != 0) && (warrantymonth != 0 )) {
                    for(int j = 1;j<=itemquntity;j++){
                        try{
                            Statement state = data.dbConnection().createStatement();
                            product_code = JOptionPane.showInputDialog("Input "+model.getValueAt(i, 1).toString() +" Item "+ j +" Code");
                            while (product_code.length() == 0){
                                product_code = JOptionPane.showInputDialog("Input "+model.getValueAt(i, 1).toString() +" Item "+ j +" Code");
                            }
                            String add_sql = "INSERT INTO warranty(item_code, invo_id, prod_id, coustomer_NIC, coustomer_name, Warranty_period, Expiration_date)" +
                                " VALUES (\""+ product_code + "\","+Integer.parseInt(invoiceNO) + ","+Integer.valueOf(model.getValueAt(i, 0).toString())+",\""+txtPOSCustomerNIC.getText()+"\",\""+txtPOSCustomerName.getText()+"\",\""+Integer.valueOf(model.getValueAt(i, 2).toString())+"\",\""+getWarrantyExpireDate(Integer.parseInt(model.getValueAt(i, 2).toString()))+"\")";
                            state.execute(add_sql);
                            
                        }catch (HeadlessException | NumberFormatException | SQLException e){
                            JOptionPane.showMessageDialog(this, "Database not Connected......! ");
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(this, "Successfuly Insert Warrenty Data...");
        
//----------------------------------------------- Update Selling Table -------------------------------------------------------------
            itemrowcount = tabPOSItemTable.getRowCount();
        
            for (int i=0;i<itemrowcount;i++){
                try{
                    Statement state = data.dbConnection().createStatement();
                    String add_sql = "INSERT INTO selling(product_id, invo_id, quantity, sell_profit, Selling_date, Selling_time)"+
                        "VALUES ("+Integer.valueOf(model.getValueAt(i, 0).toString())+ ","+Integer.valueOf(invoiceNO)+","+Integer.valueOf(model.getValueAt(i, 3).toString())+",\""+ Float.parseFloat(model.getValueAt(i, 3).toString())* getItemProfit(model.getValueAt(i, 0).toString())+"\",\""+getDate()+"\",\""+getTime()+"\")";
                    state.execute(add_sql);
                    if(i==itemrowcount-1){
                        JOptionPane.showMessageDialog(this, "Successfuly Update Selling Table...");
                    }
                }catch (HeadlessException | NumberFormatException | SQLException e){
                    JOptionPane.showMessageDialog(this, "Database not Connected......! ");
                }
            }

//----------------------------------------------- Update Product Quntity Table -------------------------------------------------------------
            itemrowcount = tabPOSItemTable.getRowCount();
        
            for (int i=0;i<itemrowcount;i++){
                try{
                    Statement state = data.dbConnection().createStatement();
                    int newStock = getproductQuntity(model.getValueAt(i, 0).toString())- Integer.parseInt(model.getValueAt(i, 3).toString());
                    //System.out.println(newStock);
                    String update_sql = "UPDATE product SET quantity = "+ newStock +" where product_id = \""+  Integer.valueOf(model.getValueAt(i, 0).toString())+"\"";
                    state.execute(update_sql);
                    
                    if(i == itemrowcount-1){
                        JOptionPane.showMessageDialog(this, "Successfuly Update Product Table...");
                    }
                }catch (NumberFormatException | SQLException e){
                    JOptionPane.showMessageDialog(this, "Database not Connected......! ");
                }
            }
            
            
        }else{
            JOptionPane.showMessageDialog(this, "The amount is not enough......!");
        }

        try {
            PrintInvoice(Integer.parseInt(invoiceNO));
        } catch (DocumentException | IOException | NumberFormatException e) {
            //System.out.println(e);
            JOptionPane.showMessageDialog(this, e);
        }
        ClearPOS();
    }//GEN-LAST:event_btnDoneMouseClicked

    private void btnAddtoCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddtoCartMouseClicked
        String d1 = lblID.getText();
        String d2 = cmbPOSProduct.getSelectedItem().toString();
        String d3 = lblWarrenty.getText();

        if (Integer.parseInt(spnPOSQuntity.getValue().toString())<0){
            spnPOSQuntity.setValue(0);
        }else if (Integer.parseInt(lblQuntity.getText()) < Integer.parseInt(spnPOSQuntity.getValue().toString())){
            spnPOSQuntity.setValue(Integer.parseInt(lblQuntity.getText()));
        }
        
        String d4 = spnPOSQuntity.getValue().toString();
        String d5 = lblPrice.getText();
        float price = Float.parseFloat(lblPrice.getText()) * Integer.parseInt(d4) ;
        String d6 = String.format("%.2f", price);
        String d7 = lblCondition.getText();
        
        String data[] = {d1,d2,d3,d4,d5,d6,d7};
        
        DefaultTableModel model = (DefaultTableModel)tabPOSItemTable.getModel();
        if(Integer.parseInt(spnPOSQuntity.getValue().toString()) == 0){
            JOptionPane.showMessageDialog(this, " Select the number of items......! ");        
        }else{
            model.addRow(data);
      
            getTotalItemPrice();
            ClearPOSItemData();
            calChange(); 
        }
    }//GEN-LAST:event_btnAddtoCartMouseClicked

    private void btngoHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngoHomeMouseClicked
        if(data.getUserRole(lblUsername.getText()).equalsIgnoreCase("Chasier")){
            this.hide();
            JOptionPane.showMessageDialog(this, "Successfully logged out.....!");
            new Login().setVisible(true);
        }else{
            this.hide();
            new Dashbourd().setVisible(true);
            Dashbourd.lblUser.setText(lblUsername.getText());
        }
    }//GEN-LAST:event_btngoHomeMouseClicked

    private void calsubTotal(){
        float totalprice = Float.parseFloat(lblPOSTotalPrice.getText());
        
        float subtotal = 0.0f;
        
        if ("0%".equalsIgnoreCase((String) cmbDiscount.getSelectedItem())){
            subtotal = totalprice;
            lbldiscount.setText("0.00");
        } else if ("1%".equalsIgnoreCase((String) cmbDiscount.getSelectedItem())){
            subtotal = totalprice*0.99f;
            lbldiscount.setText(Float.toString(totalprice*0.01f)+"0");
        } else if ("2%".equalsIgnoreCase((String) cmbDiscount.getSelectedItem())){
            subtotal = totalprice*0.98f;
            lbldiscount.setText(String.format("%.2f", totalprice*0.02f));
        } else if ("3%".equalsIgnoreCase((String) cmbDiscount.getSelectedItem())){
            subtotal = totalprice*0.97f;
            lbldiscount.setText(String.format("%.2f", totalprice*0.03f));
        } else if ("5%".equalsIgnoreCase((String) cmbDiscount.getSelectedItem())){
            subtotal = totalprice*0.95f;
            lbldiscount.setText(String.format("%.2f", totalprice*0.05f));
        } else if ("10%".equalsIgnoreCase((String) cmbDiscount.getSelectedItem())){
            subtotal = totalprice*0.90f;
            lbldiscount.setText(String.format("%.2f", totalprice*0.1f));
        }
        lblPOSSubTotalPrice.setText(String.format("%.2f", subtotal));
        calChange();
    }
    
    public static String getWarrantyExpireDate(int n){
        
        DateFormat dateformat = new SimpleDateFormat("YYYY-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, n);
        String Date = dateformat.format(cal.getTime());
        return Date;
    }
    
    public void loadProaduct(String key){
        try{
            cmbPOSProduct.removeAllItems();
            cmbPOSProduct.addItem("Select Item ......");
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("Select * from product where quantity <> 0 and product_name like \"%"+ key +"%\"");

            while (rs.next()){
                cmbPOSProduct.addItem(rs.getString("product_name"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Database not Connected.....! ");
        }
    }
    
    public void ClearPOSItemData(){
        lblID.setText("");
        cmbPOSProduct.setSelectedIndex(0);
        lblWarrenty.setText("");
        spnPOSQuntity.setValue(0);
        lblQuntity.setText("");
        lblPrice.setText("");
        lblCondition.setText("");
        txtFindItem.setText("");
    }
    
    public void getTotalItemPrice(){
        float sum = 0.0f;
        for(int i = 0;i<tabPOSItemTable.getRowCount();i++){
            sum = sum + Float.parseFloat(tabPOSItemTable.getValueAt(i, 5).toString());
        }
        lblPOSTotalPrice.setText(String.format("%.2f",sum));
        
        getDiscount();
    }
    
    public void getDiscount(){
        cmbDiscount.removeAllItems();
        
        float total = Float.parseFloat(lblPOSTotalPrice.getText());

        if(total<10000f){
            cmbDiscount.addItem("0%");
        }else if(total<50000f){
            cmbDiscount.addItem("0%");
            cmbDiscount.addItem("1%");
        }else if(total<100000f){
            cmbDiscount.addItem("0%");
            cmbDiscount.addItem("1%");
            cmbDiscount.addItem("2%");
        }else if(total<500000f){
            cmbDiscount.addItem("0%");
            cmbDiscount.addItem("1%");
            cmbDiscount.addItem("2%");
            cmbDiscount.addItem("3%");
        }else if(total<1000000f){
            cmbDiscount.addItem("0%");
            cmbDiscount.addItem("1%");
            cmbDiscount.addItem("2%");
            cmbDiscount.addItem("3%");
            cmbDiscount.addItem("5%");
        }else{
            cmbDiscount.addItem("0%");
            cmbDiscount.addItem("1%");
            cmbDiscount.addItem("2%");
            cmbDiscount.addItem("3%");
            cmbDiscount.addItem("5%");
            cmbDiscount.addItem("10%");
        }
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
    
    public void calChange(){
        
        float PayAmount;
        if(txtPOSPayAmount.getText().isEmpty()){
            PayAmount = 0.0f;
        }else{
            PayAmount = Float.parseFloat(txtPOSPayAmount.getText());
        }
        float subtotalprice = Float.parseFloat(lblPOSSubTotalPrice.getText());
        float change = PayAmount - subtotalprice;
        
        lblPOSChange.setText(String.format("%.2f", change));

    }

    public String getUserNIC(){
        String nic = "";
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("Select NIC from systemlogin where UserName = \"" + lblUsername.getText()+"\"");

            if (rs.next()){
                nic = (rs.getString("NIC"));  
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Database not Connected.....! ");
        }
        return nic;
    }
    
    public String countQuntity(){
        
        DefaultTableModel model = (DefaultTableModel)tabPOSItemTable.getModel();
        int totalRow = tabPOSItemTable.getRowCount();
        int count = 0;
        
        for(int i = 0;i<totalRow;i++){
            count = count + Integer.parseInt(model.getValueAt(i, 3).toString());
        }
        return Integer.toString(count);
    }
    
    public float getItemProfit(String ID){
        float profit = 0.0f;
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("Select profit from product where product_id = \"" + ID+"\"");

            if (rs.next()){
                profit = (rs.getFloat("profit"));  
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Database not Connected.....! ");
        }
        return profit;
    }
    
    public int getproductQuntity(String id){
        int productquntity = 0;
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT quantity FROM product WHERE product_id= \""+id + "\"");

            if (rs.next()){
                productquntity = (rs.getInt("quantity"));
                //System.out.println(productquntity);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Database not Connected.....! ");
        }
        return productquntity;
    }
    
    public  String getLastInvoiceNo(){
        String invoiceNO = null;
        try{
            Statement state = data.dbConnection().createStatement();
            ResultSet rs = state.executeQuery("select invoice_id from invoice ORDER BY invoice_id DESC LIMIT 1");
            if (rs.next()){
                invoiceNO = (rs.getString("invoice_id"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(rootPane, "Database not Connected.....! ");
        }
        return invoiceNO;
    }
    
    public static void ShowDate(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd");
        String dd = sdf.format(d);
        lblDate.setText(dd);
    }
    
    public static void ShowTime(){
        new Timer(0, (ActionEvent e) -> {
            Date t = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("HH : mm : ss");
            String tt = sdf.format(t);
            lblTime.setText(tt);
        }).start(); 
    }
    
    private static void PrintInvoice(int invoiceNO) throws FileNotFoundException, DocumentException, BadElementException, IOException{
        String path = "C:\\Users\\USER\\OneDrive\\Desktop\\vpack_invoice\\"+ invoiceNO+".pdf";
        Rectangle pagesize = new Rectangle(700,1000);
        Document document = new Document(pagesize);

        PdfWriter.getInstance(document, new FileOutputStream(path));

        document.open();
        
        float[] columnWidth = {1f,9f,9f,1f};
        PdfPTable titleTable = new PdfPTable(columnWidth);
        titleTable.setWidthPercentage(115f);
        String logopath = "C:\\Users\\USER\\OneDrive\\Desktop\\new_v_pack\\src\\Icons\\logo1.png";
        Image logo = Image.getInstance(logopath);

        PdfPCell cell0 = new PdfPCell(new Phrase("       "));
        cell0.setBackgroundColor(BaseColor.LIGHT_GRAY);
        cell0.setBorderColor(BaseColor.LIGHT_GRAY);
        titleTable.addCell(cell0);
    
        logo.setAlignment(Element.ALIGN_CENTER);
        PdfPCell cell1 = new PdfPCell(logo);
        cell1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        cell1.setBorderColor(BaseColor.LIGHT_GRAY);
        
        titleTable.addCell(cell1);
        Font detailsfont = FontFactory.getFont(FontFactory.COURIER_BOLD, 13, Font.ITALIC, BaseColor.BLACK);
        Paragraph Details = new Paragraph("\n\n\n\n V-Pack Compiter Solution\n Nupe    \n Matara    \n +94763010616    \n vpack_matara@gmail.com    \n  ",detailsfont);
        
        PdfPCell cell2 = new PdfPCell(new Phrase(Details));
        cell2.setHorizontalAlignment(Element.ALIGN_RIGHT);
        cell2.setBorderColor(BaseColor.LIGHT_GRAY);
        cell2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        
        titleTable.addCell(cell2);
        
        PdfPCell cell3 = new PdfPCell(new Phrase("       "));
        cell3.setBackgroundColor(BaseColor.LIGHT_GRAY);
        cell3.setBorderColor(BaseColor.LIGHT_GRAY);
        titleTable.addCell(cell3);
        
        document.add(titleTable);
        
        Font titlefont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 35, Font.BOLD, BaseColor.BLUE);
        Paragraph titleParagraph = new Paragraph("INVOICE\n", titlefont);
        titleParagraph.setAlignment(Element.ALIGN_CENTER);
        document.add(titleParagraph);

        document.add(new Paragraph("      "));
        
        PdfPTable invoicedeatils = new PdfPTable(4);
        invoicedeatils.setWidthPercentage(95f);
        Font invoicedeatilsfont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 13, Font.BOLD, BaseColor.BLACK);
//--------------------------------------------------------------------------------------------------------------
        PdfPCell cell_11 = new PdfPCell( new Phrase("Cashier Name\nCustomer NIC\nCustomer Name"));
        cell_11.setBorder(Rectangle.NO_BORDER);
        cell_11.setHorizontalAlignment(Element.ALIGN_CENTER);
        invoicedeatils.addCell(cell_11);
//--------------------------------------------------------------------------------------------------------------
        PdfPCell cell_12 = new PdfPCell( new Phrase(":  "+lblUsername.getText()+ "\n:  " + txtPOSCustomerNIC.getText() + "\n:  " + txtPOSCustomerName.getText()));
        cell_12.setBorder(Rectangle.NO_BORDER);
        cell_12.setHorizontalAlignment(Element.ALIGN_LEFT);
        invoicedeatils.addCell(cell_12);
//--------------------------------------------------------------------------------------------------------------
        PdfPCell cell_13 = new PdfPCell( new Phrase("Invoice Number\nData\nTime"));
        cell_13.setBorder(Rectangle.NO_BORDER);
        cell_13.setHorizontalAlignment(Element.ALIGN_CENTER);
        invoicedeatils.addCell(cell_13);
//--------------------------------------------------------------------------------------------------------------
        PdfPCell cell_14 = new PdfPCell( new Phrase(":  I000"+invoiceNO+ "\n:  " + getDate() + "\n: " + getTime()));
        cell_14.setBorder(Rectangle.NO_BORDER);
        cell_14.setHorizontalAlignment(Element.ALIGN_LEFT);
        invoicedeatils.addCell(cell_14);
//--------------------------------------------------------------------------------------------------------------

        document.add(invoicedeatils);
        
        document.add(new Paragraph("      \n     "));
        
        float[] ptwidth = {1f,8f,1.5f,3.5f,3.5f};
        
        PdfPTable producttable = new PdfPTable(ptwidth);
        
        PdfPCell pt_10 = new PdfPCell(new Phrase("#",invoicedeatilsfont));
        pt_10.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell pt_11 = new PdfPCell(new Phrase("Item",invoicedeatilsfont));
        pt_11.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell pt_12 = new PdfPCell(new Phrase("Qty",invoicedeatilsfont));
        pt_12.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell pt_13 = new PdfPCell(new Phrase("Price",invoicedeatilsfont));
        pt_13.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell pt_14 = new PdfPCell(new Phrase("Total",invoicedeatilsfont));
        pt_14.setHorizontalAlignment(Element.ALIGN_CENTER);
        
        producttable.addCell(pt_10);
        producttable.addCell(pt_11);
        producttable.addCell(pt_12);
        producttable.addCell(pt_13);
        producttable.addCell(pt_14);
        
        DefaultTableModel model = (DefaultTableModel)tabPOSItemTable.getModel();
        
        int row = tabPOSItemTable.getRowCount();
        System.out.println("Row count = " + row);
        try{
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < 7; j++) {
                switch (j) {
                    case 0 -> {
                        PdfPCell item0 = new PdfPCell(new Phrase(model.getValueAt(i, 0).toString()));
                        item0.setHorizontalAlignment(Element.ALIGN_RIGHT);
                        producttable.addCell(item0);
                    }
                    case 1 -> {
                        PdfPCell item1 = new PdfPCell(new Phrase(model.getValueAt(i, 1).toString()+ "\n( " +(Integer.parseInt(model.getValueAt(i, 2).toString()))/12  +"Years Warrenty )"));
                        producttable.addCell(item1);
                    }
                    case 3 -> {
                        PdfPCell item2 = new PdfPCell(new Phrase(model.getValueAt(i, 3).toString()));
                        item2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                        producttable.addCell(item2);
                    }
                    case 4 -> {
                        PdfPCell item3 = new PdfPCell(new Phrase(model.getValueAt(i, 4).toString()));
                        item3.setHorizontalAlignment(Element.ALIGN_RIGHT);
                        producttable.addCell(item3);
                    }
                    case 5 -> {
                        PdfPCell item4 = new PdfPCell(new Phrase(model.getValueAt(i, 5).toString()));
                        item4.setHorizontalAlignment(Element.ALIGN_RIGHT);
                        producttable.addCell(item4);
                    }
                    default -> {
                    }
                }
            }
        }
        }catch( NumberFormatException e ){
            JOptionPane.showMessageDialog(cmbDiscount, e);
        }
        
        PdfPCell total = new PdfPCell(new Phrase("Total Price", invoicedeatilsfont));
        total.setHorizontalAlignment(Element.ALIGN_CENTER);
        total.setColspan(4);
        
        producttable.addCell(total);
        
        PdfPCell totalprice = new PdfPCell(new Phrase(lblPOSTotalPrice.getText(), invoicedeatilsfont));
        totalprice.setHorizontalAlignment(Element.ALIGN_RIGHT);
        producttable.addCell(totalprice);
        
        document.add(producttable);
        
        document.add(new Paragraph("       \n       "));
        
        float[] finalWidth = {4f,1.2f};
        PdfPTable finalDataTable = new PdfPTable(finalWidth);

//--------------------------------------------------------------------------------------------------------------
        
        PdfPCell f_data_01 = new PdfPCell(new Phrase("                                                              Total Price"));
        f_data_01.setHorizontalAlignment(Element.ALIGN_CENTER);
        f_data_01.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_01);
        
        PdfPCell f_data_02 = new PdfPCell(new Phrase(lblPOSTotalPrice.getText()));
        f_data_02.setHorizontalAlignment(Element.ALIGN_RIGHT);
        f_data_02.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_02);
        
//--------------------------------------------------------------------------------------------------------------
        
        PdfPCell f_data_11 = new PdfPCell(new Phrase("                                                              Discount"));
        f_data_11.setHorizontalAlignment(Element.ALIGN_CENTER);
        f_data_11.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_11);
        
        PdfPCell f_data_13 = new PdfPCell(new Phrase(cmbDiscount.getSelectedItem().toString() + "  (" + lbldiscount.getText() + ")"));
        f_data_13.setHorizontalAlignment(Element.ALIGN_RIGHT);
        f_data_13.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_13);
        
//--------------------------------------------------------------------------------------------------------------

        PdfPCell f_data_21 = new PdfPCell(new Phrase("                                                              Sub Total"));
        f_data_21.setHorizontalAlignment(Element.ALIGN_CENTER);
        f_data_21.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_21);
        
        PdfPCell f_data_22 = new PdfPCell(new Phrase(lblPOSSubTotalPrice.getText()));
        f_data_22.setHorizontalAlignment(Element.ALIGN_RIGHT);
        f_data_22.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_22);
        
//--------------------------------------------------------------------------------------------------------------
        
        PdfPCell f_data_31 = new PdfPCell(new Phrase("                                                              Amount"));
        f_data_31.setHorizontalAlignment(Element.ALIGN_CENTER);
        f_data_31.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_31);
        
        PdfPCell f_data_32 = new PdfPCell(new Phrase(txtPOSPayAmount.getText()+ ".00"));
        f_data_32.setHorizontalAlignment(Element.ALIGN_RIGHT);
        f_data_32.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_32);
        
//--------------------------------------------------------------------------------------------------------------
        
        PdfPCell f_data_41 = new PdfPCell(new Phrase("                                                              Balance"));
        f_data_41.setHorizontalAlignment(Element.ALIGN_CENTER);
        f_data_41.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_41);
        
        PdfPCell f_data_42 = new PdfPCell(new Phrase(lblPOSChange.getText()));
        f_data_42.setHorizontalAlignment(Element.ALIGN_RIGHT);
        f_data_42.setBorder(Rectangle.NO_BORDER);
        finalDataTable.addCell(f_data_42);
        
//--------------------------------------------------------------------------------------------------------------
        document.add(finalDataTable);
        
        document.add(new Paragraph("      \n     "));
        
        PdfPTable validationData = new PdfPTable(3);
        
        Font signaturefont = FontFactory.getFont(FontFactory.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
        
        PdfPCell v_data_50 = new PdfPCell(new Phrase(".............................................\nCustomer Signature ", signaturefont));
        v_data_50.setHorizontalAlignment(Element.ALIGN_CENTER);
        v_data_50.setBorder(Rectangle.NO_BORDER);
        validationData.addCell(v_data_50);
        
        PdfPCell v_data_51 = new PdfPCell(new Phrase(""));
        v_data_51.setHorizontalAlignment(Element.ALIGN_CENTER);
        v_data_51.setBorder(Rectangle.NO_BORDER);
        validationData.addCell(v_data_51);
        
        PdfPCell v_data_52 = new PdfPCell(new Phrase(".............................................\nAuthorized Signature", signaturefont));
        v_data_52.setHorizontalAlignment(Element.ALIGN_CENTER);
        v_data_52.setBorder(Rectangle.NO_BORDER);
        validationData.addCell(v_data_52);
        
        document.add(validationData);
        
        document.add(new Paragraph("      \n     "));
        
        PdfPTable last = new PdfPTable(1);
        last.setWidthPercentage(100f);
        
        Font pfont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, Font.BOLD, BaseColor.BLACK);
        

        //Paragraph thank = new Paragraph(path);
        
        PdfPCell l_data_01 = new PdfPCell(new Phrase("==========================================================================\nTHIS IS YOUR OFFICIAL INVOICE"));     
        l_data_01.setBorder(Rectangle.NO_BORDER);
        l_data_01.setHorizontalAlignment(Element.ALIGN_CENTER);
        last.addCell(l_data_01);
        
        
        PdfPCell l_data_02 = new PdfPCell(new Phrase("Thank You Come Again..!",pfont));
        l_data_02.setBorder(Rectangle.NO_BORDER);
        l_data_02.setHorizontalAlignment(Element.ALIGN_CENTER);
        last.addCell(l_data_02);
        document.add(last);
        
        document.close();
        System.out.println("Create PDF Successfully.....!");
    }
    
    

    public static void main(String args[]) throws InterruptedException, FileNotFoundException, DocumentException, BadElementException, IOException {
        java.awt.EventQueue.invokeLater(() -> {
            new POS().setVisible(true);
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Frame;
    private javax.swing.JPanel Main_Item_panel;
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnCartRemove;
    private javax.swing.JButton btnCartUpdate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btngoHome;
    private static javax.swing.JComboBox<String> cmbDiscount;
    public static javax.swing.JComboBox<String> cmbPOSProduct;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCondition;
    public static javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblID;
    private static javax.swing.JLabel lblPOSChange;
    private static javax.swing.JLabel lblPOSSubTotalPrice;
    private static javax.swing.JLabel lblPOSTotalPrice;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuntity;
    public static javax.swing.JLabel lblTime;
    public static javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWarrenty;
    private static javax.swing.JLabel lbldiscount;
    private javax.swing.JSpinner spnPOSQuntity;
    private static javax.swing.JTable tabPOSItemTable;
    private javax.swing.JTextField txtFindItem;
    private static javax.swing.JTextField txtPOSCustomerNIC;
    private static javax.swing.JTextField txtPOSCustomerName;
    private static javax.swing.JTextField txtPOSPayAmount;
    // End of variables declaration//GEN-END:variables

}
