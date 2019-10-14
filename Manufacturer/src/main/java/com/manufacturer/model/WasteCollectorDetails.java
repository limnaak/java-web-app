package com.manufacturer.model;

import org.springframework.stereotype.Component;

@Component
public class WasteCollectorDetails {
	
	private String collector_id;
	private String customer_id;
	private String deposit_id;	
	private double category_code;
	private String territory;
	private String date_of_deposit;
	private double lattitude;
	private double longitude;
	private double quantity;
	private double point_score;
	
	public String getCollector_id() {
		return collector_id;
	}

	public void setCollector_id(String collector_id) {
		this.collector_id = collector_id;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getDeposit_id() {
		return deposit_id;
	}

	public void setDeposit_id(String deposit_id) {
		this.deposit_id = deposit_id;
	}

	public double getCategory_code() {
		return category_code;
	}

	public void setCategory_code(double category_code) {
		this.category_code = category_code;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
	}

	public String getDateofdeposit() {
		return date_of_deposit;
	}

	public void setDateofdeposit(String date_of_deposit) {
		this.date_of_deposit = date_of_deposit;
	}

	public double getLattitude() {
		return lattitude;
	}

	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPoint_score() {
		return point_score;
	}

	public void setPoint_score(double point_score) {
		this.point_score = point_score;
	}

}
