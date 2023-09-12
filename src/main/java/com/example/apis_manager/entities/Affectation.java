package com.example.apis_manager.entities;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZoneId;

import java.util.Date;
@Entity
public class Affectation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_affectation;

    @ManyToOne
    @JoinColumn(name = "id_api")
    private Api api;

    @ManyToOne
    @JoinColumn(name = "id_organization")
    private Consumer  consumer;

    private LocalDate affectationDate = LocalDate.now(ZoneId.of("Europe/Paris"));
}
