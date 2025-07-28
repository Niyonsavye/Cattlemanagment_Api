// Nom du fichier : SanteController.java

package com.Cattlemanagment.Cattlemanagment.controller;

import com.Cattlemanagment.Cattlemanagment.entinty.Sante;
import com.Cattlemanagment.Cattlemanagment.service.SanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/V1/santes")
public class SanteController {

    @Autowired
    private SanteService service;

    @GetMapping
    public List<Sante> list() {
        return service.getAll();
    }

    @PostMapping
    public Sante create(@RequestBody Sante sante) {
        return service.save(sante);
    }

    @GetMapping("/{id}")
    public Sante get(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
