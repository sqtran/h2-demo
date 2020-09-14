package com.example.h2demo;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private final Logger log = LoggerFactory.getLogger(this.getClass()); 

	@Autowired
	private H2Repository repo;

	// @GetMapping annotation handles the http get request matched with the given uri.
	@GetMapping(value= "/getall", produces= "application/json")
	public List<Map<String, Object>> getAll() {
		log.info("Getting everything from database table now.");
		
		return repo.getAll();
	}
}
