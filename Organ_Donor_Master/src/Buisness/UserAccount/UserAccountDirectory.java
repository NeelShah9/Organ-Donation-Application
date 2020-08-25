/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.UserAccount;

import Buisness.Employee.Employee;
import Buisness.Patient.Patient;
import Buisness.Patient.PatientDirectory;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    
   
    public UserAccountDirectory() {
        userAccountList = new ArrayList<UserAccount>();
        
        
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    
    public UserAccount authenticateUser(String username,String password){
        
        for(UserAccount ua : userAccountList){
            if(ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            } }
        return null;
    }
    public UserAccount CreateUserAccount(String username,String password,Employee employee,Role role){
        
        UserAccount user = new UserAccount();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmployee(employee);
        user.setRole(role);
        userAccountList.add(user);
        return user;

    }
    
   public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
   public void deleteUserAccount(UserAccount userAccount)
    {
        userAccountList.remove(userAccount);
    }
   

    
}

    
