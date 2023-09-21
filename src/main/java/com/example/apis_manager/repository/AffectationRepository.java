package com.example.apis_manager.repository;

import com.example.apis_manager.entities.Affectation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AffectationRepository extends JpaRepository<Affectation, Long> {
}
