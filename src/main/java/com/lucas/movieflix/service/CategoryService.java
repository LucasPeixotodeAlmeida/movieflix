package com.lucas.movieflix.service;

import com.lucas.movieflix.entity.Category;
import com.lucas.movieflix.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category saveCategory(Category category){
        return repository.save(category);
    }
}

