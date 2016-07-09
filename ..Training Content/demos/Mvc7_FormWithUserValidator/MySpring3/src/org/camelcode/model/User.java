
package org.camelcode.model; 
  
public class User { 
    private String name; 
    private String username; 
    private String email; 
    private String phone; 
    private String password; 
    private String verifyPassword; 
    private Character gender; 
  
    public User() { 
    } 
  
    public User(String name, String username, String email, String phone, String password, String verifyPassword, Character gender) { 
        this.name = name; 
        this.username = username; 
        this.email = email; 
        this.phone = phone; 
        this.password = password; 
        this.verifyPassword = verifyPassword; 
        this.gender = gender; 
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	} 
  
} /* getters & setters */
