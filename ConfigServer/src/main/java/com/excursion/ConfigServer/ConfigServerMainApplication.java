package com.excursion.ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerMainApplication.class, args);
	}

}
