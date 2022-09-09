package com.lifeinsurance.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lifeinsurance.model.Address;
import com.lifeinsurance.service.IAddressService;

@RestController
@RequestMapping("lifeinsurance-api")
public class InsuranceController {
	
	@Autowired
	IAddressService addressService;
	
	@PostMapping("/investments")
	public ResponseEntity<Void> addAddress(Address address) {
		addressService.addAddress(address);
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
		
		
	}

}
