package com.thebrodiebunch.bankingapi.controllers;

import com.thebrodiebunch.bankingapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thebrodiebunch.bankingapi.Beans.User;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class UserController {
	private final UserService userService;

	@Autowired
	public UserController(UserService u){
		this.userService = u;
	}

	@PostMapping(path = "/login")
	public ResponseEntity<User> login(HttpSession session, @RequestBody User u)
	{
		User user = userService.getUserByName(u.getUsername());
		if (user != null){
			if (user.getPassword().equals(u.getPassword())){
				session.setAttribute("user", user);
				return ResponseEntity.ok(user);
			}else{
				return ResponseEntity.badRequest().build();
			}
		}else{
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping(path = "/register")
	public ResponseEntity<Void> register(HttpSession session, @RequestBody User newUser)
	{
		try{
			userService.addUser(newUser);
		}
		catch (Exception e){
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok().build();
	}

	@PostMapping(path = "/logout")
	public ResponseEntity<Void> logout(HttpSession session,)
	{
		session.invalidate();
		return ResponseEntity.ok().build();
	}

	@GetMapping(path = "/users")
	public ResponseEntity<List<User>> getAllUsers()
	{

		return null;
	}

	@GetMapping(path = "/users/{id}")
	public ResponseEntity<User> findUserById(@PathVariable("id") Integer id)
	{

		return null;
	}

	@PutMapping(path = "/users")
	public ResponseEntity<User> updateUser(@RequestBody User user)
	{

		return null;
	}
}
