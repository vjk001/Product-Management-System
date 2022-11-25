package com.Shop_Management.Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Shop_Management.Entity.customer;
import com.Shop_Management.Entity.product;
import com.Shop_Management.Service.product_service;

@RestController
@RequestMapping("product")
public class product_controller {

	@Autowired
	product_service service;

	@Autowired
	SessionFactory fact;

	@GetMapping("{id}")
	public product getdata(@PathVariable int id) {
		return service.getdata(id);

	}
	
	@PostMapping("add")
	public String addcustomer(@RequestBody product p) {
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(p);;
		tr.commit();
		return "Added product";
		
	}
	
	@PutMapping("update")
	public String updatecustomer(@RequestBody product p) {
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(p);;
		tr.commit();
		return "Updated Product";
		
	}
	@DeleteMapping("delete/{id}")
	public String deletebyid(@PathVariable int id) {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select * from product");
		List<Object[]> list = query.list();
		return "Deleted Product";
		
	}
	
	@GetMapping("allproduct")
	public List getdata() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select * from product");
		List<Object[]> list = query.list();
		return list;
	}

	@GetMapping("names")
	public List getnames() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select product.product_name from product");
		List<Object[]> list = query.list();
		return list;
	}

	@GetMapping("id/name")
	public List getbyidnames() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select  product.product_id,product.product_name from product");
		List<Object[]> list = query.list();
		return list;
	}

	@GetMapping("id/price")
	public List getbyidcity() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select  product.product_id,product.product_price from product");
		List<Object[]> list = query.list();
		return list;
	}

}
