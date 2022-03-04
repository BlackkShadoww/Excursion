package com.excursion.VenueService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class VenueServiceMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(VenueServiceMainApplication.class, args);
	}

}
