package com.project.AccountsMS.Repositories;

import com.project.AccountsMS.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
