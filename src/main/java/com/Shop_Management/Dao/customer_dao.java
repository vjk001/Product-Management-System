package com.Shop_Management.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Shop_Management.Entity.customer;

@Repository
public class customer_dao {

	@Autowired
	SessionFactory fact;

	public customer getcustomer(int id) {
		Session session = fact.openSession();
		customer obj = session.get(customer.class, id);
		return obj;

	}

}
