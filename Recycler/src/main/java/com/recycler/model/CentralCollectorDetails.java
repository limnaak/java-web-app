package com.recycler.model;

import org.springframework.stereotype.Component;

@Component
public class CentralCollectorDetails {
	
	private long collector_id;
	private long category_code;
	private String date_of_collect;
	private double quantity;
	
	public long getCollector_id() {
		return collector_id;
	}

	public void setCollector_id(long collector_id) {
		this.collector_id = collector_id;
	}

	public long getCategory_code() {
		return category_code;
	}

	public void setCategory_code(long category_code) {
		this.category_code = category_code;
	}

	public String getDateofdeposit() {
		return date_of_collect;
	}

	public void setDateofdeposit(String date_of_collect) {
		this.date_of_collect = date_of_collect;
	}	

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

}
