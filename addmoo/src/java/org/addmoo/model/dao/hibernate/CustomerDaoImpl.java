/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao.hibernate;

import java.util.List;
import org.addmoo.core.model.dao.Hibernate.GenericDaoImpl;
import org.addmoo.model.bo.Customer;
import org.addmoo.model.dao.CustomerDao;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;

/**
 *
 * @author A.S.Malindi
 */
public class CustomerDaoImpl extends GenericDaoImpl<Customer, Integer> implements CustomerDao
{

    @Override
    public List<Customer> getCustomers(String name) {
       DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
       criteria.add(Expression.like("name", "%" + name + "%"));
        return getHibernateTemplate().findByCriteria(criteria);
    }

    @Override
    public List<Customer> getCustomersPerPage(String name ,int start, int limit) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
       criteria.add(Expression.like("name", "%" + name + "%"));
        return getHibernateTemplate().findByCriteria(criteria, start, limit);
    }

}
