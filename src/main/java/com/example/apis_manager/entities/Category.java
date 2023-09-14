package com.example.apis_manager.entities;

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
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Category;

    private String nameCategory;

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    @OneToMany(mappedBy = "apiCategory")
    private List<Api> listApiCategory = new ArrayList<>();
}
