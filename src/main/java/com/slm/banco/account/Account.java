package com.slm.banco.account;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Table(name = "account")
@Entity(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber; // Número da conta
//    private String accountType;   // Tipo de conta (corrente, poupança, etc.)
//    private BigDecimal balance;   // Saldo da conta
//    private Date dateOpened;       // Data de abertura da conta
//    private boolean isActive;      // Estado da conta (ativa/inativa)
}
