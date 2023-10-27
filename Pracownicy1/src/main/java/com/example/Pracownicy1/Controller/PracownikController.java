package com.example.Pracownicy1.Controller;

import com.example.Pracownicy1.Entity.Pracownik;
import com.example.Pracownicy1.Service.PracownikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pracownicy")
public class PracownikController {

    @Autowired
    private PracownikService pracownikService;

    @GetMapping("/")
    public Iterable<Pracownik> getPracownicy() {
        return pracownikService.getAllPracownicy();
    }

    @GetMapping("/{id}")
    public Pracownik getPracownikById(@PathVariable Long id) {
        return pracownikService.getPracownikById(id);
    }

    @PostMapping("/")
    public Pracownik addPracownik(@RequestBody Pracownik pracownik) {
        return pracownikService.addPracownik(pracownik);
    }

    @PutMapping("/{id}")
    public Pracownik updatePracownik(@PathVariable Long id, @RequestBody Pracownik pracownik) {
        return pracownikService.updatePracownik(id, pracownik);
    }

    @DeleteMapping("/{id}")
    public void deletePracownik(@PathVariable Long id) {
        pracownikService.deletePracownik(id);
    }
}

