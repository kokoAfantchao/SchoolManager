/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author GX82
 */
public interface IAbstractDao<T,PK extends Serializable> {
    
    
    public T getOne(PK id);

    public List<T> getAll();

    public T saveOne(T t);

    public T updateOne(T t);

    public boolean deleteOne(PK id);
    
    public void deleteAll() ;

    
}
