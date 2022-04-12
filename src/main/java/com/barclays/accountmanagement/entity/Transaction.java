package com.barclays.accountmanagement.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Transaction")
public class Transaction {

	@Id
	public String transactionId;
	public int transactionRefNo;
	public Date transactionDate;
	public Time transactionTIme;
	public String transactionType;
	public String transactionSubType;
	public Transaction() {
		
	}
	public Transaction(String transactionId, int transactionRefNo, Date transactionDate, Time transactionTIme,
			String transactionType, String transactionSubType) {
		super();
		this.transactionId = transactionId;
		this.transactionRefNo = transactionRefNo;
		this.transactionDate = transactionDate;
		this.transactionTIme = transactionTIme;
		this.transactionType = transactionType;
		this.transactionSubType = transactionSubType;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public int getTransactionRefNo() {
		return transactionRefNo;
	}
	public void setTransactionRefNo(int transactionRefNo) {
		this.transactionRefNo = transactionRefNo;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public Time getTransactionTIme() {
		return transactionTIme;
	}
	public void setTransactionTIme(Time transactionTIme) {
		this.transactionTIme = transactionTIme;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getTransactionSubType() {
		return transactionSubType;
	}
	public void setTransactionSubType(String transactionSubType) {
		this.transactionSubType = transactionSubType;
	}
	
	
}
