package com.ecommerce.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.onlineshopping.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
