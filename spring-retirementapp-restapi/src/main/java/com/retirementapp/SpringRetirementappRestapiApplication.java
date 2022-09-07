package com.retirementapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.retirementapp.model.AccountDetails;
import com.retirementapp.model.Employee;
import com.retirementapp.model.Plan;
import com.retirementapp.service.IEmployeeService;

@SpringBootApplication
public class SpringRetirementappRestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringRetirementappRestapiApplication.class, args);
	}

	@Autowired
	IEmployeeService employeeService;
	
	@Override
	public void run(String... args) throws Exception {
		
		AccountDetails accountDetails = new AccountDetails("savings", "SBI", 37425987870l);
		
		Plan plan = new Plan("457", "Non-Qualified", 5, 200000.00);
		 	
		Employee employee  = new Employee("raj", 2000, 30000, accountDetails,plan );
		Employee employee1  = new Employee("rani", 3000, 40000, accountDetails,plan );
		Set<Employee> employeeList=new HashSet<>(Arrays.asList(employee,employee1));
		employeeService.addEmployee(employee);
	}

}
