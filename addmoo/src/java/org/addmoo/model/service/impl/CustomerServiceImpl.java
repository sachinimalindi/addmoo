/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.service.impl;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.Customer;
import org.addmoo.model.dao.CustomerDao;
import org.addmoo.model.service.CustomerService;

/**
 *
 * @author Sachi
 */
public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Customer getCustomer(int id) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Customer> getCustomer(String patron) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Customer> getCustomers() throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveCustomer(Customer customer) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteCustomer(Customer customer) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateCustomer(Customer customer) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
