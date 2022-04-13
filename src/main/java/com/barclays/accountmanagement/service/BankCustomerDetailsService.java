package com.barclays.accountmanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.accountmanagement.dao.BankAccountRepo;
import com.barclays.accountmanagement.dao.BankCustomerDetailsRepo;
import com.barclays.accountmanagement.entity.BankCustomerDetails;

//Service Class for BankCustomerDetails
@Service
@Transactional
public class BankCustomerDetailsService {

	@Autowired
	private BankCustomerDetailsRepo bankCustomerDetailsRepo;
	@Autowired
	private BankAccountRepo bankAccountRepo;
	
	//Create
	//Create new customer account
	public BankCustomerDetails createNewCusomer(BankCustomerDetails bankCustomerDetails) {
		
		
		bankCustomerDetailsRepo.save(bankCustomerDetails);
		
		return bankCustomerDetails;
	}
	
	//Read
	//Get Customer details using customer Id
	public BankCustomerDetails getCustomerDetails(Long customerId) {
		return  bankCustomerDetailsRepo.findByCustomerId(customerId);
			
	}
	
	//Update
	//Implemented in AccountInfoService 
	
	//Delete
	//Delete existing user (Non functional requriment)
	public void deleteCustomer(Integer customerId) {
		bankCustomerDetailsRepo.deleteById(customerId);
		
	}
	public BankCustomerDetails getDetailsByPan(String pannumber) {
		
		return bankCustomerDetailsRepo.findByPannumber(pannumber);
		
	}
}
