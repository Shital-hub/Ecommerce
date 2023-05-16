package com.ecommerce.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Address;
import com.ecommerce.onlineshopping.model.Payment;
import com.ecommerce.onlineshopping.model.User;
import com.ecommerce.onlineshopping.service.AddressService;
import com.ecommerce.onlineshopping.service.PaymentService;
import com.ecommerce.onlineshopping.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private AddressService addressService;

	@Autowired
	private PaymentService paymentService;

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

	// Save the payment by user Id
	
	@PostMapping("/saveUserPayment/{userId}")
	public ResponseEntity<Payment> saveUserPayment(@RequestBody Payment payment, @PathVariable Integer userId) {

		Payment savePayment = paymentService.storePaymentByUserId(userId, payment);
		
		return ResponseEntity.status(HttpStatus.OK).body(savePayment) ;

	}

}
