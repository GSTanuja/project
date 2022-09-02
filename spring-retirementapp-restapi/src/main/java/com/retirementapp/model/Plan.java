package com.retirementapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Plan {
	private String planName;
	private Integer uanId;
	private String planType;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private Set<Employee> employees;
	public Plan(String planName, String planType) {
		super();
		this.planName = planName;
		this.planType = planType;
		
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
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Plan [planName=" + planName + ", uanId=" + uanId + ", planType=" + planType + "]";
	}
	
	

}
