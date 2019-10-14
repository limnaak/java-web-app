package com.proj.dao;

import java.util.List;

import com.proj.model.WasteCollector;

public interface WasteCollectorService {
	
	public void saveWasteCollectorDetails(WasteCollector wastecollector);

	public List<WasteCollector> fetchCustomerInfo(Long customerid);
	
	public Double fetchCustomerPointsCollectedAgg(Long customerid);
	
	public Double fetchCustomerPointsRedeemedAgg(Long customerid);
}
