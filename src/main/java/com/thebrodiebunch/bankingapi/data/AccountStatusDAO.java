package com.thebrodiebunch.bankingapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thebrodiebunch.bankingapi.Beans.AccountStatus;
@Repository
public interface AccountStatusDAO extends JpaRepository<AccountStatus, Integer> {

}
