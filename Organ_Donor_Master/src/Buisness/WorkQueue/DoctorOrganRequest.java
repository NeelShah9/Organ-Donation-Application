/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

import Buisness.Donor.Donor;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;


/**
 *
 * @author patel
 */
public class DoctorOrganRequest extends workRequest{
     
    private Patient patient;
    private Donor donor;
    private UserAccount doctorname;
  

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

   

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    @Override
    public String toString() {
        return this.getPatient().getName();
    }

    public UserAccount getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(UserAccount doctorname) {
        this.doctorname = doctorname;
    }
    
    
    
    
}
