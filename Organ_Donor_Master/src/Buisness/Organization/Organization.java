/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Organization;

import Buisness.Donor.Donor;
import Buisness.Donor.DonorDirectory;
import Buisness.Employee.EmployeeDirectory;
import Buisness.Patient.Patient;
import Buisness.Patient.PatientDirectory;
import Buisness.Role.Role;
import Buisness.UserAccount.UserAccountDirectory;
import Buisness.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public abstract class Organization {
    
    private String name;
    private int organizationID ;
    private static int counter=000;
    private WorkQueue workqueue;
    private EmployeeDirectory employedirectory;
    private UserAccountDirectory useraccountdirectory;
    private PatientDirectory patientdirectory;
    private DonorDirectory donorlist;

    public Organization(String name) {
        this.name = name;
        workqueue = new WorkQueue();
        employedirectory = new EmployeeDirectory();
        useraccountdirectory = new UserAccountDirectory();
        patientdirectory = new PatientDirectory();
        donorlist = new DonorDirectory();
        counter++;  
        organizationID = counter;
        
    }
   
    public enum Type{
        
        Admin("Administration organization"),
        Doctor("Doctor organization"),
        Lab("Lab organization"),
        Donor("Organ organization"),
        Legal("legal Authorize Department"),
        Administration("Administration Department"),
        Transportation("Transport Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }  
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    public void setWorkqueue(WorkQueue workqueue) {
        this.workqueue = workqueue;
    }

    public EmployeeDirectory getEmployedirectory() {
        return employedirectory;
    }

    public void setEmployedirectory(EmployeeDirectory employedirectory) {
        this.employedirectory = employedirectory;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public void setUseraccountdirectory(UserAccountDirectory useraccountdirectory) {
        this.useraccountdirectory = useraccountdirectory;
    }

    public PatientDirectory getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(PatientDirectory patientdirectory) {
        this.patientdirectory = patientdirectory;
    }

    public DonorDirectory getDonorlist() {
        return donorlist;
    }

    public void setDonorlist(DonorDirectory donorlist) {
        this.donorlist = donorlist;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
//    public Donor FindbestDonor(Patient p){
//        
//         for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
//            
//            if(organization instanceof DonorOrganization){
//               org1 = (DonorOrganization)organization;
//                System.out.println(org1.getDonorlist().getDonorlist());
//              
//            }
//    return null;
//}
    }