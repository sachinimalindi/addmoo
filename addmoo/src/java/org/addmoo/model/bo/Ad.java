/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.bo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Where;

/**
 *
 * @author A.S.Malindi
 */
@Entity
public class Ad implements Serializable {

    private Customer customer;
    private int adId;
    private String title;
    private String Describe;

    /**
     * @return the adId
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getAdId() {
        return adId;
    }

    /**
     * @param adId the adId to set
     */
    public void setAdId(int adId) {
        this.adId = adId;
    }

    /**
     * @return the title
     */
    @Column(name = "AdTitle", length = 100, nullable = false)
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
     * @return the Describe
     */
    @Column(name = "AdDescribe", length = 255, nullable = false)
    public String getDescribe() {
        return Describe;
    }

    /**
     * @param Describe the Describe to set
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }
    //private List<AdImage> images;

    /**
     * @return the adId
     */
    // @Id
    // @GeneratedValue(strategy=GenerationType.SEQUENCE)
    // @Column(name="AdID",length=12,nullable=false)
    //  public int getAdId() {
    //      return adId;
    //  }
    /**
     * @param adId the adId to set
     */
    //  public void setAdId(int adId) {
    //     this.adId = adId;
    //  }
    /**
     * @return the title
     */
    // @Column(name="AdTitle",length=100,nullable=false)
    //  public String getTitle() {
    //      return title;
    //  }
    /**
     * @param title the title to set
     */
    // public void setTitle(String title) {
    //     this.title = title;
    // }
    /**
     * @return the Describe
     */
    // @Column(name="AdDescribe",length=255,nullable=false)
    //  public String getDescribe() {
    //      return Describe;
    //  }
    /**
     * @param Describe the Describe to set
     */
    // public void setDescribe(String Describe) {
    //     this.Describe = Describe;
    // }
    /**
     * @return the customer
     */
    
    
    @ManyToOne
    @JoinColumn(name="LoginId")
    @Where(clause="dtype='Customer'")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    /**
     * @return the images
     */
    //  @OneToMany(targetEntity=AdImage.class,mappedBy="ad",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    //  public List<AdImage> getImages() {
    //      return images;
    //  }
    /**
     * @param images the images to set
     */
    //  public void setImages(List<AdImage> images) {
    //      this.images = images;
    //  }
}
