// Nom du fichier : FinanceController.java

package com.Cattlemanagment.Cattlemanagment.controller;

import com.Cattlemanagment.Cattlemanagment.entinty.Finance;
import com.Cattlemanagment.Cattlemanagment.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/V1/finances")
public class FinanceController {

    @Autowired
    private FinanceService service;

    @GetMapping
    public List<Finance> list() {
        return service.getAll();
    }

    @PostMapping
    public Finance create(@RequestBody Finance finance) {
        return service.save(finance);
    }

    @GetMapping("/{id}")
    public Finance get(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
