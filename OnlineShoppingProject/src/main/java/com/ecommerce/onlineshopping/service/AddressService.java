package com.ecommerce.onlineshopping.service;

import java.util.List;

import com.ecommerce.onlineshopping.model.Address;
import com.ecommerce.onlineshopping.model.User;

public interface AddressService {

	public Address saveAddressDetails(Address address);
	public List<Address> SaveAll(List<Address> addresses);
	public List<Address> getAddressbyId(Integer userid);
}
