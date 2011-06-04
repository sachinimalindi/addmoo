/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.bo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

/**
 *
 * @author A.S.Malindi
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class User extends login implements Serializable {
    
    private String fullname;
    private String emailaddress;
    private boolean enabled=true;

    /**
     * @return the fullname
     */
    @Column(name = "fullname", length = 100, nullable = false)
    public String getFullname() {
        return fullname;
    }

    /**
     * @param fullname the fullname to set
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @return the emailaddress
     */
    @Column(name = "emailaddress", length = 100)
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
    @Column(name = "enabled", length = 255, nullable = false)
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * @param enabled the enabled to set
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

//
// 
//

}
