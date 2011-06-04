/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author A.S.Malindi
 */
@Entity
@Table(name="TAG")
public class AddTag {
    private int tagId;
    private String tag;

    /**
     * @return the tagId
     */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="TagID",length=12,nullable=false)
    public int getTagId() {
        return tagId;
    }

    /**
     * @param tagId the tagId to set
     */
    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    /**
     * @return the tag
     */
    @Column(name="TagName",length=100,nullable=false,unique=true)
    public String getTag() {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

}
