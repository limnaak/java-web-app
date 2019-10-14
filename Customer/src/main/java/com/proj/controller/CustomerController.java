package com.proj.controller;

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

import com.proj.dao.CustomerAllDetailsServiceImpl;
import com.proj.dao.WasteCollectorServiceImpl;
import com.proj.model.CustomerSpecific;
import com.proj.model.WasteCollector;

@RestController
public class CustomerController {
	private static Logger logger = LoggerFactory.getLogger(CustomerController.class);
		
	@Autowired
	private CustomerAllDetailsServiceImpl customerAllDetailsServiceImpl;
	
	@Autowired
	private WasteCollectorServiceImpl wasteCollectorServiceImpl;
	
	@Autowired
	private WasteCollector wasteCollector;
		
	//customer id list
	@RequestMapping(value = "/customer/getCustomerIDList", method = RequestMethod.GET)
	public ResponseEntity<List<BigInteger>> getCustomerIDList() {
		//RestTemplate template = new RestTemplate();
		ResponseEntity<List<BigInteger>> responseData = null;
		logger.info("***Fetching customer id list started***");
		
		try {
			List<BigInteger> customerIDs = customerAllDetailsServiceImpl.fetchAllCustomerIDs();
			
			responseData = new ResponseEntity<List<BigInteger>>(customerIDs, HttpStatus.OK);
		} catch ( Exception  e) {
			e.printStackTrace();
		}
	
		logger.info("***Fetching customer id list completed***");
		
		return responseData;
	}
	
	//specific customer details
	@RequestMapping(value = "/customer/getCustomerInfo", method = RequestMethod.GET)
	public ResponseEntity<List<CustomerSpecific>> getCustomerInfo(/*@RequestBody long customerid*/) {
		ResponseEntity<List<CustomerSpecific>> responseData = null;		
		logger.info("***Fetching customer info started***");
		try {
			/*List<CustomerSpecific> customer = new ArrayList<CustomerSpecific>();
			for(int i=0; i<cust.size(); i++){
				List temp = cust.get(i);
				CustomerSpecific custTemp = new CustomerSpecific((long)temp.get(0), (double)temp.get(1), (String)temp.get(2), (double)temp.get(3), (String)temp.get(4));
				customer.add(custTemp);
			}*/
			
			Long customerid = 111111111L;
			
			List<WasteCollector> collector =  wasteCollectorServiceImpl.fetchCustomerInfo(customerid);			
			
			List<CustomerSpecific> custCollectorinfo = new ArrayList<CustomerSpecific>();
			
			for(int i=0; i<collector.size(); i++) {
				CustomerSpecific coll = new CustomerSpecific(collector.get(i).getPoint_score(), collector.get(i).getDateofdeposit(), collector.get(i).getQuantity(), collector.get(i).getCategory_code());
				
				custCollectorinfo.add(i, coll);
			}
			
			responseData = new ResponseEntity<List<CustomerSpecific>>(custCollectorinfo, HttpStatus.OK);
			
		} catch ( Exception  e) {
			e.printStackTrace();
		}
		logger.info("***Fetching customer info completed***");
		
		return responseData;
	}
	
	//specific customer point collected score agg 
	@RequestMapping(value = "/customer/getCustomerPointsCollectedAgg", method = RequestMethod.GET)
	public ResponseEntity<Double> getCustomerPointsCollectedAgg(/*@RequestBody long customerid*/) {
		ResponseEntity<Double> responseData = null;		
		logger.info("***Fetching customer points collected agg started***");
		
		try {
			Long customerid = 111111111L;
			
			Double pointScoreCollectedAgg =  wasteCollectorServiceImpl.fetchCustomerPointsCollectedAgg(customerid);
			
			responseData = new ResponseEntity<Double>(pointScoreCollectedAgg, HttpStatus.OK);
			
		} catch ( Exception  e) {
			e.printStackTrace();
		}
		
		logger.info("***Fetching customer points collected agg completed***");
		
		return responseData;
	}
	
	//specific customer point redeemed score agg 
	@RequestMapping(value = "/customer/getCustomerPointsRedeemedAgg", method = RequestMethod.GET)
	public ResponseEntity<Double> getCustomerPointsRedeemedAgg(/*@RequestBody long customerid*/) {
		ResponseEntity<Double> responseData = null;		
		logger.info("***Fetching customer points redeemed agg started***");
		
		try {
			Long customerid = 111111111L;
			
			Double pointScoreRedeemedAgg =  wasteCollectorServiceImpl.fetchCustomerPointsRedeemedAgg(customerid);
			
			responseData = new ResponseEntity<Double>(pointScoreRedeemedAgg, HttpStatus.OK);
			
		} catch ( Exception  e) {
			e.printStackTrace();
		}
		
		logger.info("***Fetching customer points redeemed agg completed***");
		
		return responseData;
	}
	
}