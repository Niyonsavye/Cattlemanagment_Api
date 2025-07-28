// Nom du DTO : FinanceDTO

package com.Cattlemanagment.Cattlemanagment.dto;

import lombok.Data;

@Data
public class FinanceDTO {
    private Long id;
    private String typeOperation;
    private double montant;
    private String dateOperation;
    private String description;
}
