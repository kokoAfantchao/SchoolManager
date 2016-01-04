/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.service.impl;

import io.push.esig.university.dao.IAbstractDao;
import io.push.esig.university.dao.ICourseDao;
import io.push.esig.university.entities.Course;
import io.push.esig.university.entities.Lang;
import io.push.esig.university.service.ICourseCRUD;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author GX82
 */
@Transactional
@Service(value = "courseCRUD")
public class CourseCRUD  implements ICourseCRUD{
    
    @Autowired
    private ICourseDao courseDao;

    @Override
    public Course getOne(Long id) {
      
        
      return   courseDao.getOne(id);         
    }

    @Override
    public List<Course> getAll() {
        
        
      return   courseDao.getAll();
    }

    @Override
    public Course saveOne(Course t) {
        courseDao.saveOne(t);
      return null;  
      
    }

    @Override
    public Course updateOne(Course t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteOne(Long id) {
        
        courseDao.deleteOne(id);
    }

    @Override
    public void deleteArray(Course[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteArray(Long[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Course[] saveArray(Course[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Course[] updateArray(Course[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Course> findByLang(Lang lang) {

   List<Course> courses;
        courses = new ArrayList<Course>();
        List<Course> all = courseDao.getAll();
       
        for(Course course :all ){
            if(course.getLang().equals(lang))
                courses.add(course);
        }
        
        return courses;

    }
    
    
    
}
