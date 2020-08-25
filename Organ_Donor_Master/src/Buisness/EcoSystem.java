/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import Buisness.Network.Network;
import Buisness.Organization.Organization;
import Buisness.Role.Role;
import Buisness.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class EcoSystem extends Organization{

   public static EcoSystem system;
   
   private ArrayList<Network> networkList;

    public EcoSystem() {
         super(null);
         networkList = new ArrayList<>();
    }
  
   public static EcoSystem getInstance() {
       if(system == null){
           system = new EcoSystem();
       }
       return system;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public void deleteNetwork(Network network)
    {
        networkList.remove(network);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SysAdminRole());
        return roleList;
    }
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUseraccountdirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
