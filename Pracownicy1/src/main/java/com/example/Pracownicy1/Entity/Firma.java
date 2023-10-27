package com.example.Pracownicy1.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Firma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nazwa;
    private String adres;

    @OneToMany(mappedBy = "firma")
    private List<Pracownik> pracownicy;
}
