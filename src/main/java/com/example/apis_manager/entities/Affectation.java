package com.example.apis_manager.entities;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.ZoneId;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Affectation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_affectation;

    @ManyToOne
    @JoinColumn(name = "idApi")
    private Api api;

    @ManyToOne
    @JoinColumn(name = "idConsumer")
    private Consumer  consumer;

    private LocalDate affectationDate = LocalDate.now(ZoneId.of("Europe/Paris"));
}
