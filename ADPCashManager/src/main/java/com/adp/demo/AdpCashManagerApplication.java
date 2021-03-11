package com.adp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AdpCashManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdpCashManagerApplication.class, args);
	}

}
