package com.example.Pracownicy1.Entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Data
@Table(name = "pracownicy")
public class Pracownik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imie;
    private String nazwisko;
    private double pensja;
    private Date dataZatrudnienia;

    @ManyToOne
    @JoinColumn(name = "stanowisko_id")
    private Stanowisko stanowisko;

    @ManyToOne
    @JoinColumn(name = "dzial_id")
    private Dzial dzial;

    @ManyToOne
    @JoinColumn(name = "firma_id")
    private Firma firma;}
