package com.example.apis_manager.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTag;
    @Column(unique=true)
    private String nameTag;
    private int occurence =1;



    @ManyToMany(mappedBy = "tags",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Api> apis = new ArrayList<>();
}
