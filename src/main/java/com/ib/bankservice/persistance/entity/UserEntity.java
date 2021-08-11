package com.ib.bankservice.persistance.entity;

import com.ib.bankservice.config.JpaConfig;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users", schema = JpaConfig.DB_SCHEMA, catalog = JpaConfig.DB_CATALOG)
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "userEntity")
    private Set<RoleEntity> roles;
}
