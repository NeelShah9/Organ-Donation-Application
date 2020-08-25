/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DonorWorkArea;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
import Buisness.WorkQueue.opoDoctorToDonorRequest;
import Buisness.WorkQueue.workRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class CheckRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckRequestJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private Organization organization;
    private DonorOrganization org;
    public CheckRequestJpanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        //System.out.println(account.getUsername());
//        for(UserAccount aa : enterprise.getUseraccountdirectory().getUserAccountList()){
//            System.out.println(aa.getUsername() +"ccc");
//        }
        populateTable();
    }

    
    public void populateTable(){

        DefaultTableModel model = (DefaultTableModel) requestJtable.getModel();
        model.setRowCount(0);
        

        
        for(Network network : system.getNetworkList()){
             for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     for(UserAccount aa : organization.getUseraccountdirectory().getUserAccountList()){
                         
                        if (aa.getRole().toString().equals("Buisness.Role.OPO_DoctorRole")) {
                        //System.out.println("in pd account");

                        for (workRequest request : aa.getWorkqueue().getOpoDoctorTodonorlist()) {

                            opoDoctorToDonorRequest req = (opoDoctorToDonorRequest) request;
                            //System.out.println(req.getD().getName());
                            if(req.getD().getName().equals(account.getUsername().toString())){
                            Object[] row = new Object[5];
                            row[0] = request.getSender();
                            row[1] = request;
                            row[2] = req.getD().getName();
                            row[3] = request.getResponse();
                            row[4] = request.getStatus();
                            model.addRow(row);
                            }
                        } 
                        } 
                     }
                 }
             }
        }
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        requestJtable = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Request", "Donor", "Response", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 122, 693, 171));

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 319, 140, -1));

        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });
        add(btnDecline, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 319, 131, -1));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Display Requests");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-medical_heart.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel6)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, 396, -1));

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/759882k4ivnqn8s4.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        
        
        int selectedrow = (int)requestJtable.getSelectedRow();
          Organization org=null;
        for(Network network : system.getNetworkList()){
                for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     
                     if(organization instanceof DonorOrganization){
                         
                         org = organization;
                         break;
                     }
                 }
                }
              }
      
        if(selectedrow>=0){
            
            opoDoctorToDonorRequest request = (opoDoctorToDonorRequest)requestJtable.getValueAt(selectedrow, 1);
            System.out.println(request.getStatus()+"status");
            if(request.getStatus()!= "completed"){
                request.setReceiver(account);
                request.setStatus("completed");
                request.setResponse("Approve");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request send succesfully");
                
                for(workRequest req : org.getWorkqueue().getWorkrequestList()){
                    DoctorOrganRequest req1 = (DoctorOrganRequest)req;
                    if(req1.getDonor().getName().equals(account.getUsername().toString())){
                        req1.setStatus("ApproveByDonor");
                    }
                }
               
            } 
            else{
                JOptionPane.showMessageDialog(null, "Request completed already");
            }
        }else{
            JOptionPane.showMessageDialog(null, "select row first");
        }
        
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        
        int selectedrow = (int)requestJtable.getSelectedRow();
         Organization org=null;
        for(Network network : system.getNetworkList()){
                for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     
                     if(organization instanceof DonorOrganization){
                         
                         org = organization;
                         break;
                     }
                 }
                }
              }
        if(selectedrow>=0){
            
            opoDoctorToDonorRequest request = (opoDoctorToDonorRequest)requestJtable.getValueAt(selectedrow, 1);
            if(request.getStatus()!= "completed"){
                request.setReceiver(account);
                request.setStatus("completed");
                request.setResponse("Decline");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request send succesfully");
                for(workRequest req : org.getWorkqueue().getWorkrequestList()){
                    DoctorOrganRequest req1 = (DoctorOrganRequest)req;
                    if(req1.getDonor().getName().equals(account.getUsername().toString())){
                        req1.setStatus("DeclineByDonor");
                    }
                }
                for(Patient p : organization.getPatientdirectory().getPatientdirectory()){
                
               
                if(p.getEmailid().equals(request.getP().getEmailid())){
                    p.setFlag("eligible");
                }
            }
            } 
            else{
                JOptionPane.showMessageDialog(null, "Request completed already");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "select row first");
        }
        
        
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnDecline;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestJtable;
    // End of variables declaration//GEN-END:variables
}
