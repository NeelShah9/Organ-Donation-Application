/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.LegalAuthorityOrg;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.LabOrganization;
import Buisness.Organization.LegalOrganization;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.adminToLegalReport;
import Buisness.WorkQueue.workRequest;
import Userinterface.SystemAdninWorkArea.ManageEnterpriseAdminJpanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class manageRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form manageRequestJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private Organization organization;
    private LegalOrganization org;
    public manageRequestJpanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        populateReportTable();
        mypopulateTable();
    }

    

    public void populateReportTable(){
        
        DefaultTableModel model = (DefaultTableModel) reportJtable1.getModel();
        model.setRowCount(0);
              
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            if(organization instanceof LegalOrganization){
                org = (LegalOrganization)organization;
                for(workRequest request : org.getWorkqueue().getAdminToLegalReportList()){
                    adminToLegalReport req = (adminToLegalReport)request;
                        Object[] row = new Object[6];
                        row[0] = request.getSender().getUsername();
                        row[1] = req;
                        row[2] = req.getDonor_name();
                        row[3] = request.getRequest();
                        row[4] = req.getResponse();
                        row[5] = request.getStatus();
                        model.addRow(row);
                }
            }
            
                        
        }
        
    }
    
    public void mypopulateTable(){
        
         DefaultTableModel model = (DefaultTableModel) myJtable.getModel();
        model.setRowCount(0);
              
        for(workRequest request : account.getWorkqueue().getAdminToLegalReportList()){
            adminToLegalReport req = (adminToLegalReport)request;
                        Object[] row = new Object[6];
                        row[0] = request.getReceiver().getUsername();
                        row[1] = req;
                        row[2] = req.getDonor_name();
                        row[3] = request.getRequest();
                        row[4] = req.getResponse();
                        row[5] = request.getStatus();
                        model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        myJtable = new javax.swing.JTable();
        btnassign = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        reportJtable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Receiver", "Patient", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(myJtable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 962, 164));

        btnassign.setText("Assign To Me");
        btnassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignActionPerformed(evt);
            }
        });
        add(btnassign, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 158, -1));

        reportJtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "sender", "Patient", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(reportJtable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 108, 948, 164));

        jButton1.setText("Check Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 197, -1));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("My Reports");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-parse_resume.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 396, -1));

        jPanel3.setBackground(new java.awt.Color(15, 58, 59));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Legal Reports");

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-parse_resume.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap(332, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 396, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignActionPerformed
        
        int selectedRow = (int)reportJtable1.getSelectedRow();
        if(selectedRow>=0){
            
            adminToLegalReport request =(adminToLegalReport)reportJtable1.getValueAt(selectedRow, 1);
            request.setReceiver(account);
            account.getWorkqueue().getAdminToLegalReportList().add(request);
            JOptionPane.showMessageDialog(null, "Succesful");
            mypopulateTable();  
        }else{
             JOptionPane.showMessageDialog(null, "Select Request First");
        }
        
    }//GEN-LAST:event_btnassignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int selectedRow = (int)myJtable.getSelectedRow();
       
        if(selectedRow>=0){
            
            adminToLegalReport request =(adminToLegalReport)myJtable.getValueAt(selectedRow, 1);
             ReportJpanel report=new ReportJpanel(request,account,system,container,organization);
             container.add("reportjpanel",report);
              CardLayout layout=(CardLayout)container.getLayout();
                layout.next(container);
             
        }else{
             JOptionPane.showMessageDialog(null, "Select Request First");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnassign;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable myJtable;
    private javax.swing.JTable reportJtable1;
    // End of variables declaration//GEN-END:variables
}
