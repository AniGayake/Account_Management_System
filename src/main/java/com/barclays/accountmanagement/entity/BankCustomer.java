package com.barclays.accountmanagement.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.sun.istack.NotNull;

@Entity
@Table(name = "BankCustomer")
public class BankCustomer {

	@Id
	@Min(value = 6)
	@Max(value = 6)
	private long customerId;

	@Min(value = 12)
	@Max(value = 12)
	private long aadharNo;

	@NotNull
	private String panCard;

	@NotNull
	private String name;

	private String postalAddress;

	@Email
	private String email;

	@NotNull
	private LocalDate dob;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
		this.customerId = generateCustomerId();
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public long generateCustomerId() {
		long customerId = (long) Math.floor(Math.random() * 9_000_00L) + 1_000_00L;
		return customerId;
	}

}
