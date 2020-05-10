package com.cg.realestate.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.realestate.model.Property;
import com.cg.realestate.service.PropertyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/property")
@Api(value = "Property Management")
public class PropertyController {

	private static final Logger logger = LoggerFactory.getLogger(PropertyController.class);

	@Autowired
	PropertyService service;

	@PostMapping(path = "/")
	@ApiOperation(value = "addProperty", nickname = "addProperty")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Property.class),
							@ApiResponse(code = 500, message = "Failure", response = Property.class) })
	public Property addProperty(@RequestBody Property property) {
		logger.info("Adding Property.");
		logger.trace(" Inside addProperty() function");
		logger.error("Error happened at addProperty()");
		Date date = new Date();
		property.setDate(date);
		return service.addProperty(property);
	}

	@GetMapping(path = "/display")
	@ApiOperation(value = "displayProperty", nickname = "displayProperty")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Property.class),
							@ApiResponse(code = 500, message = "Failure", response = Property.class) })
	public List<Property> display() {
		logger.info("display property");
		logger.trace(" Inside property display() function ");
		logger.error("Error happened at display() of property");
		return service.display();
	}

	@CrossOrigin
	@GetMapping(path = "/searchbyid/{id}")
	@ApiOperation(value = "searchPropertybyId", nickname = "searchPropertybyId")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Property.class),
							@ApiResponse(code = 500, message = "Failure", response = Property.class) })
	public Property searchById(@PathVariable int id) {
		logger.info("search property by id");
		logger.trace(" Inside searchById() function ");
		logger.error("Error happened at searchById() of property");
		return service.searchById(id);
	}

	@CrossOrigin
	@GetMapping(path = "/searchbylocation/{location}")
	@ApiOperation(value = "searchPropertybyLocation", nickname = "searchPropertybyLocation")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Property.class),
							@ApiResponse(code = 500, message = "Failure", response = Property.class) })
	public List<Property> searchByLocation(@PathVariable String location) {
		logger.info("Search property by location given by user");
		logger.trace(" Inside searchByLocation() function ");
		logger.error("Error happened at searchByLocation() of property");
		return service.searchByLocation(location);
	}

	@GetMapping(path = "/searchbytype/{type}")
	@ApiOperation(value = "searchPropertybyType", nickname = "searchPropertybyType")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Property.class),
							@ApiResponse(code = 500, message = "Failure", response = Property.class) })
	public List<Property> searchByType(@PathVariable String type) {
		logger.info("search property by property type");
		logger.trace(" Inside searchByType() function ");
		logger.error("Error happened at searchByType() of property");
		return service.searchByType(type);
	}

	@GetMapping(path = "/searchbybudget/{budget}")
	@ApiOperation(value = "searchPropertybyPrice", nickname = "searchPropertybyPrice")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Property.class),
							@ApiResponse(code = 500, message = "Failure", response = Property.class) })
	public List<Property> searchByBudget(@PathVariable double budget) {
		logger.info("Search property by price");
		logger.trace(" Inside searchByBudget() function ");
		logger.error("Error happened at searchByBudget() of property");
		return service.searchByBudget(budget);
	}
}
