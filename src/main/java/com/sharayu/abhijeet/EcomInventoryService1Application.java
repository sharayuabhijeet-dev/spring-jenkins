package com.sharayu.abhijeet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class EcomInventoryService1Application {
	
	public static Logger logger=LoggerFactory.getLogger(EcomInventoryService1Application.class);
	
	@PostConstruct
	public void init()
	{
		logger.info("Application Started....");
	}

	public static void main(String[] args) {
		logger.info("Application executed....");
		SpringApplication.run(EcomInventoryService1Application.class, args);
	}

}
