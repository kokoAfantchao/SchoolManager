/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.dao.impl;

import io.push.esig.university.dao.ICourseDao;
import io.push.esig.university.entities.Course;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author GX82
 */

@Transactional
@Component(value = "courseDao")
public class CourseDao  extends AbstractDao<Course,Long > implements ICourseDao{
    
    public CourseDao(){
        super();
    }
    
}
