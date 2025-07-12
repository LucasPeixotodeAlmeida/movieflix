package com.lucas.movieflix.service;

import com.lucas.movieflix.entity.Category;
import com.lucas.movieflix.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();
    }
}
