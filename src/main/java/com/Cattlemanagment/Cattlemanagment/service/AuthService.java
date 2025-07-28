package com.Cattlemanagment.Cattlemanagment.service;

import com.Cattlemanagment.Cattlemanagment.dto.AuthRequest;
import com.Cattlemanagment.Cattlemanagment.dto.AuthResponse;
import com.Cattlemanagment.Cattlemanagment.dto.RegisterRequest;
import com.Cattlemanagment.Cattlemanagment.entity.User;
import com.Cattlemanagment.Cattlemanagment.repository.UserRepository;
import com.Cattlemanagment.Cattlemanagment.config.JwtUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.http.HttpStatus;
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

    public ResponseEntity<?> register(RegisterRequest request) {
        if (userRepository.findByUsername(request.getUsername()).isPresent()) {
            throw new RuntimeException("Username already taken");
        }

        User user = User.builder()
                        .username(request.getUsername())
                        .password(passwordEncoder.encode(request.getPassword()))
                        .role(User.Role.ROLE_USER)
                        .build();

        userRepository.save(user);

        String token = jwtUtils.generateJwtToken(user.getUsername());
        Map<String, Object> response = new HashMap<>();
        response.put("token", token);
        response.put("user", user); // Tu peux aussi renvoyer un UserDTO si tu veux éviter de tout exposer

        return ResponseEntity.ok(response);
    }

    public  ResponseEntity<?> authenticate(AuthRequest request) {
        authenticationManager.authenticate(
            new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
        );

     User user = userRepository.findByUsername(request.getUsername())
                              .orElseThrow(() -> new RuntimeException("User not found"));

     String token = jwtUtils.generateJwtToken(user.getUsername());
    Map<String, Object> response = new HashMap<>();
    response.put("token", token);
    response.put("user", user); // Tu peux aussi renvoyer un UserDTO si tu veux éviter de tout exposer

    return ResponseEntity.ok(response);
}

}
