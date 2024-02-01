package com.example.demo.model;


import java.util.*;

public class SessionManagement {

	public static List<Session> sessions = new ArrayList<>();
	

	public static String add(String connectionString) {
		Session session = new Session(connectionString);
		sessions.add(session);
		return session.uuid.toString();
	}

	public static String find(String uiud) {
		for (Session s : sessions) {
			if (s.getUuid().equals(UUID.fromString(uiud))) {
				return s.getConnectionString();
			}
		}
		return null;
	}
}
