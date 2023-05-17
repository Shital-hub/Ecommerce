package com.ecommerce.onlineshopping.service;

import com.ecommerce.onlineshopping.model.Transaction;

public interface TransactionService {
	
	public Transaction storeTransactionByUserId(Transaction transaction );
	public Transaction getTransactionById(Integer id );
	

}
