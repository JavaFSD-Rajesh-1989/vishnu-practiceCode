<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>OTP Verification</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="otp-container">
        <form action="LoginServlet" method="post">
            <h2>OTP Verification</h2>
            <div class="input-group">
                <label for="otp">Enter OTP</label>
                <input type="text" id="otp" name="otp" placeholder="Enter the OTP sent to your email" required>
            </div>
            <input type="hidden" name="email" value="<%= session.getAttribute("tempUserEmail") %>">
            <input type="hidden" name="password" value="<%= session.getAttribute("tempUserPassword") %>">
            <button type="submit" class="submit-btn">Verify OTP</button>
        </form>
        <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
        <% if (errorMessage != null) { %>
            <p style="color: red;"><%= errorMessage %></p>
        <% } %>
    </div>
</body>
</html>
