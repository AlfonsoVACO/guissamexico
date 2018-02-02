package com.guissa.guissa.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {

	@GetMapping("/getrest")
	public ResponseEntity<String> getRest(){
		return new ResponseEntity<String>("ok",HttpStatus.OK);
	}
}
