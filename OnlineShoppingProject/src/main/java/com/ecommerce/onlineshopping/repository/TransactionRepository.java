package com.ecommerce.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.onlineshopping.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
