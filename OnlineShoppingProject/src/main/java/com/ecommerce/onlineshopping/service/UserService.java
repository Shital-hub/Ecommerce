package com.ecommerce.onlineshopping.service;

import java.util.List;

import com.ecommerce.onlineshopping.model.User;

public interface UserService {

	public User saveUserDetails(User user);

	public User getUserdetils(Integer id);

	
}
