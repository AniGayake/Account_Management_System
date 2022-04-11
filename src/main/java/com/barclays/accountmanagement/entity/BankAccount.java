package com.barclays.accountmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.sun.istack.NotNull;

@Entity
@Table(name = "BankAccount")
public class BankAccount {

	@NotNull
	@Min(value = 6)
	@Max(value = 6)
	private long customerId;

	@Id
	@NotNull
	@Min(value = 10)
	@Max(value = 10)
	private long accountNo;

	private double accountBalance;

	public BankAccount() {
		this.accountNo = generateAccountNumber();
		this.accountBalance = 0;
	}

	public BankAccount(long customerId, long accountNo, double accountBalance) {
		super();
		this.customerId = customerId;
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public long getCustomerId() {
		return customerId;
	}

	public long generateAccountNumber() {
		long accountNo = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		return accountNo;
	}

}
