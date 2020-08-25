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
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistance("LabAssistance"),
        Donor("Donor"),
        LegalAuthority("LegalAuthority"),
        Administration("Administration"),
        OPO_Doctor("OPO_Doctor"),
        Driver("Driver");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel container,UserAccount account,
                            Organization organization,Enterprise enterprise,EcoSystem system);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
