package com.narayan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.narayan.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	/*
	 * @Query("Select p from Product p where product_type = ?1") public
	 * List<Product> findAllProductsByProductType(String productType);
	 */

}
