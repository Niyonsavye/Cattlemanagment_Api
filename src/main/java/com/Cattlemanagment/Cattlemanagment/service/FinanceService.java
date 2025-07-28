// Nom du fichier : FinanceService.java

package com.Cattlemanagment.Cattlemanagment.service;

import com.Cattlemanagment.Cattlemanagment.entinty.Finance;
import com.Cattlemanagment.Cattlemanagment.repository.FinanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceService {

    @Autowired
    private FinanceRepository repository;

    public List<Finance> getAll() {
        return repository.findAll();
    }

    public Finance save(Finance finance) {
        return repository.save(finance);
    }

    public Finance getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
