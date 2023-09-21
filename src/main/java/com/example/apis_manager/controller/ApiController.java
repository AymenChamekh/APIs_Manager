package com.example.apis_manager.controller;

import com.example.apis_manager.dto.ApiDTO;
import com.example.apis_manager.entities.Api;
import com.example.apis_manager.entities.Category;
import com.example.apis_manager.entities.Provider;
import com.example.apis_manager.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    ApiService apiService;

    @PostMapping("/add")
    public void addApi(@RequestBody Api api){
        apiService.addApi(api);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteApi(@PathVariable("id") Long id){
        apiService.deleteApi(id);
    }

    @GetMapping("/find/{id}")
    public ApiDTO getApiById(@PathVariable("id") Long id){
        return  apiService.getApiById(id);
    }
    @GetMapping("/findAll")
    public List<ApiDTO> getAllApis(){
        return  apiService.getAllApis();
    }

    @PutMapping("/update")
    public void updateApi(@RequestBody Api api){
        apiService.updateApi(api);
    }
}
