package com.recycler.model;

import javax.persistence.Column;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.stereotype.Component;

@Component
public class OrdersDetails {
	
	private long order_id;
	private String order_date;
	private long put_id;
	private long get_id;
	private String order_mode;	
	private String category_code;
	private double quantity;
	private long order_status;
	private double order_total;
	
	public long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}
	public String getOrder_date() {
		return order_date;
	}
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}
	public long getPut_id() {
		return put_id;
	}
	public void setPut_id(long put_id) {
		this.put_id = put_id;
	}
	public long getGet_id() {
		return get_id;
	}
	public void setGet_id(long get_id) {
		this.get_id = get_id;
	}
	public String getOrder_mode() {
		return order_mode;
	}
	public void setOrder_mode(String order_mode) {
		this.order_mode = order_mode;
	}
	public String getCategory_code() {
		return category_code;
	}
	public void setCategory_code(String category_code) {
		this.category_code = category_code;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public long getOrder_status() {
		return order_status;
	}
	public void setOrder_status(long order_status) {
		this.order_status = order_status;
	}
	public double getOrder_total() {
		return order_total;
	}
	public void setOrder_total(double order_total) {
		this.order_total = order_total;
	}	

}
