package com.ecommerce.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.CurrencyConversionBean;
import com.ecommerce.onlineshopping.service.CurrencyConversionBeanService;

@RestController
@RequestMapping("/CurrencyConversion")
public class CurrencyConversionBeanController {
	
	@Autowired
	CurrencyConversionBeanService currencyConversionBeanService;
	
	// RestAPI to get CurrencyConversionBean Details
	
		@GetMapping("/get/{id}")
		public ResponseEntity<CurrencyConversionBean> getCurrencyConversionBeanDetails(@PathVariable("id") Long id) {
			CurrencyConversionBean currencyConversionBean = currencyConversionBeanService.getCurrentConverterDetails(id);

			return ResponseEntity.ok().body(currencyConversionBean);

}
}
