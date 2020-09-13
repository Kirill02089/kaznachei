package com.rusatom.integrationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.rusatom.integrationsystem.security.repos"})
//@EntityScan(basePackages = {"com.rusatom.integrationsystem.entities"})
public class IntegrationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationSystemApplication.class, args);
	}

}
