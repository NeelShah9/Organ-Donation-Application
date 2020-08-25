/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DonorWorkArea;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.Validation.ValidateStrings;
import Buisness.Validation.validateEmailid;
import Buisness.Validation.validateInteger;
import Buisness.Validation.validatePhone;
import Buisness.Validation.validateWeight;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */

public class AddDetailJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDetailJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private Organization organization;
            
    public AddDetailJpanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        populateCombo();
        addInputverifiers();
        txtName.setEnabled(false);
        txtName.setText(account.getUsername());
        //System.out.println(organization.getDonorlist().getDonorlist());
    }

    public void populateCombo(){
        
        bloodCombo.addItem("A+");
        bloodCombo.addItem("A-");
        bloodCombo.addItem("B+");
        bloodCombo.addItem("B-");
        bloodCombo.addItem("AB+");
        bloodCombo.addItem("AB-");
        bloodCombo.addItem("O+");
        bloodCombo.addItem("O-"); 
        
        TissueCombo.addItem("epithelial");
        TissueCombo.addItem("connective");
        TissueCombo.addItem("muscular");
        TissueCombo.addItem("nervous");
        OrganCombo.addItem("Heart");
        OrganCombo.addItem("Lung");
        OrganCombo.addItem("Liver");
        OrganCombo.addItem("Pancrease");
        OrganCombo.addItem("Kidney");
        OrganCombo.addItem("Intestines");
    }

    public void clearfield(){
        
        txtemailid.setText("");
        txtPhone.setText("");
        txtRate.setText("");
        txtWeight.setText("");
        txtpressure.setText("");
        bloodCombo.setSelectedIndex(0);
        TissueCombo.setSelectedIndex(0);
        OrganCombo.setSelectedIndex(0);
        
    }

   public void addInputverifiers(){
        
        InputVerifier stringValidation = new ValidateStrings();
        txtName.setInputVerifier(stringValidation);
        InputVerifier phonevalidation = new validatePhone();
        txtPhone.setInputVerifier(phonevalidation);
        InputVerifier emailidvalidation = new validateEmailid();
        txtemailid.setInputVerifier(emailidvalidation);
        InputVerifier weightvalidation = new validateWeight();
        txtWeight.setInputVerifier(weightvalidation);
        InputVerifier ratevalidation = new validateInteger();
        txtRate.setInputVerifier(ratevalidation);
        InputVerifier bpvalidate = new validateWeight();
        txtpressure.setInputVerifier(bpvalidate);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtemailid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bloodCombo = new javax.swing.JComboBox<>();
        TissueCombo = new javax.swing.JComboBox<>();
        txtRate = new javax.swing.JTextField();
        txtpressure = new javax.swing.JTextField();
        OrganCombo = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 217, -1));

        jLabel2.setText("Email_id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));
        add(txtemailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 217, -1));

        jLabel3.setText("Phone");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 217, -1));

        jLabel4.setText("Weight");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 217, -1));

        jLabel5.setText("Blood Group");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        jLabel6.setText("Tissue Type");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jLabel7.setText("Respiratory rate");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jLabel8.setText("Blood Pressure");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        jLabel9.setText("Which Organ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        bloodCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        add(bloodCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 217, -1));

        TissueCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        add(TissueCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, 217, -1));
        add(txtRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 217, -1));
        add(txtpressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 217, -1));

        OrganCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        add(OrganCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 217, -1));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, 118, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(15, 58, 59));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Donor Details");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-medical_heart.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 396, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Image\\GlossyCooperativeAxisdeer-max-1mb.gif")); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 350, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
       String name = txtName.getText();
       String emailid = txtemailid.getText();
       String phone = txtPhone.getText();
       int rate = Integer.parseInt(txtRate.getText());
       int bp = Integer.parseInt(txtpressure.getText());
       float weight = Float.parseFloat(txtWeight.getText());
       String bloodgrp = (String)bloodCombo.getSelectedItem();
       String tissue = (String)TissueCombo.getSelectedItem();
       String organ = (String)OrganCombo.getSelectedItem();
        if(txtName.getText().trim().isEmpty() ||
                txtemailid.getText().trim().isEmpty() ||
                txtPhone.getText().trim().isEmpty() ||
                txtRate.getText().trim().isEmpty() ||
                txtWeight.getText().trim().isEmpty() ||
                txtpressure.getText().trim().isEmpty() ||
                bloodCombo.getSelectedIndex()<=0 ||
                TissueCombo.getSelectedIndex()<=0 ||
                OrganCombo.getSelectedIndex()<=0){
            
            JOptionPane.showMessageDialog(null, "Please Enter All Field");
           return;  
        }else{
        boolean result = organization.getDonorlist().checkIfUsernameIsUnique(name);
        if(result == true){
            try{
            
            organization.getDonorlist().AddDonor(name, emailid, phone, weight, bloodgrp, tissue, rate, bp, organ);
            JOptionPane.showMessageDialog(null, "Details added succesfully");
            clearfield();
            
            }catch(Exception e){
            
            }  
        }else{
            JOptionPane.showMessageDialog(null, "User Already exist");
        }
        
        } 
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
         container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> OrganCombo;
    private javax.swing.JComboBox<String> TissueCombo;
    private javax.swing.JComboBox<String> bloodCombo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtpressure;
    // End of variables declaration//GEN-END:variables
}
