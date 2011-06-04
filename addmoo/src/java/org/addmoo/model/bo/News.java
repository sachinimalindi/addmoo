/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.bo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;

/**
 *
 * @author A.S.Malindi
 */
@Entity
public class News implements Serializable {
  private int newsId;
  private String newsTitle;
  private String news;
  private Date date;
  private byte[]  imageFile;
  private String mimeType;

    /**
     * @return the newsId
     */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="TagID",length=12,nullable=false)
    public int getNewsId() {
        return newsId;
    }

    /**
     * @param newsId the newsId to set
     */
    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    /**
     * @return the newsTitle
     */
    @Column(name="NewsTitle",length=100,nullable=false)
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * @param newsTitle the newsTitle to set
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    /**
     * @return the news
     */
     @Column(name="News",length=255,nullable=false)
    public String getNews() {
        return news;
    }

    /**
     * @param news the news to set
     */
    public void setNews(String news) {
        this.news = news;
    }

    /**
     * @return the date
     */
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name="NewsDate",nullable=false)
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the imageFile
     */
    @Lob
    @Basic(fetch=FetchType.LAZY)
    @Column(name="NewsImage",nullable=true)
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
     * @return the mimeType
     */
    @Column(name="ImageType",length=8,nullable=true)
    public String getMimeType() {
        return mimeType;
    }

    /**
     * @param mimeType the mimeType to set
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
}
