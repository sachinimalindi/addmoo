/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao.hibernate;

import java.util.List;
import org.addmoo.core.model.dao.Hibernate.GenericDaoImpl;
import org.addmoo.model.bo.User;
import org.addmoo.model.dao.UserDao;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;

/**
 *
 * @author A.S.Malindi
 */
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao{

    @Override
    public List<User> getUsers(String name) {
        DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
        criteria.add(Expression.like("fullname","%"+ name+"%"));
        return getHibernateTemplate().findByCriteria(criteria);
    }

    @Override
    public List<User> getUsersPerPage(String name, int start, int limit) {
         DetachedCriteria criteria = DetachedCriteria.forClass(User.class);
        criteria.add(Expression.like("fullname","%"+ name+"%"));
        return getHibernateTemplate().findByCriteria(criteria, start, limit);
    }

}
