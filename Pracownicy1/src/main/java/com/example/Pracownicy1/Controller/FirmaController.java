package com.example.Pracownicy1.Controller;

import com.example.Pracownicy1.Entity.Firma;
import com.example.Pracownicy1.Service.FirmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/firmy")
public class FirmaController {

    @Autowired
    private FirmaService firmaService;

    @GetMapping("/")
    public Iterable<Firma> getFirmy() {
        return firmaService.getAllFirmy();
    }

    @GetMapping("/{id}")
    public Firma getFirmaById(@PathVariable Long id) {
        return firmaService.getFirmaById(id);
    }

    @PostMapping("/")
    public Firma addFirma(@RequestBody Firma firma) {
        return firmaService.addFirma(firma);
    }

    @PutMapping("/{id}")
    public Firma updateFirma(@PathVariable Long id, @RequestBody Firma firma) {
        return firmaService.updateFirma(id, firma);
    }

    @DeleteMapping("/{id}")
    public void deleteFirma(@PathVariable Long id) {
        firmaService.deleteFirma(id);
    }
}
