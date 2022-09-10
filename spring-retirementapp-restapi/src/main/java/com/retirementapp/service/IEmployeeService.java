package com.retirementapp.service;


import java.util.List;

import com.retirementapp.model.Employee;

public interface IEmployeeService {
	
	//CRUD Operation
	Employee addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	

	Employee getById(int employeeId);
	List<Employee> getAll();
	Employee getEmployeeByPlanName(String planName);
	Employee getEmployeeByBankName(String bankName);

}
