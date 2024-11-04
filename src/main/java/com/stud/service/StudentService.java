package com.stud.service;

import java.util.List;

import com.stud.dao.StudentDao;
import com.stud.entity.Student;

public class StudentService {
	private StudentDao dao;
public StudentService() {
		dao=new StudentDao();
	}
	public String addStudent(Student student) {
		int n=dao.addStudent(student);
		if(n>0) {
			return "Student added Successfully";
		}
		return"failed i don't know why";
	}
	public List<Student> getAllStudent() {
		
		return dao.getAllStudents();
	}

	

}
