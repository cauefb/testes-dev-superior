package com.devsuperior.dscatalog.tests;

import java.time.Instant;

import com.devsuperior.dscatalog.dto.ProductDTO;
import com.devsuperior.dscatalog.entities.Category;
import com.devsuperior.dscatalog.entities.Product;

public class Factory {
	
	public static Product creatProduct() {
		Product product = new Product (1L, "Phone", "God Phone", 800.0, "https://img.com/img.png", Instant.parse("2020-10-20t03:00:00z"));
		product.getCategories().add(new Category(2L, "Eletronics"));
		return product;
	}
	
	public static ProductDTO createProductDto() {
		Product product = creatProduct();
		return new ProductDTO(product, product.getCategories());
	}
}
