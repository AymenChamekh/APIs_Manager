package com.example.apis_manager.repository;

import com.example.apis_manager.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Long> {

    void deleteById(Long id);
}
