package com.narayan.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narayan.entity.Product;
import com.narayan.services.ProductServices;

@RestController
@RequestMapping("product")
public class ProductController {
	
	@Autowired
	ProductServices productService;
		
	@GetMapping("all-products")
	public ResponseEntity<List<Product>> getAllProducts(){
		
		List<Product> allProductsList = productService.getAllProducts();
		
		return new ResponseEntity<>(allProductsList, HttpStatus.OK);
	}	
	
	@GetMapping("productId/{pId}")
	public ResponseEntity<Product> getProductByID(@PathVariable("pId") int productId){
		
		Product productById = productService.getProductByID(productId);
		return new ResponseEntity<Product>(productById, HttpStatus.OK);
	}
	
	@GetMapping("{cartID}")
	public ResponseEntity<Collection<Product>> getProductsByCartID(@PathVariable("cartID") int cartID){
		
		Collection<Product> productsByCartID = productService.getProductsListByCartID(cartID);
		
		return new ResponseEntity<Collection<Product>>(productsByCartID, HttpStatus.OK);
		
	}
}



































