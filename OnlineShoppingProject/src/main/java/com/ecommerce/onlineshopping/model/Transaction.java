package com.ecommerce.onlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int TransactionId;
	private int Amount;
	private boolean TransactionStatus;
	
	public int getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public boolean isTransactionStatus() {
		return TransactionStatus;
	}
	public void setTransactionStatus(boolean transactionStatus) {
		TransactionStatus = transactionStatus;
	}
	
	
	
}
