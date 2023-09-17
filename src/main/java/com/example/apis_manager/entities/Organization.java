package com.example.apis_manager.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class Organization {


    private String name;
    private String adress;
    private String phone;
    private String mail;
}
