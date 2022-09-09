package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Insurance;

@Repository
public interface IInsuranceRepository extends JpaRepository<Insurance, Integer> {
	
	//Derived Queries
	
//	void addInsurance(Insurance insurance);
//	void updateInsurance(Insurance insurance);
//	void deleteInsurance(int insuranceId);
	
	List<Insurance> findAll();
	List<Insurance> findById(int insuranceId);
	
	//Custom Queries
	
	
//	List<Insurance> findByInsuranceName(String insuranceName);
	
//	@Query(value="select * from insurance i where i.sumAssured<=?1",nativeQuery = true)
//	List<Insurance> findByLessSumAssured(double sumAssured);
	
//	@Query(value="select * from insurancce i where i.sumAssured>=?1",nativeQuery=true)
//	List<Insurance> findByHighSumAssured(double sumAssured);
	
//	@Query(value="select * from insurance i where i.sumAssured is between ?1 and ?2")
//	List<Insurance> findByRangeOfSumAssured(double lessSumAssured,double highSumAssured);
	
//	@Query("from Insurance i inner join i.plan p where planname=?1")
//	List<Insurance> findByInsurancePlanPlanName(String planName);
	
	
	

}
