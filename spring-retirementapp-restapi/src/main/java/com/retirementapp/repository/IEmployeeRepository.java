package com.retirementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.retirementapp.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
