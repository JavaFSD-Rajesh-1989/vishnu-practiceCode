<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
<form action="register" method="post">

    <label for="name">Name</label>
    <input type="text" name="name" required> <br>

    <label for="email">Email</label>
    <input type="email" name="email" required> <br>

    <label for="gender">Gender</label>
    <input type="radio" name="gender" value="Male" required> Male
    <input type="radio" name="gender" value="Female" required> Female <br>

    <label for="branch">Branch</label>
    <select id="branch" name="branch">
        <option >select Branch</option>
        <option value="ECE">ECE</option>
        <option value="EEE">EEE</option>
        <option value="CSE">CSE</option>
    </select> <br>

    <label for="dateofbirth">Date Of Birth</label>
    <input type="date" name="dateofbirth" required> <br>

    <input type="submit" value="Submit">

</form>
</body>
</html>
