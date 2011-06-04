/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.view.actionform;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Sachi
 */
public class CreateAdActionForm extends org.apache.struts.action.ActionForm {
    
    private String title;
    private String describe;
    

    /**
     * @return the Describe
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * @param Describe the Describe to set
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

}
