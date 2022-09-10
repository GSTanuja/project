package com.retirementapp.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retirementapp.model.Employee;
import com.retirementapp.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService; 
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee newEmployee=employeeService.addEmployee(employee);
		HttpHeaders headers=new HttpHeaders();
		headers.add("desc", "one employee added");
		return ResponseEntity.ok().headers(headers).body(newEmployee);
	}
	@PutMapping("/employees")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
		employeeService.updateEmployee(employee);
		HttpHeaders headers=new HttpHeaders();
		return ResponseEntity.ok("updated");
	}
	@DeleteMapping("/employees/employee-by-id/{employeeId}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable int employeeId){
		employeeService.deleteEmployee(employeeId);
		
		return ResponseEntity.ok().build();
	}

	
	
	

	Employee getById(int employeeId);
	List<Employee> getAll();
	Employee getEmployeeByPlanName(String planName);
	Employee getEmployeeByBankName(String bankName);


	

}
