
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
public class electrical extends javax.swing.JFrame {
    public static Connection conn=null;
    public static ResultSet rs=null;
     public static ResultSet rs1=null;
    public static Statement stmt=null;
     public static Statement stmt1=null;

    /**
     * Creates new form electrical
     */
    public electrical() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","ssd");
            
            stmt=conn.createStatement();
            
            stmt1=conn.createStatement();
            
            String n1="SELECT * FROM test.employee WHERE Dept_No=3";
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
        savee = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        pinventry = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        hid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        eexp = new javax.swing.JTextField();
        hqua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        deletee = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        ename = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        eid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        searche = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        updatee = new javax.swing.JButton();
        equa = new javax.swing.JTextField();
        hname = new javax.swing.JTextField();
        newe = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        last = new javax.swing.JButton();
        first = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hexp = new javax.swing.JTextField();
        hcontrol = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);

        savee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        savee.setForeground(new java.awt.Color(153, 0, 0));
        savee.setText("SAVE");
        savee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveeActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        next.setForeground(new java.awt.Color(153, 0, 0));
        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 0));
        jLabel11.setText("Qualification");

        pinventry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pinventry.setForeground(new java.awt.Color(153, 0, 0));
        pinventry.setText("GO TO INVENTRY");
        pinventry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinventryActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Experience (yrs)");

        hid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hid.setForeground(new java.awt.Color(153, 0, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("ID");

        eexp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eexp.setForeground(new java.awt.Color(153, 0, 0));

        hqua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hqua.setForeground(new java.awt.Color(153, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("HOD/MANAGER");

        deletee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletee.setForeground(new java.awt.Color(153, 0, 0));
        deletee.setText("DELETE");
        deletee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteeActionPerformed(evt);
            }
        });

        prev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prev.setForeground(new java.awt.Color(153, 0, 0));
        prev.setText("<");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        ename.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ename.setForeground(new java.awt.Color(153, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Employee Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("DEPARTMENT NO-3");

        eid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eid.setForeground(new java.awt.Color(153, 0, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Name");

        searche.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searche.setForeground(new java.awt.Color(153, 0, 0));
        searche.setText("SEARCH");
        searche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searcheActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 0));
        jLabel12.setText("Experience");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Qualification");

        updatee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatee.setForeground(new java.awt.Color(153, 0, 0));
        updatee.setText("UPDATE");
        updatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateeActionPerformed(evt);
            }
        });

        equa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equa.setForeground(new java.awt.Color(153, 0, 0));

        hname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hname.setForeground(new java.awt.Color(153, 0, 0));

        newe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newe.setForeground(new java.awt.Color(153, 0, 0));
        newe.setText("NEW");
        newe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neweActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("ID");

        last.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        last.setForeground(new java.awt.Color(153, 0, 0));
        last.setText(">>");
        last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastActionPerformed(evt);
            }
        });

        first.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        first.setForeground(new java.awt.Color(153, 0, 0));
        first.setText("<<");
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Name");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jLabel13.setText("No. of Employees Under Control");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        hexp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hexp.setForeground(new java.awt.Color(153, 0, 0));

        hcontrol.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hcontrol.setForeground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("ELECTRICAL DEPARTMENT");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/h.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/re.jpg"))); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 153, 255));
        jButton3.setText("Departments");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(512, 512, 512)
                .addComponent(pinventry)
                .addContainerGap(663, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eid)
                                    .addComponent(eexp)
                                    .addComponent(equa)
                                    .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(first)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prev)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(next)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(last)
                                        .addGap(143, 143, 143))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(newe)
                                        .addGap(18, 18, 18)
                                        .addComponent(savee)
                                        .addGap(30, 30, 30)
                                        .addComponent(searche)
                                        .addGap(18, 18, 18)
                                        .addComponent(updatee)
                                        .addGap(18, 18, 18)))
                                .addComponent(deletee)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hname, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hqua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hexp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hcontrol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(248, 248, 248))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addGap(267, 267, 267)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2)
                        .addComponent(refresh)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(eid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(ename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(equa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hqua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(eexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(hcontrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(next)
                            .addComponent(prev)
                            .addComponent(last)
                            .addComponent(first)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton1)))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newe)
                    .addComponent(savee)
                    .addComponent(searche)
                    .addComponent(updatee)
                    .addComponent(deletee))
                .addGap(48, 48, 48)
                .addComponent(pinventry)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginpage/Untitled2.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel14, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveeActionPerformed
        // TODO add your handling code here:
        try{
            String s_name=ename.getText();
            String s_id=eid.getText();
            String s_qua=equa.getText();
            String s_exp=eexp.getText();
            if(s_id.startsWith("1"))
            {
                String save="INSERT INTO test.employee VALUES('"+s_id+"', '"+s_name+"', 1,'"+s_qua+"', '"+s_exp+"', 'hod1')";
                stmt.executeUpdate(save);
                JOptionPane.showMessageDialog(null, "Record Saved!");
                new paint().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Employee ID Must Start With 1");
                newe.doClick();
            }
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_saveeActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        try{

            //jButton1.doClick();
            if(rs.next())
            {
                String e_id=rs.getString("Emp_ID");
                String e_name=rs.getString("Emp_Name");
                String e_quali=rs.getString("Qualification");
                String e_exp=rs.getString("Experience");

                ename.setText(e_name);
                eid.setText(e_id);
                equa.setText(e_quali);
                eexp.setText(e_exp);
                // name.setText(d_name);

            }
            else
            {
                JOptionPane.showMessageDialog(null, "End of Database!");
            }
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_nextActionPerformed

    private void deleteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteeActionPerformed
        // TODO add your handling code here:
        new paint_search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteeActionPerformed

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
        // TODO add your handling code here:
        try{

            if(rs.previous())
            {
                String e_id=rs.getString("Emp_ID");
                String e_name=rs.getString("Emp_Name");
                String e_quali=rs.getString("Qualification");
                String e_exp=rs.getString("Experience");

                ename.setText(e_name);
                eid.setText(e_id);
                equa.setText(e_quali);
                eexp.setText(e_exp);
                // name.setText(d_name);

            }
            else
            {
                JOptionPane.showMessageDialog(null, "End of Database!");
            }
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_prevActionPerformed

    private void searcheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searcheActionPerformed
        // TODO add your handling code here:
        new paint_search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searcheActionPerformed

    private void updateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateeActionPerformed
        // TODO add your handling code here:
        new paint_search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateeActionPerformed

    private void neweActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neweActionPerformed
        // TODO add your handling code here:
        ename.setText(null);
        eid.setText(null);
        equa.setText(null);
        eexp.setText(null);
    }//GEN-LAST:event_neweActionPerformed

    private void lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastActionPerformed
        // TODO add your handling code here:
        try{
            rs.last();
            String e_id=rs.getString("Emp_ID");
            String e_name=rs.getString("Emp_Name");
            String e_quali=rs.getString("Qualification");
            String e_exp=rs.getString("Experience");

            ename.setText(e_name);
            eid.setText(e_id);
            equa.setText(e_quali);
            eexp.setText(e_exp);
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_lastActionPerformed

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        // TODO add your handling code here:
        try{
            rs.first();
            String e_id=rs.getString("Emp_ID");
            String e_name=rs.getString("Emp_Name");
            String e_quali=rs.getString("Qualification");
            String e_exp=rs.getString("Experience");

            ename.setText(e_name);
            eid.setText(e_id);
            equa.setText(e_quali);
            eexp.setText(e_exp);
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_firstActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String h1="SELECT * FROM test.employee WHERE Emp_Name='hod3'";
            rs1=stmt1.executeQuery(h1);
            rs1.next();

            String h_id=rs1.getString("Emp_ID");
            String h_name=rs1.getString("Emp_Name");
            String h_quali=rs1.getString("Qualification");
            String h_exp=rs1.getString("Experience");

            hname.setText(h_name);
            hid.setText(h_id);
            hqua.setText(h_quali);
            hexp.setText(h_exp);
            hcontrol.setText("6");

        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        new electrical().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_refreshActionPerformed

    private void pinventryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinventryActionPerformed
        // TODO add your handling code here:
        new inventory().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pinventryActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new depts().setVisible(true);
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
            java.util.logging.Logger.getLogger(electrical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(electrical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(electrical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(electrical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new electrical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletee;
    private javax.swing.JTextField eexp;
    private javax.swing.JTextField eid;
    private javax.swing.JTextField ename;
    private javax.swing.JTextField equa;
    private javax.swing.JButton first;
    private javax.swing.JTextField hcontrol;
    private javax.swing.JTextField hexp;
    private javax.swing.JTextField hid;
    private javax.swing.JTextField hname;
    private javax.swing.JTextField hqua;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton last;
    private javax.swing.JButton newe;
    private javax.swing.JButton next;
    private javax.swing.JButton pinventry;
    private javax.swing.JButton prev;
    private javax.swing.JButton refresh;
    private javax.swing.JButton savee;
    private javax.swing.JButton searche;
    private javax.swing.JButton updatee;
    // End of variables declaration//GEN-END:variables
}
