package com.danhart.demo.service;
import org.springframework.stereotype.Service;
import com.danhart.demo.model.Product;
import java.util.*;

@Service
public class ProductService {
	private List<Product> products = new ArrayList<>();
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public List<Product> findAll() {
		return products;
	}
}
