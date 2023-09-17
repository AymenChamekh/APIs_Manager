package com.example.apis_manager.services;

import com.example.apis_manager.entities.Api;
import com.example.apis_manager.entities.Provider;
import com.example.apis_manager.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProviderService {
    @Autowired
    ProviderRepository providerRepository;

    public void addProvider(Provider c){

        providerRepository.save(c);
    }
    public void deleteProvider(Long id){

        providerRepository.deleteByIdProvider(id);

    }

    public Provider getProviderById(Long id){


        return providerRepository.findById(id).get();

    }
    public List<Provider> getAllProviders(){
        List<Provider> listProvider = new ArrayList<>();
        listProvider = providerRepository.findAll();
        return listProvider;
    }

    public void updateProvider(Provider c){
        providerRepository.save(c);
    }
}
