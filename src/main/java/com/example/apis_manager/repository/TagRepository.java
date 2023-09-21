package com.example.apis_manager.repository;

import com.example.apis_manager.entities.Api;
import com.example.apis_manager.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Long> {

    void deleteByIdTag(Long id);
    Tag findByNameTag(String name);
    List<Tag> findByApi(Api api);
}
