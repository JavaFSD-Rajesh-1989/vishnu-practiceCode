package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.Exception.EmailAlreadyExistsException;
import com.emp.entity.Department;
import com.emp.entity.Employee;
import com.emp.repo.DepartmentRepo;
import com.emp.repo.EmployeeRepo;

@Service
public class EmployeeService {
@Autowired
private EmployeeRepo repo;

@Autowired
private DepartmentRepo deptRepo;
	public Employee addEmployee(Employee employee) {
		if(repo.existsByEmail(employee.getEmail())) {
			throw new EmailAlreadyExistsException("email already exists ");
 	}
		Optional<Department> dept=deptRepo.findById(employee.getDept().getId());
		employee.setDept(dept.get());
		return repo.save(employee);
  }
	public List<Employee> getAllEmployees(Long dept_id) {
		
		return repo.getAllEmployees(dept_id);
	}
	public Employee updateEmp(Long id, Employee employee) {
		Employee newEmp=new Employee();
		newEmp.setId(id);
		newEmp.setName(employee.getName());
		newEmp.setEmail(employee.getEmail());
		int n=repo.updateEmp(id,employee);
		System.out.println("from service "+n);
		if(n>0) {
			return newEmp;
		}
		throw new IllegalArgumentException("update failed");
	}
	public String deleteEmp(Long id) {
	
		int n=repo.deleteEmp(id);
		if(n>0) {
			return "success";
		}
		throw new IllegalArgumentException("update failed");
	}
}
