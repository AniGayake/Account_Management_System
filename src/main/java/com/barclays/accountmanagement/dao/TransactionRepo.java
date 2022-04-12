package com.barclays.accountmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barclays.accountmanagement.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer>{

}
