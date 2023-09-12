package com.example.apis_manager.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Consumer")
public class Consumer extends Organization{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsumer;
    private String sector;

    @OneToMany(mappedBy = "api")
    private List<Affectation> listApiConsumed = new ArrayList<>();


}
