package com.slm.banco.account;

public record AccountResponseDTO(Long id, String accountNumber) {

    public AccountResponseDTO(Account account){
        this(account.getId(), account.getAccountNumber());
    }
}
