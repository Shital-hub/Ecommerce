package com.ecommerce.onlineshopping.service;

import java.util.List;


import com.ecommerce.onlineshopping.model.Prouduct;

public interface ProductService {

	public Prouduct saveProduct(Prouduct product);
     
	public Prouduct updateProduct(Prouduct product,Integer id);


}
