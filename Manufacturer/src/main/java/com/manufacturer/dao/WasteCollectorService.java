package com.manufacturer.dao;

import java.math.BigInteger;
import java.util.List;

import com.manufacturer.model.WasteCollector;

public interface WasteCollectorService {
	
	public void saveWasteCollectorDetails(WasteCollector wastecollector);
	
	public List<BigInteger> fetchAllCustomerIDs();
	
	public List<BigInteger> fetchAllCollectorIDs();
	
	public List<WasteCollector> fetchCollectorInfo(Long collectorid);
	
	public Long fetchMaxId();
}
