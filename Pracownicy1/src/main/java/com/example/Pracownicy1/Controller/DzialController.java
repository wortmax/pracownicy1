package com.example.Pracownicy1.Controller;

import com.example.Pracownicy1.Entity.Dzial;
import com.example.Pracownicy1.Service.DzialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dzialy")
public class DzialController {

    @Autowired
    private DzialService dzialService;

    @GetMapping("/")
    public Iterable<Dzial> getDzialy() {
        return dzialService.getAllDzialy();
    }

    @GetMapping("/{id}")
    public Dzial getDzialById(@PathVariable Long id) {
        return dzialService.getDzialById(id);
    }

    @PostMapping("/")
    public Dzial addDzial(@RequestBody Dzial dzial) {
        return dzialService.addDzial(dzial);
    }

    @PutMapping("/{id}")
    public Dzial updateDzial(@PathVariable Long id, @RequestBody Dzial dzial) {
        return dzialService.updateDzial(id, dzial);
    }

    @DeleteMapping("/{id}")
    public void deleteDzial(@PathVariable Long id) {
        dzialService.deleteDzial(id);
    }
}
