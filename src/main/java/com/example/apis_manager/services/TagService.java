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


        Tag existingTag = tagRepository.findByNameTag(tag.getNameTag());

        if (existingTag != null) {
            // Tag already exists, just increment the occurrence
            existingTag.setOccurence(existingTag.getOccurence() + 1);
            tagRepository.save(existingTag);

        } else {
            // Tag doesn't exist yet, add it
            existingTag = tag;
            tagRepository.save(existingTag);
        }



    }

}


     /* Tag existingTag = tagRepository.findByNameTag(tag.getNameTag());

        if (existingTag != null) {
            // Le tag existe déjà, mettez à jour l'occurrence
            existingTag.setOccurence(existingTag.getOccurence() + 1);
            existingTag.setIdTag(existingTag.getIdTag());
            tagRepository.save(existingTag);
        } else {
            // Le tag n'existe pas encore, ajoutez-le
            tagRepository.save(tag);
        }
    }*/