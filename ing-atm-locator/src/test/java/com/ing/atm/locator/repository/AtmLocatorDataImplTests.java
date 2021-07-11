package com.ing.atm.locator.repository;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ing.atm.locator.INGATMLocatorApplication;
import com.ing.atm.locator.entity.INGATM;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = INGATMLocatorApplication.class)
@WebAppConfiguration
public class AtmLocatorDataImplTests {
	@Autowired
	INGATMLocatorData atmLocatorData;

	@Test
	public void getINGData() throws IOException {
		List<INGATM> response = atmLocatorData.getINGData();
		assertEquals(1410, response.size());
	}
}