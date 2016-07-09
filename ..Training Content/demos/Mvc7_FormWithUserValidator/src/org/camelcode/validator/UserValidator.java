package org.camelcode.validator; 
  
import org.camelcode.model.User; 
import org.springframework.validation.Errors; 
import org.springframework.validation.ValidationUtils; 
import org.springframework.validation.Validator; 
  
public class UserValidator implements Validator { 
  
  //  private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-+]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{})$"; 
  //  private static final String NUMBER_PATTERN = "((-|\\.+)?[0-9]+(\\.[0-9]+)?)+"; 
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-+]+(\\[_A-Za-z0-9-+]+)*@[A-Za-z0-9-]+(\\[A-Za-z0-9-]+)*(\\[A-Za-z]{})$"; 
    private static final String NUMBER_PATTERN = "((-|\\+)?[0-9]+(\\[0-9]+)?)+"; 
  
    public boolean supports(Class c) { 
        return User.class.isAssignableFrom(c); 
    } 
  
    public void validate(Object command, Errors errors) { 
          System.out.println("in Validate"+command);
    	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.name.empty"); 
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "field.username.empty"); 
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.email.empty"); 
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "field.phone.empty"); 
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.password.empty"); 
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "verifyPassword", "field.verifyPassword.empty"); 
        ValidationUtils.rejectIfEmpty(errors, "gender", "field.gender.empty"); 
  
        User user = (User)command; 
        if(!user.getPassword().equals(user.getVerifyPassword())) 
            errors.rejectValue("verifyPassword","password.notmatch"); 
  
        if(user.getPhone().trim().length() != 10) 
            errors.rejectValue("phone","field.phone.length"); 
  
        if(!isNumber( 
user.getPhone().trim())) 
            errors.rejectValue("phone", "field.phone.NAN"); 
  
        if(!isValidEmail(user.getEmail().trim())) 
            errors.rejectValue("email", "field.email.invalid"); 
        System.out.println("Errors:......."+errors);
    } 
  
    private boolean isNumber(String input){
    	return true;
        //return input.matches(NUMBER_PATTERN); 
    } 
  
    private boolean isValidEmail(String input){ 
    	return true;
       // return input.matches(EMAIL_PATTERN); 
    } 
} 



