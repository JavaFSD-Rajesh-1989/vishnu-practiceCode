<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="post">

 <label>name</label>
 <input type="text" name="name" required><br> 
 <label>email</label>
 <input type="text" name="email" required><br>
 <label>password</label>
 <input type="text" name="password" required><br>
 <label>age</label>
 <input type="text" name="age" required><br>
 <input type="submit" value="submit">
 <a href="${pageContext.request.contextPath}/getUsers">ViewAll users</a>
</form>
</body>
</html>