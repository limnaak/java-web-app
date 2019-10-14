package com.wasteCollector.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table (name="retailers_customers", schema="oe")
@Component
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id",scope=Retailer.class)
public class Retailer {
	@Id 
	//@GeneratedValue (strategy=GenerationType.AUTO)
	private long purchase_id;
	
	//@Column (nullable= true ,insertable = true, updatable = true)
	//private long purchase_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private long retailer_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private long customer_id;
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double point_redeemed;
	@Column (nullable= true ,insertable = true, updatable = true)
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
