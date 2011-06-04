/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.service.impl;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.Role;
import org.addmoo.model.dao.RoleDao;
import org.addmoo.model.service.RoleService;

/**
 *
 * @author Sachi
 */
public class RoleServiceImpl implements RoleService{

    private RoleDao roleDao;

    public RoleDao getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }


    @Override
    public Role getRole(int id) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Role getRole(String nombre) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Role> getRoles() throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
