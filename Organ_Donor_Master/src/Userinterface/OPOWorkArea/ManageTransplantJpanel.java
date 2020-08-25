/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.OPOWorkArea;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.Organization.TransportOrganization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorToDriverRequest;
import Buisness.WorkQueue.adminToDoctor;
import Buisness.WorkQueue.workRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class ManageTransplantJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTransplantJpanel
     */
    private JPanel container;
    private UserAccount account ;
    private Enterprise enterprise;
    private EcoSystem system;
    private DonorOrganization organization;
    private adminToDoctor req1;
    public ManageTransplantJpanel(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container=container;
        this.account=account;
        this.enterprise = enterprise;
        this.system= system;
        System.out.println(account.getUsername());
        populate();
    }

    

     public void populate(){
         
         DefaultTableModel model = (DefaultTableModel) transplantJtable.getModel();
         model.setRowCount(0);
         
         for(Organization org : enterprise.getOrganizationdirectory().getOrganizationList()){
             if(org instanceof DonorOrganization){
                 organization = (DonorOrganization)org;
                 for(workRequest request : organization.getWorkqueue().getAdminToDoctorlist()){
                     req1 = (adminToDoctor)request;
                     Object[] row = new Object[6];
                        row[0] = request.getSender().getUsername();
                        row[1] = request.getReceiver() == null ? null : request.getReceiver().getUsername();
                        row[2] = req1;
                        row[3] = request.getRequest();
                        row[4] = request.getResponse();
                        row[5] = request.getStatus();
                        model.addRow(row);
                 }
                 
             }
             
         }
     }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        transplantJtable = new javax.swing.JTable();
        btnAss = new javax.swing.JButton();
        txtRes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnsend = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transplantJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transplantJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 967, 161));

        btnAss.setText("Assign To Me");
        btnAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssActionPerformed(evt);
            }
        });
        add(btnAss, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));
        add(txtRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 190, -1));

        jButton1.setText("process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 142, -1));

        btnsend.setText("Send For Delivery");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });
        add(btnsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 166, -1));

        btnCheck.setText("Check Progress");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 169, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/organ-donation-logo.jpg"))); // NOI18N
        jLabel8.setText("jLabel2");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 90));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Manage Transplantation");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-hospital.png")); // NOI18N
        jLabel10.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(738, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1110, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Image\\images (1).jpg")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssActionPerformed
        
        int selectedRow = (int)transplantJtable.getSelectedRow();
        if(selectedRow>=0){
            
            
            
            adminToDoctor request = (adminToDoctor)transplantJtable.getValueAt(selectedRow, 2);
            
            if(request.getReceiver() == null){
                request.setReceiver(account);
                request.setStatus("processing");
                populate();
            }else{
                JOptionPane.showMessageDialog(null, "Request already assign");
            }
            
            
        }else{
            
            JOptionPane.showMessageDialog(null, "select Request First");
        }
        
    }//GEN-LAST:event_btnAssActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String response = txtRes.getText();
        int selectedRow = (int)transplantJtable.getSelectedRow();
        if(selectedRow>=0){
            
            adminToDoctor req = (adminToDoctor)transplantJtable.getValueAt(selectedRow, 2);
            
            if(req.getStatus().equals("complete")){
                
                JOptionPane.showMessageDialog(null, "process Completed");
                
            }else if(req.getReceiver() == null){
                JOptionPane.showMessageDialog(null, "Doctor Not Found");
            }else{
                
                if(req.getReceiver().equals(account)){
                    
                    if(txtRes.getText().trim().equals("")){
                        JOptionPane.showMessageDialog(null, "Enter Response");
                    }else{
                        req.setResponse(response);
                        req.setStatus("complete");
                        JOptionPane.showMessageDialog(null, "Operation succesfull");
                        populate();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Request already assigned");
                }
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Select Request first");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        
        int selectedRow = (int)transplantJtable.getSelectedRow();
        Organization organization = null;
        for(Organization org : enterprise.getOrganizationdirectory().getOrganizationList()){
            
            if(org instanceof TransportOrganization){
                organization = org;
                break;
            }
            
        }
        
        if(selectedRow>=0){
            
            adminToDoctor req = (adminToDoctor)transplantJtable.getValueAt(selectedRow, 2);
            if(req.getStatus().equals("complete")){
                
                DoctorToDriverRequest request = new DoctorToDriverRequest();
                
                request.setSender(account);  
                request.setPatient_name(req.getPatient_name());
                request.setPatient_email(req.getPatient_email());
                request.setOrgan(req.getOrgan());
                request.setDonor_name(req.getDonor_name());
                request.setDoctor(req.getDoctor());
                request.setStatus("sendForDelivery");
                
                try{
                    
                    organization.getWorkqueue().getDoctorToDriverList().add(request);
                    account.getWorkqueue().getDoctorToDriverList().add(request);
                    JOptionPane.showMessageDialog(null, "Request send Succesfully");
                    
                }catch(Exception e){
                    System.out.println(e);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Request is not complete yet");
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Select Request first");
        }
        
    }//GEN-LAST:event_btnsendActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        OrganDeliveryJpanel add = new OrganDeliveryJpanel(container, account,enterprise,system);
        container.add("opoDoctorworkArea", add);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_btnCheckActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAss;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable transplantJtable;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
