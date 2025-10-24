package com.Cattlemanagment.Cattlemanagment.config;

import com.Cattlemanagment.Cattlemanagment.entity.User;
import com.Cattlemanagment.Cattlemanagment.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(UserRepository userRepository) {
        return args -> {
            // Vérifie par email car c'est l'identifiant pour Spring Security
            if (userRepository.findByEmail("admin@example.com").isEmpty()) {
                User admin = User.builder()
                        .username("Admin")  // nom d'affichage
                        .email("admin@gmail.com")  // identifiant
                        .password(new BCryptPasswordEncoder().encode("admin123"))
                        .role(User.Role.ROLE_ADMIN)
                        .build();

                userRepository.save(admin);
                System.out.println("Admin user created");
            } else {
                System.out.println("Admin user already exists");
            }
        };
    }
}
