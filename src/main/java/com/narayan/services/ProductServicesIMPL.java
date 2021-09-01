package com.narayan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narayan.entity.Apparal;
import com.narayan.entity.Book;
import com.narayan.entity.Product;
import com.narayan.repository.ApparalRepository;
import com.narayan.repository.BookRepository;
import com.narayan.repository.ProductRepository;

@Service
public class ProductServicesIMPL implements ProductServices{

	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	BookRepository bookRepo;
	
	@Autowired
	ApparalRepository appralRepo;
	
	@Override
	public Product addProduct(Product product) {
		
		Product addedProduct = productRepo.save(product);
		
		return addedProduct;
	}
	
	@Override
	public Book updateBook(Product book) {
		
		Book updatedBook = (Book) productRepo.save(book);
		return updatedBook;
	}
	
	@Override
	public List<Book> addAllBooks(List<Book> booksList) {
		
		List<Book> addedBooksList = productRepo.saveAll(booksList);
		
		return addedBooksList;
	}
	
	@Override
	public List<Apparal> addAllApparals(List<Apparal> apparalList) {
		
		List<Apparal> addedApparalsList = productRepo.saveAll(apparalList);
		
		return addedApparalsList;
	}
	
	@Override
	public List<Product> getAllProducts() {
		
		List<Product> allProducts = productRepo.findAll();
		
		return allProducts;
	}

	@Override
	public Product getProductByID(int prodId) {

		Product prodById = productRepo.findById(prodId).orElse(null);

		return prodById;
	}

	@Override
	public List<Book> getAllBooks() {
		
		List<Book> allBooks = bookRepo.findAll();
		
		return allBooks;
	}

	@Override
	public List<Apparal> getAllApparals() {

		List<Apparal> allApparals = appralRepo.findAll() ;
		
		return allApparals;
	}

	@Override
	public Book updateBookDetails(int id, Book book) {

		Book existingBook = (Book) productRepo.findById(id).orElse(null);
		Book updatedBook = null;
		
		if(existingBook != null) {
			if(book.getPrice() != 0 || book.getPrice() > 0)
				existingBook.setPrice(book.getPrice());
			if(book.getProductType() != null)
				existingBook.setProductType(book.getProductType());
			if(book.getProductName() != null)
				existingBook.setProductName(book.getProductName());
			if(book.getGenre()!=null)
				existingBook.setGenre(book.getGenre());
			if(book.getAuthor() != null)
				existingBook.setAuthor(book.getAuthor());
			if(book.getDescription() != null) {
				existingBook.setDescription(book.getDescription());
			}
			updatedBook = (Book) productRepo.save(existingBook);
		}
		return updatedBook;
	}
	
	@Override
	public Apparal updateApparalDetails(int id, Apparal apparal) {

		Apparal existingApparal = (Apparal) productRepo.findById(id).orElse(null);
		Apparal updatedApparal = null;
		
		if(existingApparal != null) {
			if(apparal.getPrice() != 0 || apparal.getPrice() > 0)
				existingApparal.setPrice(apparal.getPrice());
			if(apparal.getProductType() != null)
				existingApparal.setProductType(apparal.getProductType());
			if(apparal.getProductName() != null)
				existingApparal.setProductName(apparal.getProductName());
			if(apparal.getBrand()!=null)
				existingApparal.setBrand(apparal.getBrand());
			if(apparal.getDesign() != null)
				existingApparal.setDesign(apparal.getDesign());
			if(apparal.getType() != null) {
				existingApparal.setType(apparal.getType());
			}
			updatedApparal = (Apparal) productRepo.save(existingApparal);
		}
		return updatedApparal;
	}
	@Override
	public String deleteApparal(int apparalID) {
		
		appralRepo.deleteById(apparalID);
		
		return "Apparal of ID: "+apparalID+" is deleted.";
	}
	
	@Override
	public String deleteBook(int bookID) {
		bookRepo.deleteById(bookID);
		return "Book of ID: "+bookID+"  is deleted.";
	}
	
}

















