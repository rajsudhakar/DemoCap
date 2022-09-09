package com.lifeinsurance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lifeinsurance.model.Address;
import com.lifeinsurance.model.Client;
import com.lifeinsurance.model.Insurance;
import com.lifeinsurance.model.Nominee;
import com.lifeinsurance.model.Plan;
import com.lifeinsurance.model.Vendor;
import com.lifeinsurance.service.IInsuranceService;

@SpringBootApplication
public class SpringCapstoneLifeinsuranceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCapstoneLifeinsuranceApplication.class, args);
	}
	
	@Autowired
	IInsuranceService insuranceService;

	@Override
	public void run(String... args) throws Exception {
		
	
		Address address=new Address("KR Puram", "Bangalore", "Karnataka", 560027);
		Plan plan=new Plan("Pensioner");
		Nominee nominee=new Nominee("Rajath","Male",23,"Son");
		Vendor vendor=new Vendor("Guru",9876541230l);
		List<Vendor> vendorList=Arrays.asList(vendor);
		Client client=new Client("Nagaraj", 9630215487l, nominee, address);
		List<Client> clientlist=Arrays.asList(client);
		Insurance insurance=new Insurance("Jeeven Raksha",5, plan, 3500, clientlist, 500000,vendorList);
		
		insuranceService.addInsurance(insurance);
		
		
	}

}
