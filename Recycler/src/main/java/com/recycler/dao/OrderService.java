package com.recycler.dao;

import com.recycler.model.Orders;

public interface OrderService {
	
	public void saveOrderDetails(Orders order);
	
	public Long fetchMaxOrderId();
}
