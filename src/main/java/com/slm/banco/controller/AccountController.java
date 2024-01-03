package com.slm.banco.controller;

import com.slm.banco.account.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
public class AccountController {

    @GetMapping
    public void getAll(){
        Account accout
    }
}
