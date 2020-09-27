package com.Betha.System;

import Database.Singleton.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemApplication {

	public static void main(String[] args) {
                Singleton.getIntancia();
		SpringApplication.run(SystemApplication.class, args);
	}

}
