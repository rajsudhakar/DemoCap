package com.lifeinsurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeinsurance.model.Vendor;
import com.lifeinsurance.repository.IVendorRepository;

@Service
public class VendorServiceImpl implements IVendorService {

	@Autowired
	IVendorRepository vendorRepository;
	
	@Override
	public void addVendor(Vendor vendor) {
	  vendorRepository.save(vendor);
		
	}

	@Override
	public void updateVendor(Vendor vendor) {
		 vendorRepository.save(vendor);
		
	}

	@Override
	public void deleteVendor(int vendorId) {
		vendorRepository.deleteById(vendorId);
	}

//	@Override
//	public List<Vendor> getByVendorName(String vendorName) {
//				return vendorRepository.findByVendorName(vendorName);
//	}
//
//	@Override
//	public Vendor getByVendorId(int vendorId) {
//		return vendorRepository.findByVendorId(vendorId).get(vendorId);
//	}

}
