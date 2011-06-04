/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao;

import java.util.List;
import org.addmoo.core.model.dao.GenericDao;
import org.addmoo.model.bo.User;

/**
 *
 * @author A.S.Malindi
 */
public interface UserDao extends GenericDao<User,Integer>{
   public List<User> getUsers(String name);
   public List<User> getUsersPerPage(String name,int start,int limit);
}
