package com.ecommerce.onlineshopping.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.onlineshopping.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findUserById(Integer userId);

	
}
