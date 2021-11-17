package com.lti.SpringBootApp2.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.SpringBootApp2.model.Product;

@Repository
public class ProductDAO {
	
	public static ArrayList<Product> productList=new ArrayList<>();
	
	public Product addProduct(Product product) {
		productList.add(product);
		return product;
	}
	
	public List<Product> getallProducts() {
		return productList;
	}

}