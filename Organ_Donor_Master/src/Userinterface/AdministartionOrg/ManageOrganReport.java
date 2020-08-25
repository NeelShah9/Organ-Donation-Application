/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdministartionOrg;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.AdministrationOrganization;
import Buisness.Organization.LegalOrganization;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
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
public class ManageOrganReport extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganReport
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
     private AdministrationOrganization org;
    public ManageOrganReport(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        PopulateTable();
        populateReportTable();
        
    }

   public void PopulateTable(){
        
        DefaultTableModel model = (DefaultTableModel) organRequestJtable.getModel();
        model.setRowCount(0);
        
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            
            if(organization instanceof AdministrationOrganization){
                org = (AdministrationOrganization)organization;
                for(workRequest request : org.getWorkqueue().getWorkrequestList()){
                    DoctorOrganRequest req = (DoctorOrganRequest) request;
                    
                    if(req.getStatus().equals("ApproveByDonor")){
                        Object[] row = new Object[5];
                        row[0] = request.getRequest();
                        row[1] = req;
                        row[2] = req.getDonor();
                        row[3] = request.getResponse();
                        row[4] = req.getStatus();
                        model.addRow(row);
                    }
                }
                
            }
        }
    }
    
    public void populateReportTable(){
        
        DefaultTableModel model = (DefaultTableModel) reportJtable.getModel();
        model.setRowCount(0);
              
        for(workRequest request : account.getWorkqueue().getAdminToLegalReportList()){
            adminToLegalReport req = (adminToLegalReport)request;
                        Object[] row = new Object[6];
                        row[0] = request.getSender().getUsername();
                        row[1] = req.getPatient_name();
                        row[2] = req;
                        row[3] = request.getRequest();
                        row[4] = req.getResponse();
                        row[5] = request.getStatus();
                        model.addRow(row);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organRequestJtable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportJtable = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        txtApprove = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request", "Patient", "Donor", "Responce", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organRequestJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 833, 124));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 103, -1));

        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 188, -1));

        reportJtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(reportJtable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 833, 164));

        btnApprove.setText("Send For Approval");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 195, -1));
        add(txtApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 234, -1));

        jPanel1.setBackground(new java.awt.Color(15, 58, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Approved Organ Request");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-template.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 40));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("My Report Table");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-template.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 400, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        
        int selectdRow = (int)organRequestJtable.getSelectedRow();
        Organization org = null;
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            
            if(organization instanceof LegalOrganization){
                org = organization;
                break;
            }
        }
        
        if(selectdRow>=0){
            
            DoctorOrganRequest request = (DoctorOrganRequest)organRequestJtable.getValueAt(selectdRow, 1);
            
            adminToLegalReport req1 = new adminToLegalReport();
            req1.setSender(account);
            req1.setPatient_name(request.getPatient().getName());
            req1.setPatient_email(request.getPatient().getEmailid());
            req1.setPatient_condition(request.getPatient().getHow_sick());
            req1.setOrgan(request.getPatient().getOrgan());
            req1.setDonor_name(request.getDonor().getName());
            req1.setDoctor(request.getSender());
            System.out.println(request.getSender().getUsername());
            try{
                
                org.getWorkqueue().getAdminToLegalReportList().add(req1);
                account.getWorkqueue().getAdminToLegalReportList().add(req1);
                 JOptionPane.showMessageDialog(null, "Succesful");
                 populateReportTable();
                
            }catch(Exception e){
                
                JOptionPane.showMessageDialog(null, "can't send Request");
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Select Request First");
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
       
        int selectedRow = (int)reportJtable.getSelectedRow();
        String approve = txtApprove.getText();
       
        if(selectedRow>=0){
            
            adminToLegalReport request = (adminToLegalReport)reportJtable.getValueAt(selectedRow,2);
            if(request.getStatus() == "complete"){
                JOptionPane.showMessageDialog(null, "Process complete");
            }else{
            request.setRequest(approve);
            request.setStatus("SendForApproval");
            JOptionPane.showMessageDialog(null, "Request send succesfully");
            populateReportTable();
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Select Request First");
        }
        
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable organRequestJtable;
    private javax.swing.JTable reportJtable;
    private javax.swing.JTextField txtApprove;
    // End of variables declaration//GEN-END:variables
}
