package com.Cattlemanagment.Cattlemanagment.entinty;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author ALEXANDRE
 */
@Entity
public class Production {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // lait, œufs
    private double quantite;
    private LocalDate date;
    private String animal;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getQuantite() { return quantite; }
    public void setQuantite(double quantite) { this.quantite = quantite; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getAnimal() { return animal; }
    public void setAnimal(String animal) { this.animal = animal; }
}
