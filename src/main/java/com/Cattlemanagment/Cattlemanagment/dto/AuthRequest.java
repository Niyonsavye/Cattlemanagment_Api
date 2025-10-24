package com.Cattlemanagment.Cattlemanagment.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;    // identifiant pour connexion
    private String password;
}
