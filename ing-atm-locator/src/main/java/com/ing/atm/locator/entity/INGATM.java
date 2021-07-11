package com.ing.atm.locator.entity;

import java.util.List;

public class INGATM {
	
	private Address address;
	private int distance;
	private String type;
	private List<OpeningTime> openingHours;
	private String functionality;

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getDistance() {
		return this.distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<OpeningTime> getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(List<OpeningTime> openingHours) {
		this.openingHours = openingHours;
	}

	public String getFunctionality() {
		return functionality;
	}

	public void setFunctionality(String functionality) {
		this.functionality = functionality;
	}

}
