package com.Cattlemanagment.Cattlemanagment.entinty;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author ALEXANDRE
 */
@Entity
public class Sante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomAnimal;
    private String typeMaladie;
    private String traitement;
    private LocalDate dateConsultation;
    private String veterinaire;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomAnimal() { return nomAnimal; }
    public void setNomAnimal(String nomAnimal) { this.nomAnimal = nomAnimal; }

    public String getTypeMaladie() { return typeMaladie; }
    public void setTypeMaladie(String typeMaladie) { this.typeMaladie = typeMaladie; }

    public String getTraitement() { return traitement; }
    public void setTraitement(String traitement) { this.traitement = traitement; }

    public LocalDate getDateConsultation() { return dateConsultation; }
    public void setDateConsultation(LocalDate dateConsultation) { this.dateConsultation = dateConsultation; }

    public String getVeterinaire() { return veterinaire; }
    public void setVeterinaire(String veterinaire) { this.veterinaire = veterinaire; }
}
