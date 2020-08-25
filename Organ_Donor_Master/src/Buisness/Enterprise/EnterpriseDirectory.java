/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> EnterpriseList;
 
    public EnterpriseDirectory() {
        this.EnterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return EnterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> EnterpriseList) {
        this.EnterpriseList = EnterpriseList;
    }
    
    //create Enterprise
    public Enterprise CreateEnterprise(String name , Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.OPO){
            enterprise = new OPOEnterprise(name);
            EnterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.Transplant_Center){
            enterprise = new TransplantEnterprise(name);
            EnterpriseList.add(enterprise);
        }
        /*if(type == Enterprise.EnterpriseType.Laboraties){
            enterprise = new LaboratiesEnterprise(name);
            EnterpriseList.add(enterprise);
        }*/
        return enterprise;
    }
    public void deleteEnterprise(Enterprise enterprise)
    {
        EnterpriseList.remove(enterprise);
    }
    
}
