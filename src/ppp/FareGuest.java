/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppp;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ramya B
 */
public class FareGuest extends javax.swing.JFrame {

    /**
     * Creates new form FareGuest
     */
    String address,port,user,pass,vehi,id;
    public FareGuest(String a1,String a2,String a3,String a4) {
         setTitle("Fares set by you!");
        address = a1;   port = a2;  user = a3;  pass = a4;
        show_show();
        initComponents();
        
        //getfordb();
    }
/* private void getfordb(){
        try {
            java.util.Date date = new java.util.Date();
      long t = date.getTime();
      java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(t);
                
                Connection theConn;
                String SQL;
                SQLCONNECTION_NEW  MyCon = new SQLCONNECTION_NEW(address,port,user,pass);
                theConn = MyCon.getConnection("Software_Parking_Project");
                Statement stmt = theConn.createStatement();    
                SQL = "select count(*) from Fare";
                ResultSet rs = stmt.executeQuery(SQL);rs.next();
                //RegularDBinfo_table.setModel(DbUtils.resultSetToTableModel(rs));
                int j=rs.getInt(1);
                System.out.println(j);
                SQL = "select * from Fare where id="+j;
                 rs=stmt.executeQuery(SQL);
                while(rs.next()){
                System.out.println(rs.getString(2));
                x1=rs.getString(3);
                 x5=rs.getString(5);
                taxtxt.setText(rs.getString(5));
                daily.setText(rs.getString(3));
               
                
                }
                long monthly=Long.parseLong(x1);
                   vehi=vehitxt.getText();
                   id=idtxt.getText();
                   if("".equals(vehi)){
                    JOptionPane.showMessageDialog(null, "Please enter vehicle no.");
                    this.setVisible(false);
                    new exit_guest(address,port,user,pass).setVisible(true);
                } if("".equals(id)){
                    JOptionPane.showMessageDialog(null, "Please enter id");
                    this.setVisible(false);
                    new exit_guest(address,port,user,pass).setVisible(true);
                }else{
                        SQL="select Time_in from Guest where Vehicle='"+vehi+"' and id='"+id+"'";
                        rs=stmt.executeQuery(SQL);
                        while(rs.next())
                        {
                            x2=rs.getTimestamp("Time_in");
                        }SQL="update Guest set Time_out='"+sqlTimestamp+"' where Vehicle='"+vehi+"'";//getfordb();
        stmt.executeUpdate(SQL);}/*
                          long milliseconds1 = x2.getTime();
  long milliseconds2 = sqlTimestamp.getTime();
  long diff=milliseconds2-milliseconds1;
   long diffMinutes = diff / ( 60 * 1000);//dur.setText(diffMinutes);
        long ans=monthly*diffMinutes/30;
        String ans1=Long.toString(ans);
        feetxt.setText(ans1);
        Float totalt=Float.parseFloat(x5);
        Float totalfee=(ans+totalt);
        String ans2=Float.toString(totalfee);
        totalfeetxt.setText(ans2);
         ans2=Float.toString(diffMinutes);
        dur.setText(ans2);
                }*/
          /*  }
                       catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
        }        
    }*//*
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        daily = new javax.swing.JTextField();
        taxtxt = new javax.swing.JTextField();
        totalfeetxt = new javax.swing.JTextField();
        dur = new javax.swing.JTextField();
        vehitxt = new javax.swing.JTextField();
        idtxt = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        daily.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        daily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyActionPerformed(evt);
            }
        });
        jPanel1.add(daily, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 190, 30));

        taxtxt.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jPanel1.add(taxtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 190, 30));

        totalfeetxt.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jPanel1.add(totalfeetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 190, 30));

        dur.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        dur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durActionPerformed(evt);
            }
        });
        jPanel1.add(dur, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 190, 30));

        vehitxt.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jPanel1.add(vehitxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 200, 30));

        idtxt.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 200, 30));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GUEST VEHICLE CHECK OUT");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel9)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GO BACK");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, -1, -1));

        jLabel11.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(226, 106, 106));
        jLabel11.setText("30 MINS FARE");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        jLabel12.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(226, 106, 106));
        jLabel12.setText("TAX");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, -1, -1));

        jLabel13.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(226, 106, 106));
        jLabel13.setText("PARKING DURATION");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SUBMIT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, 40));

        jLabel16.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(226, 106, 106));
        jLabel16.setText("NET AMOUNT");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, -1, 40));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(226, 106, 106));
        jLabel1.setText("VEHICLE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(226, 106, 106));
        jLabel2.setText("       ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 130, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ppp/Icons/driving comedy central GIF-downsized_large.gif"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 480, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        this.setVisible(false);
        new Guest_Customer(address,port,user,pass).setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
      try {
            java.util.Date date = new java.util.Date();
            long t = date.getTime();
            java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(t);

            Connection theConn;
            String SQL;
            SQLCONNECTION_NEW  MyCon = new SQLCONNECTION_NEW(address,port,user,pass);
            theConn = MyCon.getConnection("Software_Parking_Project");
            Statement stmt = theConn.createStatement();
            SQL = "select count(*) from Fare";
            ResultSet rs = stmt.executeQuery(SQL);rs.next();
            //RegularDBinfo_table.setModel(DbUtils.resultSetToTableModel(rs));
            int j=rs.getInt(1);
            System.out.println(j);
            SQL = "select * from Fare where id="+j;
            rs=stmt.executeQuery(SQL);
            while(rs.next()){
                System.out.println(rs.getString(2));
                x1=rs.getString(3);
                x5=rs.getString(5);
                taxtxt.setText(rs.getString(5));
                daily.setText(rs.getString(3));

            }
            long monthly=Long.parseLong(x1);
            vehi=vehitxt.getText();
            id=idtxt.getText();
            if("".equals(vehi)){
                JOptionPane.showMessageDialog(null, "Please enter vehicle no.");
                this.setVisible(false);
                new exit_guest(address,port,user,pass).setVisible(true);
            } if("".equals(id)){
                JOptionPane.showMessageDialog(null, "Please enter id");
                this.setVisible(false);
                new exit_guest(address,port,user,pass).setVisible(true);
            }else{
                SQL="select * from Guest where Vehicle='"+vehi+"' and id='"+id+"'";
                rs=stmt.executeQuery(SQL);
                while(rs.next())
                {x3=rs.getString("slot");
                    x2=rs.getTimestamp("Time_in");
                }SQL="update Guest set Time_out='"+sqlTimestamp+"' where Vehicle='"+vehi+"'";//getfordb();
                stmt.executeUpdate(SQL);System.out.println(x2);
                long milliseconds1 = x2.getTime();System.out.println(x2);
                long milliseconds2 = sqlTimestamp.getTime();
                long diff=milliseconds2-milliseconds1;
                long diffMinutes = diff / ( 60 * 1000);//dur.setText(diffMinutes);
                long ans=monthly*diffMinutes/30;
                String ans1=Long.toString(ans);
                //daily.setText(ans1);
                Float totalt=Float.parseFloat(x5);
                Float totalfee=(ans+totalt);
                String ans2=Float.toString(totalfee);
                totalfeetxt.setText(ans2);
                ans2=Float.toString(diffMinutes);
                dur.setText(ans2);
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }     SQLDeleteParkingSlot make=new  SQLDeleteParkingSlot(x3,address,port,user,pass);this.setVisible(false);
        new user( address,port,user,pass).setVisible(true);   // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    private void dailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailyActionPerformed

    private void durActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FareGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FareGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FareGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FareGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FareGuest().setVisible(true);
            }
        });
    }*/
private void show_show() {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegularDBinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegularDBinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegularDBinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegularDBinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField daily;
    private javax.swing.JTextField dur;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField taxtxt;
    private javax.swing.JTextField totalfeetxt;
    private javax.swing.JTextField vehitxt;
    // End of variables declaration//GEN-END:variables
java.sql.Timestamp in = null,out = null,x2=null;
String x1,x3,x5=null;}
