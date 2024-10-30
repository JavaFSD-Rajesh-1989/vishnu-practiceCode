<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
   
<body>
    <p>Welcome Home, <%= session.getAttribute("username") != null ? session.getAttribute("username") : "Guest" %>!</p>

    <h2>All Users</h2>
    <c:if test="${not empty users}">
        <div>
            <c:forEach var="user" items="${users}">
                <form id="updateForm-${user.email}")">
                    <p>Name: <input type="text" name="name" value="${user.name}" required></p>
                    <p>Email: <input type="text" name="email" value="${user.email}" readonly></p>
                    <p>Age: <input type="text" name="age" value="${user.age}" required></p>
                    <button type="submit">Update</button>
                </form>
            </c:forEach>
        </div>
    </c:if>
    <c:if test="${empty users}">
        <p>No users found.</p>
    </c:if>

    
</body>
</html>
