package com.spring.application;

import  org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringApplication1ApplicationTests {
	

	@Test
	void contextLoads() {
		
	}
	@Test
	void practice() {
		String str1=null;
		String str2="hi";
		assertNull(str1, str2);
		
	}

}
