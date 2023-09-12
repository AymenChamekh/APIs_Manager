package com.example.apis_manager.entities;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class Api {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_api;

    private String nameApi;

    private String description;

    private float version;

    private LocalDate creationDate = LocalDate.now(ZoneId.of("Europe/Paris"));

    @Enumerated(EnumType.STRING)
    private State apiState;

    @Enumerated(EnumType.STRING)
    private Method apiMethod;

    @Enumerated(EnumType.STRING)
    private Type apiType;

    @ManyToOne
    @JoinColumn(name="id_Provider",nullable=false)
    private Provider apiProvider;

    @OneToMany(mappedBy = "consumer")
    private List<Affectation> apiConsumer= new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="id_Category",nullable=false)
    private Category apiCategory;

    @ManyToMany
    @JoinTable(
            name = "Api_Tag",
            joinColumns = @JoinColumn(name = "idTag"),
            inverseJoinColumns = @JoinColumn(name = "id_api"))
    private List<Tag> tags = new ArrayList<>();

}
