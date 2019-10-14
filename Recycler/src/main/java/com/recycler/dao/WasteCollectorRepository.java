package com.recycler.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.recycler.model.WasteCollector;

@Repository
public interface WasteCollectorRepository extends CrudRepository<WasteCollector, Integer>{
	
	//customer id list
	@Transactional(readOnly=true)
	@Query(value = "SELECT distinct customer_id from oe.waste_collectors order by customer_id asc", nativeQuery = true)
	public List<BigInteger> findAllCustomerIDs();
	
	//collector id list
	@Transactional(readOnly=true)
	@Query(value = "SELECT distinct w.collector_id FROM oe.waste_collectors w order by w.collector_id asc", nativeQuery = true)
	public List<BigInteger> findAllCollectorIDs();	
	
	//get collector details for given collectorid
	@Transactional(readOnly=true)
	@Query(value = "select * FROM oe.waste_collectors w where w.collector_id= :collectorid", nativeQuery = true)
	public List<WasteCollector> findCollectorInfo(@Param("collectorid") Long collectorid);
	
	@Transactional(readOnly=true)
	@Query(value = "SELECT MAX(w.deposit_id) from oe.waste_collectors w", nativeQuery = true)
	public Long findMaxId();
	
	//get all collector details
	@Transactional(readOnly=true)
	@Query(value = "SELECT * FROM oe.waste_collectors order by collector_id asc", nativeQuery = true)
	public List<BigInteger> findAllCollectorInfo();
}

