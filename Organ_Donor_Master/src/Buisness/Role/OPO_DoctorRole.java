/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Role;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Userinterface.OPOWorkArea.OPODoctorWorkAreaJpanel;
import Userinterface.OPOWorkArea.mainJPanel;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class OPO_DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new mainJPanel(container,account,enterprise,system);
    }
    
}
