package com.cg.realestate.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cg.realestate.model.ImageModel;

public interface ImageDao extends CrudRepository<ImageModel, Integer>{

	Optional<ImageModel> findByName(String name);
}
