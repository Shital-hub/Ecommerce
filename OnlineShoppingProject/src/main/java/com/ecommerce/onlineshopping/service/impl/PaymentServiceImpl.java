package com.ecommerce.onlineshopping.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Payment;
import com.ecommerce.onlineshopping.model.User;
import com.ecommerce.onlineshopping.repository.PaymentRepository;
import com.ecommerce.onlineshopping.repository.UserRepository;
import com.ecommerce.onlineshopping.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public Payment storePaymentByUserId(Integer userId, Payment payment) {
		User user = userRepository.findUserById(userId);
		payment.setUserId(user.getId());
		payment.setPmtdate(LocalDate.now());
		
		Payment savePayments=paymentRepository.save(payment);
		
		return savePayments;
	
	}
}
