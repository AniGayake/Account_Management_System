package com.barclays.accountmanagement;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.barclays.accountmanagement.entity.Transaction;

import net.bytebuddy.utility.RandomString;

@SpringBootApplication
public class AccountManagementSystemApplication {
	
	public static void main(String[] args) {
	
		SpringApplication.run(AccountManagementSystemApplication.class, args);
		
		
	}

	
}