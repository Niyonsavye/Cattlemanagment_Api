// Nom du fichier : SanteRepository.java

package com.Cattlemanagment.Cattlemanagment.repository;

import com.Cattlemanagment.Cattlemanagment.entinty.Sante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SanteRepository extends JpaRepository<Sante, Long> {
}
