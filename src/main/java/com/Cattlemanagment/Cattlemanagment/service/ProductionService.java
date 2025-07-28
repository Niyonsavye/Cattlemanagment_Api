package com.Cattlemanagment.Cattlemanagment.service;

import com.Cattlemanagment.Cattlemanagment.entinty.Production;
import com.Cattlemanagment.Cattlemanagment.repository.ProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionService {

    @Autowired
    private ProductionRepository repository;

    public List<Production> getAll() {
        return repository.findAll();
    }

    public Production save(Production production) {
        return repository.save(production);
    }

    public Production getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
