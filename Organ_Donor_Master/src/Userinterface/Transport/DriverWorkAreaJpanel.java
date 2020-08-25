/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.Transport;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.Organization.TransportOrganization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorToDriverRequest;
import Buisness.WorkQueue.adminToDoctor;
import Buisness.WorkQueue.workRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class DriverWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DriverWorkAreaJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private TransportOrganization organization;
    private DoctorToDriverRequest req1;
    public DriverWorkAreaJpanel(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.account=account;
        this.container=container;
        this.enterprise=enterprise;
        this.system=system;
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) driverJtable.getModel();
         model.setRowCount(0);
         
         for(Organization org : enterprise.getOrganizationdirectory().getOrganizationList()){
             if(org instanceof TransportOrganization){
                 organization = (TransportOrganization)org;
                 for(workRequest request : organization.getWorkqueue().getDoctorToDriverList()){
                     req1 = (DoctorToDriverRequest)request;
                     Object[] row = new Object[5];
                        row[0] = request.getSender().getUsername();
                        row[1] = req1;
                        row[2] = request.getReceiver() == null ? null : request.getReceiver().getUsername();
                        row[3] = request.getResponse();
                        row[4] = request.getStatus();
                        model.addRow(row);
                 }
                 
             }
             
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        driverJtable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnDeliery = new javax.swing.JButton();
        txtRes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        driverJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "sender", "Organ", "Receiver", "Response", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(driverJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 690, 162));

        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        btnDeliery.setText("Delivered");
        btnDeliery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelieryActionPerformed(evt);
            }
        });
        add(btnDeliery, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 134, -1));
        add(txtRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 197, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/organ-donation-logo.jpg"))); // NOI18N
        jLabel8.setText("jLabel2");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 90));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Driver Work Area");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-guest.png")); // NOI18N
        jLabel10.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel9)
                .addContainerGap(681, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Image\\ambulance_scene_low.gif")); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 400, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        
        int selectedRow = (int)driverJtable.getSelectedRow();
        
        DoctorToDriverRequest request = (DoctorToDriverRequest)driverJtable.getValueAt(selectedRow, 1);
        
        if(selectedRow>=0){
        if(request.getReceiver() == null){
            
            request.setReceiver(account);
            request.setStatus("OutForDelivery");
            populateTable();
            
        }else{
            JOptionPane.showMessageDialog(null, "Out For Delivery");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Select Request first");
        }
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnDelieryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelieryActionPerformed
        
        int selectedRow = (int)driverJtable.getSelectedRow();
        String response = txtRes.getText();
        
        
        if(selectedRow>=0){
            DoctorToDriverRequest request = (DoctorToDriverRequest)driverJtable.getValueAt(selectedRow, 1);
            if(request.getStatus().equals("Delivered")){
               JOptionPane.showMessageDialog(null, "Organ is Deliverd"); 
            }else if(request.getReceiver() == null){
                JOptionPane.showMessageDialog(null, "Driver Not Found");
            }else{
                
                if(request.getReceiver().equals(account)){
                   
                    if(txtRes.getText().trim().equals("")){
                      JOptionPane.showMessageDialog(null, "Add Response");  
                    }else{
                        request.setStatus("Delivered");
                        request.setResponse(response);
                        JOptionPane.showMessageDialog(null, "Update Status Succesfull");
                        populateTable();
                    }
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Delivery In Process");
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "select Request first");
        }
        
    }//GEN-LAST:event_btnDelieryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnDeliery;
    private javax.swing.JTable driverJtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
