package com.project.AccountsMS.Services;

import com.project.AccountsMS.Model.Account;
import com.project.AccountsMS.Repositories.AccountRepository;
import com.project.AccountsMS.Services.Interface.AccountService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AccountServiceImpl implements AccountService {
    private final Map<Long, Account> accountRepository = new HashMap<>();
    //private final AccountRepository accountRepository;
    private long idCounter = 1;

//    public AccountServiceImpl(AccountRepository accountRepository) {
//        this.accountRepository = accountRepository;
//    }

    public List<Account> getAllAccounts() {
        return new ArrayList<>(accountRepository.values());
    }

    public Account getAccountById(Long accountId) {
        return accountRepository.get(accountId);
    }
    public Account createAccount(Account account) {
        account.setAccountId(idCounter++);
        accountRepository.put(account.getAccountId(), account);
        return account;
    }

    public Account updateAccount(Long accountId, Account account) {
        if (!accountRepository.containsKey(accountId)) {
            throw new NoSuchElementException("Account not found");
        }
        account.setAccountId(accountId);
        accountRepository.put(accountId, account);
        return account;
    }


    @Override
    public String addAccount(Account account) {
        return "";
    }

    @Override
    public Account updateAccount(Account account) {
        return null;
    }

    public Account deleteAccount(Long accountId) {
       return accountRepository.remove(accountId);
    }
}
