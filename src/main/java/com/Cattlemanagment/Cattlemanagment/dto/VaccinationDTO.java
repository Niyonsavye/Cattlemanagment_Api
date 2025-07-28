// Nom du DTO : VaccinationDTO

package com.Cattlemanagment.Cattlemanagment.dto;

import lombok.Data;

@Data
public class VaccinationDTO {
    private Long id;
    private String nomVaccin;
    private String espece;
    private String dateVaccination;
    private String veterinaire;
    private String remarques;
}
