package com.example.apis_manager.entities;

import javax.persistence.*;


@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Organization {


    private String name;
    private String adress;
    private String phone;
    private String mail;
}
