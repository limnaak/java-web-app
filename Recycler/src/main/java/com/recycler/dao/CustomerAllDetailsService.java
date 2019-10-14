package com.recycler.dao;

import java.math.BigInteger;
import java.util.List;

import com.recycler.model.CustomerInfo;

public interface CustomerAllDetailsService {
	
	public void saveCustomerDetails(CustomerInfo customerInfo);
	
	public List<CustomerInfo> fetchAllCustomerDetails();
		
}
