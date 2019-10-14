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
@Table (name="orders", schema="oe")
@Component
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id",scope=Orders.class)
public class Orders {
	@Id 
	//@GeneratedValue (strategy=GenerationType.AUTO)
	private long order_id;
	
	//@Column (nullable= true ,insertable = true, updatable = true)
	//private long order_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private String order_date;
	@Column (nullable= true ,insertable = true, updatable = true)
	@ColumnDefault ("0")
	private long put_id;
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private long get_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private String order_mode;	
	@Column (nullable= true ,insertable = true, updatable = true)
	private String category_code;
	@Column (nullable= true ,insertable = true, updatable = true)
	private double quantity;
	@Column (nullable= true ,insertable = true, updatable = true)
	private long order_status;
	@Column (nullable= true ,insertable = true, updatable = true)
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
