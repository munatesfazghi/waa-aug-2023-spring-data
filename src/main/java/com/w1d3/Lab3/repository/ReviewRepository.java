package com.w1d3.Lab3.repository;

import com.w1d3.Lab3.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;


public interface ReviewRepository extends JpaRepository<Review, Long> {
}
