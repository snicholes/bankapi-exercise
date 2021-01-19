package com.thebrodiebunch.bankingapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thebrodiebunch.bankingapi.data.UserDAO;

@Service
public class UserService {
	@Autowired
	UserDAO userDao;
//	public User addUser(User u); //throws NonUniqueUsernameException ; for SubmitAccount endpoint
//	public Set<User> getUsers();
//	public User getUserById(Integer id);
//	public User getUserByStatusId(Integer id);
//	public User getUserByRoleId(Integer id);
//	public User getUserByName(String username);
//	public void updateUser(User u);
//	public void deleteUser(User u);
}
