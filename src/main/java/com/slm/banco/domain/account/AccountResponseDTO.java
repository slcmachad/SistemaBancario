package com.slm.banco.domain.account;

public record AccountResponseDTO(Long id, String accountNumber) {

    public AccountResponseDTO(Account account){
        this(account.getId(), account.getAccountNumber());
    }
}
