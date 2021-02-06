package com.dunzo.chaipoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChaipointApplication{

	private static final Logger LOGGER = LoggerFactory.getLogger(ChaipointApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ChaipointApplication.class, args);
	}

	

}
