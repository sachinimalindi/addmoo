/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.addmoo.model.dao;

import java.util.List;
import org.addmoo.core.model.dao.GenericDao;
import org.addmoo.model.bo.AdImage;

/**
 *
 * @author A.S.Malindi
 */
public interface AdImageDao extends GenericDao<AdImage,Integer>{
   public List<AdImage> getAdImages();
   public List<AdImage> getAdImagesPerPage(int start,int limit);

}
