package com.ib.bankservice.persistance.entity;

import com.ib.bankservice.config.JpaConfig;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role_entities", schema = JpaConfig.DB_SCHEMA, catalog = JpaConfig.DB_CATALOG)
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "role", nullable = false)
    private RoleName role;

    @ManyToOne
    @JoinColumn(name = "user_entity_id")
    private UserEntity userEntity;

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public enum RoleName {
        USER, ADMIN
    }
}
