/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao.hibernate;

import java.util.List;
import org.addmoo.core.model.dao.Hibernate.GenericDaoImpl;
import org.addmoo.model.bo.Ad;
import org.addmoo.model.dao.AdDao;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Expression;

/**
 *
 * @author A.S.Malindi
 */
public class AdDaoImpl extends GenericDaoImpl<Ad, Integer> implements AdDao {

    @Override
    public List<Ad> getAds(String name) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Ad.class);
        criteria.add(Expression.like("AdTitle", "%"+name+"%"));
        return getHibernateTemplate().findByCriteria(criteria);
    }

    @Override
    public List<Ad> getAdsPerPage(String name,int start, int limit) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Ad.class);
        criteria.add(Expression.like("AdTitle", "%"+name+"%"));
        return getHibernateTemplate().findByCriteria(criteria, start, limit);
    }

    @Override
    public Ad getAd(int id) {
        return getHibernateTemplate().load(Ad.class, id);
    }

}
