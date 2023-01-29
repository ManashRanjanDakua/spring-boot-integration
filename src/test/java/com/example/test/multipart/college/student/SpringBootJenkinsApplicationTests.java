package com.example.test.multipart.college.student;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("in context loads");
		assertEquals(true, true);
	}

}
