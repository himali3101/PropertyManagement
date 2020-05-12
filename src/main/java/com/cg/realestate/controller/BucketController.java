/*package com.cg.realestate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cg.realestate.model.Property;
import com.cg.realestate.service.AmazonClient;
import com.cg.realestate.service.PropertyService;

@RestController
@RequestMapping("/storage/")
public class BucketController {

	
    private AmazonClient amazonClient;
    
    @Autowired
    PropertyService service;
    
    @Autowired
    BucketController(AmazonClient amazonClient) {
        this.amazonClient = amazonClient;
    }

    @PostMapping("/uploadFile/{id}")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file, @PathVariable ("id") int id ) {
    	String url = this.amazonClient.uploadFile(file);
    	Property property = service.searchById(id);
    	property.setUrl(url);
    	service.addProperty(property);
        return url;
    }

    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }
}*/