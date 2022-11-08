package de.hsaa.springbasicauthbackend.repository;

import de.hsaa.springbasicauthbackend.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String username);

}
