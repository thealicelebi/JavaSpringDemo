package com.javacourse.project.hibernateAndJpaa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="countries")
public class Country {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="Country_name")
	private String countryName;
	
	@Column(name="Area_Total")
	private String areaTotal;
	
	@Column(name="Area_Water")
	private String areaWater;
	
	public Country(int id, String countryName, String areaTotal, String areaWater) {
		this.id = id;
		this.countryName = countryName;
		this.areaTotal = areaTotal;
		this.areaWater = areaWater;
	}
	
	
	public Country() {
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getAreaTotal() {
		return areaTotal;
	}
	public void setAreaTotal(String areaTotal) {
		this.areaTotal = areaTotal;
	}
	public String getAreaWater() {
		return areaWater;
	}
	public void setAreaWater(String areaWater) {
		this.areaWater = areaWater;
	}
	
	

}
