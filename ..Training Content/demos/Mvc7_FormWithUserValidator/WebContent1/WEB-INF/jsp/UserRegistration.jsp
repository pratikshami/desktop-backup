<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>    <head>        <title>User registration</title>       
 <style type="text/css">            
 .right {float: right;}            
 .error {color: #ff0000;font-style: italic;}   
      </style>   
       </head>   
  <body>       
   <h1>Register new user</h1> 
          <form:form commandName="userRegistration">  
           <table>          
           <%--                If you comment out this comment, then all the errors are shown on top of the table            
               <tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr>
                           --%>            
                     <tr><td>Name</td><td><form:input path="name" /></td>
                     <td><form:errors path="name" cssClass="error" /></td></tr>  
                      <tr><td>Username</td><td><form:input path="username" /></td>
                      <td><form:errors path="username" cssClass="error" /></td></tr>       
                      <tr>                <td>Gender</td>           
                      <td><form:radiobutton path="gender" value="M" label="M" />
                      <form:radiobutton path="gender" value="F" label="F" /></td> 
                      <td><form:errors path="gender" cssClass="error" /></td>     
                        </tr>          
                      <tr><td>Email</td><td><form:input path="email" /></td><td>
                      <form:errors path="email" cssClass="error" /></td></tr>  
                       <tr><td>Phone</td><td><form:input path="phone" /></td><td>
                       <form:errors path="phone" cssClass="error" /></td></tr>    
                       <tr><td>Password</td><td><form:password path="password" /></td><td>
                       <form:errors path="password" cssClass="error" /></td></tr> 
                         <tr><td>Retype Password</td><td><form:password path="verifyPassword" /></td>
                         <td><form:errors path="verifyPassword" cssClass="error" /></td></tr> 
                         <tr><td colspan="2"><input type="submit" value="Register" class="right"/></td></tr> 
                         </table>        
                         </form:form> 
                         </body>