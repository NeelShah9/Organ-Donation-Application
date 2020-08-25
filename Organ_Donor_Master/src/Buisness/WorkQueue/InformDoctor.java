/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.WorkQueue;

import Buisness.UserAccount.UserAccount;


/**
 *
 * @author patel
 */
public class InformDoctor extends workRequest{
    
    private UserAccount doctor;
    private String Patient_name;
    private String Patient_email;
    private String organ;

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public String getPatient_name() {
        return Patient_name;
    }

    public void setPatient_name(String Patient_name) {
        this.Patient_name = Patient_name;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getPatient_email() {
        return Patient_email;
    }

    public void setPatient_email(String Patient_email) {
        this.Patient_email = Patient_email;
    }
    
    

    @Override
    public String toString() {
        return this.organ;
    }
   
 
}
