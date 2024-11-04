<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.stud.entity.Student" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
</head>
<body>
<% 
    String message = (String) session.getAttribute("msg");  // Retrieve message from session
    if (message != null) {
        out.print("<p>" + message + "</p>");
        session.removeAttribute("msg");  // Clear message from session after displaying
    }
%>


<table border="1">
<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Gender</th>
    <th>Branch</th>
    <th>Date Of Birth</th>
</tr>
<%
List<Student> students = (List<Student>) request.getAttribute("students");
if (students != null && !students.isEmpty()) { // Check if the list is not empty
    for (Student student : students) {
%>
<tr>
    <td><%= student.getName() %></td>
    <td><%= student.getEmail() %></td>
    <td><%= student.getGender() %></td>
    <td><%= student.getBranch() %></td>
    <td><%= student.getDateofBirth() %></td>
    <td><a href="updateStudent?email=<%= student.getEmail()%>">UpdateStudent</a></td>
     <td><a href="deleteStudent?email=<%= student.getEmail()%>">Delete</a></td>
</tr>
<%
    }
} else {
%>
<tr>
    <td colspan="5">No users found</td> <!-- Corrected colspan to 5 -->
</tr>
<%
}
%>
</table>
</body>
</html>
