// Nom du fichier : VaccinationRepository.java

package com.Cattlemanagment.Cattlemanagment.repository;

import com.Cattlemanagment.Cattlemanagment.entinty.Vaccination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationRepository extends JpaRepository<Vaccination, Long> {
}
