package com.javatpoint.controller;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class HelloWorldController {  
    @RequestMapping("/hello")  
    public ModelAndView helloWorld() {  
        String message = "Hello World, Spring MVC @ Javatpoint";  
	int a=3,b=4,c;
	c=a+b;//for editing purposes
	// for requirement purposes
        return new ModelAndView("hello", "message", message);  
    }  
}  
