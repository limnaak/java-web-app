package com.recycler.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.recycler.model.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer>{
	//max order id
	@Transactional(readOnly=true)
	@Query(value = "SELECT MAX(r.order_id) from oe.orders r", nativeQuery = true)
	public Long findMaxOrderId();
}

