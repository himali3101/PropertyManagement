package com.cg.realestate.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.realestate.dao.PropertyDao;
import com.cg.realestate.model.Property;

@Service
public class PropertyService {

	@Autowired
	PropertyDao dao;
	
	List<Property> properties =  new ArrayList<>();
	
		
	public Property addProperty(Property property) {
		return dao.save(property);
	}
	
	public List<Property> display(){
		List<Property> properties = new ArrayList<>();
		dao.findAll().forEach(properties::add);
		return properties;
	}
	
	public void delete(int id) {
	
		dao.deleteById(id);
		
		
	}
	
	public Property searchById(int id) {

		return display().stream().filter((propertyId) -> propertyId.getPropertyId() == id).findAny().get();

	}
	
	public List<Property> searchByType( String type) {
	
		return display().stream().filter((type1) -> type1.getPropertyType().equals(type)).collect(Collectors.toList());

	}
	
	public List<Property> searchByLocation( String location) {
		return display().stream().filter((loc) -> loc.getLocation().equals(location)).collect(Collectors.toList());
	}
	
	public List<Property> searchByBudget( double budget) {
		return display().stream().filter((propertyBudget) -> propertyBudget.getBudget() == budget).collect(Collectors.toList());

	}
	
}