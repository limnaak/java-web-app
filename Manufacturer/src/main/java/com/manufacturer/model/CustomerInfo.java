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
@Table (name="customers", schema="oe")
@Component
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class, property="@id",scope=CustomerInfo.class)
public class CustomerInfo {
	@Id 
	//@GeneratedValue (strategy=GenerationType.AUTO)
	private long customer_id;
	
	//@TableGenerator(name = "customer_id", table = "customer", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", pkColumnValue = "Addr_Gen", initialValue = (int) 161976631450L, allocationSize = 1)  
	//@Column (nullable= true ,insertable = true, updatable = true)
	//private long customer_id;
	@Column (nullable= true ,insertable = true, updatable = true)
	private String cust_first_name;
	@Column (nullable= true ,insertable = true, updatable = true)
	private String cust_last_name;
	@Column (nullable= true ,insertable = true, updatable = true)
	private String date_of_birth;	
	@Column (nullable= true ,insertable = true, updatable = true)
	private String phone_number;	
	@Column (nullable= true ,insertable = true, updatable = true)
	private String cust_email;
	@Column (nullable= true ,insertable = true, updatable = true)
	private String cust_address;
	@Column (nullable=false, insertable = true, updatable = true)
	@ColumnDefault ("0")
	private double point_score;
	
	public CustomerInfo(){
		
	}
	
	public CustomerInfo(long customer_id, String cust_first_name, String cust_last_name, String date_of_birth, String phone_number, String cust_email, String cust_address, double point_score) {
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
