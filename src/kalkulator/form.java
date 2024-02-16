
package kalkulator;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class form extends javax.swing.JFrame {

    
    public form() {
        initComponents();
    }

    proses model =  new proses();
    String angka="";
    
    public void getNumber(javax.swing.JButton button){
        angka+=button.getText();
        model.setNumber(angka);
        hasil.setText(angka);
        proses.setText(angka);
    }
    
    private void getOperator(int opt){
        model.setOperator(opt);
        angka="";
    }
    
    private void proses(){
        DecimalFormat df = new DecimalFormat("#,####.######");
            model.process();
           angka="";
            //menampilkan hasil perhitungan dihasil
            hasil.setText(df.format(model.getResult())+"");
            //menampilkan process perhitungan dilabel process
            proses.setText(df.format(model.angka3)+""+model.process+""
                    +(df.format(model.angka2)+"="+(model.result)));
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSMaterialButtonRectangleBeanInfo1 = new rojerusan.RSMaterialButtonRectangleBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hasil = new javax.swing.JTextField();
        proses = new javax.swing.JLabel();
        btn8 = new rojerusan.RSMaterialButtonCircle();
        btn9 = new rojerusan.RSMaterialButtonCircle();
        btn4 = new rojerusan.RSMaterialButtonCircle();
        btn5 = new rojerusan.RSMaterialButtonCircle();
        btn6 = new rojerusan.RSMaterialButtonCircle();
        btn1 = new rojerusan.RSMaterialButtonCircle();
        btn7 = new rojerusan.RSMaterialButtonCircle();
        btn3 = new rojerusan.RSMaterialButtonCircle();
        btn0 = new rojerusan.RSMaterialButtonCircle();
        btn00 = new rojerusan.RSMaterialButtonCircle();
        btntitik = new rojerusan.RSMaterialButtonCircle();
        btn2 = new rojerusan.RSMaterialButtonCircle();
        btnsamadengan = new rojerusan.RSMaterialButtonRectangle();
        btntambah = new rojerusan.RSMaterialButtonRectangle();
        btndelete = new rojerusan.RSMaterialButtonRectangle();
        btnkurrang = new rojerusan.RSMaterialButtonRectangle();
        btnclear = new rojerusan.RSMaterialButtonRectangle();
        btnkali = new rojerusan.RSMaterialButtonRectangle();
        btnbagi = new rojerusan.RSMaterialButtonRectangle();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("FORM_KALKULATOR");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 3, 24)); // NOI18N
        jLabel1.setText("KALKULATOR");

        hasil.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hasil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        hasil.setText("0");

        proses.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        proses.setText("PROSES");

        btn8.setBackground(new java.awt.Color(204, 204, 204));
        btn8.setForeground(new java.awt.Color(0, 0, 0));
        btn8.setText("8");
        btn8.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(204, 204, 204));
        btn9.setForeground(new java.awt.Color(0, 0, 0));
        btn9.setText("9");
        btn9.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 204, 204));
        btn4.setForeground(new java.awt.Color(0, 0, 0));
        btn4.setText("4");
        btn4.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 204, 204));
        btn5.setForeground(new java.awt.Color(0, 0, 0));
        btn5.setText("5");
        btn5.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 204, 204));
        btn6.setForeground(new java.awt.Color(0, 0, 0));
        btn6.setText("6");
        btn6.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(51, 255, 51));
        btn1.setForeground(new java.awt.Color(0, 0, 0));
        btn1.setText("1");
        btn1.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(204, 204, 204));
        btn7.setForeground(new java.awt.Color(0, 0, 0));
        btn7.setText("7");
        btn7.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(51, 255, 51));
        btn3.setForeground(new java.awt.Color(0, 0, 0));
        btn3.setText("3");
        btn3.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(255, 153, 255));
        btn0.setForeground(new java.awt.Color(0, 0, 0));
        btn0.setText("0");
        btn0.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn00.setBackground(new java.awt.Color(255, 153, 255));
        btn00.setForeground(new java.awt.Color(0, 0, 0));
        btn00.setText("00");
        btn00.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btntitik.setBackground(new java.awt.Color(255, 153, 255));
        btntitik.setForeground(new java.awt.Color(0, 0, 0));
        btntitik.setText(".");
        btntitik.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btntitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntitikActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(51, 255, 51));
        btn2.setForeground(new java.awt.Color(0, 0, 0));
        btn2.setText("2");
        btn2.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnsamadengan.setBackground(new java.awt.Color(255, 153, 255));
        btnsamadengan.setForeground(new java.awt.Color(0, 0, 0));
        btnsamadengan.setText("=");
        btnsamadengan.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btnsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsamadenganActionPerformed(evt);
            }
        });

        btntambah.setBackground(new java.awt.Color(204, 204, 204));
        btntambah.setForeground(new java.awt.Color(0, 0, 0));
        btntambah.setText("+");
        btntambah.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(204, 204, 204));
        btndelete.setForeground(new java.awt.Color(0, 0, 0));
        btndelete.setText("AC");
        btndelete.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnkurrang.setBackground(new java.awt.Color(255, 204, 204));
        btnkurrang.setForeground(new java.awt.Color(0, 0, 0));
        btnkurrang.setText("-");
        btnkurrang.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btnkurrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkurrangActionPerformed(evt);
            }
        });

        btnclear.setBackground(new java.awt.Color(255, 204, 204));
        btnclear.setForeground(new java.awt.Color(0, 0, 0));
        btnclear.setText("C");
        btnclear.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnkali.setBackground(new java.awt.Color(51, 255, 51));
        btnkali.setForeground(new java.awt.Color(0, 0, 0));
        btnkali.setText("*");
        btnkali.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btnkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkaliActionPerformed(evt);
            }
        });

        btnbagi.setBackground(new java.awt.Color(255, 153, 255));
        btnbagi.setForeground(new java.awt.Color(0, 0, 0));
        btnbagi.setText("/");
        btnbagi.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        btnbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbagiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(490, 490, 490)
                        .addComponent(proses))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnkurrang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntitik, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(btnsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(proses)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btntambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnkurrang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btntitik, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnkali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jCheckBoxMenuItem1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("EXIT");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
getNumber(btn9);         // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
getNumber(btn3);         // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
getNumber(btn7);        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
getNumber(btn8);         // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
getNumber(btn4);         // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
getNumber(btn5);         // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
getNumber(btn6);         // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
getNumber(btn1);         // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
getNumber(btn2);         // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
getNumber(btn0);         // TODO add your handling code here:
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
getNumber(btn00);         // TODO add your handling code here:
    }//GEN-LAST:event_btn00ActionPerformed

    private void btntitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntitikActionPerformed
