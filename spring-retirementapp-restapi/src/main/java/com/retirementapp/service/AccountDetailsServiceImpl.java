package com.retirementapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retirementapp.model.AccountDetails;
import com.retirementapp.repository.IAccountDetailsRepository;

@Service
public class AccountDetailsServiceImpl implements IAccountDetailsService {

	IAccountDetailsRepository accountDetailsRepository;

	@Autowired
	public void setAccountDetailsRepository(IAccountDetailsRepository accountDetailsRepository) {
		this.accountDetailsRepository = accountDetailsRepository;
	}

	@Override
	public AccountDetails addAccountDetails(AccountDetails accountDetails) {
		return accountDetailsRepository.save(accountDetails);
	}

	@Override
	public void updateAccountDetails(AccountDetails accountDetails) {
		accountDetailsRepository.save(accountDetails);
	}

	@Override
	public void deleteAccountDetails(int accountNo) {
         accountDetailsRepository.deleteById(accountNo);
	}

	

	@Override
	public List<AccountDetails> getAll() {
		return null;
	}

	

	@Override
	public AccountDetails getAccountTypeByEmployeeName(String employeeName) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.findAccountTypeByEmployeeName(employeeName);
	}

	@Override
	public AccountDetails getBankNameByEmployeeId(Integer emplyoeeId) {
		// TODO Auto-generated method stub
		return accountDetailsRepository.findBankNameByEmployeeId(emplyoeeId);
	}

}
