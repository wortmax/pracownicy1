package com.example.Pracownicy1.Repository;

import com.example.Pracownicy1.Entity.Firma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirmaRepository extends JpaRepository<Firma, Long> {
}
