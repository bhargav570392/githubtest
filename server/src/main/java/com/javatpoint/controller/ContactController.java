package com.javatpoint.controller;  
import org.springframework.stereotype.Controller;  
import org.springframework.validation.BindingResult;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.SessionAttributes;  
import org.springframework.web.servlet.ModelAndView;  
import com.javatpoint.form.Contact;  
@Controller  
@SessionAttributes  
public class ContactController {  
    @RequestMapping(value = "/addContact", method = RequestMethod.POST)  
    public String addContact(@ModelAttribute("contact") Contact contact, BindingResult result) {  
<<<<<<< HEAD
        // Sandy has written the code here to add contact  
=======
        //write the code here to add contact  
>>>>>>> a845a2e... FL-TEJA: Add java package.
    	String message = contact.toString();
        return "redirect:contact.html"+message;  
    }  
      
    @RequestMapping("/contact")  
    public ModelAndView showContacts() {  
        return new ModelAndView("contact", "command", new Contact());  
    }  
<<<<<<< HEAD
}  
=======
}  
>>>>>>> a845a2e... FL-TEJA: Add java package.
