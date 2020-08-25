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
public class opoDoctorToDonorRequest extends workRequest{
    
    public Patient p;
    public Donor d;

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }

    public Donor getD() {
        return d;
    }

    public void setD(Donor d) {
        this.d = d;
    }
    
    
}
