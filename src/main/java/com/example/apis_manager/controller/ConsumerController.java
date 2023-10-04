package com.example.apis_manager.controller;

import com.example.apis_manager.entities.Consumer;
import com.example.apis_manager.services.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;

    @PostMapping("/add")
    public void addConsumer(@RequestBody Consumer c){
        consumerService.addConsumer(c);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteConsumer(@PathVariable("id") Long id){
        consumerService.deleteConsumer(id);
    }

    @GetMapping("/find/{id}")
    public Consumer getConsumerById(@PathVariable("id") Long id){
        return  consumerService.getConsumerById(id);
    }
    @GetMapping("/findAll")
    public List<Consumer> getAllConsumer(){
        return  consumerService.getAllConsumers();
    }

    @PutMapping("/update")
    public void updateConsumer(@RequestBody Consumer c){
        consumerService.updateConsumer(c);
    }
}
