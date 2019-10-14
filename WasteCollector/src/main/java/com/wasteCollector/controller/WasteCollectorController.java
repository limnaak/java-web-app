package com.wasteCollector.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wasteCollector.dao.CustomerAllDetailsServiceImpl;
import com.wasteCollector.dao.WasteCollectorServiceImpl;
import com.wasteCollector.model.CollectorSpecific;
import com.wasteCollector.model.CustomerDetails;
import com.wasteCollector.model.CustomerInfo;
import com.wasteCollector.model.CustomerSpecific;
import com.wasteCollector.model.WasteCollector;

@RestController
public class WasteCollectorController {
	private static Logger logger = LoggerFactory.getLogger(WasteCollectorController.class);
		
	@Autowired
	private CustomerAllDetailsServiceImpl customerAllDetailsServiceImpl;
	
	@Autowired
	private WasteCollectorServiceImpl wasteCollectorServiceImpl;
	
	@Autowired
	private WasteCollector wasteCollector;
		
	//customer id list
	@RequestMapping(value = "/collector/getCustomerIDList", method = RequestMethod.GET)
	public ResponseEntity<List<BigInteger>> getCustomerIDList() {
		//RestTemplate template = new RestTemplate();
		ResponseEntity<List<BigInteger>> responseData = null;
		logger.info("***Fetching customer id list started***");
		
		try {
			List<BigInteger> customerIDs = wasteCollectorServiceImpl.fetchAllCustomerIDs();
			
			responseData = new ResponseEntity<List<BigInteger>>(customerIDs, HttpStatus.OK);
		} catch ( Exception  e) {
			e.printStackTrace();
		}
	
		logger.info("***Fetching customer id list completed***");
		
		return responseData;
	}
	
	//collector id list
	@RequestMapping(value = "/collector/getCollectorIDList", method = RequestMethod.GET)
	public ResponseEntity<List<BigInteger>> getCollectorIDList() {
		//RestTemplate template = new RestTemplate();
		ResponseEntity<List<BigInteger>> responseData = null;
		logger.info("***Fetching collector id list started***");
		
		try {
			List<BigInteger> collectorIDs = wasteCollectorServiceImpl.fetchAllCollectorIDs();
			
			responseData = new ResponseEntity<List<BigInteger>>(collectorIDs, HttpStatus.OK);
		} catch ( Exception  e) {
			e.printStackTrace();
		}
	
		logger.info("***Fetching collector id list completed***");
		
		return responseData;
	}
	
	//specific collector details
	@RequestMapping(value = "/collector/getCollectorInfo", method = RequestMethod.GET)
	public ResponseEntity<List<CollectorSpecific>> getCollectorInfo(/*@RequestBody long collectorid*/) {
		ResponseEntity<List<CollectorSpecific>> responseData = null;
		logger.info("***Fetching collector info started***");
		try {			
			Long collectorid = 1139L;
			
			List<WasteCollector> collector =  wasteCollectorServiceImpl.fetchCollectorInfo(collectorid);			
			
			List<CollectorSpecific> Collectorinfo = new ArrayList<CollectorSpecific>();
			
			for(int i=0; i<collector.size(); i++) {
				CollectorSpecific coll = new CollectorSpecific(collector.get(i).getCollector_id(), collector.get(i).getTerritory(), collector.get(i).getLattitude(), collector.get(i).getLongitude());
				
				Collectorinfo.add(i, coll);
			}
			
			responseData = new ResponseEntity<List<CollectorSpecific>>(Collectorinfo, HttpStatus.OK);
			
		} catch ( Exception  e) {
			e.printStackTrace();
		}
		logger.info("***Fetching collector info completed***");
		
		return responseData;
	}
	
	//generate max depositid
	@RequestMapping(value = "/collector/getNextDepositID", method = RequestMethod.GET)
	public ResponseEntity<Long> getNextDepositID() {
		ResponseEntity<Long> responseData = null;
		logger.info("***Fetching depositid started***");
		try {
			Long depositid = wasteCollectorServiceImpl.fetchMaxId()+1;		
			responseData = new ResponseEntity<Long>(depositid, HttpStatus.OK);
		
		} catch ( Exception  e) {
			e.printStackTrace();
		}
		logger.info("***Fetching depositid completed***");
		
		return responseData;
	}
	
	//specific collector details for graph
	@RequestMapping(value = "/collector/getAllCollectorDetails", method = RequestMethod.GET)
	public ResponseEntity<List<WasteCollector>> getAllCollectorDetails() {
		ResponseEntity<List<WasteCollector>> responseData = null;
		logger.info("***Fetching all collector details started***");
		
		try {
			Long collectorid = 1139L;
			List<WasteCollector> collectors = wasteCollectorServiceImpl.fetchCollectorInfo(collectorid);		
			responseData = new ResponseEntity<List<WasteCollector>>(collectors, HttpStatus.OK);
		
		} catch ( Exception  e) {
			e.printStackTrace();
		}
		
		logger.info("***Fetching all collector details completed***");
		
		return responseData;
	}
}