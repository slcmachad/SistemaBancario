package com.slm.banco.domain.account;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "account")
@Entity(name = "account")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber; // Número da conta
//    private String accountType;   // Tipo de conta (corrente, poupança, etc.)
//    private BigDecimal balance;   // Saldo da conta
//    private Date dateOpened;       // Data de abertura da conta
//    private boolean isActive;      // Estado da conta (ativa/inativa)

    public  Account(AccountRequestDTO data){
        this.accountNumber = data.accountNumber();
    }
}
