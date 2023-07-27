package com.w1d3.Lab3.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "user")
    private List<Review> reviews;
    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Address address;

    public User(String email, String password, String firstName, String lastName, String street, String zip, String city) {
        Address address1 = new Address(street, zip, city);
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address1;
      //  address1.setUser(this);

    }
    public void addReview(Review review){
        reviews.add(review);
    }
}
