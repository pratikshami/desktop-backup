package com.tests;
import org.springframework.web.servlet.ModelAndView;

import com.controllers.LoginCheckController;

import junit.framework.TestCase;

public class HelloControllerTests extends TestCase {

    public void testHandleRequestView() throws Exception{		
        System.out.println("test");
    	LoginCheckController controller = new LoginCheckController();
    	System.out.println("cont");
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("login.jsp", modelAndView.getViewName());
    }
}
