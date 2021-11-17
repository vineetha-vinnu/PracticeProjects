package com.lti.SpringBootApp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.SpringBootApp2.model.Product;

@RestController
public class ProductController {

	@RequestMapping("/productdetails")
	public String getProductdetails() {
		return "Product details are here.......";
	}
	@GetMapping("/Oneproductdetails")
	public String getOneProductdetails() {
		return "Single Product details are here.......";
	}
	@PostMapping("/addproduct")
	public String addproduct(@RequestBody Product product) {
		return "Adding Product done  here.......";
	}
}
