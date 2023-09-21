package com.example.apis_manager.services;

import com.example.apis_manager.entities.Api;
import com.example.apis_manager.entities.Category;
import com.example.apis_manager.entities.Tag;
import com.example.apis_manager.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TagService {
    @Autowired
    TagRepository tagRepository;

    public Tag getByName(String name){
       return tagRepository.findByNameTag(name);

    }
    public Tag getTagById(Long id){

        return tagRepository.findById(id).get();
    }
    public List<Tag> getAllTag(){
        List<Tag> listTags = new ArrayList<>();
        listTags = tagRepository.findAll();
        return listTags;
    }

    public void addTag(Tag tag) {
        tagRepository.save(tag);
    }

    public int getOccurence(String name) {
        List<Tag> tags = this.getAllTag();
        int i = 0;
        for (Tag t : tags) {
            if (t.getNameTag().equalsIgnoreCase(name)) {
                i++;
            }
        }
        return i;
    }
    public Map<String , Integer> getTagOccurence(){
        Map<String , Integer> tagsOccurence = new HashMap<>();
        List<Tag> tags = this.getAllTag();
        for(Tag t:tags){
            String s =t.getNameTag();
            int i = this.getOccurence(t.getNameTag());
            tagsOccurence.put(s,i);
        }
        return tagsOccurence;
    }

}


