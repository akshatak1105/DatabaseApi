package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
@RequestMapping("/api/database")
public class DatabaseController {
	
//	@PostMapping("/connect")
//	public  String connect(@RequestParam String url) {
//		String guid =  SessionManagement.add(url);
//		return guid;
//		
//	}
	
	@PostMapping("/connect")
	public ResponseEntity<String> connect(@RequestParam String url) {
	    // Your logic here
	    String guid = SessionManagement.add(url);
	    String response = "{ \"token\" : \"" + guid + "\"}";
	    return ResponseEntity.ok(response);
	}

}

 
