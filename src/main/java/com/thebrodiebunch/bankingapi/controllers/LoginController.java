package com.thebrodiebunch.bankingapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thebrodiebunch.bankingapi.Beans.User;

@RestController
public class LoginController {

	@GetMapping
	public User login()
	{
		return null;
	}
}
