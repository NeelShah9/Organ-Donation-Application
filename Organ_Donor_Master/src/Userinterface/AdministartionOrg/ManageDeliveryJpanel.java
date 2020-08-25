/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdministartionOrg;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organization.DoctorOrganization;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.Organization.TransportOrganization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorToDriverRequest;
import Buisness.WorkQueue.InformDoctor;
import Buisness.WorkQueue.workRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class ManageDeliveryJpanel extends javax.swing.JPanel {

    
    
    private JPanel container;
    private UserAccount account ;
    private Enterprise enterprise;
    private EcoSystem system;
    private TransportOrganization org;
    private DoctorToDriverRequest req1;
    private InformDoctor req2;
    public ManageDeliveryJpanel(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container=container;
        this.account=account;
        this.enterprise = enterprise;
        this.system= system;
        populateTable();
        InformTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) driverJtable.getModel();
         model.setRowCount(0);
         
         for(Network network : system.getNetworkList()){
             for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     
                     if(organization instanceof TransportOrganization){
                         
                         org = (TransportOrganization)organization;
                         break;
                     }
                 }
             }
                
         }
         
                 for(workRequest request : org.getWorkqueue().getDoctorToDriverList()){
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
             
         

    public void InformTable(){
        
        DefaultTableModel model = (DefaultTableModel) informJtable.getModel();
         model.setRowCount(0);
         
         for(workRequest request : account.getWorkqueue().getInformDoctorlist()){
             req2 = (InformDoctor)request;
                        Object[] row = new Object[5];
                        row[0] = request.getSender().getUsername();
                        row[1] = request.getReceiver();
                        row[2] = req2.getOrgan();
                        row[3] = request.getResponse();
                        row[4] = request.getStatus();
                        model.addRow(row);
         }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        driverJtable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        informJtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 690, 162));

        informJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "sender", "Receiver", "Organ", "Response", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(informJtable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 700, 192));

        jButton1.setText("Inform Doctor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 177, -1));
        add(txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 189, -1));

        jPanel1.setBackground(new java.awt.Color(15, 58, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Organ Delivery status");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-template.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 50));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int selectedRow = (int)driverJtable.getSelectedRow();
        
        Organization org1 = null;
        for(Organization org : enterprise.getOrganizationdirectory().getOrganizationList()){
            if(org instanceof DoctorOrganization){
                org1=org;
                break;
            }
        }
        if(selectedRow>=0){
            
            DoctorToDriverRequest request = (DoctorToDriverRequest)driverJtable.getValueAt(selectedRow, 1);
            
            if(request.getStatus().equals("Delivered")){
                
                InformDoctor req = new InformDoctor();
                req.setDoctor(request.getDoctor());
                req.setOrgan(request.getOrgan());
                req.setPatient_name(request.getPatient_name());
                req.setPatient_email(request.getPatient_email());
                System.out.println(request.getPatient_email()+"at delivery");
                UserAccount doctor = request.getDoctor();
                req.setReceiver(doctor);
                req.setSender(account);
                req.setStatus("send");
                
                //try{
                    org1.getWorkqueue().getInformDoctorlist().add(req);
                    account.getWorkqueue().getInformDoctorlist().add(req);
                    doctor.getWorkqueue().getInformDoctorlist().add(req);
                    JOptionPane.showMessageDialog(null, "Send Successfully"); 
                    InformTable();
                    
                    
//                }catch(Exception e){
//                    
//                }
                
            }else{
               JOptionPane.showMessageDialog(null, "Organ is not delivered"); 
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Select Row first");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable driverJtable;
    private javax.swing.JTable informJtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
