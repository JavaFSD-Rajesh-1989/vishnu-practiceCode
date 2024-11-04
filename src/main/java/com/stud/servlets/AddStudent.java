package com.stud.servlets;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stud.entity.Student;
import com.stud.service.StudentService;
@WebServlet("/register")
public class AddStudent extends HttpServlet {
	private StudentService service;
	public AddStudent() {
		service=new StudentService();
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String branch=req.getParameter("branch");
		LocalDate dateofbirth=LocalDate.parse(req.getParameter("dateofbirth"));
		
		Student student=new Student();
		student.setName(name);
		student.setEmail(email);
		student.setGender(gender);
		student.setBranch(branch);
		student.setDateofBirth(dateofbirth);
		String message=service.addStudent(student);
		req.setAttribute("message",message);
	    try {
            RequestDispatcher dispatcher = req.getRequestDispatcher("welcome.jsp");
            dispatcher.forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
	}

}
