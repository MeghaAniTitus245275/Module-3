package com.ust.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstrestApplication {
	
	static Logger logger = LoggerFactory.getLogger(FirstrestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstrestApplication.class, args);
		logger.info("Application started successfully");
		logger.error("Application started successfully");
		logger.warn("MAKE IT COUNT");
		logger.debug("Application started successfully");
	logger.trace("Application started successfully");
	}

}
