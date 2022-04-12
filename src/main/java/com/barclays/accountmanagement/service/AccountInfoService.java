package com.barclays.accountmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.accountmanagement.dao.AccountInfoDao;
import com.barclays.accountmanagement.entity.AccountInfo;

//Service class for AccountInfo
@Service
public class AccountInfoService {

	@Autowired
	private AccountInfoDao accountInfoDao;

	//Get all accounts in database
	public List<AccountInfo> getAllAccounts() {
		return accountInfoDao.getAllAccounts();

	}

	//Add transactions to transaction table
	public AccountInfo addTransaction(AccountInfo accountInfo) {
		return accountInfoDao.addTransaction(accountInfo);

	}

	//Get Accounts by Account no.
	public List<AccountInfo> findByAccountNo(long accno) {
		return accountInfoDao.findByAccountNo(accno);

	}

}
