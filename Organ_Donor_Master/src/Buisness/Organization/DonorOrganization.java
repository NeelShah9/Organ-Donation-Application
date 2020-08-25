/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Organization;

import Buisness.Role.DonorRole;
import Buisness.Role.OPO_DoctorRole;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class DonorOrganization extends Organization{

    public DonorOrganization() {
        super(Organization.Type.Donor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList<>();
        role.add(new DonorRole());
        role.add(new OPO_DoctorRole());
        return role;
    }
    
}
