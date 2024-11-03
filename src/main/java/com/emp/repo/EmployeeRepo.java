package com.emp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.emp.entity.Employee;

import jakarta.transaction.Transactional;
@Repository
public interface EmployeeRepo  extends JpaRepository<Employee, Long>{
   
	boolean existsByEmail(String  email);
	
	
    @Query("select e from Employee e where  e.dept.id =:dept_id")
	List<Employee> getAllEmployees(@Param("dept_id") Long dept_id);
    
    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.name = :#{#employee.name}, e.email = :#{#employee.email} WHERE e.id = :id")
    int updateEmp(@Param("id") Long id, @Param("employee") Employee employee);
    @Modifying
    @Transactional
    @Query("DELETE FROM Employee e WHERE e.id = :id")
    int deleteEmp(@Param("id") Long id);
}
