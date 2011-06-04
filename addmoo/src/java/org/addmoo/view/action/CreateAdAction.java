/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.view.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.addmoo.model.bo.Ad;
import org.addmoo.model.service.AdService;
import org.addmoo.servicefinder.ServiceFinder;
import org.addmoo.view.actionform.CreateAdActionForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Sachi
 */
public class CreateAdAction extends org.apache.struts.action.Action {
    
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
        CreateAdActionForm actionForm = (CreateAdActionForm) form;
        AdService adService = (AdService) ServiceFinder.getContext(request).getBean("adService");

        Ad ad = new Ad();
        ad.setTitle(actionForm.getTitle());
        ad.setDescribe(actionForm.getDescribe());

        adService.saveAd(ad);
        return mapping.findForward(SUCCESS);
    }
}
