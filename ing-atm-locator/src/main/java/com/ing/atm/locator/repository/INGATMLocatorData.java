package com.ing.atm.locator.repository;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ing.atm.locator.entity.INGATM;

@Repository
public interface INGATMLocatorData {
	
	List<INGATM> getINGData() throws IOException;
}
