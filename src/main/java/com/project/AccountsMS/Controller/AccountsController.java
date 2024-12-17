package com.project.AccountsMS.Controller;

import com.project.AccountsMS.Model.Account;
import com.project.AccountsMS.Services.AccountServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
    private final AccountServiceImpl accountServiceImpl;

    public AccountsController(AccountServiceImpl accountServiceImpl) {
        this.accountServiceImpl = accountServiceImpl;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountServiceImpl.getAllAccounts();
    }

    @GetMapping("/{accountId}")
    public Account getAccountById(@PathVariable("accountId") Long accountId) {
        return accountServiceImpl.getAccountById(accountId);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountServiceImpl.createAccount(account);
    }

    @PutMapping("/{accountId}")
    public Account updateAccount(@PathVariable("accountId") Long accountId, @RequestBody Account account) {
        return accountServiceImpl.updateAccount(accountId, account);
    }

    @DeleteMapping("/{accountId}")
    public void deleteAccount(@PathVariable("accountId") Long accountId) {
        accountServiceImpl.deleteAccount(accountId);
    }
}
