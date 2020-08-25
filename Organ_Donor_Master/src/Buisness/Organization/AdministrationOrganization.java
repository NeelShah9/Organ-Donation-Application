/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Organization;

import Buisness.Role.AdministrationRole;
import Buisness.Role.LegalAuthorityRole;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class AdministrationOrganization extends Organization{

    public AdministrationOrganization() {
        super(Organization.Type.Administration.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdministrationRole());
        return roles;
    }
    
}
