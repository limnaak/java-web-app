package com.recycler.model;

import org.springframework.stereotype.Component;

@Component
public class RecyclerDetails {
	
	private long deposit_id;
	private long recycler_id;
	private long category_code;
	private double waste_quantity;
	private double recycle_quantity;
	private String date_of_recycle;
	
	public long getDeposit_id() {
		return deposit_id;
	}
	public void setDeposit_id(long deposit_id) {
		this.deposit_id = deposit_id;
	}
	public long getRecycler_id() {
		return recycler_id;
	}
	public void setRecycler_id(long recycler_id) {
		this.recycler_id = recycler_id;
	}
	public long getCategory_code() {
		return category_code;
	}
	public void setCategory_code(long category_code) {
		this.category_code = category_code;
	}
	public double getWaste_quantity() {
		return waste_quantity;
	}
	public void setWaste_quantity(double waste_quantity) {
		this.waste_quantity = waste_quantity;
	}
	public double getRecycle_quantity() {
		return recycle_quantity;
	}
	public void setRecycle_quantity(double recycle_quantity) {
		this.recycle_quantity = recycle_quantity;
	}
	public String getDate_of_recycle() {
		return date_of_recycle;
	}
	public void setDate_of_recycle(String date_of_recycle) {
		this.date_of_recycle = date_of_recycle;
	}
		

}
