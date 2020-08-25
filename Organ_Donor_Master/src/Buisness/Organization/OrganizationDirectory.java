/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Organization;

import Buisness.Enterprise.Enterprise;
import Buisness.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class OrganizationDirectory {
    
    public ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        this.organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    //create organization
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if(type.getValue().equals(type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        if(type.getValue().equals( type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        if(type.getValue().equals(type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
        if(type.getValue().equals(type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        if(type.getValue().equals(type.Legal.getValue())){
            organization = new LegalOrganization();
            organizationList.add(organization);
        }
        if(type.getValue().equals(type.Administration.getValue())){
            organization = new AdministrationOrganization();
            organizationList.add(organization);
        }
        if(type.getValue().equals(type.Transportation.getValue())){
            organization = new TransportOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
     public void deleteOrganization(Organization organization)
    {
      organizationList.remove(organization);
    }
   
}
