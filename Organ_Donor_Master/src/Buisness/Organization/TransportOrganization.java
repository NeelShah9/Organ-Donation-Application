/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Organization;

import Buisness.Role.DoctorRole;
import Buisness.Role.DriverRole;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class TransportOrganization extends Organization{

    public TransportOrganization() {
        super(Organization.Type.Transportation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<>();
        role.add(new DriverRole());
        return role;
    }
    
}
