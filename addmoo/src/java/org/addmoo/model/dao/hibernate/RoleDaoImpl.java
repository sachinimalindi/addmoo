/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao.hibernate;

import java.util.List;
import org.addmoo.core.model.dao.Hibernate.GenericDaoImpl;
import org.addmoo.model.bo.Role;
import org.addmoo.model.dao.RoleDao;

/**
 *
 * @author A.S.Malindi
 */
public class RoleDaoImpl extends GenericDaoImpl<Role, Integer> implements RoleDao{

    @Override
    public List<Role> getRoles() {
        return getHibernateTemplate().loadAll(Role.class);
    }

}
