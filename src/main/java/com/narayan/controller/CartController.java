package com.narayan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.narayan.entity.Cart;
import com.narayan.services.CartServices;

@RestController
@RequestMapping("cart")
public class CartController {

	@Autowired
	CartServices cartService;
	
	@GetMapping("{cartid}")
	public ResponseEntity<Cart> getCartItemsByCartID(@PathVariable("cartid") int cartID) {
		Cart cartDetailsByID = cartService.getCartItemsByCartID(cartID);
		return new ResponseEntity<Cart>(cartDetailsByID, HttpStatus.OK);
	}	
	@PostMapping("add-items/{cartid}")
	public ResponseEntity<Cart> addItemstoCart(@PathVariable("cartid") int cartid, @RequestBody Cart cart){		
		Cart cartDetails = cartService.addItemsToCart(cartid, cart);
		return new ResponseEntity<Cart>(cartDetails, HttpStatus.OK);
	}
}
