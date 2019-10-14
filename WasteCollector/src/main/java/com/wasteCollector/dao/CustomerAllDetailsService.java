package com.wasteCollector.dao;

import java.math.BigInteger;
import java.util.List;

import com.wasteCollector.model.CustomerInfo;

public interface CustomerAllDetailsService {
	
	public void saveCustomerDetails(CustomerInfo customerInfo);
	
	public List<CustomerInfo> fetchAllCustomerDetails();
		
}
