package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserRestfulapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRestfulapiApplication.class, args);
	}
	
	@Bean
	//to run contact-service in controller
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
