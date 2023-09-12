package com.example.api_manager.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTag;

    private String nameTag;
    private int occurence=1;

    private ArrayList<Api> listApisTaged = new ArrayList<Api>();
}
