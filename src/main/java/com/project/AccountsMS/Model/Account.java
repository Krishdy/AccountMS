package com.project.AccountsMS.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table
@Setter
@Getter
public class Account {
    private Long accountId;
    private Long userId;
    private String accountNumber;
    private String accountType;
    private Double balance;
    private String currency;
}
