package com.retirementapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.retirementapp.model.Plan;
import com.retirementapp.repository.IPlanRepository;

@Service
public class PlanServiceImpl implements IPlanService {

	IPlanRepository planRepository;

	@Autowired
	public void setPlanRepository(IPlanRepository planRepository) {
		this.planRepository = planRepository;
	}

	@Override
	public Plan addPlan(Plan plan) {
		return planRepository.save(plan);
	}

	@Override
	public void updatePlan(Plan plan) {
        planRepository.save(plan);
	}

	@Override
	public void deletePlan(int uanId) {
       planRepository.deleteById(uanId);
	}

	@Override
	public Plan getById(int uanId) {
		return planRepository.findById(uanId).get();
	}

	@Override
	public List<Plan> getAll() {
		return null;
	}

	

	@Override
	public List<Plan> getPlanByEmployeeName(String employeeName) {
		return planRepository.findPlanByEmployeeName(employeeName);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Plan> getPlanByEmployeeId(int emplyoeeId) {
		// TODO Auto-generated method stub
		return planRepository.findPlanByEmployeeId(emplyoeeId);
	}

	
}
