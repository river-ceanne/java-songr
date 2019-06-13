package com.vencer401.firstWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.vencer401.firstWebApp")
public class FirstWebAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstWebAppApplication.class, args);
	}

}
