package com.w1d3.Lab3.service;

import com.w1d3.Lab3.model.Product;
import com.w1d3.Lab3.model.Review;

import java.util.List;

public interface ProductService {
    void save(Product product);

    List<Product> getAll();

    Product getOne(Long id);

    void delete(Long id);

    List<Product> findAllByMinPrice(double price);

    List<Product> findAllByName(String keyword);

    List<Review> getReviewsById(Long id);
}
