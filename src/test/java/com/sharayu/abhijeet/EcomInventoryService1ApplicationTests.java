package com.sharayu.abhijeet;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class EcomInventoryService1ApplicationTests {
	
	public static Logger logger=LoggerFactory.getLogger(EcomInventoryService1ApplicationTests.class);

	@Test
	void contextLoads() {
		assertEquals(true, true);
		logger.info("Application execution test started....");
	}

}
