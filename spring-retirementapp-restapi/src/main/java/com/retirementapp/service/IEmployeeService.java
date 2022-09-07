package com.retirementapp.service;

import java.util.List;

import com.retirementapp.model.Employee;

public interface IEmployeeService {
	
	//CRUD Operation
	Employee addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	
	//query the table
	Employee getById(int employeeId);
	Employee getByFinalAmount(int employeeId);
	List<Employee> getAll();
	List<Employee> getEmployeeByPlanName(String planName);

}
