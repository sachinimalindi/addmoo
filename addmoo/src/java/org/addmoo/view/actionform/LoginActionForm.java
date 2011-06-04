/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.view.actionform;

//import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.addmoo.model.bo.Role;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author A.S.Malindi
 */
public class LoginActionForm extends org.apache.struts.action.ActionForm {

    private String username=null;
    private String password=null;
    private List<Role> roles=null;
  //  private boolean isUserLogIn;
  //  private boolean isAdmin;
  //  private boolean isCustomer;
  //  private boolean isUser;

    /**
     *
     */
    public LoginActionForm() {
        super();
        // TODO Auto-generated constructor stub
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
    public List<Role> getRoles() {
        return roles;
    }

    /**
     * @param roles the roles to set
     */
    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    /*public boolean hasRole(String roleName) {
        Iterator<Role> iterator = roles.iterator();
        while (iterator.hasNext()) {
            Role role = iterator.next();
            if (role.getName().equals(roleName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAdmin() {
       isAdmin= hasRole("admin");
        return isAdmin;
    }

    public boolean isCustomer() {
        isCustomer= hasRole("customer");
        return isCustomer;
    }

    public boolean isUser() {
       isUser= hasRole("user");
         return isUser;
    }*/

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        //System.out.println("LoginActionForm   fdidfsijh aaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        ActionErrors errors = new ActionErrors();

        if (getUsername() == null || getUsername().length() < 1) {
            errors.add("name", new ActionMessage("error.username.required"));
        }
        if (getPassword() == null || getPassword().length() < 1) {
            errors.add("password", new ActionMessage("error.password.required"));
        }
        return errors;
    }

    /**
     * @return the isUserLogIn
     */
   /* public boolean isIsUserLogIn() {
        return isUserLogIn;
    }

    /**
     * @param isUserLogIn the isUserLogIn to set
     */
    /*public void setIsUserLogIn(boolean isUserLogIn) {
        this.isUserLogIn = isUserLogIn;
    }*/
}
