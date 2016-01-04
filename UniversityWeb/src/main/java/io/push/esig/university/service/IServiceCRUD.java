/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author GX82
 */
public interface IServiceCRUD<T, PK extends Serializable> {
    
    public T getOne(PK id);

    public List<T> getAll();

    public T saveOne(T t);

    public T updateOne(T t);

    public void deleteOne(PK id);

    public void deleteArray(T[] ts);

    public void deleteArray(PK[] ts);

    public T[] saveArray(T[] ts);

    public T[] updateArray(T[] ts);

    public void deleteAll();
    
}
