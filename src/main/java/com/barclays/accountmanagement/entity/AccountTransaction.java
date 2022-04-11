package com.barclays.accountmanagement.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "AccountTransaction")
public class AccountTransaction {
	@Id
	private String transactionID;

	@Column(unique = true)
	private long transactionReferenceNo;

	private LocalDateTime dateTime;

	@NotNull
	private String type;

	@NotNull
	private String subType;

	private double currentBalance;

	public AccountTransaction() {

	}

	public AccountTransaction(String transactionID, long transactionReferenceNo, LocalDateTime dateTime, String type,
			String subType, double currentBalance) {
		super();
		this.transactionID = transactionID;
		this.transactionReferenceNo = transactionReferenceNo;
		this.dateTime = dateTime;
		this.type = type;
		this.subType = subType;
		this.currentBalance = currentBalance;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public long getTransactionReferenceNo() {
		return transactionReferenceNo;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public String getType() {
		return type;
	}

	public String getSubType() {
		return subType;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public void setTransactionReferenceNo(long transactionReferenceNo) {
		this.transactionReferenceNo = transactionReferenceNo;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

}
