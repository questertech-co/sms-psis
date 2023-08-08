package com.quester.smspsis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmsPsisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsPsisApplication.class, args);
	}

}
