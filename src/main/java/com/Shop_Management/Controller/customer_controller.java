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
import com.Shop_Management.Service.customer_service;

@RestController
@RequestMapping("customer")
public class customer_controller {

	@Autowired
	customer_service service;

	@Autowired
	SessionFactory fact;

	@GetMapping("{id}")
	public customer getdata(@PathVariable int id) {
		return service.getdata(id);

	}
	@PostMapping("add")
	public String addcustomer(@RequestBody customer c) {
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(c);;
		tr.commit();
		return "Added Customer";
		
	}
	
	@PutMapping("update")
	public String updatecustomer(@RequestBody customer c) {
		Session session = fact.openSession();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(c);;
		tr.commit();
		return "Updated Customer";
		
	}
	@DeleteMapping("delete/{id}")
	public String deletebyid(@PathVariable int id) {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select * from customer");
		List<Object[]> list = query.list();
		return "Deleted Customer";
		
	}
	@GetMapping("allcustomer")
	public List getdata() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select * from customer");
		List<Object[]> list = query.list();
		return list;
	}

	@GetMapping("names")
	public List getnames() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select customer.customer_name from customer");
		List<Object[]> list = query.list();
		return list;
	}

	@GetMapping("id/names")
	public List getbyidnames() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select  customer.customer_id,customer.customer_name from customer");
		List<Object[]> list = query.list();
		return list;
	}

	@GetMapping("id/city")
	public List getbyidcity() {
		Session session = fact.openSession();
		NativeQuery<Object[]> query = session.createSQLQuery("select  customer.customer_id,customer.customer_city from customer");
		List<Object[]> list = query.list();
		return list;
	}
	
	
	
	
	
}
