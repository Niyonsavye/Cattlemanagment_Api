// Nom du fichier : VaccinationService.java

package com.Cattlemanagment.Cattlemanagment.service;

import com.Cattlemanagment.Cattlemanagment.entinty.Vaccination;
import com.Cattlemanagment.Cattlemanagment.repository.VaccinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccinationService {

    @Autowired
    private VaccinationRepository repository;

    public List<Vaccination> getAll() {
        return repository.findAll();
    }

    public Vaccination save(Vaccination vaccination) {
        return repository.save(vaccination);
    }

    public Vaccination getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
