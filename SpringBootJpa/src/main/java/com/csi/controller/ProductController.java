package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.csi.Product.Product;
import com.csi.services.ProductService;


@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productServiceImpl;

	@GetMapping("/getdata")
	public List<Product> getData() {
		return productServiceImpl.getdata();
	}

	

	@PostMapping("/savedata")
	public String saveData(@RequestBody Product product) {
		productServiceImpl.saveData(product);
		return "Product Data save successfully";
	}

	@PutMapping("/updatedata/{productId}")
	public String updateData(@PathVariable("productId") int productId, @RequestBody Product product) {
		productServiceImpl.updateData(productId, product);
		return "Product Data updated successfully";
	}

	@DeleteMapping("/deletedata/{productId}")
	public String deleteData(@PathVariable("productId") int productId) {
		productServiceImpl.deleteData(productId);
		return "Product data deleted successfully";
	}
}
