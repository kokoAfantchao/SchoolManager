/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.dao.impl;

import io.push.esig.university.dao.IAbstractDao;
import io.push.esig.university.entities.Course;
import java.io.Serializable; 
import java.lang.reflect.ParameterizedType; 
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
 
/**
 *
 * @author GX82
 */

public class AbstractDao<T, PK extends Serializable>  implements IAbstractDao<T, PK>{
     
    private final Class<T> persistentClass;
     
    @SuppressWarnings("unchecked")
    public AbstractDao(){
        this.persistentClass =(Class<T>) ((ParameterizedType) 
                this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
     
    @Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
 
    @SuppressWarnings("unchecked")
    public T getByKey(PK key) {
        return (T) getSession().get(persistentClass, key);
    }
 
    public void persist(T entity) {
        getSession().persist(entity);
    }
 
    public void delete(T entity) {
        getSession().delete(entity);
    }
     
    protected Criteria createEntityCriteria(){
        
        return getSession().createCriteria(persistentClass);
 
}

    @Override
    public T getOne(PK id) {
        
        return (T) getSession().get(persistentClass, id);
     }

    @Override
    public List<T> getAll() {
      
       
        
        return (List<T>) getSession().createCriteria(persistentClass).list();
          //getSession().
         // return   createEntityCriteria().list();
     
         }

    @Override
    public T saveOne(T t) {
       
      return (T) getSession().save(t);
      
    }

    @Override
    public T updateOne(T t) {
      
     getSession().update(t);
     return null ;   
    }

    @Override
    public boolean deleteOne(PK id) {
       
         getSession().delete( getSession().get(persistentClass, id));
    return true ;
    }

    @Override
    public void deleteAll() {
        
       
    }
}
