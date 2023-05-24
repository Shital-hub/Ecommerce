package com.ecommerce.onlineshopping.service;

import com.ecommerce.onlineshopping.model.CurrencyConversionBean;

/**
 * 
 * @author Poonam
 *
 */
public interface CurrencyConversionBeanService {
	
	
	//Get CurrencyConversionBean Details
	
	public CurrencyConversionBean getCurrentConverterDetails(Long id);
	
	//Delete CurrencyConversionBean Details
	
	public void deleteCurrentConverterDetails(Long id);
	
	

}
