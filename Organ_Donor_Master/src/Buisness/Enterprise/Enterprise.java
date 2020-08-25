/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Enterprise;

import Buisness.Organization.Organization;
import Buisness.Organization.OrganizationDirectory;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class Enterprise extends Organization{
    
    private EnterpriseType enterprisetype;
    private OrganizationDirectory organizationdirectory;
    
    public Enterprise(String name,EnterpriseType enterprisetype) {
        super(name);
        this.enterprisetype = enterprisetype;
        this.organizationdirectory = new OrganizationDirectory();
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
     
    public enum EnterpriseType{
        
        OPO("Organ procurement Organization"),
        Transplant_Center("Transplant Center");
        //Laboraties("Laboraties");
        private String value;
         private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }     
  }

    public EnterpriseType getEnterprisetype() {
        return enterprisetype;
    }

    public void setEnterprisetype(EnterpriseType enterprisetype) {
        this.enterprisetype = enterprisetype;
    }

    public OrganizationDirectory getOrganizationdirectory() {
        return organizationdirectory;
    } 
    
}
