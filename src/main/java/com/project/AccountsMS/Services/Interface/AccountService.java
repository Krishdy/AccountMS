package com.project.AccountsMS.Services.Interface;

import com.project.AccountsMS.Model.Account;

import java.util.List;

public interface AccountService {
    String addAccount(Account account);
    Account updateAccount(Account account);
    Account deleteAccount(Long accountID);
    List<Account> getAllAccounts();

}
