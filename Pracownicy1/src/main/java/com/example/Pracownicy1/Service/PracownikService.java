package com.example.Pracownicy1.Service;

import com.example.Pracownicy1.Entity.Pracownik;
import com.example.Pracownicy1.Repository.PracownikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracownikService {

    @Autowired
    private PracownikRepository pracownikRepository;

    public Iterable<Pracownik> getAllPracownicy() {
        return pracownikRepository.findAll();
    }

    public Pracownik getPracownikById(Long id) {
        return pracownikRepository.findById(id).orElse(null);
    }

    public Pracownik addPracownik(Pracownik pracownik) {
        return pracownikRepository.save(pracownik);
    }

    public Pracownik updatePracownik(Long id, Pracownik pracownik) {
        if (pracownikRepository.existsById(id)) {
            pracownik.setId(id);
            return pracownikRepository.save(pracownik);
        }
        return null;
    }

    public void deletePracownik(Long id) {
        pracownikRepository.deleteById(id);
    }
}
