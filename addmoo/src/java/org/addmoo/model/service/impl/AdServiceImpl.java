/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.service.impl;

import java.util.List;
import org.addmoo.Exception.AddmooException;
import org.addmoo.model.bo.Ad;
import org.addmoo.model.dao.AdDao;
import org.addmoo.model.service.AdService;
import org.hibernate.tool.hbm2x.DAOExporter;

/**
 *
 * @author Sachi
 */
public class AdServiceImpl implements AdService{

    private AdDao adDao;

    public AdDao getAdDao() {
        return adDao;
    }

    public void setAdDao(AdDao adDao) {
        this.adDao = adDao;
    }

    @Override
    public Ad getAd(int id) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Ad> getAd(String patron) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Ad> getAds() throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveAd(Ad ad) throws AddmooException {
        getAdDao().save(ad);
    }

    @Override
    public void deleteAd(Ad ad) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateAd(Ad ad) throws AddmooException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
