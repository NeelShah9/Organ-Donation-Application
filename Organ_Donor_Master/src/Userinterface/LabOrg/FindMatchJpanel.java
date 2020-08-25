/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.LabOrg;

import Buisness.Donor.Donor;
import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
import Buisness.WorkQueue.opoDoctorToLabRequest;
import Userinterface.DoctorOrg.ManagePatientJpanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class FindMatchJpanel extends javax.swing.JPanel {

    /**
     * Creates new form FindMatchJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Donor donor;
    private Patient p;
    private DoctorOrganRequest request;
    public FindMatchJpanel(JPanel container,UserAccount account,DoctorOrganRequest request,Donor donor,Patient p) {
        initComponents();
        this.container = container;
        this.account = account;
        this.donor = donor;
        this.request=request; 
        this.p=p;
        
        if(donor!=null){
            resultJlable.setText("Match found");
            populateTable();
        }else{
            resultJlable.setText("Not found appropriate Donor");
        }
        
    }

   public void populateTable(){
       
        DefaultTableModel model = (DefaultTableModel) donorJtable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6];
        row[0]= donor.getName();
        row[1] = donor.getEmailid();
        row[2] = donor.getOrgan();
        row[3] = donor.getTissue();
        row[4] = donor.getBloodgroup();
        row[5] = donor.getRe_rate();
        model.addRow(row);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        donorJtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        resultJlable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResponse = new javax.swing.JTextField();
        btnResponse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        donorJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Emailid", "Organ", "Tissue Type", "Blood Group", "Respiratory Rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donorJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 748, 191));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel1.setText("Lab Test Result :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        resultJlable.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        resultJlable.setText("<value>");
        add(resultJlable, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 317, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jLabel2.setText("Response");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));
        add(txtResponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 256, -1));

        btnResponse.setText("send Report");
        btnResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponseActionPerformed(evt);
            }
        });
        add(btnResponse, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 180, -1));

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
        jLabel10.setText("Donor and Patient Match");

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-microscope.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(33, 33, 33))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 396, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/C1.PNG"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, -1, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponseActionPerformed
        
        String response = txtResponse.getText();
        
        if(txtResponse.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please Add Response");
            
        }else{
            if(donor!=null){
            
                request.setDonor(donor);
                request.setPatient(p);
                request.setResponse(response);
                request.setStatus("completed"); 
            }else{
                
                request.setDonor(null);
                request.setPatient(p);
                request.setResponse(response);
                request.setStatus("completed");
            }
        
       
       JOptionPane.showMessageDialog(null, "Send Report Succesfully");
        }
    }//GEN-LAST:event_btnResponseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
         container.remove(this);
         Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistanceWorkAreaJpanel sysAdminwjp = (LabAssistanceWorkAreaJpanel) component;
        sysAdminwjp.populateTable();
        sysAdminwjp.mypopulateTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnResponse;
    private javax.swing.JTable donorJtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel resultJlable;
    private javax.swing.JTextField txtResponse;
    // End of variables declaration//GEN-END:variables
}
