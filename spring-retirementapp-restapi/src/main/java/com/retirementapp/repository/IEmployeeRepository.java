package com.retirementapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.retirementapp.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	
@Query("FROM Employee e INNER JOIN e.planList p WHERE p.planName=?1 ")	
 List<Employee> findEmployeeByPlanName(String planName);
}
