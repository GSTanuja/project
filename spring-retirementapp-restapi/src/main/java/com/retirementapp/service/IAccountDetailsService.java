package com.retirementapp.service;

import java.util.List;

import com.retirementapp.model.AccountDetails;


public interface IAccountDetailsService {

	//CRUD Operation
	AccountDetails addAccountDetails(AccountDetails accountDetails);
	void updateAccountDetails(AccountDetails accountDetails);
	void deleteAccountDetails(int accountNo);
	
    //query the table
	AccountDetails getAccountTypeByEmployeeName(String employeeName);
	AccountDetails getBankNameByEmployeeId(Integer emplyoeeId);
	List<AccountDetails> getAll();

}
