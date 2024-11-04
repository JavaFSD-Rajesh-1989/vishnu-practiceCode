package com.stud.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stud.service.StudentService;

@WebServlet("/deleteStudent")
public class DeleteStudent  extends HttpServlet{
private StudentService service;
	public DeleteStudent() {
		service=new StudentService();
		}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String msg=service.deleteStudent(email);
		 req.getSession().setAttribute("msg", msg);  
	     res.sendRedirect(req.getContextPath()+"/viewAll");
	}

}
