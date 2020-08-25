/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdministartionOrg;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.adminToDoctor;
import Buisness.WorkQueue.adminToLegalReport;
import Buisness.WorkQueue.workRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class ManageOrganTransplant extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganTransplant
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    public ManageOrganTransplant(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        populateReportTable();
        populate();
    }

   

     public void populateReportTable(){
        
        DefaultTableModel model = (DefaultTableModel) reportJtable.getModel();
        model.setRowCount(0);
              
        for(workRequest request : account.getWorkqueue().getAdminToLegalReportList()){
            adminToLegalReport req = (adminToLegalReport)request;
                        Object[] row = new Object[5];
                        row[0] = req.getPatient_name();
                        row[1] = req;
                        row[2] = request.getRequest();
                        row[3] = req.getResponse();
                        row[4] = request.getStatus();
                        model.addRow(row);
        }
        
    }
     
     public void populate(){
         
         DefaultTableModel model = (DefaultTableModel) transplantJtable.getModel();
         model.setRowCount(0);
         
         for(workRequest request : account.getWorkqueue().getAdminToDoctorlist()){
             adminToDoctor req1 = (adminToDoctor)request;
                        Object[] row = new Object[5];
                        row[0] = request.getSender().getUsername();
                        row[1] = req1.getDonor_name();
                        row[2] = request.getRequest();
                        row[3] = request.getResponse();
                        row[4] = request.getStatus();
                        model.addRow(row);
         }
         
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        reportJtable = new javax.swing.JTable();
        btnInitiate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transplantJtable = new javax.swing.JTable();
        txtrequest = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reportJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(reportJtable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 126, 899, 164));

        btnInitiate.setText("Initiate Transplant");
        btnInitiate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitiateActionPerformed(evt);
            }
        });
        add(btnInitiate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 256, -1));

        transplantJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transplantJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 838, 161));

        txtrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrequestActionPerformed(evt);
            }
        });
        add(txtrequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 301, -1));

        jPanel1.setBackground(new java.awt.Color(15, 58, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("My Request");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-parse_resume.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 400, -1));

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Legal Organization Report");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-parse_resume.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 396, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitiateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitiateActionPerformed
        
        int selectedRow = (int)reportJtable.getSelectedRow(); 
        String Request = txtrequest.getText();
        Organization org2 = null;
         for(Network network : system.getNetworkList()){
             for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     
                     if(organization instanceof DonorOrganization){
                         
                         org2 = organization;
                         break;
                     }
                 }
             }
                
         }

        if(selectedRow>=0){
            
            if(txtrequest.getText().trim().isEmpty()){
                
               JOptionPane.showMessageDialog(null, "plz Add Request"); 
            }else{
            adminToLegalReport request = (adminToLegalReport)reportJtable.getValueAt(selectedRow, 1);
            adminToDoctor req = new adminToDoctor();
            req.setSender(account);
            req.setPatient_name(request.getPatient_name());
                System.out.println(request.getPatient_email()+"at organ transplant");
            req.setPatient_email(request.getPatient_email());
            req.setDonor_name(request.getDonor_name());
            req.setOrgan(request.getOrgan());
            req.setDoctor(request.getDoctor());
            req.setRequest(Request);
            req.setStatus("SendToDoctor");
            
            try{
                
                org2.getWorkqueue().getAdminToDoctorlist().add(req);
                account.getWorkqueue().getAdminToDoctorlist().add(req);
                JOptionPane.showMessageDialog(null, "Request send succesfully"); 
                populate();
                
            }catch(Exception e){
                
            }
            
            }         
            
        }else{
            
            JOptionPane.showMessageDialog(null, "select Row first");
        }
        
        
    }//GEN-LAST:event_btnInitiateActionPerformed

    private void txtrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrequestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInitiate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable reportJtable;
    private javax.swing.JTable transplantJtable;
    private javax.swing.JTextField txtrequest;
    // End of variables declaration//GEN-END:variables
}
