/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.bo.test;

import java.util.ArrayList;
import java.util.List;
import org.addmoo.model.bo.Ad;
import org.addmoo.model.bo.AdImage;
import org.addmoo.model.bo.Customer;
import org.addmoo.model.bo.Role;
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
public class NewClass3 {

    public static void main(String agrs[]) {

        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.addAnnotatedClass(Ad.class);
        configuration.addAnnotatedClass(login.class);
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Customer.class);
        //configuration.addAnnotatedClass(AdImage);
        configuration.addAnnotatedClass(Role.class);
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
        customer.setPassword("pass");

        Ad ad1 = new Ad();
        ad1.setTitle("title 1 ");
        ad1.setDescribe("dfjidfj jgolg fdjgfdgjkfg");

        Ad ad2 = new Ad();
        ad2.setTitle("title 2 ");
        ad2.setDescribe("fdf dfsdf fddsssss");

        List<Ad> ads = new ArrayList<Ad>();
        ads.add(ad1);
        ads.add(ad2);

        customer.setOwnerAds(ads);

        Role role_admin = new Role();
        role_admin.setName("admin");
        role_admin.setDescription("admin can do any thing ");

        Role role_cus = new Role();
        role_cus.setName("customer");
        role_cus.setDescription("customer can post a add");

        Role role_user = new Role();
        role_user.setName("user");
        role_user.setDescription("user can view adds");

        List<Role> roles = new ArrayList<Role>();
        roles.add(role_admin);
        roles.add(role_cus);
        roles.add(role_user);

        login.setRoles(roles);

        session.save(login);
        session.save(user);

        session.save(customer);
        session.save(ad1);
        session.save(ad2);
        session.save(role_admin);
        session.save(role_cus);
        session.save(role_user);

        System.out.println("//////////////////////////////////////////////////////////////////////");
        System.out.println("roles of users");
        List<Role> roles1 = user.getRoles();
        Role[] toArray = (Role[]) roles1.toArray();
        for (int x = 0; x < toArray.length; x++) {
            System.out.println(toArray[x].getName());
        }
        System.out.println("roles of login");
        List<Role> roles2 = login.getRoles();
        Role[] toArray2 = (Role[]) roles2.toArray();
        for (int x = 0; x < toArray.length; x++) {
            System.out.println(toArray[x].getName());
        }
        System.out.println("roles of customer");
        List<Role> roles3 = login.getRoles();
        Role[] toArray3 = (Role[]) roles3.toArray();
        for (int x = 0; x < toArray.length; x++) {
            System.out.println(toArray[x].getName());
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////");
        session.getTransaction().commit();

    }
}
