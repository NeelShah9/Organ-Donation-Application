/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.UserAccount;

import Buisness.Employee.Employee;
import Buisness.Role.Role;
import Buisness.WorkQueue.WorkQueue;

/**
 *
 * @author patel
 */
public class UserAccount {
    
    private String Username;
    private String Password;
    private Employee employee;
    private Role role;
    private WorkQueue workqueue;

    public UserAccount() {
        this.workqueue = new WorkQueue();
    }
    
    

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkqueue() {
        return workqueue;
    }

    @Override
    public String toString() {
        return this.Username;
    }

    
}
