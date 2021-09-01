package com.narayan.services;

import com.narayan.entity.Cart;

public interface CartServices {
	
	public Cart getCartItemsByCartID(int cartID);

	public Cart addItemsToCart(int cartid, Cart cart);
}
