package com.barclays.accountmanagement.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.barclays.accountmanagement.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer>{

	@Query(value="select * from transaction where account_number=?1 order by transactiontime desc limit 0,5", nativeQuery=true)
	List<Transaction> findByAccountNumber(long accountNumber);
}
