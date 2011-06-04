/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.bo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

/**
 *
 * @author A.S.Malindi
 */
@Entity
public class AdImage implements Serializable {

    private int id;
    private String mimeType;
    private byte[] imageFile;
    private Ad ad;

    /**
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "AdImageID", length = 12, nullable = false)
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the mimeType
     */
    @Column(name = "MimeType", length = 8, nullable = false)
    public String getMimeType() {
        return mimeType;
    }

    /**
     * @param mimeType the mimeType to set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * @return the imageFile
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "AdImage", nullable = true)
    public byte[] getImageFile() {
        return imageFile;
    }

    /**
     * @param imageFile the imageFile to set
     */
    public void setImageFile(byte[] imageFile) {
        this.imageFile = imageFile;
    }

    /**
     * @return the ad
     */
    @ManyToOne
    @JoinColumn(name="AdImageID")
    public Ad getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(Ad ad) {
        this.ad = ad;
    }
}
