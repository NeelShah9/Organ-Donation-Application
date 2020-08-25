/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DoctorOrg;

import Buisness.Organization.Organization;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import Userinterface.SystemAdninWorkArea.SystemAdminWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class ViewPatientDetailJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPatientDetailJpanel
     */
    private JPanel container;
    private Patient p;
    private UserAccount account;
    private Organization organization;
    
    public ViewPatientDetailJpanel(JPanel container, Patient p, UserAccount account, Organization organization) {
        initComponents();
        this.container = container;
        this.p=p;
        this.account=account;
        this.organization=organization;
        textfield();
        populateBloodtypecombo();
        txtName.setText(p.getName());
        txtEmailid.setText(p.getEmailid());
        txtPhone.setText(p.getPhone());
        txtWeight.setText(Float.toString(p.getWeight()));
        txtrate.setText(Integer.toString(p.getRe_rate()));
        bloodCombo.setSelectedItem(p.getBloodType());
        SickCombo.setSelectedItem(p.getHow_sick());
        TissueCombo.setSelectedItem(p.getTissue_type());
        OrganCombo.setSelectedItem(p.getOrgan());
        
        
    }

    public void textfield(){
        
        txtName.setEnabled(false);
        txtEmailid.setEnabled(false);
        txtPhone.setEnabled(false);
        txtWeight.setEnabled(false);
        txtrate.setEnabled(false);
        bloodCombo.setEnabled(false);
        SickCombo.setEnabled(false);
        TissueCombo.setEnabled(false);
        OrganCombo.setEnabled(false);
        
    }
   private void populateBloodtypecombo(){
       // bloodCombo.removeAllItems();
        bloodCombo.addItem("A+");
        bloodCombo.addItem("A-");
        bloodCombo.addItem("B+");
        bloodCombo.addItem("B-");
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


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmailid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtrate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bloodCombo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        SickCombo = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        TissueCombo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        OrganCombo = new javax.swing.JComboBox();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Name");

        jLabel3.setText("Email Id");

        txtEmailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailidActionPerformed(evt);
            }
        });

        jLabel4.setText("Phone Number");

        jLabel6.setText("Weight");

        jLabel11.setText("Respiratory Rate");

        jLabel5.setText("Blood Type");

        bloodCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        bloodCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodComboActionPerformed(evt);
            }
        });

        jLabel7.setText("How Sick");

        SickCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        SickCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SickComboActionPerformed(evt);
            }
        });

        jLabel8.setText("Tissue Type");

        TissueCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        TissueCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TissueComboActionPerformed(evt);
            }
        });

        jLabel9.setText("Which Organ");

        OrganCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        OrganCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganComboActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(15, 58, 59));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("View Patient Detail");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-report_card.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(btnUpdate)
                        .addGap(90, 90, 90)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(txtrate)
                            .addComponent(txtWeight)
                            .addComponent(txtPhone)
                            .addComponent(txtEmailid)
                            .addComponent(bloodCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(435, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9))
                            .addGap(119, 119, 119)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(SickCombo, 0, 227, Short.MAX_VALUE)
                                .addComponent(OrganCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(126, 126, 126)
                            .addComponent(TissueCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(436, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(47, 47, 47)
                .addComponent(bloodCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addGap(42, 42, 42))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(390, 390, 390)
                    .addComponent(jLabel5)
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(SickCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(TissueCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(OrganCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(106, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailidActionPerformed

    private void bloodComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodComboActionPerformed

    private void SickComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SickComboActionPerformed

    }//GEN-LAST:event_SickComboActionPerformed

    private void TissueComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TissueComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TissueComboActionPerformed

    private void OrganComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganComboActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        txtName.setEnabled(true);
        txtEmailid.setEnabled(true);
        txtPhone.setEnabled(true);
        txtWeight.setEnabled(true);
        txtrate.setEnabled(true);
        bloodCombo.setEnabled(true);
        SickCombo.setEnabled(true);
        TissueCombo.setEnabled(true);
        OrganCombo.setEnabled(true);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        String name = txtName.getText();
        String emailid = txtEmailid.getText();
        String phone = txtPhone.getText();
        String bloodtype = (String)bloodCombo.getSelectedItem();
        float weight = (Float.parseFloat(txtWeight.getText()));
        String howsick = (String)SickCombo.getSelectedItem();
        String tissue =(String)TissueCombo.getSelectedItem();
        String organ = (String)OrganCombo.getSelectedItem();
        int rate = Integer.parseInt(txtrate.getText());
        
        boolean check = organization.getPatientdirectory().checkIfUsernameIsUnique(emailid);
        
        if(txtName.getText().trim().isEmpty() ||
            txtEmailid.getText().trim().isEmpty() ||
            txtPhone.getText().trim().isEmpty() ||
             bloodCombo.getSelectedIndex()<0 ||
               txtWeight.getText().trim().isEmpty() ||
                SickCombo.getSelectedIndex()<0 ||
                TissueCombo.getSelectedIndex()<0||
                OrganCombo.getSelectedIndex()<0 ||
                txtrate.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please Enter All Field");
           return;  
        }else{
            if(check == true){
                try{
                p.setName(txtName.getText());
                p.setEmailid(txtEmailid.getText());
                p.setPhone(txtPhone.getText());
                p.setWeight(Float.parseFloat(txtWeight.getText()));
                p.setRe_rate(Integer.parseInt(txtrate.getText()));
                p.setBloodType(bloodCombo.getSelectedItem().toString());
                p.setHow_sick(SickCombo.getSelectedItem().toString());
                p.setTissue_type(TissueCombo.getSelectedItem().toString());
                p.setOrgan(OrganCombo.getSelectedItem().toString());
                }catch(Exception e){
                   JOptionPane.showMessageDialog(null, "Detail not updated"); 
                }
        }else{
                JOptionPane.showMessageDialog(null, "Email id already exist");
            }
       } 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
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
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
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
