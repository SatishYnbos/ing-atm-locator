package com.ing.atm.locator.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.ing.atm.locator.TestUtil;
import com.ing.atm.locator.entity.INGATM;
import com.ing.atm.locator.repository.INGATMLocatorData;

public class AtmLocatorServiceTests {
	private List<INGATM> expectedServiceResponse;

	@InjectMocks
	private INGATMLocatorService atmLocatorService;

	@Mock
	private INGATMLocatorData atmLocatorData;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		expectedServiceResponse = TestUtil.getExpectedResponse();
	}

	@Test
	public void getINGATMLocation() throws Exception {
		Mockito.when(atmLocatorData.getINGData()).thenReturn(expectedServiceResponse);
		List<INGATM> actualResponse = atmLocatorService.getINGATMLocation();
		assertEquals(expectedServiceResponse.size(), actualResponse.size());
	}

	@Test
	public void getINGATMLocationByCity() throws Exception {
		Mockito.when(atmLocatorData.getINGData()).thenReturn(expectedServiceResponse);
		List<INGATM> actualResponse = atmLocatorService.getINGATMLocationByCity("Amsterdam");
		assertEquals(2, actualResponse.size());
	}
}