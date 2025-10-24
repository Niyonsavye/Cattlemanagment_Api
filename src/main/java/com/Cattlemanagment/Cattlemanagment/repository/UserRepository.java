package com.Cattlemanagment.Cattlemanagment.repository;

import com.Cattlemanagment.Cattlemanagment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // Cherche un utilisateur par email (identifiant pour Spring Security)
    Optional<User> findByEmail(String email);

    // Si vous voulez aussi chercher par username (affichage/profil)
    Optional<User> findByUsername(String username);
}
