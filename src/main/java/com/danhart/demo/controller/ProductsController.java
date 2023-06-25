package com.danhart.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.danhart.demo.model.Product;

import com.danhart.demo.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductsController {
	//private final ProductService productService;
	private ProductService productService;
	
	public ProductsController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping
	public String viewProducts(Model model) {
		var products = productService.findAll();
		model.addAttribute("prodcuts", products);
		
		return "products.html";
	}
	
	@PostMapping
	public String addProduct(
		@RequestParam String name,
		@RequestParam double price,
		Model model
	) {
		Product p = new Product();
		p.setName(name);
		p.setPrice(price);
		productService.addProduct(p);
	
		var products = productService.findAll();
		model.addAttribute("products", products);
	
		return "products.html";
	}
}