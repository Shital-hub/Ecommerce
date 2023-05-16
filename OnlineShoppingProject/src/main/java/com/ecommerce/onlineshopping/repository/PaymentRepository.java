package com.ecommerce.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.onlineshopping.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
