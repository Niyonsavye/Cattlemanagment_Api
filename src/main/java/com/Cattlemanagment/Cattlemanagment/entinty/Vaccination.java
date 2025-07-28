// Nom de l'entité : Vaccination

package com.Cattlemanagment.Cattlemanagment.entinty;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vaccination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomVaccin;
    private String espece; // vache, poule, etc.
    private String dateVaccination;
    private String veterinaire;
    private String remarques;
}
