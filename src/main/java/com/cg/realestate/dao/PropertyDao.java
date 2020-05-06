package com.cg.realestate.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.realestate.model.Property;

@Repository
public interface PropertyDao extends CrudRepository<Property, Integer>{

}
