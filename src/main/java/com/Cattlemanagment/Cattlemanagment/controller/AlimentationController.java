// Nom du fichier : AlimentationController.java

package com.Cattlemanagment.Cattlemanagment.controller;

import com.Cattlemanagment.Cattlemanagment.entinty.Alimentation;
import com.Cattlemanagment.Cattlemanagment.service.AlimentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alimentation")
public class AlimentationController {

    @Autowired
    private AlimentationService service;

    @GetMapping
    public List<Alimentation> list() {
        return service.getAll();
    }

    @PostMapping
    public Alimentation create(@RequestBody Alimentation alimentation) {
        return service.save(alimentation);
    }

    @GetMapping("/{id}")
    public Alimentation get(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
