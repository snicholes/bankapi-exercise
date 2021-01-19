package com.thebrodiebunch.bankingapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountDAO extends JpaRepository<Account, Integer> {

}
