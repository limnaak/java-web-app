package com.proj.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.proj.model.WasteCollector;

@Repository
public interface WasteCollectorRepository extends CrudRepository<WasteCollector, Integer>{
	
	//get customer details for given customerid
	@Transactional(readOnly=true)
	@Query(value = "SELECT * FROM oe.waste_collectors WHERE customer_id= :customerid", nativeQuery = true)
	public List<WasteCollector> findCustomerInfo(@Param("customerid") Long customerid);
	
	//point collected agg for given customerid 
	@Transactional(readOnly=true)
	@Query(value = "SELECT sum(point_score) FROM oe.waste_collectors WHERE customer_id= :customerid", nativeQuery = true)
	public Double findCustomerPointsCollectedAgg(@Param("customerid") Long customerid);
	
	//point redeemed agg for given customerid 
	@Transactional(readOnly=true)
	@Query(value = "SELECT sum(point_redeemed) FROM oe.retailers_customers WHERE customer_id= :customerid", nativeQuery = true)
	public Double findCustomerPointsRedeemedAgg(@Param("customerid") Long customerid);
}

