package com.ecommerce.onlineshopping.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Bill;
import com.ecommerce.onlineshopping.model.Order;
import com.ecommerce.onlineshopping.repository.OrderRepository;
import com.ecommerce.onlineshopping.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	

	@Override
	public Order saveOrder(Order order) {
		Order order1=orderRepository.save(order);
		return order1;
	}


	@Override
	public Order updateOrder(Order order, Long id) {
		Optional<Order> optional=orderRepository.findById(id);
		Order order3=optional.get();
		
		order3.setPrice(order.getPrice());
		order3.setProductName(order.getProductName());
		order3.setQuantity(order.getQuantity());
		
		Order order4=orderRepository.save(order3);
		return order4;
	}

}
