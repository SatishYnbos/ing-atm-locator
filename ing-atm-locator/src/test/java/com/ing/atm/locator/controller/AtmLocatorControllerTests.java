package com.ing.atm.locator.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ing.atm.locator.TestUtil;
import com.ing.atm.locator.entity.INGATM;
import com.ing.atm.locator.service.INGATMLocatorService;

public class AtmLocatorControllerTests {

	private List<INGATM> expectedControllerResponse;

	@InjectMocks
	INGATMLocatorController atmLocatorController;

	@Mock
	INGATMLocatorService atmLocatorService;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
		expectedControllerResponse = TestUtil.getExpectedResponse();
	}

	@Test
	public void getINGATMLocation() throws Exception {
		when(atmLocatorService.getINGATMLocation()).thenReturn(expectedControllerResponse);
		List<INGATM> actualResponse = atmLocatorController.getINGATMLocation();
		assertEquals(expectedControllerResponse.size(), actualResponse.size());
	}

	@Test
	public void getINGATMLocationByCity() throws Exception {
		when(atmLocatorService.getINGATMLocationByCity("Rotterdam")).thenReturn(expectedControllerResponse);
		List<INGATM> actualResponse = atmLocatorController.getINGATMLocationByCity("Rotterdam");
		assertEquals(expectedControllerResponse.size(), actualResponse.size());
	}
}