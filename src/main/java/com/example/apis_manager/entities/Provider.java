package com.example.apis_manager.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Provider")
public class Provider extends Organization implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProvider;
    private int nbr_authorisation;

    @OneToMany(mappedBy = "apiProvider")
    private List<Api> listApiProvided = new ArrayList<>();

}
