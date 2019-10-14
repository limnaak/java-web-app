package com.manufacturer.model;

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
@Table (name="manufacturers", schema="oe")
@Component
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id",scope=Manufacturers.class)
public class Manufacturers {
	@Id 
	//@GeneratedValue (strategy=GenerationType.AUTO)
	private long manufacturer_id;
	
	//@Column (nullable= true ,insertable = true, updatable = true)
	//private long manufacturer_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private long category_code;
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double raw_quantity;
	@Column (nullable= true ,insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double recycle_quantity;	
	@Column (nullable= true ,insertable = true, updatable = true)
	private String date_of_manufacture;
	@ColumnDefault ("0")
	private double profit;
	@Column (nullable= true ,insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double profit_share;
	
	public long getManufacturer_id() {
		return manufacturer_id;
	}
	public void setManufacturer_id(long manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}
	public long getCategory_code() {
		return category_code;
	}
	public void setCategory_code(long category_code) {
		this.category_code = category_code;
	}
	public double getRaw_quantity() {
		return raw_quantity;
	}
	public void setRaw_quantity(double raw_quantity) {
		this.raw_quantity = raw_quantity;
	}
	public double getRecycle_quantity() {
		return recycle_quantity;
	}
	public void setRecycle_quantity(double recycle_quantity) {
		this.recycle_quantity = recycle_quantity;
	}
	public String getDate_of_manufacture() {
		return date_of_manufacture;
	}
	public void setDate_of_manufacture(String date_of_manufacture) {
		this.date_of_manufacture = date_of_manufacture;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	public double getProfit_share() {
		return profit_share;
	}
	public void setProfit_share(double profit_share) {
		this.profit_share = profit_share;
	}	
	
}
