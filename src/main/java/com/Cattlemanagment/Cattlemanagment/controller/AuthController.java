package com.Cattlemanagment.Cattlemanagment.controller;

import com.Cattlemanagment.Cattlemanagment.config.JwtUtils;
import com.Cattlemanagment.Cattlemanagment.dto.AuthRequest;
import com.Cattlemanagment.Cattlemanagment.dto.AuthResponse;
import com.Cattlemanagment.Cattlemanagment.dto.RegisterRequest;

import com.Cattlemanagment.Cattlemanagment.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/V1/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public  ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public  ResponseEntity<?> login(@RequestBody AuthRequest request) {
        return authService.authenticate(request);
    }
}
