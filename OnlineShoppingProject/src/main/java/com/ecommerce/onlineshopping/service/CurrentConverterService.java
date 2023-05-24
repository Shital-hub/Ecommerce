package com.ecommerce.onlineshopping.service;

import com.ecommerce.onlineshopping.model.CurrentConverter;


public interface CurrentConverterService {
	
public CurrentConverter addCurrentConverter(CurrentConverter currentConverter );

public CurrentConverter updateCurrentConverter(CurrentConverter currentConverter , Long id);

}
