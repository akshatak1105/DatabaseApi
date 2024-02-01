package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.*;

@RestController
public class QueryController {

	@PostMapping("/execute")
	public static String execute(@RequestBody QueryExecution query) {
		String connectionString = SessionManagement.find(query.getUiud());
		String result = DataAccess.executeQuery(connectionString, query.getQuery());
		return result;
	}

}
