/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.service;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.login;

/**
 *
 * @author A.S.Malindi
 */
public interface LoginService {

    public login login(String username, String password) throws AddmooException;

    public login getLogin(String username) throws AddmooException;

    public List<login> searchAllLogin() throws AddmooException;

    public List<login> searchLogin(String patron) throws AddmooException;

    public void saveLogin(login login) throws AddmooException;

    public void deleteLogin(login login) throws AddmooException;

    public void updateLogin(login login) throws AddmooException;
}
