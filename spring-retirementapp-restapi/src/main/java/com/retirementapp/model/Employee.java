package com.retirementapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {
	private String employeeName;

	@Id
	@GeneratedValue(generator = "employee_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "employee_gen", sequenceName = "employee_seq", initialValue = 1, allocationSize = 1)
	private Integer emplyoeeId;
	private double salary;
	private double finalAmount;
	@OneToOne(cascade = CascadeType.ALL)
	private AccountDetails accountDetails;
	@ManyToOne
	private Plan plan;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, double salary, double finalAmount, AccountDetails accountDetails, Plan plan) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.finalAmount = finalAmount;
		this.accountDetails = accountDetails;
		this.plan = plan;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmplyoeeId() {
		return emplyoeeId;
	}

	public void setEmplyoeeId(Integer emplyoeeId) {
		this.emplyoeeId = emplyoeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salary=" + salary + ", finalAmount=" + finalAmount
				+ ", accountDetails=" + accountDetails + ", plan=" + plan + "]";
	}

}
