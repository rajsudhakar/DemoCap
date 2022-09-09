package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Plan;

@Repository
public interface IPlanRepository extends JpaRepository<Plan, Integer>{
	
	
	List<Plan> findAll();
	Plan findById(int planId);
	
	
	
	

}
