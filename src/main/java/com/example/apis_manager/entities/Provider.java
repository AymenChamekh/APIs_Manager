package com.example.apis_manager.entities;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Provider")
public class Provider extends Organization{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProvider;
    private int nbr_authorisation;

    @OneToMany(mappedBy = "apiProvider")
    private List<Api> listApiProvided = new ArrayList<>();

}
