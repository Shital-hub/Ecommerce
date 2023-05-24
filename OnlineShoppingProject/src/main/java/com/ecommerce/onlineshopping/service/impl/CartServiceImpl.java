package com.ecommerce.onlineshopping.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Cart;
import com.ecommerce.onlineshopping.repository.CartRepository;
import com.ecommerce.onlineshopping.service.CartService;

@Service
public class CartServiceImpl  implements CartService{

	//
	@Autowired
	private CartRepository cartRepository;
	

	@Override
	public Cart addCartDetails(Cart cart) {
		// TODO Auto-generated method stub
		Cart	cart1	= cartRepository.save(cart);
		
		return cart1;
	}


	@Override
	public Cart getCartDetails(Integer Id) {
	
	Optional<Cart> optinal	= cartRepository.findById(Id);
	
	                           Cart cart1 = optinal.get();
		return cart1;
	}




}
