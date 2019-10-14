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
@Table (name="waste_collectors", schema="oe")
@Component
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id",scope=WasteCollector.class)
public class WasteCollector {
	@Id 
	//@GeneratedValue (strategy=GenerationType.AUTO)
	private long deposit_id;
	
	@Column (nullable= true ,insertable = true, updatable = true)
	private long collector_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private long customer_id;
	//@Column (nullable= true ,insertable = true, updatable = true)
	//private long deposit_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private long category_code;
	@Column (nullable= true ,insertable = true, updatable = true)
	private String territory;
	@Column (nullable= true ,insertable = true, updatable = true)
	private String date_of_deposit;
	
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double lattitude;
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double longitude;
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double quantity;
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double point_score;
	
	public WasteCollector() {
		
	}

	public long getCollector_id() {
		return collector_id;
	}

	public void setCollector_id(long collector_id) {
		this.collector_id = collector_id;
	}

	public long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}

	public long getDeposit_id() {
		return deposit_id;
	}

	public void setDeposit_id(long deposit_id) {
		this.deposit_id = deposit_id;
	}

	public long getCategory_code() {
		return category_code;
	}

	public void setCategory_code(long category_code) {
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
