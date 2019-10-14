package com.manufacturer.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecyclerServiceImpl implements RecyclerService {
	
	@Autowired
	private RecyclerRepository recyclerRepository;		
	
	//get recycler id list
	@Override
	public List<BigInteger> fetchAllRecyclerIDs() {		
		List<BigInteger> recyclerids = recyclerRepository.findAllRecyclerIDs();		
		return recyclerids;		
	}
}
