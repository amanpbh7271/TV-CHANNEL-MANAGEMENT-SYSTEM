
package tvmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class addadvertisement extends javax.swing.JFrame {

    
    public addadvertisement() {
        initComponents();
         shownametext.setVisible(false);
            showname.setVisible(false);
            priority.setVisible(false);
            prioritytext.setVisible(false);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        showname121 = new javax.swing.JLabel();
        advertisementnametext = new javax.swing.JTextField();
        showname122 = new javax.swing.JLabel();
        advertisementtype = new javax.swing.JComboBox<>();
        Add = new javax.swing.JButton();
        mainmenu = new javax.swing.JButton();
        showname = new javax.swing.JLabel();
        shownametext = new javax.swing.JTextField();
        priority = new javax.swing.JLabel();
        prioritytext = new javax.swing.JTextField();
        year = new javax.swing.JLabel();
        year1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Add Advertisement");

        showname121.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        showname121.setText("Advertisement Name");

        showname122.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        showname122.setText("Advertisement Type");

        advertisementtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "channel", "show" }));
        advertisementtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advertisementtypeActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Add.setText("Add advertisement");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        mainmenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        mainmenu.setText("Main Menu");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });

        showname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        showname.setText("Show Name");

        priority.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        priority.setText("Priority");

        year.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        year.setText("Year ");

        year1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 157, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showname122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showname121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priority, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(advertisementnametext)
                            .addComponent(advertisementtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shownametext)
                            .addComponent(prioritytext)
                            .addComponent(year1))))
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showname121, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(advertisementnametext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showname122, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(advertisementtype, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priority, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioritytext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shownametext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(year, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(year1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void advertisementtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advertisementtypeActionPerformed
        if(advertisementtype.getSelectedIndex()==1)
        {
            shownametext.setVisible(true);
            showname.setVisible(true);
             priority.setVisible(true);
            prioritytext.setVisible(true);
            year.setVisible(false);
            year1.setVisible(false);
        }
        else
        {
            year.setVisible(true);
            year1.setVisible(true);
            shownametext.setVisible(false);
            showname.setVisible(false);
             priority.setVisible(false);    
            prioritytext.setVisible(false);
        }
    }//GEN-LAST:event_advertisementtypeActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        String advertisementname=advertisementnametext.getText();
        String type=advertisementtype.getSelectedItem().toString();
        int priority;
        String expire="none";
        if(prioritytext.getText().isEmpty())
            priority=0;
        else
        priority=Integer.parseInt(prioritytext.getText());
        String duration="3";
        String showname="";
        if(type.equalsIgnoreCase("show"))
        {
            showname=shownametext.getText();
        }
        if(type.equalsIgnoreCase("channel"))
            expire=year1.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/tv";
             Connection dbCon = null;
       
        ResultSet rs = null;
        ResultSet rs1=null;
        
        String insertadvertisement="insert into advertisements values('"+advertisementname+"','"+type+"','"+priority+"','"+duration+"','"+showname+"','"+expire+"');";
        
        dbCon = DriverManager.getConnection(dbURL, "root","" );
        Statement stmt=null;
        Statement stmt1=null;
        stmt = dbCon.createStatement();
        rs = stmt.executeQuery("select * from advertisements where name='"+advertisementname+"';");
        if(showname.length()!=0)
        {
            rs1=stmt.executeQuery("select * from programs where name='"+showname+"';");
            
            if(!rs1.next())
            {
                 JOptionPane.showMessageDialog(null,"Show not present");
                 return;
            }
        }
        if(rs.next())
        {
            JOptionPane.showMessageDialog(null,"Advertisement already entered");
            
        }
        else
        {
            stmt.executeUpdate(insertadvertisement);
            JOptionPane.showMessageDialog(null,"Advertisement added successfully");
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addadvertisement.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Advertisement already entered");
        } catch (SQLException ex) {
            Logger.getLogger(addadvertisement.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Advertisement already entered");
        }
    }//GEN-LAST:event_AddActionPerformed

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
        this.setVisible(false);
        (new advertisementmanager()).setVisible(true);
    }//GEN-LAST:event_mainmenuActionPerformed

    private void year1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year1ActionPerformed

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
            java.util.logging.Logger.getLogger(addadvertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addadvertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addadvertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addadvertisement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addadvertisement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField advertisementnametext;
    private javax.swing.JComboBox<String> advertisementtype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mainmenu;
    private javax.swing.JLabel priority;
    private javax.swing.JTextField prioritytext;
    private javax.swing.JLabel showname;
    private javax.swing.JLabel showname121;
    private javax.swing.JLabel showname122;
    private javax.swing.JTextField shownametext;
    private javax.swing.JLabel year;
    private javax.swing.JTextField year1;
    // End of variables declaration//GEN-END:variables
}
