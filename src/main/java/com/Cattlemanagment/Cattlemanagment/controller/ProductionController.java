package com.Cattlemanagment.Cattlemanagment.controller;

import com.Cattlemanagment.Cattlemanagment.entinty.Production;
import com.Cattlemanagment.Cattlemanagment.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/production")
public class ProductionController {

    @Autowired
    private ProductionService service;

    @GetMapping
    public List<Production> list() {
        return service.getAll();
    }

    @PostMapping
    public Production create(@RequestBody Production production) {
        return service.save(production);
    }

    @GetMapping("/{id}")
    public Production get(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
