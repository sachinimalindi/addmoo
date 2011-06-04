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
public class NewClass1 {
    public static void  main(String agrs[]){
      AnnotationConfiguration configuration = new AnnotationConfiguration();
      configuration.addAnnotatedClass(login.class);
      configuration.addAnnotatedClass(User.class);
      configuration.addAnnotatedClass(Customer.class);
      configuration.addAnnotatedClass(Ad.class);
      configuration.addAnnotatedClass(AdImage.class);
      configuration.configure();

      new SchemaExport(configuration).create(true, true);

      SessionFactory factory = configuration.buildSessionFactory();
      Session session = factory.getCurrentSession();
      session.beginTransaction();

      Customer customer = new Customer();
      customer.setUsername("Sachi");
      customer.setCompany("my company");
      customer.setDontCall(false);
      customer.setEmailaddress("sdsadsad@me.com");
      customer.setEnabled(true);
      customer.setPassword("password");
      customer.setPhoneMobile("23245354535");
      customer.setPhoneOther("554645665");
      customer.setTitle("student");

      login admin = new login();
      admin.setPassword("admin");
      admin.setUsername("admin");

      User user = new User();
      user.setEmailaddress("sdfsfds@fgd.com");
      user.setEnabled(true);
      user.setFullname("hggfh fghgfh ghgfh");
      user.setUsername("username");
      user.setPassword("password");

      List<Role> roles_user = new ArrayList<Role>();
      List<Role> roles_customer = new ArrayList<Role>();
      List<Role> roles_admin = new ArrayList<Role>();

      Role user_role = new Role();
      user_role.setName("user");
      user_role.setDescription("user can view adds");

      Role customer_role = new Role();
      customer_role.setName("customer");
      customer_role.setDescription("customer can post a add");

      Role admin_role = new Role();
      admin_role.setName("admin");
      admin_role.setDescription("admin can do any thing");

      roles_user.add(user_role);

      roles_customer.add(user_role);
      roles_customer.add(customer_role);

      roles_admin.add(user_role);
      roles_admin.add(customer_role);
      roles_admin.add(admin_role);

   //   user.setRoles(roles_user);
    //  customer.setRoles(roles_customer);
   //   admin.setRoles(roles_admin);
      
      session.save(user_role);
      session.save(customer_role);
      session.save(admin_role);

      session.save(user);
      session.save(customer);
      session.save(admin);
    
      session.getTransaction().commit();
    }

}
