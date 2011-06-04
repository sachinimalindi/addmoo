/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.core.model.dao;

import java.io.Serializable;

/**
 *
 * @author A.S.Malindi
 */
public interface GenericDao<T ,ID extends Serializable> {
    public T get(ID id);
    public void save(T entity);
    public void remove(T entity);
    public void update(T entity);


}
