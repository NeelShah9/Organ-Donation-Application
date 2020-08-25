/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.OPOWorkArea;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorToDriverRequest;
import Buisness.WorkQueue.workRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class OrganDeliveryJpanel extends javax.swing.JPanel {

    /**
     * Creates new form OrganDeliveryJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private DoctorToDriverRequest req1;
    public OrganDeliveryJpanel(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
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
         for(workRequest request : account.getWorkqueue().getDoctorToDriverList()){
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
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        driverJtable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 690, 162));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/organ-donation-logo.jpg"))); // NOI18N
        jLabel8.setText("jLabel2");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 90));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Organ Delivery");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-medical_heart.png"))); // NOI18N
        jLabel10.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(849, Short.MAX_VALUE))
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

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1110, 60));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 90, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable driverJtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
