package com.example.apis_manager.services;

import com.example.apis_manager.entities.Consumer;
import com.example.apis_manager.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsumerService {
    @Autowired
    ConsumerRepository consumerRepository;

    public void addConsumer(Consumer c){

        consumerRepository.save(c);
    }
    public void deleteConsumer(Long id){

        consumerRepository.deleteByIdConsumer(id);

    }

    public Consumer getConsumerById(Long id){


        return consumerRepository.findById(id).get();

    }
    public List<Consumer> getAllConsumers(){
        List<Consumer> listConsumer = new ArrayList<>();
        listConsumer = consumerRepository.findAll();
        return listConsumer;
    }

    public void updateConsumer(Consumer c){
        consumerRepository.save(c);
    }
}
