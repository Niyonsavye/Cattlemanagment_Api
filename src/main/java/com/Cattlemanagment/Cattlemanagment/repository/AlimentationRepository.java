// Nom du fichier : AlimentationRepository.java

package com.Cattlemanagment.Cattlemanagment.repository;

import com.Cattlemanagment.Cattlemanagment.entinty.Alimentation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlimentationRepository extends JpaRepository<Alimentation, Long> {
}
