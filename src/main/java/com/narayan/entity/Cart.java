package com.narayan.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue
	private int cartID;
	private int quantity;
	private double price;
	
	@OneToMany(mappedBy = "cart")
	private Collection<Product> productList = new ArrayList<>();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price2) {
		this.price = price2;
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Collection<Product> getProductList() {
		return productList;
	}

	public void setProductList(Collection<Product> productList) {
		this.productList = productList;
	}

	public Cart(int cartID, int quantity, List<Product> productList) {
		super();
		this.cartID = cartID;
		this.quantity = quantity;
		this.productList = productList;
	}
	
	public Cart(int cartID, int quantity, double price, Collection<Product> productList) {
		super();
		this.cartID = cartID;
		this.quantity = quantity;
		this.price = price;
		this.productList = productList;
	}

	public Cart() {
		super();
	}

	@Override
	public String toString() {
		return "Cart [cartID=" + cartID + ", quantity=" + quantity + ", productList=" + productList +", total amount="+ price + "]";
	}
	
}
