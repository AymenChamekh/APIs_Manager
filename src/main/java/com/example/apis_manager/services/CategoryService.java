package com.example.apis_manager.services;

import com.example.apis_manager.entities.Category;
import com.example.apis_manager.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public void addCategory(Category c){

        categoryRepository.save(c);
    }
    public void deleteCategory(Long id){

        categoryRepository.deleteById(id);

    }

    public Category getCategoryById(Long id){

        return categoryRepository.findById(id).get();
    }
    public List<Category> getAllCategory(){
        List<Category> listCategory = new ArrayList<>();
        listCategory = categoryRepository.findAll();
        return listCategory;
    }

    public void updateCategory(Category c){
        categoryRepository.save(c);
    }
}
