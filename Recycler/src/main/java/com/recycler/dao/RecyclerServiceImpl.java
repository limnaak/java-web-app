package com.recycler.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.recycler.model.Orders;

@Component
public class RecyclerServiceImpl implements RecyclerService {
	
	@Autowired
	private RecyclerRepository recyclerRepository;		
	
	//get customer id list
	@Override
	public List<BigInteger> fetchAllRecyclerIDs() {		
		List<BigInteger> cust = recyclerRepository.findAllRecyclerIDs();		
		return cust;		
	}	
}
