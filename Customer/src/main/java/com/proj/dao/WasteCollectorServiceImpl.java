package com.proj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.proj.model.CustomerInfo;
import com.proj.model.CustomerSpecific;
import com.proj.model.WasteCollector;

@Component
public class WasteCollectorServiceImpl implements WasteCollectorService {
	
	@Autowired
	private WasteCollectorRepository wasteCollectorRepository;	
	
	@Override
	public void saveWasteCollectorDetails(WasteCollector wastecollector) {
		wasteCollectorRepository.save(wastecollector); 
	} 	
	
	@Override
	public List<WasteCollector> fetchCustomerInfo(Long customerid) {		
		List<WasteCollector> cust = wasteCollectorRepository.findCustomerInfo(customerid);		
		return cust;		
	}
	
	@Override
	public Double fetchCustomerPointsCollectedAgg(Long customerid) {		
		Double cust = wasteCollectorRepository.findCustomerPointsCollectedAgg(customerid);		
		return cust;		
	}
	
	@Override
	public Double fetchCustomerPointsRedeemedAgg(Long customerid) {		
		Double cust = wasteCollectorRepository.findCustomerPointsRedeemedAgg(customerid);		
		return cust;		
	}
}
