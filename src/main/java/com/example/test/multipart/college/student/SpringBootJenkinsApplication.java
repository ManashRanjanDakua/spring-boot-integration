package com.example.test.multipart.college.student;

import javax.annotation.PostConstruct;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Initialize");
	}

	public static void main(String[] args) {
		logger.info("application executed.....");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
		logger.info("Omm Sai Ram.....");
	}

}
