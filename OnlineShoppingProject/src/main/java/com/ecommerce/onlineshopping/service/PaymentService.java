package com.ecommerce.onlineshopping.service;

import com.ecommerce.onlineshopping.model.Payment;

public interface PaymentService {
	
	public Payment storePaymentByUserId(Integer id , Payment payment );

}
