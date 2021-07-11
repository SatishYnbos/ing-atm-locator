package com.ing.atm.locator.service;

import com.ing.atm.locator.entity.INGATM;
import com.ing.atm.locator.repository.INGATMLocatorData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;

@Service
public class INGATMLocatorService {

	@Autowired
	private INGATMLocatorData atmLocatorData;

	@Autowired
	public INGATMLocatorService(INGATMLocatorData atmLocatorData) {
		this.atmLocatorData = atmLocatorData;
	}

	public List<INGATM> getINGATMLocation() throws Exception {
		List<INGATM> atms = atmLocatorData.getINGData();
		sortATMs(atms);
		return atms;
	}

	public List<INGATM> getINGATMLocationByCity(String city) throws Exception {
		List<INGATM> atms = atmLocatorData.getINGData();
		sortATMs(atms);
		return atms.stream().filter(response -> response.getAddress().getCity().equalsIgnoreCase(city))
				.collect(toList());
	}

	private void sortATMs(List<INGATM> atms) {
		Comparator<INGATM> c = (a1, a2) -> a1.getAddress().getHousenumber().compareTo(a2.getAddress().getHousenumber());
		atms.sort(c);
	}

}
