package com.barclays.accountmanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.accountmanagement.dao.UsersRepo;
import com.barclays.accountmanagement.entity.Users;

//Service class for Users
@Service
@Transactional
public class UsersService {
	@Autowired
	private UsersRepo userRepo;
	
	//Get user by Id
	public Users getUserById(Integer customerId) {
		return userRepo.getById(customerId);
	}

	//Create new user
	public Users createUser(Users user) {
		return userRepo.save(user);
	}
	
	//Delete user
	public void deleteUser(Integer customerId) {
		userRepo.deleteById(customerId);
	}
	
	//Find By Customer Id
	public Users findByCustomerId(long customer_id) {
		return userRepo.findByCustomerId(customer_id);
	}

	
}
