package com.example.apis_manager.services;

import com.example.apis_manager.entities.Affectation;
import com.example.apis_manager.repository.AffectationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AffectationService {
    @Autowired
    AffectationRepository affectationRepository;

    public void addAffectation(Affectation a){
        affectationRepository.save(a);
    }
    public void deleteAffectationById(Long id){
        affectationRepository.deleteById(id);
    }

}
