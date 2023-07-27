package com.w1d3.Lab3.repository;

import com.w1d3.Lab3.model.Category;
import com.w1d3.Lab3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CategoryRepository extends JpaRepository<Category, Long> {
    @Query("select distinct p from Category c join c.products p where p.price> ?1")
    List<Product> findAllProductsInCategory(double price);
}
