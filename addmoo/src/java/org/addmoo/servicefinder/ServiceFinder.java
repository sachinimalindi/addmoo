/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.servicefinder;

import javax.servlet.http.HttpServletRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 *
 * @author A.S.Malindi
 */
public class ServiceFinder {

    public static ApplicationContext getContext(HttpServletRequest httpRequest) {
        return WebApplicationContextUtils.getRequiredWebApplicationContext(
                httpRequest.getSession().getServletContext());
    }
}
