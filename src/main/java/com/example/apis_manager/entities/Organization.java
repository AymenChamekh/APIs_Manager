package com.example.api_manager.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_organization;
    private String name;
    private String adress;
    private String phone;
    private String mail;
}
