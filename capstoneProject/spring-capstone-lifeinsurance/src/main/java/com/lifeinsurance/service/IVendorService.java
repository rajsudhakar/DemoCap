package com.lifeinsurance.service;

import java.util.List;

import com.lifeinsurance.model.Vendor;

public interface IVendorService {

	void addVendor(Vendor vendor);
	void updateVendor(Vendor vendor);
	void deleteVendor(int vendorId);
	
//	List<Vendor> getByVendorName(String vendorName);
//	Vendor getByVendorId(int vendorId);
}
