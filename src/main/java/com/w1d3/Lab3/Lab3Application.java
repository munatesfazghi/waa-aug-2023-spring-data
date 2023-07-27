package com.w1d3.Lab3;

import com.w1d3.Lab3.model.Product;
import com.w1d3.Lab3.model.Review;
import com.w1d3.Lab3.model.User;
import com.w1d3.Lab3.repository.ProductRepository;
import com.w1d3.Lab3.repository.ReviewRepository;
import com.w1d3.Lab3.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab3Application implements CommandLineRunner {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	ReviewRepository reviewRepository;
    @Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(Lab3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Product product = new Product("Shampoo", 7.99, 3, "HairProducts");
		Product product1 = new Product("Lotion", 9.99, 5, "Fragnance");
//		User user = new User("muna@gmail.com", "pwd1", "Muna", "Haile","4th Street", "52557", "FaireField");
//		Review review = new Review("Love this Product");
//		review.setUser(user);
//		review.setProduct(product);
//
//		//user.addReview(review);
//
//		productRepository.save(product);
//		productRepository.save(product1);
//		userRepository.save(user);
//		reviewRepository.save(review);
        Review review = new Review("i hate this product");
		User user1 = new User("selam@gmail.com", "pwd2", "Selam", "Tekleab", "5th St", "52228", "Toronto");
		review.setUser(user1);
		review.setProduct(product1);


		productRepository.save(product1);
		userRepository.save(user1);
		reviewRepository.save(review);
	}
}
