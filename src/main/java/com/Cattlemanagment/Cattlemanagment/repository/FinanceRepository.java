// Nom du fichier : FinanceRepository.java

package com.Cattlemanagment.Cattlemanagment.repository;

import com.Cattlemanagment.Cattlemanagment.entinty.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceRepository extends JpaRepository<Finance, Long> {
}
