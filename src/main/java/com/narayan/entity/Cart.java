package com.narayan.entity;

import java.util.ArrayList;
import java.util.List;


public class Cart {
	
	private int cartID;
	private int quantity;	
	
	private List<Product> productList = new ArrayList<>();

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

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public Cart(int cartID, int quantity, List<Product> productList) {
		super();
		this.cartID = cartID;
		this.quantity = quantity;
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "Cart [cartID=" + cartID + ", quantity=" + quantity + ", productList=" + productList + "]";
	}
	
}
