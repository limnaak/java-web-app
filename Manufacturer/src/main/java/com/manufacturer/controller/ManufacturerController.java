package com.manufacturer.controller;

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

import com.manufacturer.dao.CustomerAllDetailsServiceImpl;
import com.manufacturer.dao.ManufacturerServiceImpl;
import com.manufacturer.dao.OrderServiceImpl;
import com.manufacturer.dao.RecyclerServiceImpl;
import com.manufacturer.dao.WasteCollectorServiceImpl;
import com.manufacturer.model.WasteCollector;
import com.manufacturer.model.Orders;

@RestController
public class ManufacturerController {
	private static Logger logger = LoggerFactory.getLogger(ManufacturerController.class);
		
	@Autowired
	private CustomerAllDetailsServiceImpl customerAllDetailsServiceImpl;
	
	@Autowired
	private WasteCollectorServiceImpl wasteCollectorServiceImpl;
	
	@Autowired
	private RecyclerServiceImpl recyclerServiceImpl;
	
	@Autowired
	private OrderServiceImpl orderServiceImpl;
	
	@Autowired
	private ManufacturerServiceImpl manufacturerServiceImpl;
	
	@Autowired
	private WasteCollector wasteCollector;
		
	//recycler id list
	@RequestMapping(value = "/manufacturer/getRecyclerIDList", method = RequestMethod.GET)
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
	
	//manufacturer id list
	@RequestMapping(value = "/manufacturer/getManufacturerIDList", method = RequestMethod.GET)
	public ResponseEntity<List<BigInteger>> getManufacturerIDList() {
		//RestTemplate template = new RestTemplate();
		ResponseEntity<List<BigInteger>> responseData = null;
		logger.info("***Fetching manufacturer id list started***");
		
		try {
			List<BigInteger> manuacturerIDs = manufacturerServiceImpl.fetchAllManufacturerIDs();
			
			responseData = new ResponseEntity<List<BigInteger>>(manuacturerIDs, HttpStatus.OK);
		} catch ( Exception  e) {
			e.printStackTrace();
		}
	
		logger.info("***Fetching manufacturer id list completed***");
		
		return responseData;
	}
	
	//generate max orderid
	@RequestMapping(value = "/manufacturer/getNextOrderID", method = RequestMethod.GET)
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
	@RequestMapping(value = "/manufacturer/sendManufacturerOrderDetails", method = RequestMethod.POST)
	public void sendManufacturerOrderDetails() {
		logger.info("***Sending manufacturer order details started***");
		try {
			Orders orders = null;
			
			orderServiceImpl.saveOrderDetails(orders);	
		
		} catch ( Exception  e) {
			e.printStackTrace();
		}
		
		logger.info("***Sending manufacturer order details completed***");		
	}
}