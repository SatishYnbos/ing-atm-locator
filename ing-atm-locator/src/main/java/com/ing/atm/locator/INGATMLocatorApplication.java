package com.ing.atm.locator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class INGATMLocatorApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(INGATMLocatorApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(INGATMLocatorApplication.class);
	}

}
