package com.cnu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//if we package as jar and without 
//if we package as war ,if we try to run as web application we get whitelable errorpage we need to add component scan
//@ComponentScan(basePackages= {"com.cnu"})
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
