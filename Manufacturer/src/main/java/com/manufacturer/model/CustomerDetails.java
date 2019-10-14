package com.manufacturer.model;

import org.springframework.stereotype.Component;

@Component
public class CustomerDetails {
	
	private long customer_id;
	private String cust_first_name;
	private String cust_last_name;	
	private String date_of_birth;
	private String phone_number;
	private String cust_email;
	private String cust_address;
	private double point_score;
	
	public CustomerDetails() {
		
	}
	
	public CustomerDetails(long customer_id, String cust_first_name, String cust_last_name, String date_of_birth, String phone_number, String cust_email, String cust_address, double point_score) {
		this.customer_id = customer_id;
		this.cust_first_name = cust_first_name;
		this.cust_last_name = cust_last_name;
		this.date_of_birth = date_of_birth;
		this.phone_number = phone_number;
		this.cust_email = cust_email;
		this.cust_address = cust_address;
		this.point_score = point_score;
	}
	
	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCust_first_name() {
		return cust_first_name;
	}

	public void setCust_first_name(String cust_first_name) {
		this.cust_first_name = cust_first_name;
	}

	public String getCust_last_name() {
		return cust_last_name;
	}

	public void setCust_last_name(String cust_last_name) {
		this.cust_last_name = cust_last_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}

	public double getPoint_score() {
		return point_score;
	}

	public void setPoint_score(double point_score) {
		this.point_score = point_score;
	}
	
	
}
