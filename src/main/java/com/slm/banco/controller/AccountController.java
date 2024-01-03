package com.slm.banco.controller;

import com.slm.banco.account.Account;
import com.slm.banco.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountRepository repository;
    @GetMapping
    public List<Account> getAll(){

        List<Account> accountList = repository.findAll();
        return accountList;

    }
}
