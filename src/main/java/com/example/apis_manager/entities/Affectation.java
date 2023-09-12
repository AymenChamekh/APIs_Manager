package com.example.api_manager.entities;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Affectation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_affectation;

    private Long idApi;

    private Long  idConsumer;

    private LocalDate affectationDate = LocalDate.now(ZoneId.of("Europe/Paris"));
}
