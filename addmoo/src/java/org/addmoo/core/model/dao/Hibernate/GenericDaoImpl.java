/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.core.model.dao.Hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import org.addmoo.core.model.dao.GenericDao;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author A.S.Malindi
 */
public abstract  class GenericDaoImpl<T, ID extends Serializable> extends HibernateDaoSupport implements GenericDao<T, ID>
{
    private Class<T> persistentClass;

    @SuppressWarnings("unchecked")
    public GenericDaoImpl() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    
    public Class<T> getPersistentClass() {
        return persistentClass;
    }


    @Override
     @SuppressWarnings("unchecked")
    public T get(ID id) {
        return (T) getHibernateTemplate().get(getPersistentClass(), id);
    }

    @Override
    public void save(T entity) {
          getHibernateTemplate().save(entity);
    }

    @Override
    public void remove(T entity) {
        getHibernateTemplate().delete(entity);
    }

    @Override
    public void update(T entity) {
        getHibernateTemplate().update(entity);
    }


}
