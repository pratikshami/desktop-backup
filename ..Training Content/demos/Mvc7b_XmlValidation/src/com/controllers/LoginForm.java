/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controllers;

import com.model.Login;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

/** 
 *
 * @author ramanath
 */
public class LoginForm extends SimpleFormController {

    public LoginForm() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(com.model.Login.class);
        //setCommandName("MyCommandName");
        //setSuccessView("successView");
        //setFormView("formView");
    }
    
    
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
    	
        ModelAndView mv = new ModelAndView(getSuccessView());
        
        return mv;
    }
   
}