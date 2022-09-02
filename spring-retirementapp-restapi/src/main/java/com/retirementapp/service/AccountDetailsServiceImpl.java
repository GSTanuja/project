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
	public AccountDetails getByAccountType(String accountType) {
		return null;
	}

	@Override
	public List<AccountDetails> getAll() {
		return null;
	}

	@Override
	public AccountDetails getByBankName(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

}
