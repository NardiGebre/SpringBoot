package com.Nardos.Restaurant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)

public class ProductServiceMockTest {
	
@Mock
ProductRepository productRepository;

@InjectMocks
ProductService productService;

@Test
public void createProduct() {
	Product product = new Product ();
	product.setName("book");
	product.setPrice(170.88);
	
	when(productRepository.save(product)).thenReturn(product);
	Product result = productService.createProduct(product);
	assertEquals("book", result.getName());
}
}


