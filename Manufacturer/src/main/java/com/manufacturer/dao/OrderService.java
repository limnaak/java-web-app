package com.manufacturer.dao;

import com.manufacturer.model.Orders;

public interface OrderService {
	
	public void saveOrderDetails(Orders order);
	
	public Long fetchMaxOrderId();
}
