package com.example.apis_manager.entities;

import com.example.apis_manager.services.TagService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Api implements Serializable {

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

    @OneToMany(mappedBy = "api")
    private List<Affectation> apiConsumer= new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="id_Category",nullable=false)
    private Category apiCategory;

    @OneToMany(mappedBy = "api")
    private List<Tag> tags= new ArrayList<>();

   /* @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Api_Tag",
            joinColumns = @JoinColumn(name = "idTag"),
            inverseJoinColumns = @JoinColumn(name = "id_api"))
    private Set<Tag> tags = new HashSet<>();*/




}
