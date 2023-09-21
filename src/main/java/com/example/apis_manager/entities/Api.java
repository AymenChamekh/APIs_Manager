package com.example.apis_manager.entities;

import com.example.apis_manager.services.TagService;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    private Long idApi;

    private String nameApi;

    private String description;

    private float version;

    private LocalDate creationDate = LocalDate.now(ZoneId.of("Europe/Paris"));

    @Enumerated(EnumType.STRING)
    private State apiState;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Method.class)
    @CollectionTable(name = "api_method" , joinColumns = @JoinColumn(name ="idApi"))
    @Column(name = "method")
    private Set<Method> methods;

    @Enumerated(EnumType.STRING)
    private Type apiType;

    @ManyToOne
    @JoinColumn(name="idProvider",nullable=false)

    private Provider apiProvider;

    @OneToMany(mappedBy = "api",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Affectation> apiConsumer= new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="idCategory",nullable=false)

    private Category apiCategory;

    @OneToMany(mappedBy = "api",orphanRemoval = true)
    private List<Tag> tags= new ArrayList<>();


    @JsonCreator
    public Api(@JsonProperty("idApi") Long idApi) {
        this.idApi = idApi;
    }
}
