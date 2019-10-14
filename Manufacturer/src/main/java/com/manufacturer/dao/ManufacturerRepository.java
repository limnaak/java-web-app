package com.manufacturer.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manufacturer.model.Manufacturers;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturers, Integer>{
	
	//manuacturer id list
	@Transactional(readOnly=true)
	@Query(value = "SELECT distinct manufacturer_id from oe.manufacturers order by manufacturer_id asc", nativeQuery = true)
	public List<BigInteger> findAllManufacturerIDs();	
	
}

