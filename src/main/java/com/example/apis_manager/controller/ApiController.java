package com.example.apis_manager.controller;

import com.example.apis_manager.entities.Api;
import com.example.apis_manager.entities.Provider;
import com.example.apis_manager.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    ApiService apiService;

    @PostMapping("/add")
    public void addApi(@RequestBody Api api){
        apiService.addApi(api);
    }
}
