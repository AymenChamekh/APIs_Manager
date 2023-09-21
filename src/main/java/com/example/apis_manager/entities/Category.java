package com.example.apis_manager.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory;

    private String nameCategory;

    @JsonCreator
    public Category(@JsonProperty("idCategory") Long idCategory) {
        this.idCategory = idCategory;
    }

    @OneToMany(mappedBy = "apiCategory" , cascade = CascadeType.ALL)
    private List<Api> listApiCategory = new ArrayList<>();
}
