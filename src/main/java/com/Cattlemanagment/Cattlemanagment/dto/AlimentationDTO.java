// Nom du DTO : AlimentationDTO

package com.Cattlemanagment.Cattlemanagment.dto;

import lombok.Data;

@Data
public class AlimentationDTO {
    private Long id;
    private String typeAliment;
    private double quantite;
    private String dateDistribution;
}
