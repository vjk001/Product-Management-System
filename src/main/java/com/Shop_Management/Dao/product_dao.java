package com.Shop_Management.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Shop_Management.Entity.product;

@Repository
public class product_dao {

	@Autowired
	SessionFactory fact;

	public product getproduct(int id) {
		Session session = fact.openSession();
		product obj = session.get(product.class, id);
		return obj;
	}
}
