// Nom du DTO : SanteDTO

package com.Cattlemanagment.Cattlemanagment.dto;

import lombok.Data;

@Data
public class SanteDTO {
    private Long id;
    private String typeMaladie;
    private String traitement;
    private String dateConsultation;
    private String nomVeterinaire;
}
