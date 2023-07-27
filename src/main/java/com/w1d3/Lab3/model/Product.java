package com.w1d3.Lab3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int rating;
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)

    private List<Review> reviews;

    public Product(String name, double price, int rating, String categoryName) {
        Category category1 = new Category(categoryName);
        this.category = category1;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    public void addReview(Review review){
        reviews.add(review);
    }
}
