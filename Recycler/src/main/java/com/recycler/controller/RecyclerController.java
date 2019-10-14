package com.recycler.controller;

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

import com.recycler.dao.CustomerAllDetailsServiceImpl;
import com.recycler.dao.OrderServiceImpl;
import com.recycler.dao.RecyclerServiceImpl;
import com.recycler.dao.WasteCollectorServiceImpl;
import com.recycler.model.CollectorSpecific;
import com.recycler.model.Orders;
import com.recycler.model.WasteCollector;

@RestController
public class RecyclerController {
	private static Logger logger = LoggerFactory.getLogger(RecyclerController.class);
		
	@Autowired
	private CustomerAllDetailsServiceImpl customerAllDetailsServiceImpl;
	
	@Autowired
	private WasteCollectorServiceImpl wasteCollectorServiceImpl;
	
	@Autowired
	private RecyclerServiceImpl recyclerServiceImpl;
	
	@Autowired
	private OrderServiceImpl orderServiceImpl;
	
	@Autowired
	private WasteCollector wasteCollector;
		
	//recycler id list
	@RequestMapping(value = "/recycler/getRecyclerIDList", method = RequestMethod.GET)
	public ResponseEntity<List<BigInteger>> getRecyclerIDList() {
		//RestTemplate template = new RestTemplate();
		ResponseEntity<List<BigInteger>> responseData = null;
		logger.info("***Fetching recycler id list started***");
		
		try {
			List<BigInteger> recyclerIDs = recyclerServiceImpl.fetchAllRecyclerIDs();
			
			responseData = new ResponseEntity<List<BigInteger>>(recyclerIDs, HttpStatus.OK);
		} catch ( Exception  e) {
			e.printStackTrace();
		}
	
		logger.info("***Fetching recycler id list completed***");
		
		return responseData;
	}	
	
	//generate max orderid
	@RequestMapping(value = "/recycler/getNextOrderID", method = RequestMethod.GET)
	public ResponseEntity<Long> getNextOrderID() {
		ResponseEntity<Long> responseData = null;
		logger.info("***Fetching order id started***");
		try {
			Long depositid = orderServiceImpl.fetchMaxOrderId()+1;		
			responseData = new ResponseEntity<Long>(depositid, HttpStatus.OK);
		
		} catch ( Exception  e) {
			e.printStackTrace();
		}
		logger.info("***Fetching order id completed***");
		
		return responseData;
	}
	
	//save values to order table
	@RequestMapping(value = "/recycler/sendRecyclerOrderDetails", method = RequestMethod.POST)
	public void sendRecyclerOrderDetails() {
		logger.info("***Sending recycler order details started***");
		try {
			Orders orders = null;
			
			orderServiceImpl.saveOrderDetails(orders);	
		
		} catch ( Exception  e) {
			e.printStackTrace();
		}
		
		logger.info("***Sending recycler order details completed***");		
	}
}