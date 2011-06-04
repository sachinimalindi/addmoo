/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao;

import java.util.List;
import org.addmoo.core.model.dao.GenericDao;
import org.addmoo.model.bo.Customer;

/**
 *
 * @author A.S.Malindi
 */
public interface CustomerDao extends GenericDao<Customer, Integer>{
     public List<Customer> getCustomers(String name);
      public List<Customer> getCustomersPerPage(String name,int start,int limit);

}
