package com.csi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.csi.Product.Product;
import com.csi.repos.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repos;

	public List<Product> getdata() {
		return (List<Product>) ((CrudRepository<Product, Integer>) repos).findAll();
	}

	public void saveData(Product product) {
		((CrudRepository<Product, Integer>) repos).save(product);
	}

	public void updateData(int productId, Product product) {
		((CrudRepository<Product, Integer>) repos).save(product);
	}

	public void deleteData(int productId) {
		((CrudRepository<Product, Integer>) repos).deleteById(productId);
		;
	}

}
