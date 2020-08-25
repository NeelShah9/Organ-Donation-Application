/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DoctorOrg;

import Buisness.Enterprise.Enterprise;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class DoctorWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
    public DoctorWorkAreaJpanel(JPanel container, UserAccount account, Enterprise enterprise, Organization organization) {
        initComponents();
        this.container=container;
        this.account=account;
        this.enterprise=enterprise;
        this.organization=organization;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManagepatient = new javax.swing.JButton();
        btnCreaterequest = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManagepatient.setText("Manage Patient Details");
        btnManagepatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagepatientActionPerformed(evt);
            }
        });
        add(btnManagepatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 270, 209, -1));

        btnCreaterequest.setText("Create request for Organ");
        btnCreaterequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaterequestActionPerformed(evt);
            }
        });
        add(btnCreaterequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 331, 240, -1));

        btnCheck.setText("Check Organ Delivery");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 394, 209, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/organ-donation-logo.jpg"))); // NOI18N
        jLabel8.setText("jLabel2");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 90));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 72));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Doctor Work Area");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-medical_doctor.png"))); // NOI18N
        jLabel10.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, -1, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagepatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagepatientActionPerformed
        
       ManagePatientJpanel add = new ManagePatientJpanel(container, account,organization);
        container.add("Managepatient", add);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnManagepatientActionPerformed

    private void btnCreaterequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaterequestActionPerformed
        // TODO add your handling code here:
        CreateOrganRequestJpanel add = new CreateOrganRequestJpanel(container, account,organization,enterprise);
        container.add("Addpatientdetail", add);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnCreaterequestActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        
        CheckOrganDelivery add = new CheckOrganDelivery(container, account,organization,enterprise);
        container.add("Addpatientdetail", add);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
        
        
    }//GEN-LAST:event_btnCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnCreaterequest;
    private javax.swing.JButton btnManagepatient;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
