package com.fdmgroup.demoAFooRestApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class DemoBFooRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBFooRestApiApplication.class, args);
	}

}
