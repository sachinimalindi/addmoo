/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.service.impl;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.User;
import org.addmoo.model.dao.UserDao;
import org.addmoo.model.service.UserService;

/**
 *
 * @author Sachi
 */
public class UserServiceImpl implements UserService{

    private UserDao UserDao;
    public void setUserDao(UserDao UserDao) {
        this.UserDao = UserDao;
    }

      public UserDao getUserDao() {
        return UserDao;
    }

    @Override
    public User getUser(int id) throws AddmooException {
        return getUserDao().get(id);
    }

    @Override
    public List<User> getUser(String patron) throws AddmooException {
        return getUserDao().getUsers(patron);
    }

    @Override
    public List<User> getUsers() throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveUser(User user) throws AddmooException {
        getUserDao().save(user);
    }

    @Override
    public void deleteUser(User user) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateUser(User user) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

  
  

}
