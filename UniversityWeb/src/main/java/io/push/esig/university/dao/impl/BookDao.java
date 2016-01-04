/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.dao.impl;

import io.push.esig.university.dao.IBookDao;
import io.push.esig.university.entities.Book;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author GX82
 */


@Transactional
@Component(value = "bookDao")
public class BookDao extends AbstractDao<Book,Long > implements IBookDao{

    
    public BookDao() {
        
        super();
    }
    
    
}
