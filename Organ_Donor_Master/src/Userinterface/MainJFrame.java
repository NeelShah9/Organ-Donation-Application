/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface;

import Buisness.DBOUtill.DB4OUtil;
import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author patel
 */
public class MainJFrame extends javax.swing.JFrame {

    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        JFrame jframe = new JFrame();
      jframe.setPreferredSize(new Dimension(400,300));
       // setResizable( false );
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        setSize(screenSize.width, screenSize.height);

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));

        jSplitPane2.setMinimumSize(new java.awt.Dimension(1200, 700));
        jSplitPane2.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel3.setBackground(new java.awt.Color(165, 192, 185));
        jPanel3.setMinimumSize(new java.awt.Dimension(160, 700));
        jPanel3.setPreferredSize(new java.awt.Dimension(160, 700));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel1.setText("UserName");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 173, -1, -1));

        txtUsername.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 102));
        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUsername.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel3.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setText("Password");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 244, -1, -1));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, -1));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel3.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 140, -1));

        txtPassword.setForeground(new java.awt.Color(0, 0, 102));
        txtPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 25));

        jSplitPane2.setLeftComponent(jPanel3);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setMinimumSize(new java.awt.Dimension(1200, 700));
        container.setPreferredSize(new java.awt.Dimension(1200, 700));
        container.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(163, 193, 185));
        jPanel2.setForeground(new java.awt.Color(163, 193, 185));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/33.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1000, 480));

        container.add(jPanel2, "card2");

        jSplitPane2.setRightComponent(container);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:

        btnLogout.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        btnLogin.setEnabled(true);

        txtUsername.setText("");
        txtPassword.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String username = txtUsername.getText();
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUseraccountdirectory().authenticateUser(username, password);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterprisedirectory().getEnterpriseList()){
                    userAccount=enterprise.getUseraccountdirectory().authenticateUser(username, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationdirectory().getOrganizationList()){
                            userAccount=organization.getUseraccountdirectory().authenticateUser(username, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
            layout.next(container);
        }

        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);

    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
