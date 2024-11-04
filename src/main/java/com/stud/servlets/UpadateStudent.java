package com.stud.servlets;

import java.io.IOException;
import java.net.http.HttpResponse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stud.entity.Student;
import com.stud.service.StudentService;

@WebServlet("/updateStudent")
public class UpadateStudent extends HttpServlet {
 private StudentService service;
	public UpadateStudent() {
		service= new StudentService();
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		 Student student=service.getStudeentByEmail(email);
		 req.setAttribute("student", student);
		 
		 RequestDispatcher rd= req.getRequestDispatcher("/updateStudent.jsp");
			rd.include(req, res);
	
	
	}
}
