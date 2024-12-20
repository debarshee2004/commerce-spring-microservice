package com.debarshee.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PaymentServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServerApplication.class, args);
	}

}
