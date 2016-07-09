<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="tags" %>
<sf:form action="logon.htm" commandName="logonForm" method="post">
    Username: <input type="text" name="username"/><br> <tags:hasBindErrors name="username"/>
    Password: <input type="password" name="password"/></br>
    <input type="submit" value="login"/>
</sf:form>