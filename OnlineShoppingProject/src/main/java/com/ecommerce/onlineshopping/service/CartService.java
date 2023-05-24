package com.ecommerce.onlineshopping.service;

import com.ecommerce.onlineshopping.model.Cart;

public interface CartService {
	
	public Cart addCartDetails(Cart  cart);
	
	public Cart getCartDetails( Integer Id);


}
