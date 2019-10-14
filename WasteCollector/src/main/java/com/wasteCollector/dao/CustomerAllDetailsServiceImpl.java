package com.wasteCollector.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wasteCollector.model.CustomerInfo;

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
	
}
