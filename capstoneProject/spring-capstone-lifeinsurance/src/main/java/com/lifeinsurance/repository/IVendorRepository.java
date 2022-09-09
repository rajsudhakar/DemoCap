package com.lifeinsurance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lifeinsurance.model.Vendor;

@Repository
public interface IVendorRepository extends JpaRepository<Vendor, Integer>{

//	@Query(value = "select * from vendor v where ")
//	List<Vendor> findByVendorName(String vendorName);
//	List<Vendor> findByVendorId(int vendorId);
//	
}
