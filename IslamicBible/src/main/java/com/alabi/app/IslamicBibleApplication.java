package com.alabi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class IslamicBibleApplication {

	public static void main(String[] args) {
		SpringApplication.run(IslamicBibleApplication.class, args);
	}

}
