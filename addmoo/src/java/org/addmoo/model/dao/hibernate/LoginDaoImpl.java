/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao.hibernate;

import java.util.List;
import org.addmoo.core.model.dao.Hibernate.GenericDaoImpl;
import org.addmoo.model.bo.login;
import org.addmoo.model.dao.LoginDao;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Projections;

/**
 *
 * @author A.S.Malindi
 */
public class LoginDaoImpl extends GenericDaoImpl<login, Integer> implements LoginDao{

    @Override
    public login getUser(String userName) {
        login login= null;
       DetachedCriteria criteria = DetachedCriteria.forClass(login.class);
       criteria.add(Expression.eq("username", userName));

       List<login> list = getHibernateTemplate().findByCriteria(criteria);
       if(!list.isEmpty()){
           login = list.get(0);
       }
        return login;
    }

    @Override
    public int getUserCount(String userName) {
        int count= 0;
        DetachedCriteria criteria = DetachedCriteria.forClass(login.class);
        criteria.add(Expression.like("username",userName+"%"));
        criteria.setProjection(Projections.rowCount());
        count =(Integer) getHibernateTemplate().findByCriteria(criteria).get(0);
        return count;
    }

    @Override
    public List<login> getUserPerPage(String userName, int start, int limit) {
        DetachedCriteria criteria = DetachedCriteria.forClass(login.class);
        criteria.add(Expression.like("username",userName+"%"));
        return getHibernateTemplate().findByCriteria(criteria, start, limit);
    }

    @Override
    public List<login> getUsers() {
        List<login> list = getHibernateTemplate().loadAll(login.class);
        return list;

    }

}
