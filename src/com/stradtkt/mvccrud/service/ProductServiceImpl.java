package com.stradtkt.mvccrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stradtkt.mvccrud.dao.ProductDao;
import com.stradtkt.mvccrud.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getProducts() {
		return productDao.getProducts();
	}

	@Override
	public void saveProduct(Product theProduct) {
		productDao.saveProduct(theProduct);
	}

	@Override
	public Product getProduct(int theId) {
		return productDao.getProduct(theId);
	}

	@Override
	public void deleteProduct(int theId) {
		productDao.deleteProduct(theId);
	}

}
