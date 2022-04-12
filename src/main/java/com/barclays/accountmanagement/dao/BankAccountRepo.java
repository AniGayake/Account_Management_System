package com.barclays.accountmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barclays.accountmanagement.entity.BankAccount;

public interface BankAccountRepo extends JpaRepository<BankAccount, Integer>{

}
