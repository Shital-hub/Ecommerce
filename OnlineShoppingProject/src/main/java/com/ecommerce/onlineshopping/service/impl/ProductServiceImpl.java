package com.ecommerce.onlineshopping.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Prouduct;
import com.ecommerce.onlineshopping.repository.ProductRepository;
import com.ecommerce.onlineshopping.service.ProductService;

@Service
public class ProductServiceImpl implements  ProductService{

	
	//inject repository reference
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public Prouduct saveProduct(Prouduct product) {
		
	Prouduct product1	= productRepository.save(product);
		return product1;
	}
    

	@Override
	public Prouduct updateProduct(Prouduct product, Integer id) {
		Optional<Prouduct> product1 = productRepository.findById(id);
	Prouduct	product2 = product1.get();
	
		return product2 ;
	}
	
	
	

	

}
