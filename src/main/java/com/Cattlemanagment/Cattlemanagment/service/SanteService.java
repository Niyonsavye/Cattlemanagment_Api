// Nom du fichier : SanteService.java

package com.Cattlemanagment.Cattlemanagment.service;

import com.Cattlemanagment.Cattlemanagment.entinty.Sante;
import com.Cattlemanagment.Cattlemanagment.repository.SanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanteService {

    @Autowired
    private SanteRepository repository;

    public List<Sante> getAll() {
        return repository.findAll();
    }

    public Sante save(Sante sante) {
        return repository.save(sante);
    }

    public Sante getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
