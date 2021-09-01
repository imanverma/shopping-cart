package com.narayan.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narayan.entity.Cart;
import com.narayan.entity.Product;
import com.narayan.repository.CartRepository;
import com.narayan.repository.ProductRepository;

@Service
public class CartServicesIMPL implements CartServices {

	@Autowired
	CartRepository cartRepo;
	
	@Autowired
	ProductRepository productRepo;
	
	
	@Override
	public Cart getCartItemsByCartID(int cartID) {
		double totalPrice = 0;
		Cart cartDetailsByID = cartRepo.findById(cartID).orElse(null);
		
		Collection<Product> productsListBycartID = productRepo.getProductsByCartID(cartID);
		
		for(Product p : productsListBycartID) {
			totalPrice = totalPrice+p.getPrice();
		}
		if(cartDetailsByID.getPrice() == totalPrice)
			totalPrice = 0;
		else {
			cartDetailsByID.setPrice(totalPrice);
			cartDetailsByID.setQuantity(productsListBycartID.size());
			cartDetailsByID.setProductList(productsListBycartID);
		}
		
		Cart updatedCartDetails = cartRepo.save(cartDetailsByID);
		
		return updatedCartDetails;
	}

	@Override
	public Cart addItemsToCart(int cartid, Cart cart) {
			
		return null;
	}
}
