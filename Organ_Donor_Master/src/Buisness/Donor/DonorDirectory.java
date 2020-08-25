/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Donor;

import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class DonorDirectory {
    
   private ArrayList<Donor> donorlist;
   private Donor d;

    public DonorDirectory() {
        
        donorlist = new ArrayList<Donor>();
    }

    public ArrayList<Donor> getDonorlist() {
        return donorlist;
    }

    public void setDonorlist(ArrayList<Donor> donorlist) {
        this.donorlist = donorlist;
    }
    
    public void AddDonor(String name,String emailid,String phone,float weight,
            String bloodgroup,String tissue,int re_rate,int bp,String organ){
        d = new Donor();
        d.setName(name);
        d.setEmailid(emailid);
        d.setPhone(phone);
        d.setWeight(weight);
        d.setBloodgroup(bloodgroup);
        d.setTissue(tissue);
        d.setRe_rate(re_rate);
        d.setBP(bp);
        d.setOrgan(organ);
        donorlist.add(d);
             
    }
    
     public boolean checkIfUsernameIsUnique(String username){
        for (Donor d: donorlist){
            if (d.getName().equals(username))
                return false;
        }
        return true;
    }
}
