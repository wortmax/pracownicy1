package com.example.Pracownicy1.Repository;

import com.example.Pracownicy1.Entity.Dzial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DzialRepository extends JpaRepository<Dzial, Long> {
}
