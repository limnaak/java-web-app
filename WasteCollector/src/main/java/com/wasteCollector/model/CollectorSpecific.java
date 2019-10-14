package com.wasteCollector.model;

import org.springframework.stereotype.Component;

@Component
public class CollectorSpecific {
	
	//private long customer_id;
	private long collector_id;
	private String territory;
	private double lattitude;
	private double longitude;
	
	public CollectorSpecific() {
		
	}
	
	public CollectorSpecific(long collector_id, String territory, double lattitude, double longitude) {
		this.setCollector_id(collector_id);
		this.setTerritory(territory);
		this.setLattitude(lattitude);
		this.setLongitude(longitude);
	}

	public long getCollector_id() {
		return collector_id;
	}

	public void setCollector_id(long collector_id) {
		this.collector_id = collector_id;
	}

	public String getTerritory() {
		return territory;
	}

	public void setTerritory(String territory) {
		this.territory = territory;
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
	
	
}
