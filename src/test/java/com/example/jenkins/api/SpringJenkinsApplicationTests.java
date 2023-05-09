package com.example.jenkins.api;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class SpringJenkinsApplicationTests {

	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	@Test
	public void contextLoads() {
		logger.info("Test case executing...");
	
	}

}
