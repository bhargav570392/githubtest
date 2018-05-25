<<<<<<< HEAD
//Hello World. GitHub Test

=======
>>>>>>> 6c17d15... FL-TEJA: Add java package.
package com.javatpoint.controller;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class HelloWorldController {  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
        String message = "Hello World, Spring MVC @ Javatpoint";  
        return new ModelAndView("hello", "message", message);  
    }  
<<<<<<< HEAD
}
=======
}  
>>>>>>> 6c17d15... FL-TEJA: Add java package.
