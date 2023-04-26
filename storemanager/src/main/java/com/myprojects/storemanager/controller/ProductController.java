package com.myprojects.storemanager.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.myprojects.storemanager.products.product;
import com.myprojects.storemanager.repository.ProductRepository;
import com.myprojects.storemanager.exception.ResoruceNotFoundException;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<product> getAllProducts(){
		return this.productRepository.findAll();
	}
	
	@PostMapping("/products")
	public product createProduct(@RequestBody product prod)
	{
		return productRepository.save(prod);
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<product> getProductById(@PathVariable Long id) throws ResoruceNotFoundException
	{
		product prod=productRepository.findById(id).orElseThrow(()->new ResoruceNotFoundException("Product doesnt exist with id :" +id));
		return ResponseEntity.ok(prod);
	}
	
}
