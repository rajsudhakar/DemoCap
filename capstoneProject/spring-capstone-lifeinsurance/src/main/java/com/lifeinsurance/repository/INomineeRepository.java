package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Nominee;
@Repository
public interface INomineeRepository extends JpaRepository<Nominee, Integer>{
	
//	List<Nominee> findByNomineeName(String nomineeName);
//	List<Nominee> findById(String relation);
//	List<Nominee> findByNameAndRelation(String name,String relation);
//	List<Nominee> findByNameAndAge(String name,int age);
}
