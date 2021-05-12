package com.csi.repos;

import org.springframework.data.repository.CrudRepository;

import com.csi.Product.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
