package com.thebrodiebunch.bankingapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.thebrodiebunch.bankingapi.data.AccountDAO;

@Service
public class AccountService {
	@Autowired
	AccountDAO accountDao;
	
	public Account addAccount(Account a);
	public Set<Account> getAccounts();
	public Account getAccountById(Integer id);
	public Account getAccountByName(String username);
	public void deleteAccount(Account a);
	public void updateAccount(Account a);
}
