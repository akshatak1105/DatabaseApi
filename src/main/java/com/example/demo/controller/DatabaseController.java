package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.model.*;

@RestController
@RequestMapping("/api/database")
public class DatabaseController {
	
	@PostMapping("/connect")
	public static String connect(@RequestBody String connectionString) {
		String guid =  SessionManagement.add(connectionString);
		return guid;
		
	}

}

