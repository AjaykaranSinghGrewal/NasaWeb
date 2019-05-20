package com.grewal.MemeWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.grewal.controller"})
public class NasaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NasaWebApplication.class, args);
	}

}
