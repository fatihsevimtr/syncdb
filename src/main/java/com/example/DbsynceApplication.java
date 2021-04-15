package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.transport.PostgreDbConn;
import com.example.transport.Sync;

@SpringBootApplication
public class DbsynceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbsynceApplication.class, args);
		
	}

}
