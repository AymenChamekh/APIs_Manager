package com.example.apis_manager.controller;


import com.example.apis_manager.entities.Provider;
import com.example.apis_manager.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @PostMapping("/add")
    public void addProvider(@RequestBody Provider p){
        providerService.addProvider(p);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProvider(@PathVariable("id") Long id){
        providerService.deleteProvider(id);
    }

    @GetMapping("/find/{id}")
    public Provider getProviderById(@PathVariable("id") Long id){
        return  providerService.getProviderById(id);
    }
    @GetMapping("/findAll")
    public List<Provider> getAllProvider(){
        return  providerService.getAllProviders();
    }

    @PutMapping("/update")
    public void updateProvider(@RequestBody Provider p){
        providerService.updateProvider(p);
    }
}
