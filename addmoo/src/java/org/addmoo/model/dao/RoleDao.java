/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao;

import java.util.List;
import org.addmoo.core.model.dao.GenericDao;
import org.addmoo.model.bo.Role;

/**
 *
 * @author A.S.Malindi
 */
public interface RoleDao extends GenericDao<Role, Integer>{
    //find Roles
    public List<Role> getRoles();

}
