package com.ecommerce.onlineshopping.service;

import com.ecommerce.onlineshopping.model.Order;

public interface OrderService  {
	
	//Add Order Details
	public Order saveOrder(Order order);
	
	//Update Order Details
	
		public Order updateOrder(Order order,Long id);

}
