package com.example.apis_manager.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Consumer")
public class Consumer extends Organization{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsumer;
    private String sector;

    @JsonCreator
    public Consumer(@JsonProperty("idConsumer") Long idConsumer) {
        this.idConsumer = idConsumer;
    }

    @OneToMany(mappedBy = "consumer" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Affectation> listApiConsumed = new ArrayList<>();
}
