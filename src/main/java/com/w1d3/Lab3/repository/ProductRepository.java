package com.w1d3.Lab3.repository;

import com.w1d3.Lab3.model.Product;
import com.w1d3.Lab3.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByPriceLessThan(double price);
    List<Product> findAllByNameContainingIgnoreCase(String name);

    @Query("select r from Product p join p.reviews r where r.id = ?1")
    List<Review> getReviewsById(Long id);
}
