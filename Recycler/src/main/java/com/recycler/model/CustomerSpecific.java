package com.recycler.model;

import org.springframework.stereotype.Component;

@Component
public class CustomerSpecific {
	
	//private long customer_id;
	private double point_score;
	private String date_of_deposit;
	private double quantity;
	private long category_code;
	
	public CustomerSpecific() {
		
	}
	
	public CustomerSpecific(double point_score, String date_of_deposit, double quantity, long category_code) {
		this.point_score = point_score;
		this.date_of_deposit = date_of_deposit;
		this.quantity = quantity;
		this.category_code = category_code;
	}
	
	/*public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}*/

	public double getPoint_score() {
		return point_score;
	}

	public void setPoint_score(double point_score) {
		this.point_score = point_score;
	}

	public String getDate_of_deposit() {
		return date_of_deposit;
	}

	public void setDate_of_deposit(String date_of_deposit) {
		this.date_of_deposit = date_of_deposit;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public long getCategory_code() {
		return category_code;
	}

	public void setCategory_code(long category_code) {
		this.category_code = category_code;
	}	
}
