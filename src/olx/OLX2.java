package olx;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon.*;
import javax.swing.ImageIcon;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * OLX2.java
 *
 * Created on Oct 30, 2014, 9:55:50 AM
 */

/**
 *
 * @author Machine38
 */
public class OLX2 extends javax.swing.JFrame {

    /** Creates new form OLX2 */
    public OLX2() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTable();
        SHOW1 = new javax.swing.JButton();
        t12 = new javax.swing.JTextField();
        r2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("CHECK YOUR PROFILE");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("ENTER NAME");

        r1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        r1.setForeground(new java.awt.Color(0, 102, 0));
        r1.setText("ALL PURCHASES");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        ta1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "PTYPE", "PNAME", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(ta1);

        SHOW1.setBackground(new java.awt.Color(255, 51, 153));
        SHOW1.setForeground(new java.awt.Color(51, 0, 51));
        SHOW1.setText("SHOW PURCHASES");
        SHOW1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOW1ActionPerformed(evt);
            }
        });

        r2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        r2.setForeground(new java.awt.Color(0, 102, 0));
        r2.setText("ALL SALES");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        ta2.setForeground(new java.awt.Color(0, 102, 51));
        ta2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PID", "PTYPE", "PNAME", "PRICE"
            }
        ));
        jScrollPane2.setViewportView(ta2);

        jLabel2.setIcon(new ImageIcon("C:\\shoppe\\rs.jpg"));

        jButton3.setBackground(new java.awt.Color(102, 51, 255));
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("SHOW SALES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new ImageIcon("C:\\shoppe\\logo.jpg"));

        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("BUSINESS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(86, 86, 86)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                            .addComponent(t11)))
                                    .addComponent(SHOW1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r1)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SHOW1)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r2)
                            .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addGap(129, 129, 129))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
// TODO add your handling code here:
            String a=t11.getText();
                  try
         {
             Class.forName("java.sql.DriverManager");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
             Statement st=con.createStatement();

             String s="select count(*)from purchaser where name='"+a+"';";
            ResultSet rs= st.executeQuery(s);
                  while(rs.next()){


            int g=rs.getInt(1);

            t1.setText(""+g);
                  }
            rs.close();
            st.close();con.close();
                  }

                  catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(null,"error in code");

                  }
}//GEN-LAST:event_r1ActionPerformed

private void SHOW1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOW1ActionPerformed
    // TODO add your handling code here:
        DefaultTableModel md=(DefaultTableModel)ta1.getModel();
        String g=t11.getText();

        try
         {
             Class.forName("java.sql.DriverManager");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
             Statement st=con.createStatement();

             String s="select pid,ptype,pname,price from purchaser where name='"+g+"';";
            ResultSet rs= st.executeQuery(s);
                  while(rs.next()){


            int a=rs.getInt(1);
            String d=rs.getString(2);
          
            String o=rs.getString(3);
         int b=rs.getInt(4);
          md.addRow(new Object[]{a,d,o,b});
                  }
            rs.close();
            st.close();con.close();
                  }

                  catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(null,"error in code");

                  }
}//GEN-LAST:event_SHOW1ActionPerformed

private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
    // TODO add your handling code here:
      String a=t11.getText();
                  try
         {
             Class.forName("java.sql.DriverManager");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
             Statement st=con.createStatement();

             String s="select count(*)from c2c where name='"+a+"';";
            ResultSet rs= st.executeQuery(s);
                  while(rs.next()){


            int g=rs.getInt(1);

            t12.setText(""+g);
                  }
            rs.close();
            st.close();con.close();
                  }

                  catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(null,"error in code");

                  }
}//GEN-LAST:event_r2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
      DefaultTableModel md=(DefaultTableModel)ta2.getModel();
        String g=t11.getText();

        try
         {
             Class.forName("java.sql.DriverManager");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
             Statement st=con.createStatement();

             String s="select pid,ptype,pname,price from c2c where name='"+g+"';";
            ResultSet rs= st.executeQuery(s);
                  while(rs.next()){


            int a=rs.getInt(1);
            String d=rs.getString(2);

            String o=rs.getString(3);
         int b=rs.getInt(4);
          md.addRow(new Object[]{a,d,o,b});
                  }
            rs.close();
            st.close();con.close();
                  }

                  catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(null,"error in code");

                  }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    OLX4 G=new OLX4();
    G.show(true);
    this.setVisible(false);

}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
      OLX1 G=new OLX1();
    G.show(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OLX2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SHOW1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTable ta1;
    private javax.swing.JTable ta2;
    // End of variables declaration//GEN-END:variables

}
