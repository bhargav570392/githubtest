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
<<<<<<< HEAD
<<<<<<< HEAD

	String message = contact.toString();
=======
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> 171ae8b... FL-TEJA: Add java package.
        // Sandy has written the code here to add contact  
        //write the code here to add contact  
<<<<<<< HEAD
=======
>>>>>>> a845a2e... FL-TEJA: Add java package.
=======
        //write the code here to add contact  
>>>>>>> a845a2e... FL-TEJA: Add java package.
>>>>>>> 171ae8b... FL-TEJA: Add java package.
=======
>>>>>>> 6efcedd... FL-DILEEP: wishing everyone
    	String message = contact.toString();
=======
	String message = contact.toString();
>>>>>>> 5eac95b... FL-DILEEP: modified FIrst Commit
        return "redirect:contact.html"+message;  
    }  
      
    @RequestMapping("/contact")  
    public ModelAndView showContacts() {  
        return new ModelAndView("contact", "command", new Contact());  
<<<<<<< HEAD
<<<<<<< HEAD
    } Hello everyone;
    //wishing everyone
}  

    }  
<<<<<<< HEAD
}  
=======
<<<<<<< HEAD
<<<<<<< HEAD
}  
=======
}  
>>>>>>> a845a2e... FL-TEJA: Add java package.
=======
>>>>>>> 171ae8b... FL-TEJA: Add java package.
}  
=======
    } Hello everyone

=======
    } Hello everyone;
>>>>>>> 5eac95b... FL-DILEEP: modified FIrst Commit
    //wishing everyone
}  

>>>>>>> 6efcedd... FL-DILEEP: wishing everyone
