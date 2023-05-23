package com.ecommerce.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Address;
import com.ecommerce.onlineshopping.model.Bill;
import com.ecommerce.onlineshopping.model.Prouduct;
import com.ecommerce.onlineshopping.model.Transaction;
import com.ecommerce.onlineshopping.model.User;
import com.ecommerce.onlineshopping.service.AddressService;
import com.ecommerce.onlineshopping.service.ProductService;
import com.ecommerce.onlineshopping.service.TransactionService;
import com.ecommerce.onlineshopping.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private AddressService addressService;

	@Autowired
	private TransactionService transactionService;

	@PostMapping("/saveUserDetails")
	public ResponseEntity<User> saveUserDetails(@RequestBody User user) {
		User saveUser = userService.saveUserDetails(user);
		List<Address> addressList = user.getAddressList();

		// using for loop
		for (Address address : addressList) {

		    address.setUserid(user.getId());
		    
		    this.addressService.SaveAll(addressList);
		}


		return ResponseEntity.ok().body(saveUser);

	}

	// get user details by id of many addresses
	@GetMapping("/getUserdetails/{id}")
	public ResponseEntity<User> getUserDetails(@PathVariable("id") Integer id) {
		User user = userService.getUserdetils(id);

		return ResponseEntity.ok().body(user);

	}

	// get many address from userID
	
	@GetMapping("/getAddressById/{userId}")
	public ResponseEntity<List<Address>> getAddressDetailsById(@PathVariable("userId") Integer userId) {
		List<Address> address = addressService.getAddressbyId(userId);

		return ResponseEntity.ok().body(address);
	}

	// Save the Transaction by Id
	
	@PostMapping("/saveUserTransaction")
	public ResponseEntity<Transaction> saveUserTransaction(@RequestBody Transaction transaction) {

		Transaction saveTransaction = transactionService.storeTransactionByUserId(transaction);
		
		return ResponseEntity.status(HttpStatus.OK).body(saveTransaction) ;

	}
	
	// Get Transaction By Id
	@GetMapping("/getTransaction/{id}")
	public ResponseEntity<Transaction> getTransaction(@PathVariable("id") Integer id) {
		
		Transaction transaction = transactionService.getTransactionById(id);
		return ResponseEntity.ok().body(transaction); 
	
	}
	

		// inject user service here
		@Autowired
		private ProductService productService;

		@PostMapping("/saveUserproduct")
		public Prouduct saveProduct(@RequestBody Prouduct product) {
			// call service method
			Prouduct product1 =productService.saveProduct(product);
			
			return  product1 ;
		}
		
		
		
     //update product restful  design
		@PutMapping("/updateProduct/{id}/")
		public ResponseEntity <Prouduct> updateProduct(@PathVariable("id") Integer id, @RequestBody Prouduct product) {
		Prouduct product1	= productService.updateProduct(product, id);
			
			return  ResponseEntity.ok().body(product1);
		}
}





