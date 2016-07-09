/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model;

/**
 *
 * @author SJ
 */
public class Login {
    private String username;
    private String password;
    
    public Login()
    {
    	System.out.println("Constr called");
    	
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        System.out.println("in setName of login");
    }

   /* public Login() {
    	//username="a";
    	//password="b";
    }*/

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("para constr called");
    }
    
}
