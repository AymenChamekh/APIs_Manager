package com.example.apis_manager.controller;

import com.example.apis_manager.entities.Affectation;
import com.example.apis_manager.entities.Category;
import com.example.apis_manager.services.AffectationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/affectation")
public class AffectationController {
    @Autowired
    AffectationService affectationService;

    @PostMapping("/add")
    public void Affectation(@RequestBody Affectation a){
        affectationService.addAffectation(a);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAffectation(@PathVariable("id") Long id){
        affectationService.deleteAffectationById(id);
    }
}
