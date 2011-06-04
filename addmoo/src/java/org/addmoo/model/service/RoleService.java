/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.service;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.Role;

/**
 *
 * @author A.S.Malindi
 */
public interface RoleService {

    public Role getRole(int id) throws AddmooException;

    public Role getRole(String nombre) throws AddmooException;

    public List<Role> getRoles() throws AddmooException;
}
