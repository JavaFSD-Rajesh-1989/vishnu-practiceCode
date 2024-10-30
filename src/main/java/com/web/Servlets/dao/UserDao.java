package com.web.Servlets.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.web.Servlets.config.DBConfig;
import com.web.Servlets.entity.User;


public class UserDao {
		Connection connection;
		
		public UserDao() {
	    try {
			connection=DBConfig.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}

		public String registerUser(User user) {
			try {
		   PreparedStatement ps=connection.prepareStatement("Insert into user(name,email,password,age) values(?,?,?,?);");
		    ps.setString(1,user.getName());	
		    ps.setString(2,user.getEmail());
		    ps.setString(3,user.getPassword());
		    ps.setInt(4,user.getAge());
		    int num=ps.executeUpdate();
		    if(num>0) {
		    	return "successfully registered";
		    }
		    else {
		    	return "not registered error";
		    }
			} catch (SQLException e) {
				e.printStackTrace();
				 return "Error: " + e.getMessage(); 
			}
					
			
		}

		public User[] getAllUsers() {
			List<User> userList=new ArrayList<>();
			try {
				
				PreparedStatement ps=connection.prepareStatement("select * from user");
				ResultSet rs=ps.executeQuery();
				while(rs.next()) {
					User user=new User();
					user.setName(rs.getString("name"));
					user.setEmail(rs.getString("email"));
					user.setAge(rs.getInt("age"));
					userList.add(user);
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return userList.toArray(new User[0]);
		}

		public boolean updateUser(String email, String name, int age) {
			
			try {
				PreparedStatement ps=connection.prepareStatement("update user set name=? & age=? where email=?");
				ps.setString(1, name);
				ps.setInt(2, age);
				ps.setString(3,email);
				return ps.execute();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return false;
		}

}
