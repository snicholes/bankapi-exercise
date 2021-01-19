package com.thebrodiebunch.bankingapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thebrodiebunch.bankingapi.Beans.User;
@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

}
