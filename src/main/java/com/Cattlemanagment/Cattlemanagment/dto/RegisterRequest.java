package com.Cattlemanagment.Cattlemanagment.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username; // nom affiché
    private String email;    // identifiant pour connexion
    private String password;
}
