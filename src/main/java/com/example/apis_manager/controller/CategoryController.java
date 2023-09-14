package com.example.apis_manager.controller;

import com.example.apis_manager.entities.Category;
import com.example.apis_manager.repository.CategoryRepository;
import com.example.apis_manager.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    CategoryService categoryService;
    @PostMapping("/add")
    public void addCategory(@RequestBody Category c){
        categoryService.addCategory(c);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable("id") Long id){
        categoryService.deleteCategory(id);
    }

    @GetMapping("/find/{id}")
    public Category getCategoryById(@PathVariable("id") Long id){
      return  categoryService.getCategoryById(id);
    }
    @GetMapping("/findAll")
    public List<Category> getAllCategory(){
        return  categoryService.getAllCategory();
    }

    @PutMapping("/update")
    public void updateCategory(@RequestBody Category c){
        categoryService.updateCategory(c);
    }
}
