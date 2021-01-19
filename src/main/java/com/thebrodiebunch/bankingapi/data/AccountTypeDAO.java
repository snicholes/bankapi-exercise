package com.thebrodiebunch.bankingapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thebrodiebunch.bankingapi.Beans.AccountType;
@Repository
public interface AccountTypeDAO extends JpaRepository<AccountType, Integer> {

}
