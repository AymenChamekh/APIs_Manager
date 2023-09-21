package com.example.apis_manager.services;

import com.example.apis_manager.dto.ApiDTO;
import com.example.apis_manager.entities.Api;
import com.example.apis_manager.entities.Method;
import com.example.apis_manager.entities.Tag;
import com.example.apis_manager.repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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


    public void deleteApi(Long id){
        apiRepository.deleteById(id);
    }


    public ApiDTO getApiById(Long id){

        ApiDTO apiDTO = new ApiDTO();
             Api api =   apiRepository.findById(id).get();
             return apiDTO.fromEntity(api);
    }

    public void updateApi(Api api){
        this.getApiById(api.getIdApi());
        apiRepository.save(api);
    }
    public List<ApiDTO> getAllApis(){
        ApiDTO apiDTO = new ApiDTO();
        List<ApiDTO> apisDto =new ArrayList<>();
        List<Api> apis = apiRepository.findAll();
        for(Api api : apis){
                 apisDto.add(apiDTO.fromEntity(api));
             }
        return apisDto;
    }

}
