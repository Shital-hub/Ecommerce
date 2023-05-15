package com.ecommerce.onlineshopping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Address;
import com.ecommerce.onlineshopping.repository.AddressRepository;
import com.ecommerce.onlineshopping.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddressDetails(Address address) {
		Address address1 = addressRepository.save(address);
		return address1;
	}

	@Override
	public List<Address> SaveAll(List<Address> addresses)
	{
		List<Address> addList = addressRepository.saveAll(addresses);
		return addList;
	}
}
