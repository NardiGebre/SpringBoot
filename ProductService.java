package com.Nardos.Restaurant;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
		
	}
	public Optional<Product> getProductByID(Long id) {
		return productRepository.findById(id);
	}

}
