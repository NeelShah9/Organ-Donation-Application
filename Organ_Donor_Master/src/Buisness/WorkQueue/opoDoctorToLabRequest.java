/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

import Buisness.Donor.Donor;
import Buisness.Patient.Patient;

/**
 *
 * @author patel
 */
public class opoDoctorToLabRequest extends workRequest{
    
    private Patient patient;
    private Donor donor;

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
    
    
}
