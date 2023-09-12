package com.example.api_manager.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Category;

    private String nameCategory;

    private ArrayList<Api> listApiCategory = new ArrayList<Api>();
}
