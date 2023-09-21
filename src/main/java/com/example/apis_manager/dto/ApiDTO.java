package com.example.apis_manager.dto;

import com.example.apis_manager.entities.Api;
import com.example.apis_manager.entities.Method;
import com.example.apis_manager.entities.State;
import com.example.apis_manager.entities.Tag;
import com.example.apis_manager.services.TagService;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Data

public class ApiDTO {

    private Long idApi;

    private String nameApi;

    private float version;

    private LocalDate creationDate;

    private Set<Method> methods;

    private State  apiState;

    private String apiType;

    private String apiProvider;

    private String apiCategory;

    private List<String> tags;


    public ApiDTO fromEntity(Api api){
        ApiDTO apiDTO = new ApiDTO();
        TagService tagService ;
        if(api==null){
            return null;
        }

        apiDTO.setIdApi(api.getIdApi());
        apiDTO.setNameApi(api.getNameApi());
        apiDTO.setVersion(api.getVersion());
        apiDTO.setCreationDate(api.getCreationDate());
        apiDTO.setMethods(api.getMethods());
        apiDTO.setApiState(api.getApiState());
        apiDTO.setApiType(api.getApiType().toString());
        apiDTO.setApiProvider(api.getApiProvider().getName());
        apiDTO.setApiCategory(api.getApiCategory().getNameCategory());

        List<Tag> tags = api.getTags();
        List<String> namesTags = new ArrayList<>();
        for(Tag t : tags){
            namesTags.add(t.getNameTag());
        }
        apiDTO.setTags(namesTags);

        return apiDTO;
    }


}
