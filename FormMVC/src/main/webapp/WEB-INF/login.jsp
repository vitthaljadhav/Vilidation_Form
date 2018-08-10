<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Login_Page</h1>
<body>
<form:form action="login.html" method="post" modelAttribute="log">

     User_name :<form:input path="name" name="name"/>

        <form:errors path="name"/><br>
  
  

    Password:    <form:input path="password" name="password"/>
  

  
  <form:errors path="password"/><br>
 
<input type="submit" value="login">
</form:form>
</body>
</html>