package com.ecommerce.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Bill;
import com.ecommerce.onlineshopping.model.Order;
import com.ecommerce.onlineshopping.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService OrderService;
	
	// RestAPI for Save Order Details
	
	@PostMapping("/saveorder")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
		Order order2 = OrderService.saveOrder(order);
		return ResponseEntity.ok().body(order2);
		
	}
		// RestAPI for Update Order Details

		@PutMapping("/update/{id}")
		public ResponseEntity<Order> updateOrder(@PathVariable("id") Long id, @RequestBody Order order) {
			Order updateOrder = OrderService.updateOrder(order, id);
			return ResponseEntity.ok().body(updateOrder);
	}
	

}
