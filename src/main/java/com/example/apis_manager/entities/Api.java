package com.example.api_manager.entities;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Api {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_api;

    private String nameApi;

    private String description;

    private float version;

    private LocalDate creationDate = LocalDate.now(ZoneId.of("Europe/Paris"));

    private State apiState;

    private Method apiMethod;

    private Type apiType;

    private Provider apiProvider;

    private List<Consumer> apiConsumer= new ArrayList<Consumer>();

    private Category apiCategory;


}
