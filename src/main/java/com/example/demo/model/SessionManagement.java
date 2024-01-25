package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class SessionManagement {

	public static List<Session> sessions = new ArrayList<>();

	public static String add(String connectionString) {
		Session session = new Session(connectionString);
		sessions.add(session);
		return session.uuid.toString();
	}

}
