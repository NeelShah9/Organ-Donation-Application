/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DoctorOrg;

import Buisness.Organization.Organization;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import Buisness.Validation.ValidateStrings;
import Buisness.Validation.validateEmailid;
import Buisness.Validation.validateInteger;
import Buisness.Validation.validatePhone;
import Buisness.Validation.validateWeight;
import Userinterface.LegalAuthorityOrg.ReportJpanel;
import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class AddPatientDetailJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPatientDetailJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Organization organization;
    public AddPatientDetailJpanel(JPanel container, UserAccount account, Organization organization) {
        initComponents();
        this.container=container;
        this.account=account;
        this.organization=organization;
        populateBloodtypecombo();
        addInputverifiers();
       // System.out.println(organization.getUseraccountdirectory().getPatientdirectory());
        
        //System.out.println(organization.getUseraccountdirectory().getUserAccountList());
    }

    private void populateBloodtypecombo(){
       // bloodCombo.removeAllItems();
        bloodCombo.addItem("A+");
        bloodCombo.addItem("A-");
        bloodCombo.addItem("B+");
        bloodCombo.addItem("B-");
        bloodCombo.addItem("AB+");
        bloodCombo.addItem("AB-");
        bloodCombo.addItem("O+");
        bloodCombo.addItem("O-"); 
        SickCombo.addItem("Need_urgent_Transplant");
        SickCombo.addItem("Can Wait");
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
        txtName.setText("");
        txtEmailid.setText("");
        txtPhone.setText("");
        txtWeight.setText("");
        txtrate.setText("");
        bloodCombo.setSelectedIndex(0);
        SickCombo.setSelectedIndex(0);
        TissueCombo.setSelectedIndex(0);
        OrganCombo.setSelectedIndex(0);
    }

    public void addInputverifiers(){
        
        InputVerifier stringValidation = new ValidateStrings();
        txtName.setInputVerifier(stringValidation);
        InputVerifier phonevalidation = new validatePhone();
        txtPhone.setInputVerifier(phonevalidation);
        InputVerifier emailidvalidation = new validateEmailid();
        txtEmailid.setInputVerifier(emailidvalidation);
        InputVerifier weightvalidation = new validateWeight();
        txtWeight.setInputVerifier(weightvalidation);
        InputVerifier ratevalidation = new validateInteger();
        txtrate.setInputVerifier(ratevalidation);
    }
    
    public void sendEmail(String recipient, String details) throws IOException{
        
    Email from = new Email("sapna.patel.01993@gmail.com");
    String subject = "Notification";
    Email to = new Email(recipient);
    Content content = new Content("text/plain", details);
    Mail mail = new Mail(from, subject, to, content);

    SendGrid sg = new SendGrid("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");
    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sg.api(request);
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody());
      System.out.println(response.getHeaders());
    } catch (IOException ex) {
      throw ex;
    }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmailid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SickCombo = new javax.swing.JComboBox();
        TissueCombo = new javax.swing.JComboBox();
        bloodCombo = new javax.swing.JComboBox();
        OrganCombo = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtrate = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 105, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 102, 133, -1));

        jLabel3.setText("Email Id");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 149, -1, -1));

        txtEmailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailidActionPerformed(evt);
            }
        });
        add(txtEmailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 146, 133, -1));

        jLabel4.setText("Phone Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 184, -1, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 181, 133, -1));

        jLabel5.setText("Blood Type");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 314, -1, -1));

        jLabel6.setText("Weight");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 226, -1, -1));
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 223, 133, -1));

        jLabel7.setText("How Sick");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 363, -1, -1));

        jLabel8.setText("Tissue Type");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 421, -1, -1));

        jLabel9.setText("Which Organ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 465, -1, -1));

        jLabel10.setText("Needs To Transplant");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 497, -1, -1));

        SickCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        SickCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SickComboActionPerformed(evt);
            }
        });
        add(SickCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 360, 133, -1));

        TissueCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        TissueCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TissueComboActionPerformed(evt);
            }
        });
        add(TissueCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 418, 133, -1));

        bloodCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        bloodCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodComboActionPerformed(evt);
            }
        });
        add(bloodCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 311, 133, -1));

        OrganCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        OrganCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganComboActionPerformed(evt);
            }
        });
        add(OrganCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 462, 133, -1));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 581, 118, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel11.setText("Respiratory Rate");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 270, -1, -1));
        add(txtrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 267, 133, -1));

        jPanel4.setBackground(new java.awt.Color(15, 58, 59));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Patient Details");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-parse_resume.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(35, 35, 35)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 47, 400, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Image\\1.gif")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void SickComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SickComboActionPerformed

      
    }//GEN-LAST:event_SickComboActionPerformed

    private void TissueComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TissueComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TissueComboActionPerformed

    private void bloodComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodComboActionPerformed

    private void OrganComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganComboActionPerformed

    private void txtEmailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailidActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       
        String name = txtName.getText();
        String emailid = txtEmailid.getText();
        String phone = txtPhone.getText();
        String bloodtype = (String)bloodCombo.getSelectedItem();
        float weight = (Float.parseFloat(txtWeight.getText()));
        String howsick = (String)SickCombo.getSelectedItem();
        String tissue =(String)TissueCombo.getSelectedItem();
        String organ = (String)OrganCombo.getSelectedItem();
        int rate = Integer.parseInt(txtrate.getText());
        String flag = "eligible";
        String details = "You added to waitingList";
        
        if(txtName.getText().trim().isEmpty() &&
            txtEmailid.getText().trim().isEmpty() &&
            txtPhone.getText().trim().isEmpty() &&
             bloodCombo.getSelectedIndex()<0 &&
               txtWeight.getText().trim().isEmpty() &&
                SickCombo.getSelectedIndex()<=00 &&
                TissueCombo.getSelectedIndex()<=00 &&
                OrganCombo.getSelectedIndex()<=00 &&
                txtrate.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please Enter All Field");
           return;  
        }else{
       
            boolean check = organization.getPatientdirectory().checkIfUsernameIsUnique(emailid);
            
            if(check == true){
            try{
            organization.getPatientdirectory().ADDPatient(name, emailid, phone, bloodtype, weight, howsick, tissue, organ,rate,flag);
            JOptionPane.showMessageDialog(null, "Patient Details Added succesfully");
             try {
                    sendEmail(emailid, details);
                    //JOptionPane.showMessageDialog(null, "Report mail send successfully");
                } catch (IOException ex) {
                    Logger.getLogger(ReportJpanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            clearfield();
            }catch(Exception e){   
            }
            }else{
                 JOptionPane.showMessageDialog(null, "Patient Already Exist"); 
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       container.remove(this);
         Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagePatientJpanel sysAdminwjp = (ManagePatientJpanel) component;
        sysAdminwjp.populateTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox OrganCombo;
    private javax.swing.JComboBox SickCombo;
    private javax.swing.JComboBox TissueCombo;
    private javax.swing.JComboBox bloodCombo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtEmailid;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtrate;
    // End of variables declaration//GEN-END:variables
}
