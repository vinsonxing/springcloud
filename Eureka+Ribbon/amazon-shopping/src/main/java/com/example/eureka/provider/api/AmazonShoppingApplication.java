package com.example.eureka.provider.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class AmazonShoppingApplication {

	@Bean
	// Must config this annotation, otherwise, the Spring boot won't map the Eureka 
	// service address (in terms of TICKET-PROVIDER) to it's real address
	@LoadBalanced 
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AmazonShoppingApplication.class, args);
	}

}
