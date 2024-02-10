package com.Nardos.Restaurant;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceTests {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductService productService;
	
@Test 
public void createProduct() {
Product product = new Product();
 	product.setName("pencil");
	product.setPrice(17.88);

Product result = productService.createProduct(product);
	assertEquals("pencil", result.getName());
	}
	@Test
	public void getProductByID() {
					
			Optional<Product> result = productService.getProductByID(7L);
			assertEquals("pencil", result.get().getName());
		
	}
}
