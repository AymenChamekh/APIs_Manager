package com.example.apis_manager.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Category;

    private String nameCategory;

    @OneToMany(mappedBy = "apiCategory")
    private List<Api> listApiCategory = new ArrayList<>();
}
