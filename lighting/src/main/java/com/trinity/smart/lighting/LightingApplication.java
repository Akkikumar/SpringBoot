package com.trinity.smart.lighting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LightingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LightingApplication.class, args);
		System.out.println("hi");
	}
}
