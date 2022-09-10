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
	List<Plan> getPlanByEmployeeName(String employeeName);
	List<Plan> getPlanByEmployeeId(int emplyoeeId);
	List<Plan> getAll();

}
