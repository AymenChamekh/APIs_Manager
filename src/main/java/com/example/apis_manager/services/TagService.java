package com.example.apis_manager.services;

import com.example.apis_manager.entities.Category;
import com.example.apis_manager.entities.Tag;
import com.example.apis_manager.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagService {
    @Autowired
    TagRepository tagRepository;

    public Tag getTagById(Long id){

        return tagRepository.findById(id).get();
    }
    public List<Tag> getAllTag(){
        List<Tag> listTags = new ArrayList<>();
        listTags = tagRepository.findAll();
        return listTags;
    }
    public void addTag(Tag tag){

        List<Tag> listTags = getAllTag();
        for(Tag t:listTags){

                if(tag.getNameTag().equalsIgnoreCase(t.getNameTag())){
                    t.setOccurence(t.getOccurence()+1);
                } else{
                tagRepository.save(tag);
            }
            }


    }
}
