package com.proj.dao;

import java.math.BigInteger;
import java.util.List;

import com.proj.model.CustomerInfo;
import com.proj.model.CustomerSpecific;

public interface CustomerAllDetailsService {
	
	public void saveCustomerDetails(CustomerInfo customerInfo);
	
	public List<CustomerInfo> fetchAllCustomerDetails();
	
	public List<BigInteger> fetchAllCustomerIDs();
		
}
