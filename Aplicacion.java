package proyectoNavidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class Aplicacion extends javax.swing.JFrame {
    
    Connection con;
    Conexion con1 = new Conexion();
    Connection conet;
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
    int idc;
    
    private String patron;
    public Connection getConnection() {
            
        return con;
            
        }

    public Aplicacion() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel12.setVisible(false);
        jPanel6.setVisible(false);
        setLocationRelativeTo(null);
        consultar();
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/findmypeople" ,"findmypeople", "findmypeople");
         }   catch (Exception e) {
              System.err.println("there could have not been made a connection to the database. Error: "+e);
         }  
        
    
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel27 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jTextField17 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jFormattedTextField1.setText("jFormattedTextField1");

        jFormattedTextField2.setText("jFormattedTextField2");

        jLabel2.setText("jLabel2");

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Surname");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 98, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Name ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 53, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Age");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 194, 29, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Sex");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 237, 29, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Height");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, 45, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Your contact information");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 204, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel10.setText("Last place seen");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setText("Last time seen");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 90, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setText("Eye color");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 278, -1, -1));

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton2.setText("Register!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Register a new person");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 6, 245, -1));

        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 94, -1, -1));

        jTextField4.setText("jTextField3");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 142, -1, -1));

        jTextField7.setText("jTextField3");
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jTextField8.setText("jTextField3");
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 190, -1, -1));

        jTextField9.setText("jTextField3");
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 49, -1, -1));

        jTextField10.setText("jTextField3");
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jTextField11.setText("jTextField3");
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jTextField12.setText("jTextField3");
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Find My People");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1080, 680));
        setMinimumSize(new java.awt.Dimension(1080, 680));
        setPreferredSize(new java.awt.Dimension(1080, 680));
        setSize(new java.awt.Dimension(1080, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("Surname");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 108, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("I´ve found this person!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 220, -1));

        jTextField2.setText("Name");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 91, -1));

        jTextField5.setText("Place seen");
        jTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 194, -1));

        jTextField6.setText("My phone number");
        jTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 194, -1));

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1907, 638, 109, 60));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jFormattedTextField3.setText("Time seen");
        jFormattedTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField3FocusGained(evt);
            }
        });
        getContentPane().add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 197, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Ahmad", "Parvish", "34", "M", "Hassan-Golbas", "1,74", "Brown", "Isfahan Charmahin", "01/07/1993", "(+98)09139373757"},
                {"Ali Ali", "Bakhshi", "71", "M", "Unknown", "1,77", "Brown", "Karaj Fardis", "14/07/2021", "(+98)09104551745"},
                {"Farizeh ", "Ataai", "67", "F", "Unknown", "1,66", "Brown", "Tehran", "13/08/2011", "(+98)09125657878"},
                {"Fatemeh", "Armand", "63", "F", "Unknown", "1,64", "Brown", "Shiraz Karandish terminal", "28/12/2023", "(+98)09172001513"},
                {"Haleh", "Samadi", "39", "F", "Unknown", "1,64", "Brown", "Tabriz", "22/04/2021", "(+98)093001947110"},
                {"Iliya ", "Mirghafuri", "15", "M", "Yahya", "1,72", "Brown", "Talesh", "13/01/2022", "(+98)09024753660"},
                {"Jalal", "Habibi Gobaran", "32", "M", "Unknown", "1,78", "Brown", "West Azerbaijan Oshnavieh", "13/08/2022", "(+98)09212581105"},
                {"Mahmood", "Babayi", "26", "M", "Unknown", "1,82", "Brown", "Zanjan", "29/01/2023", "@parmis.koorosh51"},
                {"Mehziar", "Visi Nejhad", "11", "M", "Unknown", "1,34", "Brown", "Ahvaz Islamabad", "01/01/2020", "(+98)09376088847"},
                {"Mosleholdin", "Bagheri", "38", "M", "Unknown", "1,71", "Brown", "Shiraz Sardaran boulevard ", "30/12/2024", "(+98)09172541349"},
                {"Sama ", "Samiran", "22", "F", "Unknown", "1,68", "Brown", "Shiraz Maali Abad ", "16/07/2022", "(+98)09179689867"},
                {"Yousofali", "Tarasi", "72", "M", "Hosein Ali", "1,71", "Brown", "Shahroud Dahmala", "06/01/2022", "(+98)02166884228"}
            },
            new String [] {
                "Name", "Surname", "Age", "Sex", "Parents name", "Height", "Eye color", "Last place seen", "Last time seen", "Contact information"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Name");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Surname");
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Age");
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Sex");
            jTable1.getColumnModel().getColumn(4).setHeaderValue("Parents name");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Height");
            jTable1.getColumnModel().getColumn(6).setHeaderValue("Eye color");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Last place seen");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Last time seen");
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setHeaderValue("Contact information");
        }

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1030, 260));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1050, 400));

        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 110, 60));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 470, 1120, -1));

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setName(""); // NOI18N
        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField18.setText("Name");
        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 77, 127, -1));

        jTextField19.setText("Surname");
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 111, 127, -1));

        jTextField20.setText("Age");
        jTextField20.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 151, 127, -1));

        jTextField21.setText("Last place seen");
        jTextField21.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 270, 127, -1));

        jFormattedTextField5.setText("Last time seen ");
        jPanel6.add(jFormattedTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 230, 127, -1));

        jLabel27.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel27.setText("Search the persons information here...");
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 385, 58));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel6.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 190, -1, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 318, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 360));

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel12FocusGained(evt);
            }
        });
        jPanel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel12KeyPressed(evt);
            }
        });
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel24.setText("Register a new person here");
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 277, 59));

        jTextField14.setText("Name");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 73, 201, -1));

        jTextField13.setText("Surname");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 107, 201, -1));

        jTextField15.setText("Eye color");
        jTextField15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 201, -1));

        jTextField16.setText("Last place seen");
        jTextField16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 201, -1));

        jFormattedTextField4.setText("Last time seen ");
        jPanel12.add(jFormattedTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 201, -1));

        jTextField17.setText("My phone number");
        jTextField17.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 201, -1));

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-register-64.png")); // NOI18N
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 200, 110));

        jTextField22.setText("Parents name");
        jTextField22.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 201, -1));

        jTextField23.setText("Age");
        jTextField23.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 147, 201, -1));

        jTextField24.setText("Sex");
        jTextField24.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField24ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 201, -1));

        jTextField25.setText("Height");
        jTextField25.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 201, -1));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1030, 410));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 110));

        jMenuBar1.setBackground(new java.awt.Color(51, 204, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 8));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-asia-64.png")); // NOI18N
        jMenu1.setText("Find my people");
        jMenu1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem9.setBackground(new java.awt.Color(51, 204, 0));
        jMenuItem9.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-list-50.png")); // NOI18N
        jMenuItem9.setText("List by name (A-Z)");
        jMenuItem9.setActionCommand("");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem6.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-portrait-50.png")); // NOI18N
        jMenuItem6.setText("Images");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(255, 0, 0));
        jMenuItem7.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-search-50.png")); // NOI18N
        jMenuItem7.setText("Search");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-clothing-51.png")); // NOI18N
        jMenu2.setText("Register ");
        jMenu2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-register-30.png")); // NOI18N
        jMenuItem5.setText("Register a new person");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-dove-64.png")); // NOI18N
        jMenu4.setText("About find my people");
        jMenu4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N

        jMenuItem8.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-middle-east-30.png")); // NOI18N
        jMenuItem8.setText("About the application");
        jMenu4.add(jMenuItem8);

        jMenuItem10.setIcon(new javax.swing.ImageIcon("C:\\Users\\delba\\OneDrive\\Desktop\\Curso java\\ProyectoJava24\\logos\\icons8-writer-50.png")); // NOI18N
        jMenuItem10.setText("About the autor");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>                        

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel12.setVisible(false);
    }                                          

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        
    }                                           

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        
    }                                           

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
      
    }                                           

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        
    }                                           

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         boolean pasas = true;
        
        Pattern patron = Pattern.compile(jTextField1.getText(),Pattern.CASE_INSENSITIVE);
        Matcher frase = patron.matcher("Parvish \", \"Bakhshi\", \"Ataai\", \"Armand\", \"Samadi\", \"Mirghafuri\", \"Habibi Gobaran\", \"Babayi\", \"Visi Nejhad\", \"Bagheri\", \"Samiran\", \"Tarasi\"");
        boolean encontrado = frase.find();
        
        if(encontrado){
            pasas = true;
        }else{
            pasas = false;
             JOptionPane.showMessageDialog(rootPane, "No data has been found!");
        }
        if(pasas == true){ 
            { //if(jTextField1.getText().contentEquals((CharSequence) jLabel4)){
           try{
            FileWriter miarchivo = new FileWriter("Find my people.txt",true);        
            miarchivo.write(jTextField2.getText()+"|"+jTextField1.getText()+"|"+jTextField5.getText()+"|"+jFormattedTextField3.getText()+"|"+jTextField6.getText()+"\n");     
            miarchivo.close();                                                   
        }catch(IOException e){                                                  
            e.printStackTrace(); 
        }   
       if(pasas == true){
           jTextField2.setText("");jTextField1.setText("");jTextField5.setText("");jFormattedTextField3.setText("");jTextField6.setText("");
           
        //jLabel13.setText("Thank you! Soon the contact of the person will be informed about your petition!");
        }else{
           pasas = false;
            JOptionPane.showMessageDialog(rootPane, "No data has been found!");
       }
            }
        }
    }                                        
    
    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
        jTextField1.setText("");
        
    }                                       

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
         jTextField2.setText("");
         
    }                                       

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
         jTextField5.setText("");
        
    }                                       

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {                                        
        // TODO add your handling code here:
         jTextField6.setText("");
         
    }                                       

    private void jFormattedTextField3FocusGained(java.awt.event.FocusEvent evt) {                                                 
        // TODO add your handling code here:
        jFormattedTextField3.setText("");
        jPanel6.setVisible(false);
        
    }                                                

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
      jPanel6.setVisible(false);
    }                                        

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        jPanel12.setVisible(false);
        jPanel5.setVisible(false);
        
    }                                   

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel12.setVisible(false);
        jPanel6.setVisible(false);
    }                                      

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel12.setVisible(true);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
    }                                          

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        boolean pasas = true;
        
        Pattern patron = Pattern.compile(jTextField1.getText(),Pattern.CASE_INSENSITIVE);
        Matcher frase = patron.matcher("Parvish \", \"Bakhshi\", \"Ataai\", \"Armand\", \"Samadi\", \"Mirghafuri\", \"Habibi Gobaran\", \"Babayi\", \"Visi Nejhad\", \"Bagheri\", \"Samiran\", \"Tarasi\"");
        boolean encontrado = frase.find();
        
        if(encontrado){
            pasas = true;
        }else{
            pasas = false;
            JOptionPane.showMessageDialog(rootPane, "No data has been found!");

        }
        if(pasas == true){ 
            { 
           try{
            FileWriter miarchivo = new FileWriter("Find my people.txt",true);        
            miarchivo.write(jTextField2.getText()+"|"+jTextField1.getText()+"|"+jTextField5.getText()+"|"+jFormattedTextField3.getText()+"|"+jTextField6.getText()+"\n");     
            miarchivo.close();                                                   
        }catch(IOException e){                                                  
            e.printStackTrace(); 
        }   
       if(pasas == true){
           jTextField2.setText("");jTextField1.setText("");jTextField5.setText("");jFormattedTextField3.setText("");jTextField6.setText("");
           JOptionPane.showMessageDialog(rootPane, "Thank you! Soon the contact of the person will be informed about your petition!");
        }else{
           pasas = false;
           jTextField2.setText("");jTextField1.setText("");jTextField5.setText("");jFormattedTextField3.setText("");jTextField6.setText("");
            JOptionPane.showMessageDialog(rootPane, "No data has been found!");
       }
            }
        }
    }                                        

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jPanel5.setVisible(true);
        jPanel12.setVisible(false);
        jPanel6.setVisible(false);

    }                                          

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        jPanel6.setVisible(true);
        jPanel1.setVisible(false);
        jPanel12.setVisible(false);
        jPanel5.setVisible(false);
        
        
    }                                          

    private void jPanel12KeyPressed(java.awt.event.KeyEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void jPanel12FocusGained(java.awt.event.FocusEvent evt) {                                     
        // TODO add your handling code here:
        jPanel6.setVisible(false);
    }                                    

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String nam = jTextField14.getText();
        String sur = jTextField13.getText();
        String age = jTextField23.getText();
        String pan = jTextField24.getText();
        String hei = jTextField25.getText();
        String eye = jTextField15.getText();
        String place = jTextField16.getText();
        String time = jFormattedTextField4.getText();
        String phon = jTextField17.getText();
        try {
            if (nam.equals("") || sur.equals("") || age.equals("")) {
                JOptionPane.showMessageDialog(null, "Some fields are empty");
                
            } else {
            String sql = "insert into findmypeople_sql_1(Name, Surname, Age, Sex, Parents name, Height, Eye color, Last place seen, Last time seen, Contact information) values ('"+nam+"','"+sur+"','"+age+"','"+pan+"','"+hei+"','"+eye+"','"+place+"','"+time+"','"+phon+"')";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/findmypeople_sql_1" ,"findmypeople", "findmypeople");
            Statement peticion = (Statement) conexion.createStatement();
            peticion.execute("INSERT INTO people Values ('"+nam+"','"+sur+"','"+age+"','"+pan+"','"+hei+"','"+eye+"','"+place+"','"+time+"','"+phon+"')");
            JOptionPane.showMessageDialog(null,"The new data has been saved successfully");
            }
        } catch (Exception e) {
            
        }
        boolean pasas = true;
        String phone = "[0-9+]";
        Pattern patron = Pattern.compile(phone,Pattern.CASE_INSENSITIVE);
        Matcher frase = patron.matcher(jTextField17.getText());
        
        boolean encontrado = frase.find();

        if(encontrado){
            pasas = true;
            
        }else{
            pasas = false;
            JOptionPane.showMessageDialog(rootPane, "Not a valid phone number!");
           
        }
        if(pasas == true){
            { 
                try{
                    FileWriter miarchivo = new FileWriter("Register my people.txt",true);
                    miarchivo.write(jTextField14.getText()+"|"+jTextField13.getText()+"|"+jTextField15.getText()+"|"+jFormattedTextField4.getText()+"|"+jTextField16.getText()+jTextField17.getText()+"\n");
                    miarchivo.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
                if(pasas == true){
                    
                    JOptionPane.showMessageDialog(rootPane, "Thank you! Soon your lost person will be added to our list!");
                    
                    
                    Registrar();

                }else{
                    pasas = false;
                }
            }
        }
    }                                        

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        jTextField17.setText("");
    }                                            

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        jTextField16.setText("");
    }                                            

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        jTextField15.setText("");
    }                                            

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        
    }                                            

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        jTextField14.setText("");
    }                                            

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel12.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
    }                                      

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         jTextField21.setText("");
    }                                            

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         jTextField20.setText("");
    }                                            

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         jTextField19.setText("");
    }                                            

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         jTextField18.setText("");
    }                                            

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String longaniza = "" ;
     try{
            File miotroarchivo = new File("Find my people.txt");
            Scanner lector = new Scanner(miotroarchivo);
            while(lector.hasNextLine());
              longaniza += lector.nextLine()+"\n";
              
     }  catch(IOException e){
         e.printStackTrace();
        }
     
    }                                        

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         jTextField22.setText("");
    }                                            

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         jTextField23.setText("");
    }                                            

    private void jTextField24ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         jTextField24.setText("");
    }                                            

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
         jTextField25.setText("");
    }                                            

    
    public static void main(String args[]) {
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/findmypeople" ,"findmypeople", "findmypeople");
            Statement peticion = conexion.createStatement();
            ResultSet resultado = peticion.executeQuery("SELECT * FROM findmypeople_sql_1");
            while(resultado.next()){
  
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try {
             UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
             
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Aplicacion().setVisible(true);
                
            }
        });
    }
    
    void consultar() {
        String sql = "select * FROM `findmypeople_sql_1`";
        
        try {
           conet = con1.getConnection();
           st = conet.createStatement();
           rs = st.executeQuery(sql);
           Object[] findmypeople_sql_1 = new Object [10];
           modelo = (DefaultTableModel) jTable1.getModel();
           while (rs.next()){
               
               findmypeople_sql_1 [1] = rs.getString("Name");
               findmypeople_sql_1 [2] = rs.getString("Surname");
               findmypeople_sql_1 [3] = rs.getInt("Age");
               findmypeople_sql_1 [4] = rs.getString("Sex");
               findmypeople_sql_1 [5] = rs.getString("Parents name");
               findmypeople_sql_1 [6] = rs.getString("Height");
               findmypeople_sql_1 [7] = rs.getString("Eye color");
               findmypeople_sql_1 [8] = rs.getString("Last place seen");
               findmypeople_sql_1 [9] = rs.getString("Last time seen");
               findmypeople_sql_1 [10] = rs.getString("Contact information");
               
               modelo.addRow(findmypeople_sql_1);
               
           }
           jTable1.setModel(modelo);
        } catch (Exception e) {
    }
    }
    
    void Registrar(){
        String nam = jTextField14.getText();
        String sur = jTextField13.getText();
        String age = jTextField23.getText();
        String pan = jTextField24.getText();
        String hei = jTextField25.getText();
        String eye = jTextField15.getText();
        String place = jTextField16.getText();
        String time = jFormattedTextField4.getText();
        String phon = jTextField17.getText();
        
        try {
            if (nam.equals("") || sur.equals("") || age.equals("")) {
                JOptionPane.showMessageDialog(null, "Some fields are empty");
                
            } else {
            String sql = "insert into findmypeople_sql_1(Name, Surname, Age, Sex, Parents name, Height, Eye color, Last place seen, Last time seen, Contact information) values ('"+nam+"','"+sur+"','"+age+"','"+pan+"','"+hei+"','"+eye+"','"+place+"','"+time+"','"+phon+"')";
            conet = con1.getConnection();
            st = conet.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"The new data has been saved successfully");
            }
        } catch (Exception e) {
            
        }
                
    }
    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
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
    // End of variables declaration                   
}

