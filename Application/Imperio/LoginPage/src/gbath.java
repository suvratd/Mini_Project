
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class gbath extends javax.swing.JFrame {
    String user;
    String item;
    int t1;
     public static Connection conn=null;
    public static ResultSet rs=null;
     public static ResultSet rs1=null;
    public static Statement stmt=null;
    public static Statement stmt1=null;

    /**
     * Creates new form gbath
     */
    
    public gbath(String User) {
        user=User;
         try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","ssd");
            
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
            
            String n1="SELECT * FROM test.inventry ";
            rs=stmt.executeQuery(n1);
        //rs.next();
            
             //String sql;
            //sql = "SELECT *  FROM Admins";
             //rs = stmt.executeQuery(sql);
            //rs.next();
             
        }
         catch(Exception e)
        {
        }
        initComponents();
        exist.setVisible(false);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        toilets = new javax.swing.JRadioButton();
        washbasin = new javax.swing.JRadioButton();
        shower = new javax.swing.JRadioButton();
        taps = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        len = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tcost = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        bathtubs = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        wish = new javax.swing.JButton();
        exist = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sli_viva.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/KOS-1.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/bath taps.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/vascabarca-boat-shaped-bathtub1.jpg"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 0));
        jLabel10.setText("Select An Item");

        toilets.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        toilets.setForeground(new java.awt.Color(51, 51, 0));
        toilets.setText("Toilets");
        toilets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toiletsActionPerformed(evt);
            }
        });

        washbasin.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        washbasin.setForeground(new java.awt.Color(51, 51, 0));
        washbasin.setText("Wash Basins");
        washbasin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                washbasinActionPerformed(evt);
            }
        });

        shower.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        shower.setForeground(new java.awt.Color(51, 51, 0));
        shower.setText("Hand Showers");
        shower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showerActionPerformed(evt);
            }
        });

        taps.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        taps.setForeground(new java.awt.Color(51, 51, 0));
        taps.setText("Taps");
        taps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tapsActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("Cost Per Item");

        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("No Of Items");

        len.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lenActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("Estimated Cost");

        calculate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        calculate.setForeground(new java.awt.Color(0, 51, 51));
        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        bathtubs.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        bathtubs.setForeground(new java.awt.Color(51, 51, 0));
        bathtubs.setText("Bath Tubs");
        bathtubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bathtubsActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/h.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/re.jpg"))); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 204));
        jButton2.setText("Gallery");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        wish.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wish.setForeground(new java.awt.Color(0, 51, 51));
        wish.setText("Add to Cart");
        wish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wishActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/cart.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 0));
        jLabel6.setText("MY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bathtubs)
                            .addComponent(toilets)
                            .addComponent(washbasin)
                            .addComponent(shower)
                            .addComponent(taps))
                        .addGap(223, 385, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(14, 14, 14)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(exist, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(wish, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(435, 435, 435)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)))
                        .addComponent(jLabel10))
                    .addGap(60, 60, 60)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(len, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                .addComponent(tcost))
                            .addGap(105, 105, 105)
                            .addComponent(calculate)))
                    .addContainerGap(431, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refresh)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bathtubs)
                        .addGap(18, 18, 18)
                        .addComponent(washbasin)
                        .addGap(18, 18, 18)
                        .addComponent(shower)
                        .addGap(18, 18, 18)
                        .addComponent(taps)))
                .addGap(18, 18, 18)
                .addComponent(toilets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(exist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wish))
                        .addComponent(jLabel5)))
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jLabel10)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(len, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calculate))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGap(126, 126, 126)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/Untitled2.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toiletsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toiletsActionPerformed
        // TODO add your handling code here:
        if(toilets.isSelected())
        {
             len.setText(null);
            tcost.setText(null);
            shower.setSelected(false);
            //toilets.setSelected(false);
              washbasin.setSelected(false);
                taps.setSelected(false);
                bathtubs.setSelected(false);

            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='toilets'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_toiletsActionPerformed

    private void washbasinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_washbasinActionPerformed
        // TODO add your handling code here:

        if(washbasin.isSelected())
        {
             len.setText(null);
            tcost.setText(null);
            
            
            shower.setSelected(false);
            toilets.setSelected(false);
             // washbasin.setSelected(false);
                taps.setSelected(false);
                bathtubs.setSelected(false);
            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='washbasins'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_washbasinActionPerformed

    private void showerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showerActionPerformed
        // TODO add your handling code here:

        if(shower.isSelected())
        {
             len.setText(null);
            tcost.setText(null);
           
            //shower.setSelected(false);
            toilets.setSelected(false);
              washbasin.setSelected(false);
                taps.setSelected(false);
                bathtubs.setSelected(false);
            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='handshowers'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_showerActionPerformed

    private void tapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tapsActionPerformed
        // TODO add your handling code here:
        if(taps.isSelected())
        {
             len.setText(null);
            tcost.setText(null);
            
            shower.setSelected(false);
            toilets.setSelected(false);
              washbasin.setSelected(false);
               // taps.setSelected(false);
                bathtubs.setSelected(false);
            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='taps'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_tapsActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void lenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lenActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        String l1=len.getText();
        //String b1=bre.getText();
        String c1=cost.getText();
        int x1=Integer.parseInt(l1);
        //int y1=Integer.parseInt(b1);
        int z1=Integer.parseInt(c1);
        int r1=x1*z1;
        String re1=String.valueOf(r1);
        tcost.setText(re1);
    }//GEN-LAST:event_calculateActionPerformed

    private void bathtubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bathtubsActionPerformed
        // TODO add your handling code here:
        if(bathtubs.isSelected())
        {
            len.setText(null);
            tcost.setText(null);
            //    tractor.setSelected(false);
            ////dulux.setSelected(false);
            //apex.setSelected(false);
            shower.setSelected(false);
            toilets.setSelected(false);
              washbasin.setSelected(false);
                taps.setSelected(false);
                //bathtubs.setSelected(false);
            try{
                String c1="SELECT Cost FROM test.inventry WHERE Product_Name='bathtubs'";
                rs=stmt.executeQuery(c1);
                rs.next();
                String cosi_i=rs.getString("Cost");
                cost.setText(cosi_i);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bathtubsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        new gbath(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         new gallery(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void wishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wishActionPerformed
        // TODO add your handling code here:
        try{
           String e1="SELECT * FROM test.guser WHERE Name='"+user+"'";
        rs=stmt1.executeQuery(e1);
        rs.next();
        String e=rs.getString("Items");
        String c=rs.getString("Total");
        int c1=Integer.parseInt(c);
            if(shower.isSelected())
            {
                item=e+",Hand shower";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                t1=c1+a1;
            }
            if(taps.isSelected())
            {
                item=e+",Taps";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                 t1=c1+a1;
            }
            if(toilets.isSelected())
            {
                item=e+",Toilet";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                 t1=c1+a1;
            }
            if(washbasin.isSelected())
            {
                item=e+",Washbasin";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                 t1=c1+a1;
            }
            if(bathtubs.isSelected())
            {
                item=e+",Bath-tub";
                String a=tcost.getText();
                int a1=Integer.parseInt(a);
                 t1=c1+a1;
            }
            
            String w1="UPDATE test.guser SET Items='"+item+"',Total='"+t1+"' WHERE Name='"+user+"'";
            stmt1.executeUpdate(w1);
            JOptionPane.showMessageDialog(null, "Item added to Wishlist!");
        
             String f1="SELECT * FROM test.guser WHERE Name='"+user+"'";
        rs=stmt.executeQuery(f1);
        rs.next();
        String f=rs.getString("Items");
        //String c=rs.getString("Total");
        exist.setText(f);
       
        
        ///refresh.doClick();
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Please Regiter!");
            new guser().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_wishActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new gcart(user).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(gbath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gbath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gbath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gbath.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String user=null;
                new gbath(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bathtubs;
    private javax.swing.JButton calculate;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField exist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField len;
    private javax.swing.JButton refresh;
    private javax.swing.JRadioButton shower;
    private javax.swing.JRadioButton taps;
    private javax.swing.JTextField tcost;
    private javax.swing.JRadioButton toilets;
    private javax.swing.JRadioButton washbasin;
    private javax.swing.JButton wish;
    // End of variables declaration//GEN-END:variables
}
