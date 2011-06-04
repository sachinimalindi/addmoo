/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.service;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.User;

/**
 *
 * @author A.S.Malindi
 */
public interface UserService {

    public User getUser(int id) throws AddmooException;

    public List<User> getUser(String patron) throws AddmooException;

    public List<User> getUsers() throws AddmooException;

    public void saveUser(User user) throws AddmooException;

    public void deleteUser(User user) throws AddmooException;

    public void updateUser(User user) throws AddmooException;
}
