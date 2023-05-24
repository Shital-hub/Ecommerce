package com.ecommerce.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.service.CurrentConverterService;

@RestController
public class CurrentConverter {
	
	//inject the data service reference
    @Autowired
	private CurrentConverterService  currentConverterService;
    @PostMapping("/addCurrentConverter")
    public ResponseEntity<CurrentConverter> addCurrentConverter(@RequestBody CurrentConverter currentConverter){
		
    	CurrentConverter currentConverter1	= currentConverterService.addCurrentConverter(currentConverter );
    	
    	return ResponseEntity.ok().body(currentConverter1);
    	
    }
    
    public ResponseEntity<CurrentConverter> updateCurrentConverter(@PathVariable ("id") Long id,@RequestBody CurrentConverter currentConverter){
		
    	CurrentConverter	currentConverter1 = currentConverterService.updateCurrentConverter(currentConverter,id  )
    	
    	return ResponseEntity.ok().body(currentConverter1);
   
    
    }   
}
