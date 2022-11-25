package com.Shop_Management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class ProductShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductShopApplication.class, args);
	}

}
