/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.dao.impl;

import io.push.esig.university.dao.ICategoryDao;
import io.push.esig.university.entities.Category;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author GX82
 */


@Transactional
@Component(value = "categoryDao")
public class CategoryDao extends AbstractDao<Category,Long > implements ICategoryDao{
    
    public CategoryDao(){
        super();
    }
}
