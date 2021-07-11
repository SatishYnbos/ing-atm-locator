package com.ing.atm.locator.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ing.atm.locator.entity.INGATM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class INGATMLocatorDataImpl implements INGATMLocatorData {

	@Value("${atm.locator.uri}")
	private String uri;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<INGATM> getINGData() throws IOException {
		String response = restTemplate.getForObject(uri, String.class);
		String ToParsedResponse = response.substring(6, response.length());
		ObjectMapper objectMapper = new ObjectMapper();
		INGATM[] ingAtmLocations = objectMapper.readValue(ToParsedResponse, INGATM[].class);
		return Arrays.asList(ingAtmLocations);
	}
}
