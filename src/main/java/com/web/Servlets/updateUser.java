package com.web.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.Servlets.service.UserService;
@WebServlet("/update")
public class updateUser  extends HttpServlet{
	 private UserService service;

	    public updateUser() {
	        this.service = new UserService();
	    }

	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	        String email = req.getParameter("email");
	        String name = req.getParameter("name");
	        String ageParam = req.getParameter("age");

	        // Log incoming parameters to check if they are null or missing
	        System.out.println("Email: " + email);
	        System.out.println("Name: " + name);
	        System.out.println("Age Parameter: " + ageParam);

	        // Validate and parse age parameter
	        int age = 0;
	        if (ageParam != null && !ageParam.isEmpty()) {
	            try {
	                age = Integer.parseInt(ageParam);
	            } catch (NumberFormatException e) {
	                res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	                res.getWriter().write("Invalid age parameter.");
	                return;
	            }
	        } else {
	            res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
	            res.getWriter().write("Age parameter is missing.");
	            return;
	        }

	        // Call the service to update user
	        boolean isUpdated = service.updateUser(email, name, age);
	        res.setContentType("text/plain");

	        if (isUpdated) {
	            res.getWriter().write("User updated successfully!");
	        } else {
	            res.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
	            res.getWriter().write("Failed to update user.");
	        }
	    }
}
