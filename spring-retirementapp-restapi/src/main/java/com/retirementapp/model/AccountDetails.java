package com.retirementapp.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class AccountDetails {
	
	private String accountType;
	private String bankName;
	private long accountNo;
	@OneToOne(mappedBy = "accountDetails")
	private Employee employee;
	
	public AccountDetails(String accountType, String bankName, long accountNo) {
		super();
		this.accountType = accountType;
		this.bankName = bankName;
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "AccountDetails [accountType=" + accountType + ", bankName=" + bankName + ", accountNo=" + accountNo
				+ "]";
	}

	
}
