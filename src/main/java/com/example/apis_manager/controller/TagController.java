package com.example.apis_manager.controller;

import com.example.apis_manager.entities.Provider;
import com.example.apis_manager.entities.Tag;
import com.example.apis_manager.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {
    @Autowired
    TagService tagService;

    @GetMapping("/findAll")
    public List<Tag> getAllTags(){
        return  tagService.getAllTag();
    }
}
