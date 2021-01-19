package com.thebrodiebunch.bankingapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thebrodiebunch.bankingapi.Beans.Account;
@Repository
public interface AccountDAO extends JpaRepository<Account, Integer> {

}
