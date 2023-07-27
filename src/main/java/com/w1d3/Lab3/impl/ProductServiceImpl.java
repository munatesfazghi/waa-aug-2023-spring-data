package com.w1d3.Lab3.impl;

import com.w1d3.Lab3.model.Product;
import com.w1d3.Lab3.model.Review;
import com.w1d3.Lab3.repository.ProductRepository;
import com.w1d3.Lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getOne(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> findAllByMinPrice(double price) {
        return productRepository.findAllByPriceLessThan(price);
    }

    @Override
    public List<Product> findAllByName(String keyword) {
        return productRepository.findAllByNameContainingIgnoreCase(keyword);
    }

    @Override
    public List<Review> getReviewsById(Long id) {
        return productRepository.getReviewsById(id);
    }


}
