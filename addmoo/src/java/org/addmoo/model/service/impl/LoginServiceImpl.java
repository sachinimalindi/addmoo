/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.service.impl;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.login;
import org.addmoo.model.dao.LoginDao;
import org.addmoo.model.service.LoginService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author A.S.Malindi
 */
public class LoginServiceImpl implements LoginService{

    private Log logger= LogFactory.getLog(this.getClass());

    @Override
    public String toString() {
        return "LoginServiceImpl{" + "logger=" + logger + "loginDao=" + loginDao + '}';
    }

    private LoginDao loginDao;

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

  
    @Override
    public org.addmoo.model.bo.login login(String username, String password) throws AddmooException {
        login login = this.getLoginDao().getUser(username);
        if(login!=null){
            if(!login.getPassword().equals(password)){
                login=null;
            }
        }
        return login;
    }

    @Override
    public org.addmoo.model.bo.login getLogin(String username) throws AddmooException {
        login log = this.getLoginDao().getUser(username);
        return log;
    }

    @Override
    public List<org.addmoo.model.bo.login> searchAllLogin() throws AddmooException {
        List<login> list = this.getLoginDao().getUsers();
        return list;
    }

    @Override
    public List<org.addmoo.model.bo.login> searchLogin(String patron) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveLogin(org.addmoo.model.bo.login login) throws AddmooException {
        this.getLoginDao().save(login);
    }

    @Override
    public void deleteLogin(org.addmoo.model.bo.login login) throws AddmooException {
        this.getLoginDao().remove(login);
    }

    @Override
    public void updateLogin(org.addmoo.model.bo.login login) throws AddmooException {
        this.getLoginDao().update(login);
    }


}
