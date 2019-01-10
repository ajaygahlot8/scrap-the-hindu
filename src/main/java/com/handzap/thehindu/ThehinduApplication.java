package com.handzap.thehindu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.handzap.thehindu.*"})
public class ThehinduApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThehinduApplication.class, args);
	}

}

