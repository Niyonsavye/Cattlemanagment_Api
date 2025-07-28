// Nom du fichier : VaccinationController.java

package com.Cattlemanagment.Cattlemanagment.controller;

import com.Cattlemanagment.Cattlemanagment.entinty.Vaccination;
import com.Cattlemanagment.Cattlemanagment.service.VaccinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vaccination")
public class VaccinationController {

    @Autowired
    private VaccinationService service;

    @GetMapping
    public List<Vaccination> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Vaccination create(@RequestBody Vaccination vaccination) {
        return service.save(vaccination);
    }

    @GetMapping("/{id}")
    public Vaccination getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
