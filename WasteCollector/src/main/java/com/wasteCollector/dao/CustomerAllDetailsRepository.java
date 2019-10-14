package com.wasteCollector.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wasteCollector.model.CustomerInfo;

@Repository
public interface CustomerAllDetailsRepository extends CrudRepository<CustomerInfo, Integer>{
	
	//not required - all customer details
	@Transactional(readOnly=true)
	@Query(value = "SELECT * from oe.customers", nativeQuery = true)
	public List<CustomerInfo> findAll();	
		
}

