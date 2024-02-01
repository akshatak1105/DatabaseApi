package com.example.demo.model;

public class DataAccess {
	public static String executeQuery(String connectionString, String queryText) {
		
		
		return null;
		
	}

}package com.example.demo.model;

import java.sql.*;

public class DataAccess {

	public static String executeQuery(String connectionString, String query) {
		String message;
		try {
//			System.out.println(connectionString);
//			System.out.println(connectionString.length());
//			System.out.println("jdbc:mysql://localhost:3306/maiara_tech?user=root&password=@kshata1105.02".length());
//			String x = "jdbc:mysql://localhost:3306/maiara_tech?user=root&password=@kshata1105.02";
//			System.out.println(x.equals(connectionString));

			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("after registration");
//			Connection con = DriverManager.getConnection(connectionString);
//			Statement stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery(query);

//			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2. Create connection
//			connectionString = connectionString.trim();
			String url = connectionString;// "jdbc:mysql://localhost:3306/maiara_tech?user=root&password=@kshata1105.02";
			Connection connection = DriverManager.getConnection(url);
//			System.out.println("after connection");

			// 3. Perform database operations
			Statement statement = connection.createStatement();
//			ResultSet rs = statement.executeQuery(query);
			statement.execute(query);
			System.out.println("after execute");

			connection.close();

			message = "Success";
		} catch (Exception e) {
			System.out.println(e.getStackTrace());

			message = e.getMessage();
		}

		return message;

	}

}

