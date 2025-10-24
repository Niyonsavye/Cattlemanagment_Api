package com.Cattlemanagment.Cattlemanagment.service;

import com.Cattlemanagment.Cattlemanagment.dto.AuthRequest;
import com.Cattlemanagment.Cattlemanagment.dto.RegisterRequest;
import com.Cattlemanagment.Cattlemanagment.entity.User;
import com.Cattlemanagment.Cattlemanagment.repository.UserRepository;
import com.Cattlemanagment.Cattlemanagment.config.JwtUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    // Inscription
    public ResponseEntity<?> register(RegisterRequest request) {
        // Vérifie si l'email existe déjà
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new RuntimeException("Email already taken");
        }

        User user = User.builder()
                        .username(request.getUsername()) // nom affiché
                        .email(request.getEmail())       // identifiant
                        .password(passwordEncoder.encode(request.getPassword()))
                        .role(User.Role.ROLE_USER)
                        .build();

        userRepository.save(user);

        String token = jwtUtils.generateJwtToken(user.getEmail());
        Map<String, Object> response = new HashMap<>();
        response.put("token", token);
        response.put("user", user); // éventuellement UserDTO

        return ResponseEntity.ok(response);
    }

    // Authentification
    public ResponseEntity<?> authenticate(AuthRequest request) {
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );

        User user = userRepository.findByEmail(request.getEmail())
                                  .orElseThrow(() -> new RuntimeException("User not found"));

        String token = jwtUtils.generateJwtToken(user.getEmail());
        Map<String, Object> response = new HashMap<>();
        response.put("token", token);
        response.put("user", user);

        return ResponseEntity.ok(response);
    }
}
