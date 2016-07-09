package org.camelcode.controller;

  
import org.camelcode.model.User; 
import org.springframework.validation.BindException; 
import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.servlet.mvc.SimpleFormController; 
  
public class UserController extends SimpleFormController { 
  
    public UserController(){ 
    	System.out.println("in controller constr");
        setCommandClass(User.class); 
        setCommandName("userRegistration"); 
    } 
  
    @Override
    protected ModelAndView onSubmit(Object command, BindException errors) { 
        System.out.println("in onsubmit command"+command);
    	ModelAndView modelAndView = new ModelAndView(); 
    	System.out.println("BindExce:..."+errors);
        if(errors.hasErrors()){ 
            modelAndView.setViewName(getFormView()); 
        }else{ 
            modelAndView.addObject("user", command); 
            modelAndView.setViewName(getSuccessView()); 
        } 
        return modelAndView; 
    } 
}