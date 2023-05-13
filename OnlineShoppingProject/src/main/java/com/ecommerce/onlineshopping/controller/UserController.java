package com.ecommerce.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.onlineshopping.model.Address;
import com.ecommerce.onlineshopping.model.User;
import com.ecommerce.onlineshopping.service.AddressService;
import com.ecommerce.onlineshopping.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private AddressService addressService;

	@PostMapping("/saveUserDetails")
	public ResponseEntity<User> saveUserDetails(@RequestBody User user) {
		User user1 = userService.saveUserDetails(user);
		List<Address> addressList = user.getAddressList();

		// using for loop
		for (Address address : addressList) {

			address.setaId(user.getId());
			addressService.saveAddressDetails(address);

		}

		return ResponseEntity.ok().body(user1);

	}

}