getNumber(btntitik);         // TODO add your handling code here:
    }//GEN-LAST:event_btntitikActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
     getOperator(1);   // TODO add your handling code here:
    }//GEN-LAST:event_btntambahActionPerformed

    private void btnkurrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkurrangActionPerformed
 getOperator(2);        // TODO add your handling code here:
    }//GEN-LAST:event_btnkurrangActionPerformed

    private void btnkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkaliActionPerformed
 getOperator(3);        // TODO add your handling code here:
    }//GEN-LAST:event_btnkaliActionPerformed

    private void btnbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbagiActionPerformed
 getOperator(4);        // TODO add your handling code here:
    }//GEN-LAST:event_btnbagiActionPerformed

    private void btnsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsamadenganActionPerformed
proses();        // TODO add your handling code here:
    }//GEN-LAST:event_btnsamadenganActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
angka="";
model.setOperator(0);
model.setResult(0);
hasil.setText("0");
proses.setText("process");// TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
if(hasil.getText().length()<=1){
    angka="";
hasil.setText("0");
}else{
angka=hasil.getText().substring(0, hasil.getText().length()-1);
hasil.setText(angka);
}
if(proses.getText().length()<=1){
    angka="";
proses.setText("0");
}else{
angka=proses.getText().substring(0, proses.getText().length()-1);
proses.setText(angka);
}
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonCircle btn0;
    private rojerusan.RSMaterialButtonCircle btn00;
    private rojerusan.RSMaterialButtonCircle btn1;
    private rojerusan.RSMaterialButtonCircle btn2;
    private rojerusan.RSMaterialButtonCircle btn3;
    private rojerusan.RSMaterialButtonCircle btn4;
    private rojerusan.RSMaterialButtonCircle btn5;
    private rojerusan.RSMaterialButtonCircle btn6;
    private rojerusan.RSMaterialButtonCircle btn7;
    private rojerusan.RSMaterialButtonCircle btn8;
    private rojerusan.RSMaterialButtonCircle btn9;
    private rojerusan.RSMaterialButtonRectangle btnbagi;
    private rojerusan.RSMaterialButtonRectangle btnclear;
    private rojerusan.RSMaterialButtonRectangle btndelete;
    private rojerusan.RSMaterialButtonRectangle btnkali;
    private rojerusan.RSMaterialButtonRectangle btnkurrang;
    private rojerusan.RSMaterialButtonRectangle btnsamadengan;
    private rojerusan.RSMaterialButtonRectangle btntambah;
    private rojerusan.RSMaterialButtonCircle btntitik;
    private javax.swing.JTextField hasil;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel proses;
    private rojerusan.RSMaterialButtonRectangleBeanInfo rSMaterialButtonRectangleBeanInfo1;
    // End of variables declaration//GEN-END:variables
}
