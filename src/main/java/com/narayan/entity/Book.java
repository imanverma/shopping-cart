package com.narayan.entity;

import javax.persistence.Entity;

@Entity
public class Book extends Product {
	
	private String genre;
	private String author;
	private String description;
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [genre=" + genre + ", author=" + author + ", description=" + description + ", getProductType()="
				+ getProductType() + ", getProductId()=" + getProductId() + ", getProductName()=" + getProductName()
				+ ", getPrice()=" + getPrice() + "]";
	}	
}
