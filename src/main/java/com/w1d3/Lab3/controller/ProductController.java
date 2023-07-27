package com.w1d3.Lab3.controller;

import com.w1d3.Lab3.model.Product;
import com.w1d3.Lab3.model.Review;
import com.w1d3.Lab3.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public void save(@RequestBody Product product){
        productService.save(product);
    }

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }
    @GetMapping("/{id}")
    public Product getOne(@PathVariable Long id){
        return productService.getOne(id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        productService.delete(id);
    }
    @GetMapping("/byPrice")
    public List<Product> findAllByMinPrice(@RequestParam double price){
        return productService.findAllByMinPrice(price);
    }
    @GetMapping("/byName")
    public List<Product> findAllByName(@RequestParam String keyword){
        return productService.findAllByName(keyword);
    }
    @GetMapping("/reviews")
    public List<Review> getAllReviewsById(@RequestParam Long id){
        return  productService.getReviewsById(id);
    }

}
