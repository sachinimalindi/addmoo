/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.bo.test;

import java.util.ArrayList;
import java.util.List;
import org.addmoo.model.bo.Ad;
import org.addmoo.model.bo.Customer;
import org.addmoo.model.bo.User;
import org.addmoo.model.bo.login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author A.S.Malindi
 */
public class NewClass2 {

    public static void main(String agrs[]) {
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.addAnnotatedClass(login.class);
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Customer.class);
        configuration.configure();

        new SchemaExport(configuration).create(true, true);

        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        login login = new login();
        login.setUsername("username");
        login.setPassword("password");

        User user = new User();
        user.setEmailaddress("dfdfdsf@dfd.com");
        user.setUsername("dfdf");
        user.setPassword("pass");
        user.setEnabled(true);
        user.setFullname("hdhf khdfkj");

        Customer customer = new Customer();
        customer.setCompany("my company");
        customer.setDontCall(true);
        customer.setUsername("cus");
        customer.setPhoneMobile("32323332");
        customer.setTitle("dfdfdfdf");
        customer.setEmailaddress("cua$email.com");
        customer.setPhoneOther("23233213");

        Ad ad1 = new Ad();
        ad1.setTitle("title1");
        ad1.setDescribe("fgd fuhdh idfukdf udfyhudf dihfudjf yughuydfgdisfu d.");

        Ad ad2 = new Ad();
        ad2.setTitle("title2");
        ad2.setDescribe("sdf dfdfd dgfdf yty tytry fdfsdgfdg rtyrtyr fgfd gffgdfg.");

      //  ad1.setCustomer(customer);
       // ad2.setCustomer(customer);

        List<Ad> ads = new ArrayList<Ad>();
        ads.add(ad1);
        ads.add(ad2);

        customer.setOwnerAds(ads);

        session.save(login);
        session.save(user);
        session.save(ad1);
        session.save(ad2);
        session.save(customer);

        session.getTransaction().commit();


    }
}
