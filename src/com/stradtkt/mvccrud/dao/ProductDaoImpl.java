package com.stradtkt.mvccrud.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.stradtkt.mvccrud.entity.Product;

public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<Product> getProducts() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Product> theQuery = currentSession.createQuery("from Product order by productName", Product.class);
		List<Product> products = theQuery.getResultList();
		return products;
	}
	@Override
	public void saveProduct(Product theProduct) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theProduct);
	}
	@Override
	public Product getProduct(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Product theProduct = currentSession.get(Product.class, theId);
		return theProduct;
	}
	@Override
	public void deleteProduct(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Product where id=:productId");
		theQuery.setParameter("productId", theId);
		theQuery.executeUpdate();
	}
}
