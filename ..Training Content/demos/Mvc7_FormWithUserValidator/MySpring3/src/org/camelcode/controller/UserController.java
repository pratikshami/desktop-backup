package org.camelcode.controller; 
  
import org.camelcode.model.User; 
import org.springframework.validation.BindException; 
import org.springframework.web.servlet.ModelAndView; 
import org.springframework.web.servlet.mvc.SimpleFormController; 
  
public class UserController extends SimpleFormController { 
  
    public UserController(){ 
        setCommandClass(User.class); 
        setCommandName("userRegistration"); 
    } 
  
    @Override
    protected ModelAndView onSubmit(Object command, BindException errors) { 
        ModelAndView modelAndView = new ModelAndView(); 
        if(errors.hasErrors()){ 
            modelAndView.setViewName(getFormView()); 
        }else{ 
            modelAndView.addObject("user", command); 
            modelAndView.setViewName(getSuccessView()); 
        } 
        return modelAndView; 
    } 
}