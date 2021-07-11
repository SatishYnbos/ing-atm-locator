package com.ing.atm.locator.entity;

import java.util.List;

public class OpeningTime implements Comparable<OpeningTime> {

	private int dayOfWeek;
	private List<Hour> hours;

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public List<Hour> getHours() {
		return hours;
	}

	public void setHours(List<Hour> hours) {
		this.hours = hours;
	}

	@Override
	public int compareTo(OpeningTime o) {
		return this.dayOfWeek - o.dayOfWeek;
	}

}
