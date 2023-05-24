package com.ecommerce.onlineshopping.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.User;
import com.ecommerce.onlineshopping.repository.UserRepository;
import com.ecommerce.onlineshopping.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUserDetails(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

	@SuppressWarnings("deprecation")
	@Override
	public User getUserdetils(Integer id) {
		User user=userRepository.getById(id);
		return user;
	}

	
}



