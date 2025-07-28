// Nom du fichier : AlimentationService.java

package com.Cattlemanagment.Cattlemanagment.service;

import com.Cattlemanagment.Cattlemanagment.entinty.Alimentation;
import com.Cattlemanagment.Cattlemanagment.repository.AlimentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentationService {

    @Autowired
    private AlimentationRepository repository;

    public List<Alimentation> getAll() {
        return repository.findAll();
    }

    public Alimentation save(Alimentation alimentation) {
        return repository.save(alimentation);
    }

    public Alimentation getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
