package com.barclays.project.accountmgmt;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.barclays.accountmanagement.dao.BankCustomerDetailsRepo;
import com.barclays.accountmanagement.entity.BankCustomerDetails;

@SpringBootTest
class AccountManagementSystemApplicationTests {

	@Autowired
	private BankCustomerDetailsRepo bankCustomerDetailsRepo;

	@Test
	public void testCreate() {
		BankCustomerDetails bankCustomerDetails = new BankCustomerDetails();
		bankCustomerDetails.setPANNumber("DAALP6945ZZ");
		bankCustomerDetails.setAadharNumber("459636251230");
		bankCustomerDetails.setName("xyz");
		bankCustomerDetails.setEmailAddress("xyz@gmail.com");
		bankCustomerDetails.setAddress("UP");
		bankCustomerDetails.setCustomerId(936452);
		assertNotNull(bankCustomerDetailsRepo.findById(936452).get());

	}

	@Test
	public void testRead() {
		List<BankCustomerDetails> bankList = bankCustomerDetailsRepo.findAll();
		assertThat(bankList).size().isGreaterThan(0);
	}

//	
//
//	@Test
//	@Rollback(false)
//	public void getCustomerDetails() {
//		BankCustomerDetails bankCustomerDetails = bankCustomerDetailsRepo.findByCustomerId(904450L);
//		bankCustomerDetails.setPANNumber("DUUPG7894L");
//
//		bankCustomerDetailsRepo.save(bankCustomerDetails);
//
//		BankCustomerDetails updatedBankCustomerDetails = bankCustomerDetailsRepo.findByCustomerId(904450L);
//		assertThat(updatedBankCustomerDetails.getPANNumber()).isEqualTo("DUUPG7894L");
//
//	}

}
