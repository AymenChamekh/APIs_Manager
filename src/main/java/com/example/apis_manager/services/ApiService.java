package com.example.apis_manager.services;

import com.example.apis_manager.entities.Api;
import com.example.apis_manager.entities.Tag;
import com.example.apis_manager.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {
    @Autowired
    ApiRepository apiRepository;

    @Autowired
    TagService tagService;
    @Autowired
    ProviderService providerService;
    @Autowired
    CategoryService categoryService;

    public void addApi(Api api) {

        List<Tag> tags = api.getTags();
        Api a = apiRepository.save(api);

        for(Tag t : tags){
            t.setApi(a);
            tagService.addTag(t);
        }



    }

}
