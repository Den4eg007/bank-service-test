package com.ib.bankservice.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = {"com.ib.bankservice.persistence.entity"})
@EnableJpaRepositories(basePackages = {"com.ib.bankservice.persistance.repository"})
@EnableTransactionManagement
public class JpaConfig {
    public static final String DB_SCHEMA = "public";
    public static final String DB_CATALOG = "ib_ws_db";
}