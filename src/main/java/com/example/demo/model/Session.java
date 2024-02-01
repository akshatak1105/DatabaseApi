package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Session {
	String connectionString;
	UUID uuid;
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public LocalDateTime getCurrentDateTime() {
		return currentDateTime;
	}

	public void setCurrentDateTime(LocalDateTime currentDateTime) {
		this.currentDateTime = currentDateTime;
	}

	LocalDateTime currentDateTime;

	Session(String connectionString) {
		this.connectionString = connectionString;
		uuid = UUID.randomUUID();
		currentDateTime = LocalDateTime.now();
		

	}

}
