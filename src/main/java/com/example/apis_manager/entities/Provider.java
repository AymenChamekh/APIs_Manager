package com.example.apis_manager.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Provider")
public class Provider extends Organization implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProvider;
    private int nbr_authorisation;

    @JsonCreator
    public Provider(@JsonProperty("idProvider") Long idProvider) {
        this.idProvider = idProvider;
    }

    @OneToMany(mappedBy = "apiProvider" , cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Api> listApiProvided = new ArrayList<>();

}
