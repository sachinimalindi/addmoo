/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao;

import java.util.List;
import org.addmoo.core.model.dao.GenericDao;
import org.addmoo.model.bo.Ad;

/**
 *
 * @author A.S.Malindi
 */
public interface AdDao extends GenericDao<Ad,Integer>{
   public List<Ad> getAds(String name);
   public List<Ad> getAdsPerPage(String name,int start,int limit);
   public Ad getAd(int id);
}
