/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.service;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.Customer;

/**
 *
 * @author A.S.Malindi
 */
public interface CustomerService {

    public Customer getCustomer(int id) throws AddmooException;

    public List<Customer> getCustomer(String patron) throws AddmooException;

    public List<Customer> getCustomers() throws AddmooException;

    public void saveCustomer(Customer customer) throws AddmooException;

    public void deleteCustomer(Customer customer) throws AddmooException;

    public void updateCustomer(Customer customer) throws AddmooException;
}
