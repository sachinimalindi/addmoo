/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.view.actionform;

/**
 *
 * @author Sachi
 */
public class changePasswordActionForm extends org.apache.struts.action.ActionForm {
    private String password;
    private String newPassword;
    private String confirmNewPassword;

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
     * @return the newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * @param newPassword the newPassword to set
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * @return the ConfirmNewPassword
     */
    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }

    /**
     * @param ConfirmNewPassword the ConfirmNewPassword to set
     */
    public void setConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword = confirmNewPassword;
    }
}
