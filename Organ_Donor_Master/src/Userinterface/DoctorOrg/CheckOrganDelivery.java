/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DoctorOrg;

import Buisness.Enterprise.Enterprise;
import Buisness.Organization.Organization;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
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
public class CheckOrganDelivery extends javax.swing.JPanel {

    /**
     * Creates new form CheckOrganDelivery
     */
    
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
     private InformDoctor req2;
    public CheckOrganDelivery(JPanel container, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.container=container;
        this.account=account;
        this.enterprise=enterprise;
        this.organization=organization;
        InformTable();
    }

   public void InformTable(){
        
        DefaultTableModel model = (DefaultTableModel) informJtable.getModel();
         model.setRowCount(0);
         
         for(workRequest request : account.getWorkqueue().getInformDoctorlist()){
             req2 = (InformDoctor)request;
                        Object[] row = new Object[4];
                       
                        row[0] = request.getReceiver();
                        row[1] = req2;
                        row[2] = request.getResponse();
                        row[3] = request.getStatus();
                        model.addRow(row);
         }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        informJtable = new javax.swing.JTable();
        txtRes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Organ", "Response", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(informJtable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 690, 192));
        add(txtRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 194, -1));

        jButton1.setText("Complete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 135, -1));

        jPanel4.setBackground(new java.awt.Color(15, 58, 59));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Organ Delivery Status");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-medical_heart.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 396, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/8.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, -1, -1));

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        int selectedRow = (int)informJtable.getSelectedRow();
        String res = txtRes.getText();
        
        if(selectedRow>=0){
            
            
            
            InformDoctor req = (InformDoctor)informJtable.getValueAt(selectedRow,1 );
           // if(req.getStatus().equals("send")){
            req.setStatus("Complete");
            String email = req.getPatient_email();
            System.out.println(email+"req");
            req.setResponse(res);
            InformTable();
            System.out.println(organization);
            
           
            for(Patient p : organization.getPatientdirectory().getPatientdirectory()){
                
                System.out.println(p.getEmailid()+"org");
                if(p.getEmailid().equals(email)){
                    p.setFlag("complete");
                }
            }
            //organization.getPatientdirectory().changeStatus(email);
//            }else{
//                
//                JOptionPane.showMessageDialog(null, "Process Complete");  
//            }
            
        }else{
           JOptionPane.showMessageDialog(null, "Select Request first");  
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable informJtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
