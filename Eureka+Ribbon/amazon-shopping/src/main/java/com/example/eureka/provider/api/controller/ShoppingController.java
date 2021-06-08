package com.example.eureka.provider.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/pay/{price}")
	public String pay(@PathVariable int price) {
//		String url = "http://localhost:8888/payment-provider/paynow/" + price;
		String url = "http://TICKET-PROVIDER/payment-provider/paynow/" + price;
		System.out.println("Shopping ~~~~");
		return restTemplate.getForObject(url, String.class);
	}
}
