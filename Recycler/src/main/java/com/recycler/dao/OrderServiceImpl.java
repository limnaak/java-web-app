package com.recycler.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.recycler.model.Orders;

@Component
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;		
		
	@Override
	public void saveOrderDetails(Orders orders) {		
		orderRepository.save(orders);
	}	
	
	//get max order id
	@Override
	public Long fetchMaxOrderId() {		
		Long depositid = orderRepository.findMaxOrderId();		
		return depositid;		
	}
}
