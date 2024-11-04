package com.stud.entity;

import java.time.LocalDate;

public class Student {
 String name;
 String email;
 String gender;
 String branch;
 LocalDate DateofBirth;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public LocalDate getDateofBirth() {
	return DateofBirth;
}
public void setDateofBirth(LocalDate dateofBirth) {
	DateofBirth = dateofBirth;
}
 

}
