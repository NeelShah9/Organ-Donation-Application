/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Network;

import Buisness.Enterprise.Enterprise;
import Buisness.Enterprise.EnterpriseDirectory;

/**
 *
 * @author patel
 */
public class Network {
    
    private String network;
    private String state;
    private EnterpriseDirectory enterprisedirectory;

    public Network() {
        enterprisedirectory=new EnterpriseDirectory();
    }
    

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EnterpriseDirectory getEnterprisedirectory() {
        return enterprisedirectory;
    }

  
    
    
    @Override
    public String toString(){
        return network;
    }
    
}
