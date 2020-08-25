/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import Buisness.Employee.Employee;
import Buisness.Role.SysAdminRole;
import Buisness.UserAccount.UserAccount;

/**
 *
 * @author patel
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployedirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUseraccountdirectory().CreateUserAccount("sysadmin", "sysadmin", employee, new SysAdminRole());
        
        
        return system;
        
    }
    
}
