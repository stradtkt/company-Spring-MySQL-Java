package com.stradtkt.mvccrud.dao;

import java.util.List;

import com.stradtkt.mvccrud.entity.Product;

public interface ProductDao {
	public List<Product> getProducts();
	public void saveProduct(Product theProduct);
	public Product getProduct(int theId);
	public void deleteProduct(int theId);
}
