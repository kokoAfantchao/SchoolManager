/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.service.impl;

/**
 *
 * @author GX82
 */



import io.push.esig.university.dao.IBookDao;
import io.push.esig.university.entities.Book;
import io.push.esig.university.service.IBookCRUD;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service(value = "bookCRUD")
public class BookCRUD  implements IBookCRUD{
    
    @Autowired
    private IBookDao bookDao;

    @Override
    public Book getOne(Long id) {
        
        return bookDao.getOne(id);
            }

    @Override
    public List<Book> getAll() {
       
    return bookDao.getAll();
    }

    @Override
    public Book saveOne(Book t) {
     
       return  bookDao.saveOne(t);
    
    }

    @Override
    public Book updateOne(Book t) {
        
    return  bookDao.updateOne(t);
    }

    @Override
    public void deleteOne(Long id) {
        
        bookDao.deleteOne(id);
        
        }

    @Override
    public void deleteArray(Book[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteArray(Long[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book[] saveArray(Book[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book[] updateArray(Book[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        
        bookDao.deleteAll();
       }
    
}
