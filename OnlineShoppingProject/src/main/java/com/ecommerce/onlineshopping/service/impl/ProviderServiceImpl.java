package com.ecommerce.onlineshopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Provider;
import com.ecommerce.onlineshopping.repository.ProviderRepository;
import com.ecommerce.onlineshopping.service.ProviderService;

@Service
public class ProviderServiceImpl implements ProviderService {

	//To inject Repository Reference
	@Autowired
	private ProviderRepository providerRepository;
	
	@Override
	public Provider saveProvider(Provider provider) {
		
		Provider provider1 =providerRepository.save(provider);
		return provider1;
	}

}
