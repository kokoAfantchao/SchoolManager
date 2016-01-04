/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.controller;

import com.google.gson.Gson;
import io.push.esig.university.entities.Course;
import io.push.esig.university.entities.Lang;
import io.push.esig.university.service.ICourseCRUD;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author GX82
 */
@RestController
@RequestMapping("/course")
public class CouresController {
 
 @Autowired
 private ICourseCRUD courseCRUD;   
 
 private Gson gson;
    
    
    public CouresController(){
        
        gson = new Gson();
       
    }

  @RequestMapping(value="/lang_course/{lang}",method=RequestMethod.GET) 
  @ResponseBody
  public String lang_Course(@PathVariable Lang lang){
     
        List<Course> findByLang = courseCRUD.findByLang(lang);
      
     return gson.toJson(findByLang);  
  }
   
   
   @RequestMapping(value ="/list",method =RequestMethod.GET)
   public String getAllCourse(){
       
        List<Course> all = courseCRUD.getAll();
       
        
       return gson.toJson(all);
       //return "null popinter ";
   }
   
   @RequestMapping(value ="/getOne/{id}", method = RequestMethod.GET)
   
   public String getOneCourse(@PathVariable Long id ){
        
      Course cours  = courseCRUD.getOne(id);
      return gson.toJson(cours);
   }
   
   @RequestMapping(value="/checkUpdate/{version}",method= RequestMethod.GET)
   
   public Boolean checkUpdate(@PathVariable Long v){
       
    return  null ; 
   }
}
