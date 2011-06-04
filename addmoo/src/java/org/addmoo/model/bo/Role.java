/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.bo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author A.S.Malindi
 */
@Entity
public class Role implements Serializable {

    private List<login> logins;
    private int roleId;
    private String name;
    private String description;

    /**
     * @return the roleId
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RoleId")
    public int getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @ManyToMany(mappedBy = "roles")
    public List<login> getLogins() {
        return logins;
    }

    public void setLogins(List<login> logins) {
        this.logins = logins;
    }
}
