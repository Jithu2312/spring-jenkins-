package com.example.jenkins.api;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger logger=(Logger) LoggerFactory.getLogger(SpringJenkinsApplication.class);
	@PostConstruct
	public void intt() {
	logger.info("App started");
	}
	public static void main(String[] args) {
		logger.info("App executed");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
