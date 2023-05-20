package com.ecommerce.onlineshopping.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.CurrencyConversionBean;
import com.ecommerce.onlineshopping.repository.CurrencyConversionBeanRepository;
import com.ecommerce.onlineshopping.service.CurrencyConversionBeanService;
@Service
public class CurrencyConversionBeanServiceImpl implements CurrencyConversionBeanService  {

	@Autowired
	private CurrencyConversionBeanRepository currencyConversionBeanRepository;
	
	// Get CurrencyConversionBean Details
	
	@Override
	public CurrencyConversionBean getCurrentConverterDetails(Long id) {
		Optional<CurrencyConversionBean> optinal=currencyConversionBeanRepository.findById(id);
		CurrencyConversionBean currencyConversionBean=optinal.get();
		return currencyConversionBean;
	}

	// Delete CurrencyConversionBean Details
	@Override
	public void deleteCurrentConverterDetails(Long id) {
		
		currencyConversionBeanRepository.deleteById(id);
		
	}

}
