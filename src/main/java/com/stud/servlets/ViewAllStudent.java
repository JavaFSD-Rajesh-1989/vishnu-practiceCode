package com.stud.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stud.entity.Student;
import com.stud.service.StudentService;

@WebServlet("/viewAll")
public class ViewAllStudent extends HttpServlet{
 private StudentService service;
 
	public ViewAllStudent() {
		service=new StudentService();
	}
	public  void doGet(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("from servlet");
		List<Student> students=service.getAllStudent();
		req.setAttribute("students", students);
		RequestDispatcher rd=req.getRequestDispatcher("/view-all-Students.jsp");
		try {
			rd.include(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
