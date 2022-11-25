package com.Shop_Management.Controller;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	SessionFactory fact;
	
	@GetMapping("list")
	public List<Object[]> getalllist() {
		Session session = fact.openSession();
		String Query = "select customer_id,customer_name,product.product_id,product.product_name,product.product_price,order_id from customer,product where customer.product_id=product.product_id";
		
		NativeQuery<Object[]> query = session.createSQLQuery(Query);
		List<Object[]> list = query.list();
		return list;
	}
	
	@GetMapping("customerid/productid")
	public List<Object[]> getBothid() {
		Session session = fact.openSession();
		String Query = "select customer.customer_id,product.product_id from customer,product where customer.product_id=product.product_id";
		
		NativeQuery<Object[]> query = session.createSQLQuery(Query);
		List<Object[]> list = query.list();
		return list;
	}
	
	@GetMapping("productid/customername")
	public List<Object[]> getcustomernamebyproductid() {
		Session session = fact.openSession();
		String Query = "select product.product_id,customer.customer_name from customer,product where customer.product_id=product.product_id";
		
		NativeQuery<Object[]> query = session.createSQLQuery(Query);
		List<Object[]> list = query.list();
		return list;
	}
}
