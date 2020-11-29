package com.techleads.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbMockVerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbMockVerApplication.class, args);
	}
	
	@Value("dummy")
	public String findVal(String a, String b) {
		System.out.println(a+b);
		return a+b;
	}

}
