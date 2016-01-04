/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.service.impl;

import io.push.esig.university.dao.impl.CategoryDao;
import io.push.esig.university.entities.Category;
import io.push.esig.university.service.ICategoryCRUD;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author GX82
 */


@Transactional
@Service(value = "categoryCRUD")
public class CategoryCRUD implements ICategoryCRUD{
 
    
    @Autowired 
    private CategoryDao categoryDao;
    
    @Override
    public Category getOne(Long id) {
        
        return categoryDao.getOne(id);
        }

    @Override
    public List<Category> getAll() {
        
        return categoryDao.getAll();
        }

    @Override
    public Category saveOne(Category t) {
        
        return categoryDao.saveOne(t);
        }

    @Override
    public Category updateOne(Category t) {
        
       return  categoryDao.updateOne(t);
        }

    @Override
    public void deleteOne(Long id) {
        
      categoryDao.deleteOne(id);
        
        }

    @Override
    public void deleteArray(Category[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteArray(Long[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category[] saveArray(Category[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Category[] updateArray(Category[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        
        categoryDao.deleteAll();
        
       }
    
    
}
