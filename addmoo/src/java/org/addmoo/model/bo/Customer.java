/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.bo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * @author A.S.Malindi
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue(value="Customer")
public class Customer extends login implements Serializable {

    
    private String name;
    private String title;
    private String company;
    private String phoneMobile; 
    private String phoneOther;
    private boolean dontCall=false;
    private String emailaddress;
    private boolean enabled=true;
    private List<Ad> ownerAds;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the title
     */
    @Column(name = "title", length = 64)
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the company
     */
    @Column(name = "company", length = 128)
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the phoneMobile
     */
    @Column(name = "phone_mobile", length = 20)
    public String getPhoneMobile() {
        return phoneMobile;
    }

    /**
     * @param phoneMobile the phoneMobile to set
     */
    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    /**
     * @return the phoneOther
     */
    @Column(name = "phone_other", length = 20)
    public String getPhoneOther() {
        return phoneOther;
    }

    /**
     * @param phoneOther the phoneOther to set
     */
    public void setPhoneOther(String phoneOther) {
        this.phoneOther = phoneOther;
    }

    /**
     * @return the dontCall
     */
    @Column(name = "dont_call", nullable = false)
    public boolean isDontCall() {
        return dontCall;
    }

    /**
     * @param dontCall the dontCall to set
     */
    public void setDontCall(boolean dontCall) {
        this.dontCall = dontCall;
    }

    /**
     * @return the emailaddress
     */
    public String getEmailaddress() {
        return emailaddress;
    }

    /**
     * @param emailaddress the emailaddress to set
     */
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }

    /**
     * @return the enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * @return the ownerAds
     */

    
    
    @OneToMany(cascade=CascadeType.ALL,mappedBy="customer")
    public List<Ad> getOwnerAds() {
        return ownerAds;
    }

    /**
     * @param ownerAds the ownerAds to set
     */
    public void setOwnerAds(List<Ad> ownerAds) {
        this.ownerAds = ownerAds;
    }
    //private List<Ad> ownerAds;
   
    /**
     * @return the ownerAds
     */

   // @OneToMany(mappedBy = "customer")
   // public List<Ad> getOwnerAds() {
  //      return ownerAds;
  //  }

    /**
     * @param ownerAds the ownerAds to set
     */
  //  public void setOwnerAds(List<Ad> ownerAds) {
  //      this.ownerAds = ownerAds;
 //   }

    

}
