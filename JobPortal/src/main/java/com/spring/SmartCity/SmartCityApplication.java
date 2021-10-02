package com.spring.SmartCity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration()
@ComponentScan(basePackages = "com.spring")
@EntityScan(basePackages = {"com.spring"})
public class SmartCityApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(SmartCityApplication.class, args);
	}

}
