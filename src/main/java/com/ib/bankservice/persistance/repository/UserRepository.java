package com.ib.bankservice.persistance.repository;

import com.ib.bankservice.persistance.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
