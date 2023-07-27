package com.w1d3.Lab3.controller;

import com.w1d3.Lab3.model.Category;
import com.w1d3.Lab3.model.Product;
import com.w1d3.Lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @PostMapping
    public void save(@RequestBody Category category){
        categoryService.save(category);

    }
    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAll();
    }
    @GetMapping ("/{id}")
    public Category getOne(@PathVariable Long id){
        return categoryService.getOne(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        categoryService.delete(id);
    }
    @GetMapping("/products")
    public List<Product> getProductByMaxPrice(@RequestParam double price){
        return  categoryService.getProductByMaxPrice(price);
    }
}
