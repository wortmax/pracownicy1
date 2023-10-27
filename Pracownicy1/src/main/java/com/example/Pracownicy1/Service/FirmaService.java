package com.example.Pracownicy1.Service;

import com.example.Pracownicy1.Entity.Firma;
import com.example.Pracownicy1.Repository.FirmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirmaService {

    @Autowired
    private FirmaRepository firmaRepository;

    public Iterable<Firma> getAllFirmy() {
        return firmaRepository.findAll();
    }

    public Firma getFirmaById(Long id) {
        return firmaRepository.findById(id).orElse(null);
    }

    public Firma addFirma(Firma firma) {
        return firmaRepository.save(firma);
    }

    public Firma updateFirma(Long id, Firma firma) {
        if (firmaRepository.existsById(id)) {
            firma.setId(id);
            return firmaRepository.save(firma);
        }
        return null;
    }

    public void deleteFirma(Long id) {
        firmaRepository.deleteById(id);
    }
}
