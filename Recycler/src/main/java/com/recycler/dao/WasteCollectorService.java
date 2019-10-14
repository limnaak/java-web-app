package com.recycler.dao;

import java.math.BigInteger;
import java.util.List;

import com.recycler.model.WasteCollector;

public interface WasteCollectorService {
	
	public void saveWasteCollectorDetails(WasteCollector wastecollector);
	
	public List<BigInteger> fetchAllCustomerIDs();
	
	public List<BigInteger> fetchAllCollectorIDs();
	
	public List<WasteCollector> fetchCollectorInfo(Long collectorid);
	
	public Long fetchMaxId();
}
