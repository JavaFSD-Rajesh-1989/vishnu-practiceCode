package com.web.Servlets.service;

import com.web.Servlets.dao.UserDao;
import com.web.Servlets.entity.User;

public class UserService {
 private UserDao dao;
 public UserService() {
	 dao=new UserDao();
	 }
	public String  registerUser(User user) {
	   return dao.registerUser(user);
		
	}
	public User[] getAllUsers() {
		
		return dao.getAllUsers();
	}
	public boolean updateUser(String email, String name, int age) {
		
		return dao.updateUser(email,name,age);
	}

}
