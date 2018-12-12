package com.dengjunw;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class SellApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SellApplication.class, args);
		String[] profiles = context.getEnvironment().getActiveProfiles();

		log.info("{} is active", Arrays.toString(profiles));
	}

}

