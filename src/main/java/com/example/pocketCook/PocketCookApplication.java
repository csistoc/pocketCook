package com.example.pocketCook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EntityScan(basePackages = "com.example.pocketCook.entity")
@SpringBootApplication
public class PocketCookApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocketCookApplication.class, args);
	}

}
