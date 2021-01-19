package com.thebrodiebunch.bankingapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thebrodiebunch.bankingapi.Beans.Account;
import com.thebrodiebunch.bankingapi.data.AccountDAO;

@Service
public class AccountService {
	private AccountDAO adao;
	
	
	@Autowired
	public AccountService(AccountDAO adao)
	{
		this.adao = adao;
	}
	
	public Account addAcount(Account a)
	{
		return adao.save(a);
	}
	public List<Account> getAccounts()
	{
		return adao.findAll();
	}
	public Account getAccountById(Integer id)
	{
		return adao.getOne(id);
	}
	public List<Account> getAccountByStatus(Integer statusId)
	{
		List<Account> all = adao.findAll();
		all.removeIf(account -> account.getStatus().getId() != statusId);
		return all;
	}
	public void deleteAccount(Account a)
	{
		adao.delete(a);
	}
	public void updateAccount(Account a)
	{
		Account instance = adao.getOne(a.getId());
		if (instance != null)
		{
			adao.save(a);
		}
	}
	public List<Account> getAccountbyUser(Integer userId)
	{
		List<Account> all = adao.findAll();
		all.removeIf(account -> account.getOwnerId() != userId);
		return all;
	}
}
