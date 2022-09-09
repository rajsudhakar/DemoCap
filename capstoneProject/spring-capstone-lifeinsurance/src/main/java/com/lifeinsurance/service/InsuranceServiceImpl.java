package com.lifeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeinsurance.model.Insurance;
import com.lifeinsurance.repository.IInsuranceRepository;
@Service
public class InsuranceServiceImpl implements IInsuranceService{
	
	@Autowired
	IInsuranceRepository insuranceRepository;

	@Override
	public void addInsurance(Insurance insurance) {
		insuranceRepository.save(insurance);
	}

	@Override
	public void updateInsurance(Insurance insurance) {
		insuranceRepository.save(insurance);
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		insuranceRepository.deleteById(insuranceId);
	}

//	@Override
//	public List<Insurance> getByInsuranceName(String insuranceName) {
//		return insuranceRepository.findByInsuranceName(insuranceName);
//	}

//	@Override
//	public Insurance getById(int insuranceId) {
//		return insuranceRepository.findById(insuranceId).get(insuranceId);
//	}
//
//	@Override
//	public List<Insurance> getAll() {
//		// TODO Auto-generated method stub
//		return insuranceRepository.findAll();
//	}

//	@Override
//	public List<Insurance> getByLessSumAssured(double sumAssured) {
//		// TODO Auto-generated method stub
//		return insuranceRepository.findByLessSumAssured(sumAssured);
//	}

//	@Override
//	public List<Insurance> getByHighSumAssured(double sumAssured) {
//		// TODO Auto-generated method stub
//		return insuranceRepository.findByHighSumAssured(sumAssured);
//	}

//	@Override
//	public List<Insurance> getByRangeOfSumAssured(double lessSumAssured, double highSumAssured) {
//		// TODO Auto-generated method stub
//		return insuranceRepository.findByRangeOfSumAssured(lessSumAssured, highSumAssured);
//	}
//
//	@Override
//	public List<Insurance> getByInsurancePlanPlanName(String planName) {
//		// TODO Auto-generated method stub
//		return insuranceRepository.findByInsurancePlanPlanName(planName);
//	}

}
