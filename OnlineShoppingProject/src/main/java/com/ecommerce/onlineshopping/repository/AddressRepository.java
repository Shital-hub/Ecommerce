package com.ecommerce.onlineshopping.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.onlineshopping.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	@Query(value = "select * from address  where userid=?1", nativeQuery = true)
	public  List<Address> findAddressById(Integer userid);
}
