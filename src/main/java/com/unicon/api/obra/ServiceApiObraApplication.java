package com.unicon.api.obra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServiceApiObraApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceApiObraApplication.class, args);
	}

}
