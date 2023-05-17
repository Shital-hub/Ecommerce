package com.ecommerce.onlineshopping.service.impl;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.onlineshopping.model.Transaction;
import com.ecommerce.onlineshopping.model.User;
import com.ecommerce.onlineshopping.repository.TransactionRepository;
import com.ecommerce.onlineshopping.repository.UserRepository;
import com.ecommerce.onlineshopping.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public Transaction storeTransactionByUserId(Transaction transaction) {
		//User user = userRepository.findUserById(userId);
		//transaction.setTransactionId(user.getId());
		//transaction.isTransactionStatus();
		Transaction saveTransaction=transactionRepository.save(transaction);
		
		return saveTransaction;
	
	}

	@Override
	public Transaction getTransactionById(Integer id) {
		Optional<Transaction> transaction=transactionRepository.findById(id);
		Transaction transaction2=transaction.get();
		return transaction2;
	}
}
