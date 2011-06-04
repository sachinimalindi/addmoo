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

/**
 *
 * @author A.S.Malindi
 */
@Entity
public class Province implements Serializable {
private int provinceId;
private String name;
private List<City> cityList;

    /**
     * @return the provinceId
     */
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name="ProvinceID",nullable=false,length=12)
    public int getProvinceId() {
        return provinceId;
    }

    /**
     * @param provinceId the provinceId to set
     */
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * @return the name
     */
    @Column(name="ProvinceName",length=100,nullable=false,unique=true)
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
     * @return the cityList
     */
    @OneToMany(targetEntity=City.class,mappedBy="province",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    public List<City> getCityList() {
        return cityList;
    }

    /**
     * @param cityList the cityList to set
     */
    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

}
