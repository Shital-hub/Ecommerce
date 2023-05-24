package com.ecommerce.onlineshopping.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.CurrentConverter;
import com.ecommerce.onlineshopping.service.CurrentConverterService;

@Service
public class CurrentConverterServiceImpl implements CurrentConverterService {

	//inject repository reference
	@Autowired
	private CurrentConverterRepository currentConverterRepository;
	
	@Override
	public CurrentConverter addCurrentConverter(CurrentConverter currentConverter) {
		
		CurrentConverter	currentConverter1	= currentConverterRepository.save(currentConverter);
		
		return currentConverter1;
	}

	@Override
	public CurrentConverter updateCurrentConverter(CurrentConverter currentConverter, Long id) {
		
	Optional <CurrentConverter> optinal	= currentConverterRepository.findById(id);
		
	CurrentConverter currentConverter1 = optinal.get();
	
	
		return currentConverter1;
	}

}
