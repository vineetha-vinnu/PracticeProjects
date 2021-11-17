package com.lti.SpringBootApp2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.SpringBootApp2.DAO.ProductDAO;
import com.lti.SpringBootApp2.model.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO productDao;
	
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}
	
	
	public List<Product> getAllProducts() {
		return productDao.getallProducts();
		
	}
}
