package com.ing.atm.locator;

import java.util.ArrayList;
import java.util.List;

import com.ing.atm.locator.entity.Address;
import com.ing.atm.locator.entity.INGATM;

public class TestUtil {
	public static List<INGATM> getExpectedResponse() {
		List<INGATM> expectedControllerResponse = new ArrayList<>();
		INGATM locatorApiResponse = new INGATM();
		Address address = new Address();
		address.setCity("Rotterdam");
		address.setHousenumber("12/R");
		locatorApiResponse.setAddress(address);
		locatorApiResponse.setDistance(1);
		locatorApiResponse.setType("ING");
		expectedControllerResponse.add(locatorApiResponse);

		locatorApiResponse = new INGATM();
		address = new Address();
		address.setCity("Amsterdam");
		address.setHousenumber("12/A");
		locatorApiResponse.setAddress(address);
		locatorApiResponse.setDistance(2);
		locatorApiResponse.setType("ING");
		expectedControllerResponse.add(locatorApiResponse);

		locatorApiResponse = new INGATM();
		address = new Address();
		address.setCity("Amsterdam");
		address.setHousenumber("12/C");
		locatorApiResponse.setAddress(address);
		locatorApiResponse.setDistance(3);
		locatorApiResponse.setType("ING");
		expectedControllerResponse.add(locatorApiResponse);

		return expectedControllerResponse;
	}
}
