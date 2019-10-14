package com.manufacturer.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.manufacturer.model.Recycler;

@Repository
public interface RecyclerRepository extends CrudRepository<Recycler, Integer>{
	
	//recycler id list
	@Transactional(readOnly=true)
	@Query(value = "SELECT distinct recycler_id from oe.waste_recyclers order by recycler_id asc", nativeQuery = true)
	public List<BigInteger> findAllRecyclerIDs();		
	
}

