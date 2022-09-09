package com.lifeinsurance.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

public class Vendor {
	
	@Column(length = 20)
	private String vendorName;
	@Id
	@GeneratedValue(generator = "vendor_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="vendor_id",sequenceName = "vendor_seq",allocationSize = 1,initialValue = 1)
	private Integer vendorId;
	
	@Column(length = 10)
	private long contactNumber;
	
	@ManyToMany(mappedBy = "vendor_id")
	private List<Insurance> insurance;
	
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(String vendorName, long contactNumber) {
		super();
		this.vendorName = vendorName;
		this.contactNumber = contactNumber;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Vendor [vendorName=" + vendorName + ", contactNumber=" + contactNumber + "]";
	}
	
	

}
