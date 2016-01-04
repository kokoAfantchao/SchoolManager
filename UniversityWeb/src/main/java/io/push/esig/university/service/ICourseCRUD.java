/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.service;

import io.push.esig.university.entities.Course;
import io.push.esig.university.entities.Lang;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author GX82
 */
public interface ICourseCRUD extends  IServiceCRUD<Course,Long>{

    public List<Course> findByLang(Lang lang);
    
}
