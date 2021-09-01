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

import com.narayan.entity.Book;
import com.narayan.entity.Product;
import com.narayan.services.ProductServices;

@RestController
@RequestMapping("book")
public class BookController {
	
	@Autowired
	ProductServices productService;
	
	@PostMapping("add-book")
	public ResponseEntity<Product> registerBookAsProduct(@RequestBody Book book){
		
		Product addedProduct = productService.addProduct(book);
		
		return new ResponseEntity<Product>(addedProduct, HttpStatus.OK);
	}
	@PostMapping("add-allbooks")
	public ResponseEntity<List<Book>> addAllBooks(@RequestBody List<Book> booksList){
		
		List<Book> addedBooksList = productService.addAllBooks(booksList);
		
		return new ResponseEntity<List<Book>>(addedBooksList,HttpStatus.OK);
	}	
	
	@GetMapping("all-books")
	public ResponseEntity<List<Book>> getAllBooks(){
		
		List<Book> allBooks = productService.getAllBooks();
		
		return new ResponseEntity<>(allBooks, HttpStatus.OK);
	}

	@PutMapping("update/{id}")
	public ResponseEntity<Book> updateProductDetails(@PathVariable("id") int id, @RequestBody Book book){
		
		Book updatedBook = productService.updateBookDetails(id, book);
		return new ResponseEntity<Book>(updatedBook, HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{productID}")
	public ResponseEntity<String> deleteApparal(@PathVariable("productID") int bookID){
		
		String deletedBook = productService.deleteBook(bookID);
		
		return new ResponseEntity<String>(deletedBook, HttpStatus.OK);
		
	}	
	
}
