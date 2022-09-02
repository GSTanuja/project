package com.retirementapp.service;

import java.util.List;
import com.retirementapp.model.Plan;

public interface IPlanService {

	//CRUD Operation
	Plan addPlan(Plan plan);
	void updatePlan(Plan plan);
	void deletePlan(int uanId);

	//query the table
	Plan getById(int uanId);
	Plan getByPlanName(String planName);
	Plan getByPlanType(String planType);
	List<Plan> getAll();

}
