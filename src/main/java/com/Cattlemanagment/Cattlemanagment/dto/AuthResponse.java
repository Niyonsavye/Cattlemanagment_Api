package com.Cattlemanagment.Cattlemanagment.dto;
import com.Cattlemanagment.Cattlemanagment.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private User user;
}
