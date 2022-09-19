package com.retirementapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retirementapp.model.Plan;
import com.retirementapp.service.IPlanService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/Plans-restapi")
public class PlanController {

	@Autowired
	IPlanService iPlanService;

	@PostMapping("/plans")
	public ResponseEntity<Plan> addPlan(@RequestBody Plan plan) {
		Plan newPlan = iPlanService.addPlan(plan);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "one plan added");
		return ResponseEntity.ok().headers(headers).body(newPlan);
	}

	@PutMapping("/plans")
	public ResponseEntity<String> updatePlan(@RequestBody Plan plan) {
		iPlanService.updatePlan(plan);
		HttpHeaders headers = new HttpHeaders();
		return ResponseEntity.ok("updated");
	}

	@DeleteMapping("/plans/id/{uanId}")
	public ResponseEntity<Void> deletePlan(@PathVariable("uanId") int uanId) {
		iPlanService.deletePlan(uanId);
		return ResponseEntity.ok().build();
	}

	@GetMapping("/plans/uanId/{uanId}")
	public ResponseEntity<Plan> getByPlanId(@PathVariable("uanId") int uanId) {
		Plan plan	= iPlanService.getByPlanId(uanId);
		ResponseEntity<Plan> responseEntity=new ResponseEntity <Plan>(plan,HttpStatus.OK);
		
		
		return responseEntity;
	}
	@GetMapping("/plans")
	public ResponseEntity<List<Plan>> getAll(){
	List<Plan> plan	=iPlanService.getAll();
	ResponseEntity<List<Plan>> responseEntity=new ResponseEntity<List<Plan>>(plan,HttpStatus.OK);
		return responseEntity;
		
		
	}

}
