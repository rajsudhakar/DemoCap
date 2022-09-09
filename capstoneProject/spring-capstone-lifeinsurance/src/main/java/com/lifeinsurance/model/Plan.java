package com.lifeinsurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Plan {
	
	private String planName;
	@Id
	@GeneratedValue(generator = "plan_id" , strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "plan_id" , sequenceName = "plan_seq", allocationSize = 1, initialValue = 10)
	private Integer planId;
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plan(String planName) {
		super();
		this.planName = planName;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	@Override
	public String toString() {
		return "Plan [planName=" + planName + "]";
	}
	
	

}
