package com.banking.dto;

import java.util.Date;

import com.banking.entity.Transaction;


public class TransactionDTO {

	Integer transactionID;
	String operation;
	Double amount;
	Integer accountNumber;
	Date timestamp;
	String comments;

	public Integer getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(Integer transactionID) {
		this.transactionID = transactionID;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public static TransactionDTO valueOf(Transaction transaction) {
		TransactionDTO transactionDTO = new TransactionDTO();
		transactionDTO.setAccountNumber(transaction.getAccountNumber());
		transactionDTO.setAmount(transaction.getAmount());
		transactionDTO.setComments(transaction.getComments());
		transactionDTO.setOperation(transaction.getOperation());
		transactionDTO.setTimestamp(transaction.getTimestamp());
		transactionDTO.setTransactionID(transaction.getTransactionID());

		return transactionDTO;
	}

	public Transaction createEntity() {
		Transaction transaction = new Transaction();
		transaction.setAccountNumber(this.getAccountNumber());
		transaction.setAmount(this.getAmount());
		transaction.setComments(this.getComments());
		transaction.setOperation(this.getOperation());
		transaction.setTimestamp(this.getTimestamp());
		transaction.setTransactionID(this.getTransactionID());

		return transaction;
	}

}
