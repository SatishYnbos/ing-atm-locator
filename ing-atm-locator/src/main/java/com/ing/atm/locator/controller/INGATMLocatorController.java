package com.ing.atm.locator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ing.atm.locator.entity.INGATM;
import com.ing.atm.locator.service.INGATMLocatorService;

@RestController
public class INGATMLocatorController {

	private final INGATMLocatorService atmLocatorService;

	@Autowired
	public INGATMLocatorController(INGATMLocatorService atmLocatorService) {
		this.atmLocatorService = atmLocatorService;
	}

	@GetMapping(value = "/atmLocations", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<INGATM> getINGATMLocation() throws Exception {
		return atmLocatorService.getINGATMLocation();
	}

	@GetMapping(value = "/atmLocations/{city}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<INGATM> getINGATMLocationByCity(@PathVariable("city") String city) throws Exception {
		return atmLocatorService.getINGATMLocationByCity(city);
	}
}
