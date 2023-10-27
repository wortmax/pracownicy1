package com.example.Pracownicy1.Controller;

import com.example.Pracownicy1.Entity.Stanowisko;
import com.example.Pracownicy1.Service.StanowiskoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stanowiska")
public class StanowiskoController {

    @Autowired
    private StanowiskoService stanowiskoService;

    @GetMapping("/")
    public Iterable<Stanowisko> getStanowiska() {
        return stanowiskoService.getAllStanowiska();
    }

    @GetMapping("/{id}")
    public Stanowisko getStanowiskoById(@PathVariable Long id) {
        return stanowiskoService.getStanowiskoById(id);
    }

    @PostMapping("/")
    public Stanowisko addStanowisko(@RequestBody Stanowisko stanowisko) {
        return stanowiskoService.addStanowisko(stanowisko);
    }

    @PutMapping("/{id}")
    public Stanowisko updateStanowisko(@PathVariable Long id, @RequestBody Stanowisko stanowisko) {
        return stanowiskoService.updateStanowisko(id, stanowisko);
    }

    @DeleteMapping("/{id}")
    public void deleteStanowisko(@PathVariable Long id) {
        stanowiskoService.deleteStanowisko(id);
    }
}
