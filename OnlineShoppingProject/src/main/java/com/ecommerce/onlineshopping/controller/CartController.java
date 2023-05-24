package com.ecommerce.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Cart;
import com.ecommerce.onlineshopping.model.Prouduct;
import com.ecommerce.onlineshopping.model.Reimbursement;
import com.ecommerce.onlineshopping.service.CartService;
import com.ecommerce.onlineshopping.service.ReimbursementService;

@RestController
@RequestMapping("/Cart")
public class CartController {
	
	@Autowired
	private CartService cartService;

	// Design the restful web service add cart details
	
	@PostMapping("/saveCartDetails")
	public ResponseEntity<Cart> addCartDetails(@RequestBody Cart cart) {
          
	Cart cart1	= cartService.addCartDetails(cart);
		
		return ResponseEntity.ok().body(cart1);



}
	
// Design Restful web service to get cart details into database
	
	@GetMapping("/getCart/{id}")
	public ResponseEntity<Cart> getCartDetails(@PathVariable("id") Integer Id) {
		
	Cart cart	= cartService.getCartDetails(Id);
		
		
		return ResponseEntity .ok (cart)  ;
	}
}

	
	
	
	
	
	
