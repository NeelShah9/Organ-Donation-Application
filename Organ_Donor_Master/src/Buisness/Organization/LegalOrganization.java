/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness.Organization;

import Buisness.Role.AdminRole;
import Buisness.Role.LegalAuthorityRole;
import Buisness.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class LegalOrganization extends Organization{

    public LegalOrganization() {
        super(Organization.Type.Legal.getValue());
    }
  
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LegalAuthorityRole());
        return roles;
    }
    
}
