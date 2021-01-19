package com.thebrodiebunch.bankingapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thebrodiebunch.bankingapi.Beans.Account;
import com.thebrodiebunch.bankingapi.services.AccountService;

@RequestMapping("/accounts")
@RestController
public class AccountController {

	private AccountService accServ;
	
	@Autowired
	public AccountController(AccountService accServ)
	{
		this.accServ = accServ;
	}
	
	@GetMapping
	public ResponseEntity<List<Account>> getAccounts()
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = (String) auth.getPrincipal();
		return ResponseEntity.ok(accServ.getAccounts());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Account> getAccountById(@PathVariable Integer id)
	{
		Account acc = accServ.getAccountById(id);
		if (acc != null)
		{
			return ResponseEntity.ok(acc);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("/status/{statusId}")
	public ResponseEntity<List<Account>> getAccountsByStatus(@PathVariable Integer statusId)
	{
		return ResponseEntity.ok(accServ.getAccountByStatus(statusId));
	}
	
	@PostMapping
	public ResponseEntity<Account> addAccount(@RequestBody Account acc)
	{
		if(acc.getId() != 0)
		{
			return ResponseEntity.badRequest().build();
		}
		
		return ResponseEntity.ok(accServ.addAcount(acc));
	}
	
	
	@PutMapping
	public ResponseEntity<Account> updateAccount(@RequestBody Account acc)
	{
		accServ.updateAccount(acc);
		return ResponseEntity.ok(acc);
	}
	
	
}
