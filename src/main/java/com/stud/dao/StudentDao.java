package com.stud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.stud.DBConfig.DBConfiguration;
import com.stud.entity.Student;

public class StudentDao {

	Connection con;
	
	public StudentDao() {
	    this.con = DBConfiguration.getConnection();
	}

	public int addStudent(Student student) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into student(name,email,gender,branch,dateofbirth) values(?,?,?,?,?)");
			ps.setString(1,student.getName());
			ps.setString(2,student.getEmail());
			ps.setString(3,student.getGender());
			ps.setString(4, student.getBranch());
			ps.setDate(5, java.sql.Date.valueOf(student.getDateofBirth()));
			int n=ps.executeUpdate();
			System.out.println(n);
			return n;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	public List<Student> getAllStudents() {
		List<Student> allStud=new ArrayList<>();
		try {
			PreparedStatement ps=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Student student=new Student();
				student.setName(rs.getString("name"));
				student.setEmail(rs.getString("email"));
				student.setGender(rs.getString("gender"));
				student.setBranch(rs.getString("branch"));
				student.setDateofBirth(rs.getDate("dateofbirth").toLocalDate());
				allStud.add(student);
               
			}
			return allStud;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

}
