package com.Cattlemanagment.Cattlemanagment.dto;

import lombok.Data;

@Data
public class ProductionDTO {
    private Long id;
    private String typeProduction;
    private double quantite;
    private String dateProduction;
}
