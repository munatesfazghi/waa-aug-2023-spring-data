package com.w1d3.Lab3.impl;

import com.w1d3.Lab3.model.Category;
import com.w1d3.Lab3.model.Product;
import com.w1d3.Lab3.repository.CategoryRepository;
import com.w1d3.Lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public void save(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category getOne(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public List<Product> getProductByMaxPrice(double price) {
        return categoryRepository.findAllProductsInCategory(price);
    }
}
