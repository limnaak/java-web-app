package com.proj.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.proj.model.CustomerInfo;

@Component
public class CustomerAllDetailsServiceImpl implements CustomerAllDetailsService {
	
	@Autowired
	private CustomerAllDetailsRepository customerAllDetailsRepository;
	
	//registering
	@Override 
	public void saveCustomerDetails(CustomerInfo customerInfo) {		
		customerAllDetailsRepository.save(customerInfo); 	 
	}	 	
	
	//not required
	@Override
	public List<CustomerInfo> fetchAllCustomerDetails() {		
		List<CustomerInfo> cust = customerAllDetailsRepository.findAll();		
		return cust;		
	}
	
	//get customer id list
	@Override
	public List<BigInteger> fetchAllCustomerIDs() {		
		List<BigInteger> cust = customerAllDetailsRepository.findAllCustomerIDs();		
		return cust;		
	}	
	
}
