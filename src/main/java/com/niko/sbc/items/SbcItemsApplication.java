package com.niko.sbc.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SbcItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbcItemsApplication.class, args);
	}

}
