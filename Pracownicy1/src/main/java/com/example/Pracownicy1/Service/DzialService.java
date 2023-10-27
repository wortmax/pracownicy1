package com.example.Pracownicy1.Service;

import com.example.Pracownicy1.Entity.Dzial;
import com.example.Pracownicy1.Repository.DzialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DzialService {

    @Autowired
    private DzialRepository dzialRepository;

    public Iterable<Dzial> getAllDzialy() {
        return dzialRepository.findAll();
    }

    public Dzial getDzialById(Long id) {
        return dzialRepository.findById(id).orElse(null);
    }

    public Dzial addDzial(Dzial dzial) {
        return dzialRepository.save(dzial);
    }

    public Dzial updateDzial(Long id, Dzial dzial) {
        if (dzialRepository.existsById(id)) {
            dzial.setId(id);
            return dzialRepository.save(dzial);
        }
        return null;
    }

    public void deleteDzial(Long id) {
        dzialRepository.deleteById(id);
    }
}
