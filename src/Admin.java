
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;


public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_pass = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        btn_ekleme = new javax.swing.JButton();
        btn_guncelleme = new javax.swing.JButton();
        btn_silme = new javax.swing.JButton();
        btn_listele = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtbox_pass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textbox_ad = new javax.swing.JTextField();
        textbox_tc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        button_listele = new javax.swing.JButton();
        button_sil = new javax.swing.JButton();
        button_guncelle = new javax.swing.JButton();
        button_ekle = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txt_dersler = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_ad = new javax.swing.JTextField();
        b_liste = new javax.swing.JButton();
        b_ekle = new javax.swing.JButton();
        b_guncelle = new javax.swing.JButton();
        b_sil = new javax.swing.JButton();
        btn_uyari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ÖĞRETMEN EKLELME");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "TC", "AD SOYAD", "ŞİFRE"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btn_ekleme.setText("EKLE");
        btn_ekleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eklemeActionPerformed(evt);
            }
        });

        btn_guncelleme.setText("GÜNCELLE");
        btn_guncelleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncellemeActionPerformed(evt);
            }
        });

        btn_silme.setText("SİL");
        btn_silme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silmeActionPerformed(evt);
            }
        });

        btn_listele.setText("LİSTELE");
        btn_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listeleActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ad Soyad:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ŞİFRE:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TC");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ŞİFRE:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TC");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ad Soyad:");

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setForeground(new java.awt.Color(0, 51, 51));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ÖĞRENCİ EKLELME");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        button_listele.setText("LİSTELE");
        button_listele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_listeleActionPerformed(evt);
            }
        });

        button_sil.setText("SİL");
        button_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_silActionPerformed(evt);
            }
        });

        button_guncelle.setText("GÜNCELLE");
        button_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_guncelleActionPerformed(evt);
            }
        });

        button_ekle.setText("EKLE");
        button_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ekleActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "TC", "AD SOYAD", "ŞİFRE"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel5.setForeground(new java.awt.Color(0, 51, 51));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DERS EKLELME");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "DERSLER"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        txt_dersler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_derslerActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DERS:");

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GERİYE GİT");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        b_liste.setText("LİSTELE");
        b_liste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_listeActionPerformed(evt);
            }
        });

        b_ekle.setText("EKLE");
        b_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ekleActionPerformed(evt);
            }
        });

        b_guncelle.setText("GÜNCELLE");
        b_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_guncelleActionPerformed(evt);
            }
        });

        b_sil.setText("SİL");
        b_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_silActionPerformed(evt);
            }
        });

        btn_uyari.setText("Uyarı");
        btn_uyari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uyariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btn_ekleme, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_guncelleme)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_silme, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_listele))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_ad)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(98, 98, 98))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btn_uyari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_dersler, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(135, 135, 135)
                                                .addComponent(b_liste, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
                                        .addGap(53, 53, 53))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(b_ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b_guncelle)
                                        .addGap(18, 18, 18)
                                        .addComponent(b_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(150, 150, 150)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel5)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtbox_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textbox_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(textbox_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(button_guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_listele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tc, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(txt_ad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ekleme)
                            .addComponent(btn_guncelleme)
                            .addComponent(btn_silme)
                            .addComponent(btn_listele))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btn_uyari))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textbox_tc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textbox_ad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(4, 4, 4)
                                .addComponent(txtbox_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(button_ekle)
                                    .addComponent(button_guncelle))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(button_sil)
                                    .addComponent(button_listele))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(b_liste))
                                .addGap(24, 24, 24)
                                .addComponent(txt_dersler, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(b_ekle)
                                    .addComponent(b_guncelle)
                                    .addComponent(b_sil))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_silmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silmeActionPerformed
    
         DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int indix=jTable1.getSelectedRow();
        int id=Integer.parseInt(model.getValueAt(indix, 0).toString());
         try{ 
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
       
                
            PreparedStatement pr;
         
            pr =con.prepareStatement("delete from ogretmen_tablo where id_ogretmen=?");
             
            pr.setInt(1, id);
      
         pr.executeUpdate();
         JOptionPane.showMessageDialog(null, "BAŞARILI");
        
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_silmeActionPerformed

    private void button_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_silActionPerformed
       
         DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        int indix=jTable2.getSelectedRow();
        int id=Integer.parseInt(model.getValueAt(indix, 0).toString());
         try{ 
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
       
                
            PreparedStatement pr;
         
            pr =con.prepareStatement("delete from ogrenci_tablo where id_ogrenci=?");
             
            pr.setInt(1, id);
      
         pr.executeUpdate();
         JOptionPane.showMessageDialog(null, "BAŞARILI");
        
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_button_silActionPerformed

    private void txt_derslerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_derslerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_derslerActionPerformed

    private void btn_eklemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eklemeActionPerformed
     
         try{ 
             Class.forName("com.mysql.jdbc.Driver");
              Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
         String insert="INSERT INTO ogretmen_tablo(ogretmen_tc,ogretmen_adsoyad,ogretmen_password) values(?,?,?)";
        PreparedStatement pst=con.prepareStatement(insert);
         pst.setString(1,txt_tc.getText());
         pst.setString(2,txt_ad.getText());
         pst.setString(3,txt_pass.getText());
      
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null, "EKLEME BAŞARILI");
       
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
         
                  
    }//GEN-LAST:event_btn_eklemeActionPerformed

    private void btn_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listeleActionPerformed
        
        try{
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
           
            PreparedStatement pst=con.prepareStatement("SELECT * FROM ogretmen_tablo");
           ResultSet rs= pst.executeQuery();
           
            
            DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
            df.setRowCount(0);
            while(rs.next())
            {
             Object o[]={rs.getInt("id_ogretmen"),rs.getString("ogretmen_tc"),rs.getString("ogretmen_adsoyad"),rs.getString("ogretmen_password")};
             df.addRow(o);
            }
       }catch(Exception e)
       {
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_btn_listeleActionPerformed

    private void btn_guncellemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncellemeActionPerformed
      
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int indix=jTable1.getSelectedRow();
        int id=Integer.parseInt(model.getValueAt(indix, 0).toString());
         try{ 
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
        
            PreparedStatement pr;
         
            pr =con.prepareStatement("update ogretmen_tablo set ogretmen_tc='"+txt_tc.getText()+"',ogretmen_adsoyad='"+txt_ad.getText()+"',ogretmen_password='"+txt_pass.getText()+"' where id_ogretmen=?  ");
             
            pr.setInt(1, id);
      
         pr.executeUpdate();
         JOptionPane.showMessageDialog(null, "BAŞARILI");
        
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
         
    }//GEN-LAST:event_btn_guncellemeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int selectedRowIndex=jTable1.getSelectedRow();
        txt_tc.setText(model.getValueAt(selectedRowIndex,1).toString());
        txt_ad.setText(model.getValueAt(selectedRowIndex,2).toString());
        txt_pass.setText(model.getValueAt(selectedRowIndex,3).toString());
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          setVisible(false);
             AnaSayfa object=new AnaSayfa();
             object.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ekleActionPerformed
         try{ 
             Class.forName("com.mysql.jdbc.Driver");
              Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
         String insert="INSERT INTO ogrenci_tablo(ogrenci_tc,ogrenci_adsoyad,ogrenci_password) values(?,?,?)";
        PreparedStatement pst=con.prepareStatement(insert);
         pst.setString(1,textbox_tc.getText());
         pst.setString(2,textbox_ad.getText());
         pst.setString(3,txtbox_pass.getText());
      
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null, "EKLEME BAŞARILI");
       
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_button_ekleActionPerformed

    private void button_listeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_listeleActionPerformed
        // TODO add your handling code here:
        try{
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
           // String sql="SELECT * FROM ogrenci_tablo";
            PreparedStatement pst=con.prepareStatement("SELECT * FROM ogrenci_tablo");
           ResultSet rs= pst.executeQuery();
           
            
            DefaultTableModel df=(DefaultTableModel)jTable2.getModel();
            df.setRowCount(0);
            while(rs.next())
            {
             Object o[]={rs.getInt("id_ogrenci"),rs.getString("ogrenci_tc"),rs.getString("ogrenci_adsoyad"),rs.getString("ogrenci_password")};
             df.addRow(o);
            }
       }catch(Exception e)
       {
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_button_listeleActionPerformed

    private void button_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_guncelleActionPerformed
      
        DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        int indix=jTable2.getSelectedRow();
        int id=Integer.parseInt(model.getValueAt(indix, 0).toString());
         try{ 
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
        
            PreparedStatement pr;
         
            pr =con.prepareStatement("update ogrenci_tablo set ogrenci_tc='"+textbox_tc.getText()+"',ogrenci_adsoyad='"+textbox_ad.getText()+"',ogrenci_password='"+txtbox_pass.getText()+"' where id_ogrenci=?  ");
             
            pr.setInt(1, id);
      
         pr.executeUpdate();
         JOptionPane.showMessageDialog(null, "BAŞARILI");
        
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
         
    }//GEN-LAST:event_button_guncelleActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
         DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
        int selectedRowIndex=jTable2.getSelectedRow();
        textbox_tc.setText(model.getValueAt(selectedRowIndex,1).toString());
        textbox_ad.setText(model.getValueAt(selectedRowIndex,2).toString());
        txtbox_pass.setText(model.getValueAt(selectedRowIndex,3).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void b_listeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_listeActionPerformed
           try{
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
           
            PreparedStatement pst=con.prepareStatement("SELECT * FROM ders_tablo");
           ResultSet rs= pst.executeQuery();
           
            
            DefaultTableModel df=(DefaultTableModel)jTable3.getModel();
            df.setRowCount(0);
            while(rs.next())
            {
             Object o[]={rs.getInt("id_ders"),rs.getString("ders")};
             df.addRow(o);
            }
       }catch(Exception e)
       {
             JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_b_listeActionPerformed

    private void b_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ekleActionPerformed
        // TODO add your handling code here:
          try{ 
             Class.forName("com.mysql.jdbc.Driver");
              Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
         String insert="INSERT INTO ders_tablo(ders) values(?)";
        PreparedStatement pst=con.prepareStatement(insert);
         pst.setString(1,txt_dersler.getText());
        
      
         pst.executeUpdate();
         JOptionPane.showMessageDialog(null, "EKLEME BAŞARILI");
       
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_b_ekleActionPerformed

    private void b_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_guncelleActionPerformed
        
        DefaultTableModel model=(DefaultTableModel)jTable3.getModel();
        int indix=jTable3.getSelectedRow();
        int id=Integer.parseInt(model.getValueAt(indix, 0).toString());
         try{ 
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
        
            PreparedStatement pr;
         
            pr =con.prepareStatement("update ders_tablo set ders='"+txt_dersler.getText()+"' where id_ders=?  ");
             
            pr.setInt(1, id);
      
         pr.executeUpdate();
         JOptionPane.showMessageDialog(null, "BAŞARILI");
        
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_b_guncelleActionPerformed

    private void b_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_silActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable3.getModel();
        int indix=jTable3.getSelectedRow();
        int id=Integer.parseInt(model.getValueAt(indix, 0).toString());
         try{ 
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/sorubanka_database?useTimezone=true&serverTimezone=UTC","root","01A06m0550alp.");
       
                
            PreparedStatement pr;
         
            pr =con.prepareStatement("delete from ders_tablo where id_ders=?");
             
            pr.setInt(1, id);
      
         pr.executeUpdate();
         JOptionPane.showMessageDialog(null, "BAŞARILI");
        
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_b_silActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        DefaultTableModel model=(DefaultTableModel)jTable3.getModel();
        int selectedRowIndex=jTable3.getSelectedRow();
        txt_dersler.setText(model.getValueAt(selectedRowIndex,1).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    private void btn_uyariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uyariActionPerformed
        setVisible(false);
             Uyari object=new Uyari();
             object.setVisible(true);
    }//GEN-LAST:event_btn_uyariActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_ekle;
    private javax.swing.JButton b_guncelle;
    private javax.swing.JButton b_liste;
    private javax.swing.JButton b_sil;
    private javax.swing.JButton btn_ekleme;
    private javax.swing.JButton btn_guncelleme;
    private javax.swing.JButton btn_listele;
    private javax.swing.JButton btn_silme;
    private javax.swing.JButton btn_uyari;
    private javax.swing.JButton button_ekle;
    private javax.swing.JButton button_guncelle;
    private javax.swing.JButton button_listele;
    private javax.swing.JButton button_sil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField textbox_ad;
    private javax.swing.JTextField textbox_tc;
    private javax.swing.JTextField txt_ad;
    private java.awt.TextField txt_dersler;
    private javax.swing.JTextField txt_pass;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txtbox_pass;
    // End of variables declaration//GEN-END:variables
}
