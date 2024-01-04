package com.slm.banco.controller;

import com.slm.banco.account.Account;
import com.slm.banco.account.AccountRepository;
import com.slm.banco.account.AccountRequestDTO;
import com.slm.banco.account.AccountResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveAccount(@RequestBody AccountRequestDTO data){
        Account accountData = new Account(data);
        repository.save(accountData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<AccountResponseDTO> getAll(){

        List<AccountResponseDTO> accountList = repository.findAll().stream().map(AccountResponseDTO::new).toList();
        return accountList;

    }
}
