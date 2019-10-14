package com.proj.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proj.model.CustomerInfo;
import com.proj.model.CustomerSpecific;

@Repository
public interface CustomerAllDetailsRepository extends CrudRepository<CustomerInfo, Integer>{
	
	//not required - all customer details
	@Transactional(readOnly=true)
	@Query(value = "SELECT * from oe.customers", nativeQuery = true)
	public List<CustomerInfo> findAll();
	
	//customer id list
	@Transactional(readOnly=true)
	@Query(value = "SELECT customer_id from oe.customers", nativeQuery = true)
	public List<BigInteger> findAllCustomerIDs();
		
}

