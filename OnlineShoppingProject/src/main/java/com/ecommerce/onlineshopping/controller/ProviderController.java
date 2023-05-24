package com.ecommerce.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Provider;
import com.ecommerce.onlineshopping.service.ProviderService;
@RestController
@RequestMapping("/provider")
public class ProviderController {
	@Autowired
	private ProviderService providerService;
	
	@PostMapping("/saveprovider")
	public ResponseEntity<Provider> saveProvider(@RequestBody Provider Provider) {
		Provider provider2=providerService.saveProvider(Provider);
		return ResponseEntity.ok().body(provider2);
		
	}

}
