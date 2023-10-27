package com.example.Pracownicy1.Repository;

import com.example.Pracownicy1.Entity.Stanowisko;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StanowiskoRepository extends JpaRepository<Stanowisko, Long> {
}
