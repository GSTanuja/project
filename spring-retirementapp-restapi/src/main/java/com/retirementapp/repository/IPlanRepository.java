package com.retirementapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.retirementapp.model.Plan;

@Repository
public interface IPlanRepository extends JpaRepository<Plan, Integer> {

}
