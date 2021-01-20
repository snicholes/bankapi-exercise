package com.thebrodiebunch.bankingapi.services;

import com.thebrodiebunch.bankingapi.Beans.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService {
    public User addUser(User u); //throws NonUniqueUsernameException ; for SubmitAccount endpoint
    public Set<User> getUsers();
	public User getUserById(Integer id);
	public User getUserByStatusId(Integer id);
	public User getUserByRoleId(Integer id);
	public User getUserByName(String username);
	public void updateUser(User u);
	public void deleteUser(User u);
}
