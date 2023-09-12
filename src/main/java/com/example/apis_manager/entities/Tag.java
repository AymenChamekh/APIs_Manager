package com.example.apis_manager.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTag;

    private String nameTag;
    private int occurence=1;

    @ManyToMany(mappedBy = "tags")
    private List<Api> apis = new ArrayList<>();
}
