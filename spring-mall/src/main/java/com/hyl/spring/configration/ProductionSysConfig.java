package com.hyl.spring.configration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/*只有profile为production时（设置spring.profiles.active=production），才能应用该配置。*/
@Profile("production")
@SpringBootConfiguration
public class ProductionSysConfig {
	
	@Bean
	public Object production(){
		System.out.println("===================Productjion=====================");
		
		return null;
	}
}
