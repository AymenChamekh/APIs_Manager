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
@Table(name="Consumer")
public class Consumer extends Organization{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsumer;
    private String sector;

    @OneToMany(mappedBy = "consumer")
    private List<Affectation> listApiConsumed = new ArrayList<>();
}
