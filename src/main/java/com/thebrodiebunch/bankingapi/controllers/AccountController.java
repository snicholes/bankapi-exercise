package com.thebrodiebunch.bankingapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thebrodiebunch.bankingapi.Beans.Account;

@RequestMapping("/accounts")
@RestController
public class AccountController {

	@GetMapping
	public ResponseEntity<Account[]> getAccounts()
	{
		
	}
}
