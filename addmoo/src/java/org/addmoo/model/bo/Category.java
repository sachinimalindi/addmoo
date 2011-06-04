/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.bo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author A.S.Malindi
 */
@Entity
public class Category implements Serializable {
    private int catId;
    private String name;
    private int activeUserCount;
    private List<Attribute> attributes;

    /**
     * @return the catId
     */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="TagID",length=12,nullable=false)
    public int getCatId() {
        return catId;
    }

    /**
     * @param catId the catId to set
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }

    /**
     * @return the name
     */
    @Column(name="CategoryName",length=100,nullable=false,unique=true)
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
     * @return the activeUserCount
     */
    @Transient
    @Column(name="ActiveUserCount")
    public int getActiveUserCount() {
        return activeUserCount;
    }

    /**
     * @param activeUserCount the activeUserCount to set
     */
    public void setActiveUserCount(int activeUserCount) {
        this.activeUserCount = activeUserCount;
    }

    /**
     * @return the attributes
     */
    @OneToMany(targetEntity=Attribute.class,mappedBy="category",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

}
