/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Patient;

import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class PatientDirectory {
    
    ArrayList<Patient> patientdirectory;
    Patient p;

    public PatientDirectory() {
        patientdirectory = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(ArrayList<Patient> patientdirectory) {
        this.patientdirectory = patientdirectory;
    }
    
    public void ADDPatient(String name, String emailid, String phone, String bloodtype,
                              float weight, String howsick, String tissue, String organ,int rate,String flag){
       
            p = new Patient();
            p.setName(name);
            p.setEmailid(emailid);
            p.setPhone(phone);
            p.setBloodType(bloodtype);
            p.setWeight(weight);
            p.setHow_sick(howsick);
            p.setTissue_type(tissue);
            p.setOrgan(organ);
            p.setRe_rate(rate);
            p.setFlag(flag);
           patientdirectory.add(p);
            //patientDirectory.ADDPatient(p);
            //return p;
    }
    public void DeletePatient(Patient p){
        patientdirectory.remove(p);
    }
    
     public boolean checkIfUsernameIsUnique(String emailid){
        for (Patient p : patientdirectory){
            if (p.getEmailid().equals(emailid))
                return false;
        }
        return true;
    }

     public void changeStatus(String emailid){
         
         for(Patient p : patientdirectory){
             
             if(p.getEmailid().equals(emailid)){
                 p.setFlag("Complete");
             }
         }
     }
}
