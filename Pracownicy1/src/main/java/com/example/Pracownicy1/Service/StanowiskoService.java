package com.example.Pracownicy1.Service;

import com.example.Pracownicy1.Entity.Stanowisko;
import com.example.Pracownicy1.Repository.StanowiskoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StanowiskoService {

    @Autowired
    private StanowiskoRepository stanowiskoRepository;

    public Iterable<Stanowisko> getAllStanowiska() {
        return stanowiskoRepository.findAll();
    }

    public Stanowisko getStanowiskoById(Long id) {
        return stanowiskoRepository.findById(id).orElse(null);
    }

    public Stanowisko addStanowisko(Stanowisko stanowisko) {
        return stanowiskoRepository.save(stanowisko);
    }

    public Stanowisko updateStanowisko(Long id, Stanowisko stanowisko) {
        if (stanowiskoRepository.existsById(id)) {
            stanowisko.setId(id);
            return stanowiskoRepository.save(stanowisko);
        }
        return null;
    }

    public void deleteStanowisko(Long id) {
        stanowiskoRepository.deleteById(id);
    }
}
