package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Session {
	String connectionString;
	UUID uuid;
	LocalDateTime currentDateTime;

	Session(String connectionString) {
		this.connectionString = connectionString;
		uuid = UUID.randomUUID();
		currentDateTime = LocalDateTime.now();
		

	}

}
