package com.thebrodiebunch.bankingapi.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleDAO extends JpaRepository<Role, Integer> {

}
