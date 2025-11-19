package com.akash.restaurant_onboarding_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class RestaurantOnboardingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantOnboardingServiceApplication.class, args);
	}

}
