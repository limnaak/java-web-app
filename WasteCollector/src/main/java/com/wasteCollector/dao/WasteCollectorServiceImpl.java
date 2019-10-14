package com.wasteCollector.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wasteCollector.model.WasteCollector;

@Component
public class WasteCollectorServiceImpl implements WasteCollectorService {
	
	@Autowired
	private WasteCollectorRepository wasteCollectorRepository;	
	
	@Override
	public void saveWasteCollectorDetails(WasteCollector wastecollector) {
		wasteCollectorRepository.save(wastecollector); 
	}
	
	//get customer id list
	@Override
	public List<BigInteger> fetchAllCustomerIDs() {		
		List<BigInteger> cust = wasteCollectorRepository.findAllCustomerIDs();		
		return cust;		
	}
	
	//get collector id list
	@Override
	public List<BigInteger> fetchAllCollectorIDs() {		
		List<BigInteger> cust = wasteCollectorRepository.findAllCollectorIDs();		
		return cust;		
	}
	
	//get deposit id list
	@Override
	public Long fetchMaxId() {		
		Long depositid = wasteCollectorRepository.findMaxId();
		return depositid;		
	}
	
	//collector details for given customer id
	@Override
	public List<WasteCollector> fetchCollectorInfo(Long collectorid) {		
		List<WasteCollector> cust = wasteCollectorRepository.findCollectorInfo(collectorid);		
		return cust;		
	}
}
