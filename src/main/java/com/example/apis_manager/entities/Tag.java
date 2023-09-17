package com.example.apis_manager.entities;

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

    private String nameTag;
    private int occurence=1;

    public Tag(String nameTag) {
        this.nameTag = nameTag;
    }

    @ManyToMany(mappedBy = "tags",cascade = CascadeType.ALL)

    private List<Api> apis = new ArrayList<>();
}
