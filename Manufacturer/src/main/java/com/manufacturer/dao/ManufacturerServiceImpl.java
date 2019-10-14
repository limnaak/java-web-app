package com.manufacturer.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManufacturerServiceImpl implements ManufacturerService {
	
	@Autowired
	private ManufacturerRepository manufacturerRepository;		
	
	//get customer id list
	@Override
	public List<BigInteger> fetchAllManufacturerIDs() {		
		List<BigInteger> manufacturerids = manufacturerRepository.findAllManufacturerIDs();		
		return manufacturerids;		
	}
		
}
