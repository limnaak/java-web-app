package com.recycler.model;

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
@Table (name="waste_recyclers", schema="oe")
@Component
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id",scope=Recycler.class)
public class Recycler {
	@Id 
	//@GeneratedValue (strategy=GenerationType.AUTO)
	private long deposit_id;
	
	//@Column (nullable= true ,insertable = true, updatable = true)
	//private long purchase_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private long recycler_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private long category_code;
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double waste_quantity;
	@Column (nullable= true ,insertable = true, updatable = true)
	private double recycle_quantity;	
	@Column (nullable= true ,insertable = true, updatable = true)
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
