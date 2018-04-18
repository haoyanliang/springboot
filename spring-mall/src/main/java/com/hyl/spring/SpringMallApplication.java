package com.hyl.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.hyl.spring"})
public class SpringMallApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringMallApplication.class, args);
	}
}
