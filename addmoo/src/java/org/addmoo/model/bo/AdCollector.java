/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.bo;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 *
 * @author A.S.Malindi
 */
public class AdCollector {
    private int adCollectorId;
    private String collectorName;
    private List<Ad> adList;

    /**
     * @return the adCollectorId
     */
    public int getAdCollectorId() {
        return adCollectorId;
    }

    /**
     * @param adCollectorId the adCollectorId to set
     */
    public void setAdCollectorId(int adCollectorId) {
        this.adCollectorId = adCollectorId;
    }

    /**
     * @return the collectorName
     */
    public String getCollectorName() {
        return collectorName;
    }

    /**
     * @param collectorName the collectorName to set
     */
    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    /**
     * @return the adList
     */
     @OneToMany(targetEntity=Ad.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    public List<Ad> getAdList() {
        return adList;
    }

    /**
     * @param adList the adList to set
     */
    public void setAdList(List<Ad> adList) {
        this.adList = adList;
    }

}
