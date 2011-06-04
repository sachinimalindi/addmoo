/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.view.action;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.addmoo.Exception.AddmooException;
import org.addmoo.Globals;
import org.addmoo.model.bo.Role;
import org.addmoo.model.bo.login;
import org.addmoo.model.service.LoginService;
import org.addmoo.servicefinder.ServiceFinder;
import org.addmoo.view.actionform.LoginActionForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.BeansException;

/**
 *
 * @author A.S.Malindi
 */
public class LoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";
    private Map<String, Object> session;
    HttpSession session1;

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
       // System.out.print("fgdfgfgfg");
        String result = null;
        login login = null;
        try {
            LoginActionForm actionForm = (LoginActionForm) form;
            System.out.println("LoginActionForm");
            System.out.println(actionForm.getPassword());
            System.out.println(actionForm.getUsername());

            LoginService loginService = (LoginService) ServiceFinder.getContext(request).getBean("loginService");
            System.out.println(loginService);
            login = loginService.login(actionForm.getUsername(), actionForm.getPassword());
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa1");
            session1 = request.getSession(true);

            System.out.println(login.getLoginId());
            System.out.println(login.getPassword());
            System.out.println(login.getUsername());
            if (login != null) {
                // session.put(Globals.LOGGED_FLAG, Boolean.TRUE);
                // session.put(Globals.USER, login);
                session1.setAttribute(Globals.LOGGED_FLAG, Boolean.TRUE);
               // actionForm.setIsUserLogIn(true);
                List<Role> roles = login.getRoles();
                actionForm.setRoles(roles);

                session1.setAttribute(Globals.USER, actionForm);
            } else {
                System.out.println("ERROR ");
                // session.clear();
                // session.put(Globals.LOGGED_FLAG, Boolean.FALSE);
                session1.setAttribute(Globals.LOGGED_FLAG, Boolean.FALSE);
                //result=ERROR;
                return mapping.findForward(ERROR);
            }
        } catch (BeansException beansException) {
        } catch (AddmooException addmooException) {
        }
        //HttpSession session1 =request.getSession();//.setAttribute("userSession",session);
        System.out.println("SUCCESS ");
        return mapping.findForward(SUCCESS);
    }

    /**
     * @param session the session to set
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }
}
