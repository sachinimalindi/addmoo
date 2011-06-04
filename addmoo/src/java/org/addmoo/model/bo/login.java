/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.bo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

/**
 *
 * @author A.S.Malindi
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class login implements Serializable{
    protected  int loginId;
    protected  String username ;
    protected  String password;
    protected  List<Role> roles = new ArrayList<Role>();

    //String dtype = this.class.simpleName

    /**
     * @return the loginId
     */
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="LoginId")
    public int getLoginId() {
        return loginId;
    }

    /**
     * @param loginId the loginId to set
     */
    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * @return the roles
     */
    @ManyToMany
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(List<Role> roles) {
       this.roles = roles;
    }

    /*public boolean hasRole(String roleName){
        Iterator<Role> iterator = roles.iterator();
        while (iterator.hasNext()) {
            Role role = iterator.next();
            if (role.getName().equals(roleName)) {
               return true;
            }
        }
        return false;
    }

    public boolean isAdmin(){
        return hasRole("admin");
    }

    public boolean isCustomer(){
        return hasRole("customer");
    }
    public boolean isUser(){
        return hasRole("user");
    }*/
}
