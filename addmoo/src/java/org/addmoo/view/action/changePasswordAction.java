/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.addmoo.Globals;
import org.addmoo.model.bo.login;
import org.addmoo.model.service.LoginService;
import org.addmoo.servicefinder.ServiceFinder;
import org.addmoo.view.actionform.changePasswordActionForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sachi
 */
public class changePasswordAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        changePasswordActionForm actionForm = (changePasswordActionForm) form;
       // if (actionForm.getNewPassword().equals(actionForm.getConfirmNewPassword())) {
            LoginService loginService = (LoginService) ServiceFinder.getContext(request).getBean("loginService");
            //session1.setAttribute(Globals.USER, login);
            login attribute = (login) request.getSession(Boolean.FALSE).getAttribute(Globals.USER);
            attribute.setPassword(actionForm.getNewPassword());
            loginService.updateLogin(attribute);
            return mapping.findForward(SUCCESS);
       // } else {
       //     return mapping.findForward(ERROR);
      //  }


    }
}
