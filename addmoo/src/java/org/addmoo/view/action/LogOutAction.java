/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.view.action;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.addmoo.Globals;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sachi
 */
public class LogOutAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";
    //Map<String, Object> session;
    HttpSession session;

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
        try {
            //session = (Map<String, Object>) request.getSession().getAttribute("userSession");
            //session.clear();
            //session.put(Globals.LOGGED_FLAG, Boolean.FALSE);
           session.setAttribute(Globals.LOGGED_FLAG, Boolean.FALSE);
           session.removeAttribute(Globals.USER);
            //session.invalidate();

        } catch (Exception e) {
            throw new Exception("ERROR from LOGOUT ACTION : " + e.getMessage());
        }
        request.getSession().setAttribute("userSession", session);
        return mapping.findForward(SUCCESS);
    }
}
