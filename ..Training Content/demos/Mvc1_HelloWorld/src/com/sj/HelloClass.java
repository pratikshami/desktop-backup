 package com.sj;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloClass extends AbstractController {
	private String message; 

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		return new ModelAndView("welcomePage","welcomeMessage", message); 

	}
	public void setMessage(String message) { 
		      System.out.println("value set"+message);
		this.message = message; 
		 
		} 
		
		 


}
