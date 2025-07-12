package com.lucas.movieflix.controller;

import com.lucas.movieflix.entity.Category;
import com.lucas.movieflix.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/movieflix/category")
@RequiredArgsConstructor
public class CategoryController {


    private final CategoryService categoryService;

    @GetMapping()
    public List<Category> getAllCategories(){
        return categoryService.findAll();
    }

}
