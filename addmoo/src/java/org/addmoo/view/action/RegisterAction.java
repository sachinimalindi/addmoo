/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.view.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.addmoo.model.bo.Role;
import org.addmoo.model.bo.User;
import org.addmoo.model.service.LoginService;
import org.addmoo.model.service.UserService;
import org.addmoo.servicefinder.ServiceFinder;
import org.addmoo.view.actionform.RegisterActionForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sachi
 */
public class RegisterAction extends org.apache.struts.action.Action {

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

        RegisterActionForm form1 = (RegisterActionForm) form;

       // if (form1.getPassword().equals(form1.getConfirmPassword()) || form1.getEmail().equals(form1.getConfirmEmail())) {
            LoginService loginService = (LoginService) ServiceFinder.getContext(request).getBean("loginService");
            UserService userService = (UserService) ServiceFinder.getContext(request).getBean("userService");

            Role role = new Role();
            role.setName("user");
            role.setDescription("user can view adds");

            User user = new User();
            user.setUsername(form1.getUsername());
            user.setPassword(form1.getPassword());
            user.setFullname(form1.getFullname());
            user.setEmailaddress(form1.getEmail());

            List<Role> roles = new ArrayList<Role>();
            roles.add(role);

            user.setRoles(roles);
            return mapping.findForward(SUCCESS);
       // } else {
       //    return mapping.findForward(ERROR);
       // }


    }
}
