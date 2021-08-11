package com.ib.bankservice.persistance.entity;

import com.ib.bankservice.config.JpaConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "accounts", schema = JpaConfig.DB_SCHEMA, catalog = JpaConfig.DB_CATALOG)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String accountNumber;
    private Enum currency;
    private BigDecimal balance;
    private boolean isActive;

    @OneToMany
    private UserEntity user;
}
