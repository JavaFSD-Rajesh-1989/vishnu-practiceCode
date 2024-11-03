package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.entity.Employee;
import com.emp.service.EmployeeService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/emp") 
public class Employeecontroller {
@Autowired
private EmployeeService service;
  

@PostMapping("/add")
public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
	Employee emp=service.addEmployee(employee);
	return ResponseEntity.ok(emp);
	
}
@GetMapping("/employees/{dept_id}")
public ResponseEntity<?> getAllEmployees(@PathVariable Long dept_id){
	List<Employee> empList=service.getAllEmployees(dept_id);
	if(empList.isEmpty() || empList==null) {
		return   ResponseEntity.status(HttpStatus.BAD_REQUEST).body("no emp");
	}
	return ResponseEntity.ok(empList);
	
}
@PutMapping("/employee/{id}")
public ResponseEntity<Employee> updateEmp(@PathVariable  Long id, @RequestBody Employee employee) {
   Employee emp=service.updateEmp(id,employee);
    
    return ResponseEntity.ok(emp);
}


@DeleteMapping("/employee/delete/{id}")
public ResponseEntity<?> deleteEmp(@PathVariable Long id){
	String msg=service.deleteEmp(id);
	return ResponseEntity.ok(msg);
}
}
