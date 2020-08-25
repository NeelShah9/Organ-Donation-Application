/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Organization;

import Buisness.Role.DoctorRole;
import Buisness.Role.DonorRole;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class DoctorOrganization extends Organization{

    public DoctorOrganization() {
        super(Type.Doctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<>();
        role.add(new DoctorRole());
        return role;
    }
    
}
