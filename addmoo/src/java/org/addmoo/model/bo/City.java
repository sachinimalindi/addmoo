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

/**
 *
 * @author A.S.Malindi
 */
@Entity
public class City implements Serializable {
    private int cityId;
    private String cityName;
    private Province province;

    /**
     * @return the cityId
     */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="CityID",length=12,nullable=false)
    public int getCityId() {
        return cityId;
    }

    /**
     * @param cityId the cityId to set
     */
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    /**
     * @return the cityName
     */
    @Column(name="CityName",length=100,nullable=false,unique=true)
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return the province
     */
    @ManyToOne
    @JoinColumn(name="CityID")
    public Province getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(Province province) {
        this.province = province;
    }
    

}
