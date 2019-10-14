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
@Table (name="central_collector", schema="oe")
@Component
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id",scope=CentralCollector.class)
public class CentralCollector {
	@Id 
	@GeneratedValue (strategy=GenerationType.AUTO)
	private long collector_id;
	
	//@Column (nullable= true ,insertable = true, updatable = true)
	//private long collecter_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private long category_code;
	@Column (nullable= true ,insertable = true, updatable = true)
	private String date_of_collect;
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double quantity;

	public long getCollector_id() {
		return collector_id;
	}

	public void setCollector_id(long collector_id) {
		this.collector_id = collector_id;
	}

	public long getCategory_code() {
		return category_code;
	}

	public void setCategory_code(long category_code) {
		this.category_code = category_code;
	}

	public String getDateofdeposit() {
		return date_of_collect;
	}

	public void setDateofdeposit(String date_of_collect) {
		this.date_of_collect = date_of_collect;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	
}
