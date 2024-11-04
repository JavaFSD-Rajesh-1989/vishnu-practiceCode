<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.stud.entity.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Student</title>
</head>
<body>

<%
    // Get the student object from the request attribute
    Student student = (Student) request.getAttribute("student");
%>

<form action="updateStudent" method="post">

    <label for="name">Name</label>
    <input type="text" name="name" value="<%= student != null ? student.getName() : "" %>" required> <br>

    <label for="email">Email</label>
    <input type="email" name="email" value="<%= student != null ? student.getEmail() : "" %>" required readonly> <br>

    <label for="gender">Gender</label>
    <input type="radio" name="gender" value="Male" <%= student != null && "Male".equals(student.getGender()) ? "checked" : "" %>> Male
    <input type="radio" name="gender" value="Female" <%= student != null && "Female".equals(student.getGender()) ? "checked" : "" %>> Female <br>

    <label for="branch">Branch</label>
    <select id="branch" name="branch">
        <option value="">Select Branch</option>
        <option value="ECE" <%= student != null && "ECE".equals(student.getBranch()) ? "selected" : "" %>>ECE</option>
        <option value="EEE" <%= student != null && "EEE".equals(student.getBranch()) ? "selected" : "" %>>EEE</option>
        <option value="CSE" <%= student != null && "CSE".equals(student.getBranch()) ? "selected" : "" %>>CSE</option>
    </select> <br>

    <label for="dateofbirth">Date Of Birth</label>
    <input type="date" name="dateofbirth" value="<%= student != null ? student.getDateofBirth() : "" %>" required> <br>

    <input type="submit" value="Submit">
</form>

</body>
</html>
