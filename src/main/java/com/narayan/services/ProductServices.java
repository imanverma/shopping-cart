package com.narayan.services;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.narayan.entity.Apparal;
import com.narayan.entity.Book;
import com.narayan.entity.Product;

@Service
public interface ProductServices {
	
	public List<Product> getAllProducts();
	public Product getProductByID(int prodId);
	public Product addProduct(Product product);
	public List<Book> addAllBooks(List<Book> productsList);
	public List<Apparal> addAllApparals(List<Apparal> apparalList);
	
	public List<Book> getAllBooks();
	public List<Apparal> getAllApparals();
	public Book updateBook(Product productByID);
	public Book updateBookDetails(int id, Book product);
	public Apparal updateApparalDetails(int id, Apparal apparal);
	public String deleteApparal(int apparalID);
	public String deleteBook(int bookID);
	
	public Collection<Product> getProductsListByCartID(int cartID);

}
