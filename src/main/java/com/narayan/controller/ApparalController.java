package com.narayan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narayan.entity.Apparal;
import com.narayan.entity.Product;
import com.narayan.services.ProductServices;

@RestController
@RequestMapping("apparal")
public class ApparalController {
	
	@Autowired
	ProductServices productService;

	@PostMapping("add-apparal")
	public ResponseEntity<Product> registerApparalAsProduct(@RequestBody Apparal apparal){
		
		Product addedProduct = productService.addProduct(apparal);
		
		return new ResponseEntity<Product>(addedProduct, HttpStatus.OK);
		
	}	
	@PostMapping("add-allapparals")
	public ResponseEntity<List<Apparal>> addAllApparals(@RequestBody List<Apparal> apparalList){
		
		List<Apparal> addedApparalsList = productService.addAllApparals(apparalList);
		
		return new ResponseEntity<List<Apparal>>(addedApparalsList,HttpStatus.OK);
	}
	
	@GetMapping("all-apparals")
	public ResponseEntity<List<Apparal>> getAllApparal(){
		
		List<Apparal> allBooks = productService.getAllApparals();
		
		return new ResponseEntity<>(allBooks, HttpStatus.OK);
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Apparal> updateApparalDetails(@PathVariable("id") int apparalID, @RequestBody Apparal product){
		
		Apparal updatedApparal = productService.updateApparalDetails(apparalID, product);
		return new ResponseEntity<Apparal>(updatedApparal, HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{productID}")
	public ResponseEntity<String> deleteApparal(@PathVariable("productID") int apparalID){
		
		String deletedApparal = productService.deleteApparal(apparalID);
		
		return new ResponseEntity<String>(deletedApparal, HttpStatus.OK);
	}
	
}























