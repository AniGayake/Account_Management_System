package com.barclays.accountmanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.accountmanagement.dao.BankAccountRepo;
import com.barclays.accountmanagement.entity.BankAccount;

//Service class for BankAccount
@Service
@Transactional
public class BankAccountService {
	
	@Autowired
	private BankAccountRepo bankAccountRepo;
	
	//Find Details by Account No.
	public BankAccount findByAccountNumber(long accountNumber) {
		return bankAccountRepo.findById(accountNumber).get();
	}
	
	//Create new user account
	public BankAccount createAccount(BankAccount bankAccount) {
		bankAccountRepo.save(bankAccount);
		return bankAccount;
	}
	
	//Update existing account using account no.
	public void updateByaccountNumber(double balanceAfterDebit ,long accountNumber) {
		System.out.println(balanceAfterDebit);
		 bankAccountRepo.updateAccount(balanceAfterDebit,accountNumber);
	}
	

}