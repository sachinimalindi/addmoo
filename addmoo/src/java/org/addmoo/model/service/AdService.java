/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.addmoo.model.service;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.Ad;

/**
 *
 * @author A.S.Malindi
 */
public interface AdService {

    public Ad getAd(int id) throws AddmooException;

    public List<Ad> getAd(String patron) throws AddmooException;

    public List<Ad> getAds() throws AddmooException;

    public void saveAd(Ad ad) throws AddmooException;

    public void deleteAd(Ad ad) throws AddmooException;

    public void updateAd(Ad ad) throws AddmooException;
}
