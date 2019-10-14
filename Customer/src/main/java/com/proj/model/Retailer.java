package com.proj.model;

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
	@GeneratedValue (strategy=GenerationType.AUTO)
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
	
}
