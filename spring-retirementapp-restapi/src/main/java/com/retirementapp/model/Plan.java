package com.retirementapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Plan {
	

	@Id
	@GeneratedValue(generator = "plan_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "plan_gen", sequenceName = "plan_seq", initialValue = 1, allocationSize = 1)
	private Integer uanId;
	private String planName;
	private String planType;
	private int term;
	private double premium;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Employee> employeeList;
	
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Plan(String planName, String planType, int term, double premium) {
		super();
		this.planName = planName;
		this.planType = planType;
		this.term = term;
		this.premium = premium;
	}

	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getUanId() {
		return uanId;
	}
	public void setUanId(Integer uanId) {
		this.uanId = uanId;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	
	

	public Set<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(Set<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "Plan [planName=" + planName + ", planType=" + planType + ", term=" + term + ", premium=" + premium
				+ "]";
	}

	

	

}
