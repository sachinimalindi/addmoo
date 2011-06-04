/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao;

import java.util.List;
import org.addmoo.core.model.dao.GenericDao;
import org.addmoo.model.bo.login;

/**
 *
 * @author A.S.Malindi
 */
public interface LoginDao extends GenericDao<login,Integer> {
    
    // fing logins
    public login getUser(String userName);
    public int getUserCount(String userName);
    public List<login> getUserPerPage(String userName,int start,int limit);
    public List<login> getUsers();
   
}
