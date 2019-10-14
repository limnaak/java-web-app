package com.manufacturer.dao;

import java.math.BigInteger;
import java.util.List;

import com.manufacturer.model.CustomerInfo;

public interface CustomerAllDetailsService {
	
	public void saveCustomerDetails(CustomerInfo customerInfo);
	
	public List<CustomerInfo> fetchAllCustomerDetails();
		
}
