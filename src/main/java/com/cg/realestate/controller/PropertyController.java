package com.cg.realestate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.realestate.model.Property;
import com.cg.realestate.service.PropertyService;

@RestController
@CrossOrigin(origins = "*")
public class PropertyController {

	@Autowired
	PropertyService service;
	
	@PostMapping( path = "/")
	public Property addProperty( @RequestBody Property property) {
		return service.addProperty(property);
	}
	
	@GetMapping( path = "/display")
	public List<Property> display(){
		return service.display();
	}
	
	@CrossOrigin
	@GetMapping(path = "/searchbyid/{id}")
	public Property searchById( @PathVariable int id) {
		
		return service.searchById(id);
	}
	
	@CrossOrigin
	@GetMapping(path = "/searchbylocation/{location}")
	public List<Property> searchByLocation( @PathVariable String location) {
		
		return service.searchByLocation(location);
	}
	
	@GetMapping(path = "/searchbytype/{type}")
	public List<Property> searchByType( @PathVariable String type) {
		
		return service.searchByType(type);
	}
	
	@GetMapping(path = "/searchbybudget/{budget}")
	public List<Property> searchByBudget( @PathVariable double budget) {
		
		return service.searchByBudget(budget);
	}
}
