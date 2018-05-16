package org.osmand.springjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:jokes-config.xml")
public class SpringJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJokesAppApplication.class, args);
	}
}
