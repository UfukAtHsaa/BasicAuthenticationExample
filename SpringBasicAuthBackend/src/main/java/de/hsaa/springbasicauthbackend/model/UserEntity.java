package de.hsaa.springbasicauthbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "app_user")
public class UserEntity {

    @Id
    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    private String role;
}
