package proyectojava24;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;

public class Aplicacion extends javax.swing.JFrame {

    private String patron;

    public Aplicacion() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList11 = new javax.swing.JList<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList12 = new javax.swing.JList<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        jList13 = new javax.swing.JList<>();
        jScrollPane14 = new javax.swing.JScrollPane();
        jList14 = new javax.swing.JList<>();
        jScrollPane15 = new javax.swing.JScrollPane();
        jList15 = new javax.swing.JList<>();
        jScrollPane16 = new javax.swing.JScrollPane();
        jList16 = new javax.swing.JList<>();
        jScrollPane17 = new javax.swing.JScrollPane();
        jList17 = new javax.swing.JList<>();
        jScrollPane18 = new javax.swing.JScrollPane();
        jList18 = new javax.swing.JList<>();
        jScrollPane19 = new javax.swing.JScrollPane();
        jList19 = new javax.swing.JList<>();
        jScrollPane20 = new javax.swing.JScrollPane();
        jList20 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(1080, 700));
        setSize(new java.awt.Dimension(50, 50));
        setType(java.awt.Window.Type.POPUP);
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
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
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

        jLabel13.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel13AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 515, 20));

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

        jLabel24.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("Register a new person here");

        jTextField14.setText("Name");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextField13.setText("Surname");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField15.setText("Age");
        jTextField15.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField16.setText("Last place seen");
        jTextField16.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jFormattedTextField4.setText("Last time seen ");

        jTextField17.setText("My phone number");
        jTextField17.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jLabel25.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel25AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton3.setText("Register");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField15)
                            .addComponent(jTextField16)
                            .addComponent(jFormattedTextField4)
                            .addComponent(jTextField17, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(26, 26, 26)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jButton3.getAccessibleContext().setAccessibleParent(null);

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 700, 420));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel14.setText("Surname");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jList11.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList11.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "34", "71", "67", "63", "39", "15", "32", "26", "11", "38", "22", "72", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane11.setViewportView(jList11);

        jPanel5.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 40, 260));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel15.setText("Name ");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel16.setText("Age");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 29, -1));

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel17.setText("Sex");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 29, -1));

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel18.setText("Parents name");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 30));

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel19.setText("Height");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 45, -1));

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel20.setText("Eye color");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel21.setText("Last place seen");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel22.setText("Last time seen");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel23.setText("Contact information");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 60, -1, -1));

        jList12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList12.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Ahmad", "Ali Ali", "Farizeh", "Fatemeh", "Haleh", "Iliya", "Jalal", "Mahmood", "Mehziar", "Mosleholdin", "Sama", "Yousofali" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane12.setViewportView(jList12);

        jPanel5.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 260));

        jList13.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList13.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "M", "M", "F", "F", "F", "M", "M", "M", "M", "M", "F", "M", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane13.setViewportView(jList13);

        jPanel5.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 30, 260));

        jList14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList14.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Parvish ", "Bakhshi", "Ataai", "Armand", "Samadi", "Mirghafuri", "Habibi Gobaran", "Babayi", "Visi Nejhad", "Bagheri", "Samiran", "Tarasi", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane14.setViewportView(jList14);

        jPanel5.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 110, 260));

        jList15.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList15.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1,74", "1,77", "1,66", "1,64", "1,64", "1,72", "1,78", "1,82", "1,34", "1,71", "1,68", "1,71", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane15.setViewportView(jList15);

        jPanel5.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 40, 260));

        jList16.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList16.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Brown", "Brown", "Brown", "Brown", "Brown", "Brown", "Brown", "Brown", "Brown", "Brown", "Brown", "Brown", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane16.setViewportView(jList16);

        jPanel5.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 80, 260));

        jList17.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList17.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Isfahan Charmahin", "Karaj Fardis", "Tehran", "Shiraz Karandish terminal", "Tabriz", "Talesh", "West Azerbaijan Oshnavieh", "Zanjan", "Ahvaz Islamabad", "Shiraz Sardaran boulevard ", "Shiraz Maali Abad ", "Shahroud Dahmala", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane17.setViewportView(jList17);

        jPanel5.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 170, 260));

        jList18.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList18.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "July 1, 1993", "July 14, 2021", "August 13, 2011", "December 28, 2023", "April 22, 2021", "January 13, 2022", "August 13, 2022", "January 29, 2023", "January 1, 2020", "December 30, 2024", "July 16, 2022", "January 6, 2022", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane18.setViewportView(jList18);

        jPanel5.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 150, 260));

        jList19.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList19.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Hassan-Golbas", "Unknown", "Unknown", "Unknown", "Unknown", "Yahya", "Unknown", "Unknown", "Unknown", "Unknown", "Unknown", "Hosein Ali", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane19.setViewportView(jList19);

        jPanel5.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 110, 260));

        jList20.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jList20.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "(+98)09139373757", "(+98)09104551745", "(+98)09125657878", "(+98)09172001513", "(+98)093001947110", "(+98)09024753660", "(+98)09212581105", "@parmis.koorosh51", "(+98)09376088847", "(+98)09172541349", "(+98)09179689867", "(+98)02166884228", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane20.setViewportView(jList20);

        jPanel5.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 180, 260));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1030, 370));

        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 110, 60));

        jLabel26.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel26AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, 515, 20));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 8));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N

        jMenu1.setText("Find my people");

        jMenuItem9.setText("List by name (A-Z)");
        jMenuItem9.setActionCommand("");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuItem6.setText("Images");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Register new person");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem5.setText("Register a new person");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("About find my people");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        jPanel5.setVisible(true);
        jPanel12.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel12.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         boolean pasas = true;
        
        Pattern patron = Pattern.compile(jTextField1.getText(),Pattern.CASE_INSENSITIVE);
        Matcher frase = patron.matcher("Parvish \", \"Bakhshi\", \"Ataai\", \"Armand\", \"Samadi\", \"Mirghafuri\", \"Habibi Gobaran\", \"Babayi\", \"Visi Nejhad\", \"Bagheri\", \"Samiran\", \"Tarasi\"");
        boolean encontrado = frase.find();
        
        if(encontrado){
            pasas = true;
        }else{
            pasas = false;
             System.out.println("No data has been found!");
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
        jLabel13.setText("Thank you! Soon the contact of the person will be informed about your petition!");
        }else{
           pasas = false;
            jLabel14.setText("No data has been found!"); 
       }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jTextField1.setText("");
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        // TODO add your handling code here:
         jTextField2.setText("");
         
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        // TODO add your handling code here:
         jTextField5.setText("");
        
    }//GEN-LAST:event_jTextField5FocusGained

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        // TODO add your handling code here:
         jTextField6.setText("");
         
    }//GEN-LAST:event_jTextField6FocusGained

    private void jLabel13AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel13AncestorAdded
        // TODO add your handling code here:
        jPanel12.setVisible(false);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_jLabel13AncestorAdded

    private void jFormattedTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField3FocusGained
        // TODO add your handling code here:
        jFormattedTextField3.setText("");
        
    }//GEN-LAST:event_jFormattedTextField3FocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
        jPanel12.setVisible(false);
        jPanel5.setVisible(false);
        
    }//GEN-LAST:event_jPanel1FocusGained

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel12.setVisible(false);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel12.setVisible(true);
        jPanel5.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jPanel12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel12KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12KeyPressed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
        jTextField14.setText("");
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
        jTextField13.setText("");
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
        jTextField15.setText("");
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
        jTextField16.setText("");
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
        jTextField17.setText("");
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       //jLabel25.setText("Thank you! Soon your missing person will be added to the list!");
        boolean pasas = true;
        String phone = "[0-9+]";
        Pattern patron = Pattern.compile(phone,Pattern.CASE_INSENSITIVE);
        Matcher frase = patron.matcher(jTextField17.getText());
        boolean encontrado = frase.find();
        
        if(encontrado){
            pasas = true;
        }else{
            pasas = false;
            jLabel25.setText("Not a valid phone number!"); 
        }
        if(pasas == true){ 
            { //if(jTextField1.getText().contentEquals((CharSequence) jLabel4)){
           try{
            FileWriter miarchivo = new FileWriter("Register my people.txt",true);        
            miarchivo.write(jTextField14.getText()+"|"+jTextField13.getText()+"|"+jTextField15.getText()+"|"+jFormattedTextField4.getText()+"|"+jTextField16.getText()+jTextField17.getText()+"\n");     
            miarchivo.close();                                                   
        }catch(IOException e){                                                  
            e.printStackTrace(); 
        }   
       if(pasas == true){
           jTextField14.setText("");jTextField13.setText("");jTextField15.setText("");jFormattedTextField4.setText("");jTextField16.setText("");
        jLabel25.setText("Thank you! Soon your lost person will be added to our list!");
        }else{
           pasas = false;
            jLabel25.setText("Not a valid phone number!"); 
       }
            }
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel12FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel12FocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        boolean pasas = true;
        
        Pattern patron = Pattern.compile(jTextField1.getText(),Pattern.CASE_INSENSITIVE);
        Matcher frase = patron.matcher("Parvish \", \"Bakhshi\", \"Ataai\", \"Armand\", \"Samadi\", \"Mirghafuri\", \"Habibi Gobaran\", \"Babayi\", \"Visi Nejhad\", \"Bagheri\", \"Samiran\", \"Tarasi\"");
        boolean encontrado = frase.find();
        
        if(encontrado){
            pasas = true;
        }else{
            pasas = false;
            jLabel13.setText("No data has been found!"); 
             System.out.println("No data has been found!");
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
        jLabel13.setText("Thank you! Soon the contact of the person will be informed about your petition!");
        }else{
           pasas = false;
           jTextField2.setText("");jTextField1.setText("");jTextField5.setText("");jFormattedTextField3.setText("");jTextField6.setText("");
            jLabel26.setText("No data has been found!"); 
            System.out.println("No data has been found!");
       }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel26AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel26AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26AncestorAdded

    private void jLabel25AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel25AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25AncestorAdded

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLaf Cupertino Dark".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList11;
    private javax.swing.JList<String> jList12;
    private javax.swing.JList<String> jList13;
    private javax.swing.JList<String> jList14;
    private javax.swing.JList<String> jList15;
    private javax.swing.JList<String> jList16;
    private javax.swing.JList<String> jList17;
    private javax.swing.JList<String> jList18;
    private javax.swing.JList<String> jList19;
    private javax.swing.JList<String> jList20;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
