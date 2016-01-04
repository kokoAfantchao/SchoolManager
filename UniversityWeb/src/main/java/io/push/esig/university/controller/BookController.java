/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.push.esig.university.controller;

import io.push.esig.university.service.IBookCRUD;
import io.push.esig.university.service.ICourseCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author GX82
 */
@Controller
@RequestMapping("/book")
public class BookController {
 
    
   
   @Autowired
   private IBookCRUD bookCRUD;
   
   @Autowired
   private ICourseCRUD  courseCRUD;
       
    
    
    @RequestMapping(value = "", method = RequestMethod.GET)
     public String index(Model model) {
		
		return "redirect:/list";
	}
     
     @RequestMapping(value = "/list", method = RequestMethod.GET)
     public String listBook(Model model) {
        
          model.addAttribute("books",bookCRUD.getAll());
	    return "book/list";
	}
     
     
     @RequestMapping(value = "add", method = RequestMethod.GET)
     public String addBook(Model model) {
		
         
            //model.addAttribute("books",bookCRUD.getAll());
	    return "book/add";
	}
     @RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String deleteBook(@PathVariable("id") int id, 
		final RedirectAttributes redirectAttributes) {

		

		
		
		redirectAttributes.addFlashAttribute("css", "success");
		redirectAttributes.addFlashAttribute("msg", "User is deleted!");
		
		return "redirect:/users";

	}
    
}
