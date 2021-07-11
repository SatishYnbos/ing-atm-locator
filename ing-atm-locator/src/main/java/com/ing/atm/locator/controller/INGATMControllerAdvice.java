package com.ing.atm.locator.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class INGATMControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	public void catchException(HttpServletResponse response, Exception ex) throws IOException {
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		response.getWriter().write("We are facing some deficulty to perform your request. Please try again later.");
	}

}
