package com.barclays.accountmanagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.accountmanagement.entity.Transaction;
import com.barclays.accountmanagement.response.ResponseHandler;
import com.barclays.accountmanagement.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/gettransaction/{transactionId}")
	public ResponseEntity<Object> getTransaction(@PathVariable String transactionId){
		
		try {
			
			Optional<Transaction> transaction= transactionService.getTransaction(transactionId);
			return ResponseHandler.generateResponse("Success", HttpStatus.OK,transaction);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.NOT_FOUND,null);
		}
	}
	
	@PostMapping("/createtransaction")
	public ResponseEntity<Object> createTransaction(@RequestBody Transaction transaction){
		try {
			
			Transaction newtransaction = transactionService.createTransaction(transaction);
			return ResponseHandler.generateResponse("success", HttpStatus.CREATED, newtransaction);
		} catch (Exception e) {
			// TODO: handle exception
			return ResponseHandler.generateResponse(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR, null);
		}
	}
}
