/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Patient;

/**
 *
 * @author patel
 */
public class Patient {
      
    private String Name;
    private String emailid;
    private String phone;
    private float weight ;
    private String bloodType;
    private String how_sick;
    private String tissue_type;
    private String organ;
    private static int count = 00;
    private String id;
    private int re_rate;
    private String flag;

    public Patient() {
        StringBuffer sb = new StringBuffer();
        sb.append("Patient_01");
        sb.append(count);
        id = sb.toString();
        count++;
       
    }

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getHow_sick() {
        return how_sick;
    }

    public void setHow_sick(String how_sick) {
        this.how_sick = how_sick;
    }

    public String getTissue_type() {
        return tissue_type;
    }

    public void setTissue_type(String tissue_type) {
        this.tissue_type = tissue_type;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRe_rate() {
        return re_rate;
    }

    public void setRe_rate(int re_rate) {
        this.re_rate = re_rate;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
    
    

    @Override
    public String toString() {
        return this.Name;
        
    }

   
    
    
    
}
