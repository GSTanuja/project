package com.retirementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.retirementapp.model.AccountDetails;

@Repository
public interface IAccountDetailsRepository extends JpaRepository<AccountDetails, Integer> {

	
	
}
