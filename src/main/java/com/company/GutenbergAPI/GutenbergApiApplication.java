package com.company.GutenbergAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GutenbergApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GutenbergApiApplication.class, args);
	}

}
