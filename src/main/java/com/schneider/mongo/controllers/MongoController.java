package com.schneider.mongo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.schneider.mongo.dto.ProductDTO;
import com.schneider.mongo.repositories.IProductDAO;

@RestController
@RequestMapping("/api/products")
public class MongoController {
	
	@Autowired
	private IProductDAO repository;
	
	@PostMapping("/product")
	public ProductDTO create (@RequestBody ProductDTO p) {
		
		return repository.insert(p);
	}
	
	@GetMapping("/")
	public List<ProductDTO> readAll(){
		return repository.findAll();
	}
	
	@PutMapping("/product/{id}")
	public ProductDTO update(@PathVariable String id, @Validated @RequestBody ProductDTO p){
		return repository.save(p);
	} 
	
	@DeleteMapping("/product/{id}")
	public void delete (@PathVariable String id) {
		 repository.deleteById(id);
	}
	

}
