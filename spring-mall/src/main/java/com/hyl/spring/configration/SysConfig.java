package com.hyl.spring.configration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.hyl.spring.configration.model.Student;

@SpringBootConfiguration
public class SysConfig {
	@Value("${test}")
	private String test;
	
	@Bean
	public Object dataSource(){
		System.out.println("===============================================================================");
		System.out.println(this.test);
		
		return null;
	}
	
	@Bean
	@ConfigurationProperties(prefix = "student")
	public Student studentInit(){
		return new Student();
	}
}
