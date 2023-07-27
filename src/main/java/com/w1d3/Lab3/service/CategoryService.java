package com.w1d3.Lab3.service;

import com.w1d3.Lab3.model.Category;
import com.w1d3.Lab3.model.Product;

import java.util.List;

public interface CategoryService {
    void save(Category category);

    Category getOne(Long id);

    List<Category> getAll();

    void delete(Long id);

    List<Product> getProductByMaxPrice(double price);
}
