package com.proj.model;

import org.springframework.stereotype.Component;

@Component
public class RetailerDetails {
	
	private long purchase_id;
	private long retailer_id;
	private long customer_id;
	private double point_redeemed;
	private String date_of_purchase;
	
	public long getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(long purchase_id) {
		this.purchase_id = purchase_id;
	}
	public long getRetailer_id() {
		return retailer_id;
	}
	public void setRetailer_id(long retailer_id) {
		this.retailer_id = retailer_id;
	}
	public long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}
	public double getPoint_redeemed() {
		return point_redeemed;
	}
	public void setPoint_redeemed(double point_redeemed) {
		this.point_redeemed = point_redeemed;
	}
	public String getDate_of_purchase() {
		return date_of_purchase;
	}
	public void setDate_of_purchase(String date_of_purchase) {
		this.date_of_purchase = date_of_purchase;
	}
		

}
