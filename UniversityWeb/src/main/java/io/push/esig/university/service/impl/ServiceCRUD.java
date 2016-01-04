/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.service.impl;

import io.push.esig.university.dao.IAbstractDao;
import io.push.esig.university.service.IServiceCRUD;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author GX82
 */
@Repository
public abstract class ServiceCRUD<T,PK extends Serializable>  implements IServiceCRUD<T,PK>{
    
    
    @Autowired
    protected IAbstractDao<T,PK> dao;
    
    
    public ServiceCRUD(IAbstractDao<T,PK>dao){
        this.dao=dao;
        
    }
    @Override
    public T getOne(PK id) {
        return this.dao.getOne(id);
    }

    @Override
    public List<T> getAll() {
        
        return this.dao.getAll();
    }

    @Override
    public T saveOne(T t) {
        return this.dao.saveOne(t);
    }

    @Override
    public T updateOne(T t) {
     return this.dao.updateOne(t);
    }

    @Override
    public void deleteOne(PK id) {
      this.dao.deleteOne(id);
    }

    @Override
    public void deleteArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteArray(PK[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T[] saveArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T[] updateArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        this.dao.deleteAll();
    }
    
}
